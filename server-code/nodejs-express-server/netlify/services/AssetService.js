/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* name String 
* size Long 
* contentUnderscoretype String 
* visibility String  (optional)
* returns assetSignature
* */
const createSiteAsset = ({ siteUnderscoreid, name, size, contentUnderscoretype, visibility }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        name,
        size,
        contentUnderscoretype,
        visibility,
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
* assetUnderscoreid String 
* no response value expected for this operation
* */
const deleteSiteAsset = ({ siteUnderscoreid, assetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        assetUnderscoreid,
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
* assetUnderscoreid String 
* returns asset
* */
const getSiteAssetInfo = ({ siteUnderscoreid, assetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        assetUnderscoreid,
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
const listSiteAssets = ({ siteUnderscoreid }) => new Promise(
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
* assetUnderscoreid String 
* state String 
* returns asset
* */
const updateSiteAsset = ({ siteUnderscoreid, assetUnderscoreid, state }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        assetUnderscoreid,
        state,
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
  createSiteAsset,
  deleteSiteAsset,
  getSiteAssetInfo,
  listSiteAssets,
  updateSiteAsset,
};
