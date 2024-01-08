/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* appInfoLocalizationCreateRequest AppInfoLocalizationCreateRequest AppInfoLocalization representation
* returns AppInfoLocalizationResponse
* */
const appInfoLocalizationsCreate_instance = ({ appInfoLocalizationCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        appInfoLocalizationCreateRequest,
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
const appInfoLocalizationsDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket List the fields to include for returned resources of type appInfoLocalizations (optional)
* include List comma-separated list of relationships to include (optional)
* returns AppInfoLocalizationResponse
* */
const appInfoLocalizationsGet_instance = ({ id, fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappInfoLocalizationsRight_Square_Bracket,
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
* appInfoLocalizationUpdateRequest AppInfoLocalizationUpdateRequest AppInfoLocalization representation
* returns AppInfoLocalizationResponse
* */
const appInfoLocalizationsUpdate_instance = ({ id, appInfoLocalizationUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appInfoLocalizationUpdateRequest,
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
  appInfoLocalizationsCreate_instance,
  appInfoLocalizationsDelete_instance,
  appInfoLocalizationsGet_instance,
  appInfoLocalizationsUpdate_instance,
};
