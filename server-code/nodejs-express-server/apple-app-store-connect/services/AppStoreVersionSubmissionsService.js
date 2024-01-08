/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* appStoreVersionSubmissionCreateRequest AppStoreVersionSubmissionCreateRequest AppStoreVersionSubmission representation
* returns AppStoreVersionSubmissionResponse
* */
const appStoreVersionSubmissionsCreate_instance = ({ appStoreVersionSubmissionCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appStoreVersionSubmissionCreateRequest,
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
*
* id String the id of the requested resource
* no response value expected for this operation
* */
const appStoreVersionSubmissionsDelete_instance = ({ id }) => new Promise(
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

module.exports = {
  appStoreVersionSubmissionsCreate_instance,
  appStoreVersionSubmissionsDelete_instance,
};
