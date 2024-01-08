/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets activity log entries.
*
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* minDate Date Optional. The minimum date. Format = ISO. (optional)
* hasUserId Boolean Optional. Filter log entries if it has user id, or not. (optional)
* returns ActivityLogEntryQueryResult
* */
const getLogEntries = ({ startIndex, limit, minDate, hasUserId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startIndex,
        limit,
        minDate,
        hasUserId,
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
  getLogEntries,
};
