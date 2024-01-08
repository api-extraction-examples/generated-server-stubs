/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket List the fields to include for returned resources of type appScreenshotSets (optional)
* fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket List the fields to include for returned resources of type appScreenshots (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppScreenshotsResponse
* */
const appScreenshotSetsAppScreenshotsGet_to_many_related = ({ id, fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket, fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket,
        fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket,
        limit,
        include,
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
* limit Integer maximum resources per page (optional)
* returns AppScreenshotSetAppScreenshotsLinkagesResponse
* */
const appScreenshotSetsAppScreenshotsGet_to_many_relationship = ({ id, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        limit,
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
* appScreenshotSetAppScreenshotsLinkagesRequest AppScreenshotSetAppScreenshotsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const appScreenshotSetsAppScreenshotsReplace_to_many_relationship = ({ id, appScreenshotSetAppScreenshotsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appScreenshotSetAppScreenshotsLinkagesRequest,
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
* appScreenshotSetCreateRequest AppScreenshotSetCreateRequest AppScreenshotSet representation
* returns AppScreenshotSetResponse
* */
const appScreenshotSetsCreate_instance = ({ appScreenshotSetCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appScreenshotSetCreateRequest,
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
const appScreenshotSetsDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket List the fields to include for returned resources of type appScreenshotSets (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket List the fields to include for returned resources of type appScreenshots (optional)
* limitLeft_Square_BracketappScreenshotsRight_Square_Bracket Integer maximum number of related appScreenshots returned (when they are included) (optional)
* returns AppScreenshotSetResponse
* */
const appScreenshotSetsGet_instance = ({ id, fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket, include, fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket, limitLeft_Square_BracketappScreenshotsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket,
        limitLeft_Square_BracketappScreenshotsRight_Square_Bracket,
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
  appScreenshotSetsAppScreenshotsGet_to_many_related,
  appScreenshotSetsAppScreenshotsGet_to_many_relationship,
  appScreenshotSetsAppScreenshotsReplace_to_many_relationship,
  appScreenshotSetsCreate_instance,
  appScreenshotSetsDelete_instance,
  appScreenshotSetsGet_instance,
};
