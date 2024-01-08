/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* addon String 
* config Object 
* returns serviceInstance
* */
const createServiceInstance = ({ siteUnderscoreid, addon, config }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        addon,
        config,
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
* siteUnderscoreid String 
* addon String 
* instanceUnderscoreid String 
* no response value expected for this operation
* */
const deleteServiceInstance = ({ siteUnderscoreid, addon, instanceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        addon,
        instanceUnderscoreid,
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
* siteUnderscoreid String 
* returns List
* */
const listServiceInstancesForSite = ({ siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
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
* siteUnderscoreid String 
* addon String 
* instanceUnderscoreid String 
* returns serviceInstance
* */
const showServiceInstance = ({ siteUnderscoreid, addon, instanceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        addon,
        instanceUnderscoreid,
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
* siteUnderscoreid String 
* addon String 
* instanceUnderscoreid String 
* config Object 
* no response value expected for this operation
* */
const updateServiceInstance = ({ siteUnderscoreid, addon, instanceUnderscoreid, config }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        addon,
        instanceUnderscoreid,
        config,
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
  createServiceInstance,
  deleteServiceInstance,
  listServiceInstancesForSite,
  showServiceInstance,
  updateServiceInstance,
};
