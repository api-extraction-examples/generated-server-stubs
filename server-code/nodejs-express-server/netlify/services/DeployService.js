/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* deployUnderscoreid String 
* returns deploy
* */
const cancelSiteDeploy = ({ deployUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
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
* deploy DeployFiles 
* deployPreviews Boolean  (optional)
* production Boolean  (optional)
* state String  (optional)
* branch String  (optional)
* latestPublished Boolean  (optional)
* title String  (optional)
* returns deploy
* */
const createSiteDeploy = ({ siteUnderscoreid, deploy, deployPreviews, production, state, branch, latestPublished, title }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        deploy,
        deployPreviews,
        production,
        state,
        branch,
        latestPublished,
        title,
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
* deployUnderscoreid String 
* no response value expected for this operation
* */
const deleteDeploy = ({ deployUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
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
* deployUnderscoreid String 
* siteUnderscoreid String 
* no response value expected for this operation
* */
const deleteSiteDeploy = ({ deployUnderscoreid, siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
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
* deployUnderscoreid String 
* returns deploy
* */
const getDeploy = ({ deployUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
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
* deployUnderscoreid String 
* returns deploy
* */
const getSiteDeploy = ({ siteUnderscoreid, deployUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        deployUnderscoreid,
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
* deployPreviews Boolean  (optional)
* production Boolean  (optional)
* state String  (optional)
* branch String  (optional)
* latestPublished Boolean  (optional)
* page Integer  (optional)
* perUnderscorepage Integer  (optional)
* returns List
* */
const listSiteDeploys = ({ siteUnderscoreid, deployPreviews, production, state, branch, latestPublished, page, perUnderscorepage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        deployPreviews,
        production,
        state,
        branch,
        latestPublished,
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
* deployUnderscoreid String 
* returns deploy
* */
const lockDeploy = ({ deployUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
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
* deployUnderscoreid String 
* returns deploy
* */
const restoreSiteDeploy = ({ siteUnderscoreid, deployUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        deployUnderscoreid,
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
* no response value expected for this operation
* */
const rollbackSiteDeploy = ({ siteUnderscoreid }) => new Promise(
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
* deployUnderscoreid String 
* returns deploy
* */
const unlockDeploy = ({ deployUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
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
* deployUnderscoreid String 
* deploy DeployFiles 
* returns deploy
* */
const updateSiteDeploy = ({ siteUnderscoreid, deployUnderscoreid, deploy }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        deployUnderscoreid,
        deploy,
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
  cancelSiteDeploy,
  createSiteDeploy,
  deleteDeploy,
  deleteSiteDeploy,
  getDeploy,
  getSiteDeploy,
  listSiteDeploys,
  lockDeploy,
  restoreSiteDeploy,
  rollbackSiteDeploy,
  unlockDeploy,
  updateSiteDeploy,
};
