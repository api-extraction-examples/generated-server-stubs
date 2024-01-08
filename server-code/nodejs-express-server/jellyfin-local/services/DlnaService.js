/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Creates a profile.
*
* deviceProfile DeviceProfile Device profile. (optional)
* no response value expected for this operation
* */
const createProfile = ({ deviceProfile }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deviceProfile,
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
* Deletes a profile.
*
* profileId String Profile id.
* no response value expected for this operation
* */
const deleteProfile = ({ profileId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        profileId,
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
* Gets the default profile.
*
* returns DeviceProfile
* */
const getDefaultProfile = () => new Promise(
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
* Gets a single profile.
*
* profileId String Profile Id.
* returns DeviceProfile
* */
const getProfile = ({ profileId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        profileId,
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
* Get profile infos.
*
* returns List
* */
const getProfileInfos = () => new Promise(
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
* Updates a profile.
*
* profileId String Profile id.
* deviceProfile DeviceProfile Device profile. (optional)
* no response value expected for this operation
* */
const updateProfile = ({ profileId, deviceProfile }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        profileId,
        deviceProfile,
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
  createProfile,
  deleteProfile,
  getDefaultProfile,
  getProfile,
  getProfileInfos,
  updateProfile,
};
