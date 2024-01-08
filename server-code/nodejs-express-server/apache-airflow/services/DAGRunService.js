/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Clear a DAG run
* Clear a DAG run.  *New in version 2.4.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* clearDagRun ClearDagRun 
* returns clear_dag_run_200_response
* */
const clear_dag_run = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, clearDagRun }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        clearDagRun,
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
* Delete a DAG run
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* no response value expected for this operation
* */
const delete_dag_run = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
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
* Get a DAG run
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* returns DAGRun
* */
const get_dag_run = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
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
* List DAG runs
* This endpoint allows specifying `~` as the dag_id to retrieve DAG runs for all DAGs. 
*
* dagUnderscoreid String The DAG ID.
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* executionUnderscoredateUnderscoregte Date Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
* executionUnderscoredateUnderscorelte Date Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
* startUnderscoredateUnderscoregte Date Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
* startUnderscoredateUnderscorelte Date Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
* endUnderscoredateUnderscoregte Date Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
* endUnderscoredateUnderscorelte Date Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
* state List The value can be repeated to retrieve multiple matching values (OR condition). (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns DAGRunCollection
* */
const get_dag_runs = ({ dagUnderscoreid, limit, offset, executionUnderscoredateUnderscoregte, executionUnderscoredateUnderscorelte, startUnderscoredateUnderscoregte, startUnderscoredateUnderscorelte, endUnderscoredateUnderscoregte, endUnderscoredateUnderscorelte, state, orderUnderscoreby }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        limit,
        offset,
        executionUnderscoredateUnderscoregte,
        executionUnderscoredateUnderscorelte,
        startUnderscoredateUnderscoregte,
        startUnderscoredateUnderscorelte,
        endUnderscoredateUnderscoregte,
        endUnderscoredateUnderscorelte,
        state,
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
/**
* List DAG runs (batch)
* This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL length limit. 
*
* listDagRunsForm ListDagRunsForm 
* returns DAGRunCollection
* */
const get_dag_runs_batch = ({ listDagRunsForm }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        listDagRunsForm,
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
* Get dataset events for a DAG run
* Get datasets for a dag run.  *New in version 2.4.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* returns DatasetEventCollection
* */
const get_upstream_dataset_events = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
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
* Trigger a new DAG run
*
* dagUnderscoreid String The DAG ID.
* dAGRun DAGRun 
* returns DAGRun
* */
const post_dag_run = ({ dagUnderscoreid, dAGRun }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dAGRun,
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
* Update the DagRun note.
* Update the manual user note of a DagRun.  *New in version 2.5.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* setDagRunNote SetDagRunNote Parameters of set DagRun note.
* returns DAGRun
* */
const set_dag_run_note = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, setDagRunNote }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        setDagRunNote,
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
* Modify a DAG run
* Modify a DAG run.  *New in version 2.2.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* updateDagRunState UpdateDagRunState 
* returns DAGRun
* */
const update_dag_run_state = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, updateDagRunState }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        updateDagRunState,
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
  clear_dag_run,
  delete_dag_run,
  get_dag_run,
  get_dag_runs,
  get_dag_runs_batch,
  get_upstream_dataset_events,
  post_dag_run,
  set_dag_run_note,
  update_dag_run_state,
};
