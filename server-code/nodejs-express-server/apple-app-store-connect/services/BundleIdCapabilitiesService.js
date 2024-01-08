/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* bundleIdCapabilityCreateRequest BundleIdCapabilityCreateRequest BundleIdCapability representation
* returns BundleIdCapabilityResponse
* */
const bundleIdCapabilitiesCreate_instance = ({ bundleIdCapabilityCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bundleIdCapabilityCreateRequest,
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
const bundleIdCapabilitiesDelete_instance = ({ id }) => new Promise(
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
* bundleIdCapabilityUpdateRequest BundleIdCapabilityUpdateRequest BundleIdCapability representation
* returns BundleIdCapabilityResponse
* */
const bundleIdCapabilitiesUpdate_instance = ({ id, bundleIdCapabilityUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        bundleIdCapabilityUpdateRequest,
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
  bundleIdCapabilitiesCreate_instance,
  bundleIdCapabilitiesDelete_instance,
  bundleIdCapabilitiesUpdate_instance,
};
