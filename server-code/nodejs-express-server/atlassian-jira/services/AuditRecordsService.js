/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get audit records
* Returns a list of audit records. The list can be filtered to include items:   *  where each item in `filter` has at least one match in any of these fields:           *  `summary`      *  `category`      *  `eventSource`      *  `objectItem.name` If the object is a user, account ID is available to filter.      *  `objectItem.parentName`      *  `objectItem.typeName`      *  `changedValues.changedFrom`      *  `changedValues.changedTo`      *  `remoteAddress`          For example, if `filter` contains *man ed*, an audit record containing `summary\": \"User added to group\"` and `\"category\": \"group management\"` is returned.  *  created on or after a date and time.  *  created or or before a date and time.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* offset Integer The number of records to skip before returning the first result. (optional)
* limit Integer The maximum number of results to return. (optional)
* filter String The strings to match with audit field content, space separated. (optional)
* from Date The date and time on or after which returned audit records must have been created. If `to` is provided `from` must be before `to` or no audit records are returned. (optional)
* to Date The date and time on or before which returned audit results must have been created. If `from` is provided `to` must be after `from` or no audit records are returned. (optional)
* returns AuditRecords
* */
const getAuditRecords = ({ offset, limit, filter, from, to }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        offset,
        limit,
        filter,
        from,
        to,
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
  getAuditRecords,
};
