/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket List the fields to include for returned resources of type appPreviews (optional)
* fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket List the fields to include for returned resources of type appPreviewSets (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppPreviewsResponse
* */
const appPreviewSetsAppPreviewsGet_to_many_related = ({ id, fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket, fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket,
        fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket,
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
* returns AppPreviewSetAppPreviewsLinkagesResponse
* */
const appPreviewSetsAppPreviewsGet_to_many_relationship = ({ id, limit }) => new Promise(
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
* appPreviewSetAppPreviewsLinkagesRequest AppPreviewSetAppPreviewsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const appPreviewSetsAppPreviewsReplace_to_many_relationship = ({ id, appPreviewSetAppPreviewsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appPreviewSetAppPreviewsLinkagesRequest,
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
* appPreviewSetCreateRequest AppPreviewSetCreateRequest AppPreviewSet representation
* returns AppPreviewSetResponse
* */
const appPreviewSetsCreate_instance = ({ appPreviewSetCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appPreviewSetCreateRequest,
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
const appPreviewSetsDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket List the fields to include for returned resources of type appPreviewSets (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket List the fields to include for returned resources of type appPreviews (optional)
* limitLeft_Square_BracketappPreviewsRight_Square_Bracket Integer maximum number of related appPreviews returned (when they are included) (optional)
* returns AppPreviewSetResponse
* */
const appPreviewSetsGet_instance = ({ id, fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket, include, fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket, limitLeft_Square_BracketappPreviewsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket,
        limitLeft_Square_BracketappPreviewsRight_Square_Bracket,
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
  appPreviewSetsAppPreviewsGet_to_many_related,
  appPreviewSetsAppPreviewsGet_to_many_relationship,
  appPreviewSetsAppPreviewsReplace_to_many_relationship,
  appPreviewSetsCreate_instance,
  appPreviewSetsDelete_instance,
  appPreviewSetsGet_instance,
};
