/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List extra links
* List extra links for task instance. 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* returns ExtraLinkCollection
* */
const get_extra_links = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
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
* Get logs
* Get logs for a specific task instance and its try number.
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* taskUnderscoretryUnderscorenumber Integer The task try number.
* fullUnderscorecontent Boolean A full content will be returned. By default, only the first fragment will be returned.  (optional)
* mapUnderscoreindex Integer Filter on map index for mapped task. (optional)
* token String A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
* returns get_log_200_response
* */
const get_log = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, taskUnderscoretryUnderscorenumber, fullUnderscorecontent, mapUnderscoreindex, token }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        taskUnderscoretryUnderscorenumber,
        fullUnderscorecontent,
        mapUnderscoreindex,
        token,
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
* Get a mapped task instance
* Get details of a mapped task instance.  *New in version 2.3.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* mapUnderscoreindex Integer The map index.
* returns TaskInstance
* */
const get_mapped_task_instance = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, mapUnderscoreindex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        mapUnderscoreindex,
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
* List mapped task instances
* Get details of all mapped task instances.  *New in version 2.3.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* executionUnderscoredateUnderscoregte Date Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
* executionUnderscoredateUnderscorelte Date Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
* startUnderscoredateUnderscoregte Date Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
* startUnderscoredateUnderscorelte Date Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
* endUnderscoredateUnderscoregte Date Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
* endUnderscoredateUnderscorelte Date Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
* durationUnderscoregte BigDecimal Returns objects greater than or equal to the specified values.  This can be combined with duration_lte parameter to receive only the selected period.  (optional)
* durationUnderscorelte BigDecimal Returns objects less than or equal to the specified values.  This can be combined with duration_gte parameter to receive only the selected range.  (optional)
* state List The value can be repeated to retrieve multiple matching values (OR condition). (optional)
* pool List The value can be repeated to retrieve multiple matching values (OR condition). (optional)
* queue List The value can be repeated to retrieve multiple matching values (OR condition). (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns TaskInstanceCollection
* */
const get_mapped_task_instances = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, limit, offset, executionUnderscoredateUnderscoregte, executionUnderscoredateUnderscorelte, startUnderscoredateUnderscoregte, startUnderscoredateUnderscorelte, endUnderscoredateUnderscoregte, endUnderscoredateUnderscorelte, durationUnderscoregte, durationUnderscorelte, state, pool, queue, orderUnderscoreby }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        limit,
        offset,
        executionUnderscoredateUnderscoregte,
        executionUnderscoredateUnderscorelte,
        startUnderscoredateUnderscoregte,
        startUnderscoredateUnderscorelte,
        endUnderscoredateUnderscoregte,
        endUnderscoredateUnderscorelte,
        durationUnderscoregte,
        durationUnderscorelte,
        state,
        pool,
        queue,
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
* Get a task instance
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* returns TaskInstance
* */
const get_task_instance = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
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
* List task instances
* This endpoint allows specifying `~` as the dag_id, dag_run_id to retrieve DAG runs for all DAGs and DAG runs. 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* executionUnderscoredateUnderscoregte Date Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
* executionUnderscoredateUnderscorelte Date Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
* startUnderscoredateUnderscoregte Date Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
* startUnderscoredateUnderscorelte Date Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
* endUnderscoredateUnderscoregte Date Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
* endUnderscoredateUnderscorelte Date Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
* durationUnderscoregte BigDecimal Returns objects greater than or equal to the specified values.  This can be combined with duration_lte parameter to receive only the selected period.  (optional)
* durationUnderscorelte BigDecimal Returns objects less than or equal to the specified values.  This can be combined with duration_gte parameter to receive only the selected range.  (optional)
* state List The value can be repeated to retrieve multiple matching values (OR condition). (optional)
* pool List The value can be repeated to retrieve multiple matching values (OR condition). (optional)
* queue List The value can be repeated to retrieve multiple matching values (OR condition). (optional)
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* returns TaskInstanceCollection
* */
const get_task_instances = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, executionUnderscoredateUnderscoregte, executionUnderscoredateUnderscorelte, startUnderscoredateUnderscoregte, startUnderscoredateUnderscorelte, endUnderscoredateUnderscoregte, endUnderscoredateUnderscorelte, durationUnderscoregte, durationUnderscorelte, state, pool, queue, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        executionUnderscoredateUnderscoregte,
        executionUnderscoredateUnderscorelte,
        startUnderscoredateUnderscoregte,
        startUnderscoredateUnderscorelte,
        endUnderscoredateUnderscoregte,
        endUnderscoredateUnderscorelte,
        durationUnderscoregte,
        durationUnderscorelte,
        state,
        pool,
        queue,
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
* List task instances (batch)
* List task instances from all DAGs and DAG runs. This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL length limits. 
*
* listTaskInstanceForm ListTaskInstanceForm 
* returns TaskInstanceCollection
* */
const get_task_instances_batch = ({ listTaskInstanceForm }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        listTaskInstanceForm,
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
* Updates the state of a mapped task instance
* Updates the state for single mapped task instance. *New in version 2.5.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* mapUnderscoreindex Integer The map index.
* updateTaskInstance UpdateTaskInstance Parameters of action (optional)
* returns TaskInstanceReference
* */
const patch_mapped_task_instance = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, mapUnderscoreindex, updateTaskInstance }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        mapUnderscoreindex,
        updateTaskInstance,
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
* Updates the state of a task instance
* Updates the state for single task instance. *New in version 2.5.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* updateTaskInstance UpdateTaskInstance Parameters of action
* returns TaskInstanceReference
* */
const patch_task_instance = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, updateTaskInstance }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        updateTaskInstance,
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
* Update the TaskInstance note.
* Update the manual user note of a mapped Task Instance.  *New in version 2.5.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* mapUnderscoreindex Integer The map index.
* setTaskInstanceNote SetTaskInstanceNote Parameters of set Task Instance note.
* returns TaskInstance
* */
const set_mapped_task_instance_note = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, mapUnderscoreindex, setTaskInstanceNote }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        mapUnderscoreindex,
        setTaskInstanceNote,
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
* Update the TaskInstance note.
* Update the manual user note of a non-mapped Task Instance.  *New in version 2.5.0* 
*
* dagUnderscoreid String The DAG ID.
* dagUnderscorerunUnderscoreid String The DAG run ID.
* taskUnderscoreid String The task ID.
* setTaskInstanceNote SetTaskInstanceNote Parameters of set Task Instance note.
* returns TaskInstance
* */
const set_task_instance_note = ({ dagUnderscoreid, dagUnderscorerunUnderscoreid, taskUnderscoreid, setTaskInstanceNote }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dagUnderscorerunUnderscoreid,
        taskUnderscoreid,
        setTaskInstanceNote,
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
  get_extra_links,
  get_log,
  get_mapped_task_instance,
  get_mapped_task_instances,
  get_task_instance,
  get_task_instances,
  get_task_instances_batch,
  patch_mapped_task_instance,
  patch_task_instance,
  set_mapped_task_instance_note,
  set_task_instance_note,
};
