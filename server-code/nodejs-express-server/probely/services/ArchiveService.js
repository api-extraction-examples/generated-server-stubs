/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Activate targets
*
* string List 
* returns List
* */
const targetsActivatePOST = ({ string }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        string,
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
* Archive targets
*
* string List 
* returns List
* */
const targetsArchivePOST = ({ string }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        string,
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
* List archived targets
*
* string List 
* returns _targets__get_200_response
* */
const targetsArchivedPOST = ({ string }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        string,
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
  targetsActivatePOST,
  targetsArchivePOST,
  targetsArchivedPOST,
};
