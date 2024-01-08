/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Ping the server for liveness
*
* returns String
* */
const getHeartbeat = () => new Promise(
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
* Get state of the server and its dependencies.
*
* returns GetServerHealth_200_response
* */
const getServerHealth = () => new Promise(
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
  getHeartbeat,
  getServerHealth,
};
