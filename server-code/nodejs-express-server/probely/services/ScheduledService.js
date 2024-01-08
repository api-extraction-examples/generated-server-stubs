/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List scheduled scans for all targets expanding recurrence
*
* length Integer Number of results to return per page (optional)
* returns _targets_all_scheduledscans_expanded__get_200_response
* */
const targetsAllScheduledscansExpandedGET = ({ length }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        length,
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
* List scheduled scans expanding recurrence
*
* targetUnderscoreid String Target id
* length Integer Number of results to return per page (optional)
* returns _targets_all_scheduledscans_expanded__get_200_response
* */
const targetsTargetIdScheduledscansExpandedGET = ({ targetUnderscoreid, length }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        length,
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
* List scheduled scans
*
* targetUnderscoreid String Target id
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _targets__target_id__scheduledscans__get_200_response
* */
const targetsTargetIdScheduledscansGET = ({ targetUnderscoreid, page, length, ordering, search }) => new Promise(
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
* Delete
*
* targetUnderscoreid String Target id
* id String Object Id
* no response value expected for this operation
* */
const targetsTargetIdScheduledscansIdDELETE = ({ targetUnderscoreid, id }) => new Promise(
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
* Retrieve a scheduled scan
*
* targetUnderscoreid String Target id
* id String Object Id
* returns Scheduled
* */
const targetsTargetIdScheduledscansIdGET = ({ targetUnderscoreid, id }) => new Promise(
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
* Partial update
*
* targetUnderscoreid String Target id
* id String Object Id
* targetsTargetIdScheduledscansPostRequest TargetsTargetIdScheduledscansPostRequest 
* returns Scheduled
* */
const targetsTargetIdScheduledscansIdPATCH = ({ targetUnderscoreid, id, targetsTargetIdScheduledscansPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        targetsTargetIdScheduledscansPostRequest,
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
* Update a scheduled scan
*
* targetUnderscoreid String Target id
* id String Object Id
* targetsTargetIdScheduledscansPostRequest TargetsTargetIdScheduledscansPostRequest 
* returns Scheduled
* */
const targetsTargetIdScheduledscansIdPUT = ({ targetUnderscoreid, id, targetsTargetIdScheduledscansPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        targetsTargetIdScheduledscansPostRequest,
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
* Create new scheduled scan
*
* targetUnderscoreid String Target id
* targetsTargetIdScheduledscansPostRequest TargetsTargetIdScheduledscansPostRequest 
* returns Scheduled
* */
const targetsTargetIdScheduledscansPOST = ({ targetUnderscoreid, targetsTargetIdScheduledscansPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        targetsTargetIdScheduledscansPostRequest,
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
  targetsAllScheduledscansExpandedGET,
  targetsTargetIdScheduledscansExpandedGET,
  targetsTargetIdScheduledscansGET,
  targetsTargetIdScheduledscansIdDELETE,
  targetsTargetIdScheduledscansIdGET,
  targetsTargetIdScheduledscansIdPATCH,
  targetsTargetIdScheduledscansIdPUT,
  targetsTargetIdScheduledscansPOST,
};
