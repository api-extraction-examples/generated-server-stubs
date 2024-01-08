/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Cancel task
* Cancels a task.  **[Permissions](#permissions) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task.
*
* taskId String The ID of the task.
* returns oas_any_type_not_mapped
* */
const cancelTask = ({ taskId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskId,
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
* Get task
* Returns the status of a [long-running asynchronous task](#async).  When a task has finished, this operation returns the JSON blob applicable to the task. See the documentation of the operation that created the task for details. Task details are not permanently retained. As of September 2019, details are retained for 14 days although this period may change without notice.  **[Permissions](#permissions) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task.
*
* taskId String The ID of the task.
* returns TaskProgressBeanObject
* */
const getTask = ({ taskId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskId,
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
  cancelTask,
  getTask,
};
