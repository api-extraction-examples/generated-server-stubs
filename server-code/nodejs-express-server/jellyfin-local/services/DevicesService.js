/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Deletes a device.
*
* id String Device Id.
* no response value expected for this operation
* */
const deleteDevice = ({ id }) => new Promise(
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
* Get info for a device.
*
* id String Device Id.
* returns DeviceInfo
* */
const getDeviceInfo = ({ id }) => new Promise(
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
* Get options for a device.
*
* id String Device Id.
* returns DeviceOptions
* */
const getDeviceOptions = ({ id }) => new Promise(
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
* Get Devices.
*
* supportsSync Boolean Gets or sets a value indicating whether [supports synchronize]. (optional)
* userId UUID Gets or sets the user identifier. (optional)
* returns DeviceInfoQueryResult
* */
const getDevices = ({ supportsSync, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        supportsSync,
        userId,
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
* Update device options.
*
* id String Device Id.
* deviceOptions DeviceOptions Device Options.
* no response value expected for this operation
* */
const updateDeviceOptions = ({ id, deviceOptions }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        deviceOptions,
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
  deleteDevice,
  getDeviceInfo,
  getDeviceOptions,
  getDevices,
  updateDeviceOptions,
};
