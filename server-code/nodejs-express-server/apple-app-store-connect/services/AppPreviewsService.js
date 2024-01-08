/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* appPreviewCreateRequest AppPreviewCreateRequest AppPreview representation
* returns AppPreviewResponse
* */
const appPreviewsCreate_instance = ({ appPreviewCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appPreviewCreateRequest,
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
const appPreviewsDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket List the fields to include for returned resources of type appPreviews (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppPreviewResponse
* */
const appPreviewsGet_instance = ({ id, fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket,
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
* appPreviewUpdateRequest AppPreviewUpdateRequest AppPreview representation
* returns AppPreviewResponse
* */
const appPreviewsUpdate_instance = ({ id, appPreviewUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appPreviewUpdateRequest,
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
  appPreviewsCreate_instance,
  appPreviewsDelete_instance,
  appPreviewsGet_instance,
  appPreviewsUpdate_instance,
};
