/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List targets
*
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _targets__get_200_response
* */
const targetsGET = ({ page, length, ordering, search }) => new Promise(
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
* Delete target
*
* id String Object Id
* no response value expected for this operation
* */
const targetsIdDELETE = ({ id }) => new Promise(
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
* Retrieve target
*
* id String Object Id
* returns Target
* */
const targetsIdGET = ({ id }) => new Promise(
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
* Partial update target
*
* id String Object Id
* target Target  (optional)
* returns Target
* */
const targetsIdPATCH = ({ id, target }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        target,
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
* Update target
*
* id String Object Id
* target Target  (optional)
* returns Target
* */
const targetsIdPUT = ({ id, target }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        target,
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
* Create target
*
* target Target  (optional)
* returns Target
* */
const targetsPOST = ({ target }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        target,
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
  targetsGET,
  targetsIdDELETE,
  targetsIdGET,
  targetsIdPATCH,
  targetsIdPUT,
  targetsPOST,
};
