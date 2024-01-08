/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List labels
*
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _labels__get_200_response
* */
const labelsGET = ({ page, length, ordering, search }) => new Promise(
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
* Delete label
*
* id String Object Id
* no response value expected for this operation
* */
const labelsIdDELETE = ({ id }) => new Promise(
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
* Retrieve framework
*
* id String Object Id
* returns Label
* */
const labelsIdGET = ({ id }) => new Promise(
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
* Partial update
*
* id String Object Id
* label Label 
* returns Label
* */
const labelsIdPATCH = ({ id, label }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        label,
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
* Update label
*
* id String Object Id
* label Label 
* returns Label
* */
const labelsIdPUT = ({ id, label }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        label,
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
* Create label
*
* label Label 
* returns Label
* */
const labelsPOST = ({ label }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        label,
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
  labelsGET,
  labelsIdDELETE,
  labelsIdGET,
  labelsIdPATCH,
  labelsIdPUT,
  labelsPOST,
};
