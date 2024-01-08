/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List API keys allowed to operate on account
*
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _keys__get_200_response
* */
const keysGET = ({ page, length, ordering, search }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        page,
        length,
        ordering,
        search,
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
* Delete account API key
*
* id String Object Id
* no response value expected for this operation
* */
const keysIdDELETE = ({ id }) => new Promise(
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
* Retrieve account API key
*
* id String Object Id
* returns APIKey
* */
const keysIdGET = ({ id }) => new Promise(
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
* Create account API key
*
* aPIKey APIKey 
* returns APIKey
* */
const keysPOST = ({ aPIKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        aPIKey,
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
* List target specific API keys
*
* targetUnderscoreid String Target id
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _keys__get_200_response
* */
const targetsTargetIdKeysGET = ({ targetUnderscoreid, page, length, ordering, search }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        page,
        length,
        ordering,
        search,
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
* Delete target API key
*
* targetUnderscoreid String Target id
* id String Object Id
* no response value expected for this operation
* */
const targetsTargetIdKeysIdDELETE = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Retrieve target API key
*
* targetUnderscoreid String Target id
* id String Object Id
* returns APIKey
* */
const targetsTargetIdKeysIdGET = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Create target API key
*
* targetUnderscoreid String Target id
* aPIKey APIKey 
* returns APIKey
* */
const targetsTargetIdKeysPOST = ({ targetUnderscoreid, aPIKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        aPIKey,
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
  keysGET,
  keysIdDELETE,
  keysIdGET,
  keysPOST,
  targetsTargetIdKeysGET,
  targetsTargetIdKeysIdDELETE,
  targetsTargetIdKeysIdGET,
  targetsTargetIdKeysPOST,
};
