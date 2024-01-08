/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a new api key.
*
* app String Name of the app using the authentication key.
* no response value expected for this operation
* */
const createKey = ({ app }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        app,
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
* Get all keys.
*
* returns AuthenticationInfoQueryResult
* */
const getKeys = () => new Promise(
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
* Remove an api key.
*
* key String The access token to delete.
* no response value expected for this operation
* */
const revokeKey = ({ key }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        key,
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
  createKey,
  getKeys,
  revokeKey,
};
