/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* appStoreVersionPhasedReleaseCreateRequest AppStoreVersionPhasedReleaseCreateRequest AppStoreVersionPhasedRelease representation
* returns AppStoreVersionPhasedReleaseResponse
* */
const appStoreVersionPhasedReleasesCreate_instance = ({ appStoreVersionPhasedReleaseCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appStoreVersionPhasedReleaseCreateRequest,
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
const appStoreVersionPhasedReleasesDelete_instance = ({ id }) => new Promise(
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
*
* id String the id of the requested resource
* appStoreVersionPhasedReleaseUpdateRequest AppStoreVersionPhasedReleaseUpdateRequest AppStoreVersionPhasedRelease representation
* returns AppStoreVersionPhasedReleaseResponse
* */
const appStoreVersionPhasedReleasesUpdate_instance = ({ id, appStoreVersionPhasedReleaseUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appStoreVersionPhasedReleaseUpdateRequest,
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
  appStoreVersionPhasedReleasesCreate_instance,
  appStoreVersionPhasedReleasesDelete_instance,
  appStoreVersionPhasedReleasesUpdate_instance,
};
