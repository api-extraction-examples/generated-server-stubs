/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a relay proxy configuration by ID.
*
* id String The relay proxy configuration ID
* no response value expected for this operation
* */
const deleteRelayProxyConfig = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* Get a single relay proxy configuration by ID.
*
* id String The relay proxy configuration ID
* returns RelayProxyConfig
* */
const getRelayProxyConfig = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* Returns a list of relay proxy configurations in the account.
*
* returns RelayProxyConfigs
* */
const getRelayProxyConfigs = () => new Promise(
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
* Modify a relay proxy configuration by ID.
*
* id String The relay proxy configuration ID
* patchDelta List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'
* returns RelayProxyConfig
* */
const patchRelayProxyConfig = ({ id, patchDelta }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        patchDelta,
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
* Create a new relay proxy config.
*
* relayProxyConfigBody PostRelayAutoConfigRequest Create a new relay proxy configuration
* returns RelayProxyConfig
* */
const postRelayAutoConfig = ({ relayProxyConfigBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        relayProxyConfigBody,
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
* Reset a relay proxy configuration's secret key with an optional expiry time for the old key.
*
* id String The relay proxy configuration ID
* expiry Long An expiration time for the old relay proxy configuration key, expressed as a Unix epoch time in milliseconds. By default, the relay proxy configuration will expire immediately (optional)
* returns RelayProxyConfig
* */
const resetRelayProxyConfig = ({ id, expiry }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        expiry,
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
  deleteRelayProxyConfig,
  getRelayProxyConfig,
  getRelayProxyConfigs,
  patchRelayProxyConfig,
  postRelayAutoConfig,
  resetRelayProxyConfig,
};
