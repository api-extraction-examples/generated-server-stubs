/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get task by id.
*
* taskId String Task Id.
* returns TaskInfo
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
/**
* Get tasks.
*
* isHidden Boolean Optional filter tasks that are hidden, or not. (optional)
* isEnabled Boolean Optional filter tasks that are enabled, or not. (optional)
* returns List
* */
const getTasks = ({ isHidden, isEnabled }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        isHidden,
        isEnabled,
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
* Start specified task.
*
* taskId String Task Id.
* no response value expected for this operation
* */
const startTask = ({ taskId }) => new Promise(
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
* Stop specified task.
*
* taskId String Task Id.
* no response value expected for this operation
* */
const stopTask = ({ taskId }) => new Promise(
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
* Update specified task triggers.
*
* taskId String Task Id.
* taskTriggerInfo List Triggers.
* no response value expected for this operation
* */
const updateTask = ({ taskId, taskTriggerInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskId,
        taskTriggerInfo,
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
  getTask,
  getTasks,
  startTask,
  stopTask,
  updateTask,
};
