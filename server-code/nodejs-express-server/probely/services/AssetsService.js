/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List target's assets
*
* targetUnderscoreid String Target id
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _targets__target_id__assets__get_200_response
* */
const targetsTargetIdAssetsGET = ({ targetUnderscoreid, page, length, ordering, search }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        page,
        length,
        ordering,
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
* Delete asset
*
* targetUnderscoreid String Target id
* id String Object Id
* no response value expected for this operation
* */
const targetsTargetIdAssetsIdDELETE = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Retrieve asset
*
* targetUnderscoreid String Target id
* id String Object Id
* returns Asset
* */
const targetsTargetIdAssetsIdGET = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Partial update assets
*
* targetUnderscoreid String Target id
* id String Object Id
* asset Asset 
* returns Asset
* */
const targetsTargetIdAssetsIdPATCH = ({ targetUnderscoreid, id, asset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        asset,
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
* Update asset
*
* targetUnderscoreid String Target id
* id String Object Id
* asset Asset 
* returns Asset
* */
const targetsTargetIdAssetsIdPUT = ({ targetUnderscoreid, id, asset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        asset,
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
* Verify asset ownership
*
* targetUnderscoreid String Target id
* id String Object Id
* targetsTargetIdAssetsIdVerifyPostRequest TargetsTargetIdAssetsIdVerifyPostRequest 
* returns _check__post_200_response
* */
const targetsTargetIdAssetsIdVerifyPOST = ({ targetUnderscoreid, id, targetsTargetIdAssetsIdVerifyPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
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
/**
* Create new asset
*
* targetUnderscoreid String Target id
* asset Asset 
* returns Asset
* */
const targetsTargetIdAssetsPOST = ({ targetUnderscoreid, asset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        asset,
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
  targetsTargetIdAssetsGET,
  targetsTargetIdAssetsIdDELETE,
  targetsTargetIdAssetsIdGET,
  targetsTargetIdAssetsIdPATCH,
  targetsTargetIdAssetsIdPUT,
  targetsTargetIdAssetsIdVerifyPOST,
  targetsTargetIdAssetsPOST,
};
