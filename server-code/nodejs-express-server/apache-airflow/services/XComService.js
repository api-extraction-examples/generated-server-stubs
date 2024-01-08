/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List XCom entries
* This endpoint allows specifying `~` as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG runs and task instances. XCom values won't be returned as they can be large. Use this endpoint to get a list of XCom entries and then fetch individual entry to get value.
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* returns XComCollection
* */
const get_xcom_entries = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        limit,
        offset,
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
* Get an XCom entry
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* xcomUnderscorekey String The XCom key.
* deserialize Boolean Whether to deserialize an XCom value when using a custom XCom backend.  The XCom API endpoint calls `orm_deserialize_value` by default since an XCom may contain value that is potentially expensive to deserialize in the web server. Setting this to true overrides the consideration, and calls `deserialize_value` instead.  This parameter is not meaningful when using the default XCom backend.  *New in version 2.4.0*  (optional)
* returns XCom
* */
const get_xcom_entry = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, xcomUnderscorekey, deserialize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        xcomUnderscorekey,
        deserialize,
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
  get_xcom_entries,
  get_xcom_entry,
};
