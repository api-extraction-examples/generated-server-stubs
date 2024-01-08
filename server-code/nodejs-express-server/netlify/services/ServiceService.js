/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* search String  (optional)
* returns List
* */
const getServices = ({ search }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
*
* addonName String 
* returns service
* */
const showService = ({ addonName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        addonName,
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
* addonName String 
* returns Object
* */
const showServiceManifest = ({ addonName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        addonName,
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
  getServices,
  showService,
  showServiceManifest,
};
