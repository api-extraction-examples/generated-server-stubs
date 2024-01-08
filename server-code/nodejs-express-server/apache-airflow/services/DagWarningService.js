/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List dag warnings
*
* dagUnderscoreid String If set, only return DAG warnings with this dag_id. (optional)
* warningUnderscoretype String If set, only return DAG warnings with this type. (optional)
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns DagWarningCollection
* */
const get_dag_warnings = ({ dagUnderscoreid, warningUnderscoretype, limit, offset, orderUnderscoreby }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        warningUnderscoretype,
        limit,
        offset,
        orderUnderscoreby,
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
  get_dag_warnings,
};
