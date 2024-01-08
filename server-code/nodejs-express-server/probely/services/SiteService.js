/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Retrieve target's site
*
* targetUnderscoreid String Target id
* returns Site
* */
const targetsTargetIdSiteGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Partial update target's site
* Note that the URL can only be set once.
*
* targetUnderscoreid String Target id
* site Site 
* returns Site
* */
const targetsTargetIdSitePATCH = ({ targetUnderscoreid, site }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        site,
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
* Update target's site
* Note that the URL can only be set once.
*
* targetUnderscoreid String Target id
* site Site 
* returns Site
* */
const targetsTargetIdSitePUT = ({ targetUnderscoreid, site }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        site,
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
* Verify site ownership
*
* targetUnderscoreid String Target id
* targetsTargetIdAssetsIdVerifyPostRequest TargetsTargetIdAssetsIdVerifyPostRequest 
* returns _check__post_200_response
* */
const targetsTargetIdSiteVerifyPOST = ({ targetUnderscoreid, targetsTargetIdAssetsIdVerifyPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        targetsTargetIdAssetsIdVerifyPostRequest,
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
  targetsTargetIdSiteGET,
  targetsTargetIdSitePATCH,
  targetsTargetIdSitePUT,
  targetsTargetIdSiteVerifyPOST,
};
