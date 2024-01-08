/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get instance status
* Get the status of Airflow's metadatabase and scheduler. It includes info about metadatabase and last heartbeat of scheduler. 
*
* returns HealthInfo
* */
const get_health = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get version information
*
* returns VersionInfo
* */
const get_version = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  get_health,
  get_version,
};
