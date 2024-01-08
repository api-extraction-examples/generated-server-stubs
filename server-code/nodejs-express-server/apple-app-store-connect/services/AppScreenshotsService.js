/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* appScreenshotCreateRequest AppScreenshotCreateRequest AppScreenshot representation
* returns AppScreenshotResponse
* */
const appScreenshotsCreate_instance = ({ appScreenshotCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appScreenshotCreateRequest,
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
const appScreenshotsDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket List the fields to include for returned resources of type appScreenshots (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppScreenshotResponse
* */
const appScreenshotsGet_instance = ({ id, fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket,
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
* appScreenshotUpdateRequest AppScreenshotUpdateRequest AppScreenshot representation
* returns AppScreenshotResponse
* */
const appScreenshotsUpdate_instance = ({ id, appScreenshotUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appScreenshotUpdateRequest,
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
  appScreenshotsCreate_instance,
  appScreenshotsDelete_instance,
  appScreenshotsGet_instance,
  appScreenshotsUpdate_instance,
};
