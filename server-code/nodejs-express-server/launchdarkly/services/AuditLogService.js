/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get a list of all audit log entries. The query parameters allow you to restrict the returned results by date ranges, resource specifiers, or a full-text search query.
*
* before Long A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have before this timestamp. (optional)
* after Long A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occurred after this timestamp. (optional)
* q String Text to search for. You can search for the full or partial name of the resource involved or full or partial email address of the member who made the change. (optional)
* limit BigDecimal A limit on the number of audit log entries to be returned, between 1 and 20. (optional)
* spec String A resource specifier, allowing you to filter audit log listings by resource. (optional)
* returns AuditLogEntries
* */
const getAuditLogEntries = ({ before, after, q, limit, spec }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        before,
        after,
        q,
        limit,
        spec,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Use this endpoint to fetch a single audit log entry by its resouce ID.
*
* resourceId String The resource ID.
* returns AuditLogEntry
* */
const getAuditLogEntry = ({ resourceId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        resourceId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getAuditLogEntries,
  getAuditLogEntry,
};
