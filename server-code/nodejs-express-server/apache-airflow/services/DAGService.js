/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a DAG
* Deletes all metadata related to the DAG, including finished DAG Runs and Tasks. Logs are not deleted. This action cannot be undone.  *New in version 2.2.0* 
*
* dagUnderscoreid String The DAG ID.
* no response value expected for this operation
* */
const delete_dag = ({ dagUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
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
* Get basic information about a DAG
* Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/details. 
*
* dagUnderscoreid String The DAG ID.
* returns DAG
* */
const get_dag = ({ dagUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
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
* Get a simplified representation of DAG
* The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 
*
* dagUnderscoreid String The DAG ID.
* returns DAGDetail
* */
const get_dag_details = ({ dagUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
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
* Get a source code
* Get a source code using file token. 
*
* fileUnderscoretoken String The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
* returns get_dag_source_200_response
* */
const get_dag_source = ({ fileUnderscoretoken }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fileUnderscoretoken,
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
* List DAGs
* List DAGs in the database. `dag_id_pattern` can be set to match dags of a specific pattern 
*
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* tags List List of tags to filter results.  *New in version 2.2.0*  (optional)
* onlyUnderscoreactive Boolean Only filter active DAGs.  *New in version 2.1.1*  (optional)
* dagUnderscoreidUnderscorepattern String If set, only return DAGs with dag_ids matching this pattern.  (optional)
* returns DAGCollection
* */
const get_dags = ({ limit, offset, orderUnderscoreby, tags, onlyUnderscoreactive, dagUnderscoreidUnderscorepattern }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        orderUnderscoreby,
        tags,
        onlyUnderscoreactive,
        dagUnderscoreidUnderscorepattern,
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
* Get simplified representation of a task
*
* dagUnderscoreid String The DAG ID.
* taskUnderscoreid String The task ID.
* returns Task
* */
const get_task = ({ dagUnderscoreid, taskUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
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
* Get tasks for DAG
*
* dagUnderscoreid String The DAG ID.
* orderUnderscoreby String The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0*  (optional)
* returns TaskCollection
* */
const get_tasks = ({ dagUnderscoreid, orderUnderscoreby }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
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
* Update a DAG
*
* dagUnderscoreid String The DAG ID.
* dAG DAG 
* updateUnderscoremask List The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
* returns DAG
* */
const patch_dag = ({ dagUnderscoreid, dAG, updateUnderscoremask }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        dAG,
        updateUnderscoremask,
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
* Update DAGs
* Update DAGs of a given dag_id_pattern using UpdateMask. This endpoint allows specifying `~` as the dag_id_pattern to update all DAGs. *New in version 2.3.0* 
*
* dagUnderscoreidUnderscorepattern String If set, only update DAGs with dag_ids matching this pattern. 
* dAG DAG 
* limit Integer The numbers of items to return. (optional)
* offset Integer The number of items to skip before starting to collect the result set. (optional)
* tags List List of tags to filter results.  *New in version 2.2.0*  (optional)
* updateUnderscoremask List The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
* onlyUnderscoreactive Boolean Only filter active DAGs.  *New in version 2.1.1*  (optional)
* returns DAGCollection
* */
const patch_dags = ({ dagUnderscoreidUnderscorepattern, dAG, limit, offset, tags, updateUnderscoremask, onlyUnderscoreactive }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreidUnderscorepattern,
        dAG,
        limit,
        offset,
        tags,
        updateUnderscoremask,
        onlyUnderscoreactive,
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
* Clear a set of task instances
* Clears a set of task instances associated with the DAG for a specified date range. 
*
* dagUnderscoreid String The DAG ID.
* clearTaskInstances ClearTaskInstances Parameters of action
* returns TaskInstanceReferenceCollection
* */
const post_clear_task_instances = ({ dagUnderscoreid, clearTaskInstances }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        clearTaskInstances,
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
* Set a state of task instances
* Updates the state for multiple task instances simultaneously. 
*
* dagUnderscoreid String The DAG ID.
* updateTaskInstancesState UpdateTaskInstancesState Parameters of action
* returns TaskInstanceReferenceCollection
* */
const post_set_task_instances_state = ({ dagUnderscoreid, updateTaskInstancesState }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dagUnderscoreid,
        updateTaskInstancesState,
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
  delete_dag,
  get_dag,
  get_dag_details,
  get_dag_source,
  get_dags,
  get_task,
  get_tasks,
  patch_dag,
  patch_dags,
  post_clear_task_instances,
  post_set_task_instances_state,
};
