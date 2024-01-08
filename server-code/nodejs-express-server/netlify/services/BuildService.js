/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* build BuildSetup  (optional)
* returns build
* */
const createSiteBuild = ({ siteUnderscoreid, build }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        build,
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
* accountUnderscoreid String 
* returns List
* */
const getAccountBuildStatus = ({ accountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
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
* buildUnderscoreid String 
* returns build
* */
const getSiteBuild = ({ buildUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        buildUnderscoreid,
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
* page Integer  (optional)
* perUnderscorepage Integer  (optional)
* returns List
* */
const listSiteBuilds = ({ siteUnderscoreid, page, perUnderscorepage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        page,
        perUnderscorepage,
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
* buildUnderscoreid String 
* no response value expected for this operation
* */
const notifyBuildStart = ({ buildUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        buildUnderscoreid,
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
  createSiteBuild,
  getAccountBuildStatus,
  getSiteBuild,
  listSiteBuilds,
  notifyBuildStart,
};
