/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* hook Hook 
* returns hook
* */
const createHookBySiteId = ({ siteUnderscoreid, hook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        hook,
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
* hookUnderscoreid String 
* no response value expected for this operation
* */
const deleteHook = ({ hookUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        hookUnderscoreid,
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
* hookUnderscoreid String 
* returns hook
* */
const enableHook = ({ hookUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        hookUnderscoreid,
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
* hookUnderscoreid String 
* returns hook
* */
const getHook = ({ hookUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        hookUnderscoreid,
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
const listHooksBySiteId = ({ siteUnderscoreid }) => new Promise(
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
* hookUnderscoreid String 
* hook Hook 
* returns hook
* */
const updateHook = ({ hookUnderscoreid, hook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        hookUnderscoreid,
        hook,
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
  createHookBySiteId,
  deleteHook,
  enableHook,
  getHook,
  listHooksBySiteId,
  updateHook,
};
