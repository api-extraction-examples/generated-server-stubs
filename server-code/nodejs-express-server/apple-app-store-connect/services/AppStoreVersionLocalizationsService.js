/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* filterLeft_Square_BracketpreviewTypeRight_Square_Bracket List filter by attribute 'previewType' (optional)
* fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionLocalizations (optional)
* fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket List the fields to include for returned resources of type appPreviews (optional)
* fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket List the fields to include for returned resources of type appPreviewSets (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppPreviewSetsResponse
* */
const appStoreVersionLocalizationsAppPreviewSetsGet_to_many_related = ({ id, filterLeft_Square_BracketpreviewTypeRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketappPreviewsRight_Square_Bracket, fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketpreviewTypeRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket,
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
* filterLeft_Square_BracketscreenshotDisplayTypeRight_Square_Bracket List filter by attribute 'screenshotDisplayType' (optional)
* fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionLocalizations (optional)
* fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket List the fields to include for returned resources of type appScreenshotSets (optional)
* fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket List the fields to include for returned resources of type appScreenshots (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppScreenshotSetsResponse
* */
const appStoreVersionLocalizationsAppScreenshotSetsGet_to_many_related = ({ id, filterLeft_Square_BracketscreenshotDisplayTypeRight_Square_Bracket, fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket, fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket, fieldsLeft_Square_BracketappScreenshotsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketscreenshotDisplayTypeRight_Square_Bracket,
        fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket,
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
* appStoreVersionLocalizationCreateRequest AppStoreVersionLocalizationCreateRequest AppStoreVersionLocalization representation
* returns AppStoreVersionLocalizationResponse
* */
const appStoreVersionLocalizationsCreate_instance = ({ appStoreVersionLocalizationCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appStoreVersionLocalizationCreateRequest,
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
const appStoreVersionLocalizationsDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appStoreVersionLocalizations (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket List the fields to include for returned resources of type appScreenshotSets (optional)
* fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket List the fields to include for returned resources of type appPreviewSets (optional)
* limitLeft_Square_BracketappPreviewSetsRight_Square_Bracket Integer maximum number of related appPreviewSets returned (when they are included) (optional)
* limitLeft_Square_BracketappScreenshotSetsRight_Square_Bracket Integer maximum number of related appScreenshotSets returned (when they are included) (optional)
* returns AppStoreVersionLocalizationResponse
* */
const appStoreVersionLocalizationsGet_instance = ({ id, fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket, include, fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket, fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket, limitLeft_Square_BracketappPreviewSetsRight_Square_Bracket, limitLeft_Square_BracketappScreenshotSetsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappStoreVersionLocalizationsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappScreenshotSetsRight_Square_Bracket,
        fieldsLeft_Square_BracketappPreviewSetsRight_Square_Bracket,
        limitLeft_Square_BracketappPreviewSetsRight_Square_Bracket,
        limitLeft_Square_BracketappScreenshotSetsRight_Square_Bracket,
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
* appStoreVersionLocalizationUpdateRequest AppStoreVersionLocalizationUpdateRequest AppStoreVersionLocalization representation
* returns AppStoreVersionLocalizationResponse
* */
const appStoreVersionLocalizationsUpdate_instance = ({ id, appStoreVersionLocalizationUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appStoreVersionLocalizationUpdateRequest,
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
  appStoreVersionLocalizationsAppPreviewSetsGet_to_many_related,
  appStoreVersionLocalizationsAppScreenshotSetsGet_to_many_related,
  appStoreVersionLocalizationsCreate_instance,
  appStoreVersionLocalizationsDelete_instance,
  appStoreVersionLocalizationsGet_instance,
  appStoreVersionLocalizationsUpdate_instance,
};
