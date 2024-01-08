/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppResponse
* */
const betaAppLocalizationsAppGet_to_one_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
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
* betaAppLocalizationCreateRequest BetaAppLocalizationCreateRequest BetaAppLocalization representation
* returns BetaAppLocalizationResponse
* */
const betaAppLocalizationsCreate_instance = ({ betaAppLocalizationCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        betaAppLocalizationCreateRequest,
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
const betaAppLocalizationsDelete_instance = ({ id }) => new Promise(
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
* filterLeft_Square_BracketlocaleRight_Square_Bracket List filter by attribute 'locale' (optional)
* filterLeft_Square_BracketappRight_Square_Bracket List filter by id(s) of related 'app' (optional)
* fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaAppLocalizations (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns BetaAppLocalizationsResponse
* */
const betaAppLocalizationsGet_collection = ({ filterLeft_Square_BracketlocaleRight_Square_Bracket, filterLeft_Square_BracketappRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketlocaleRight_Square_Bracket,
        filterLeft_Square_BracketappRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaAppLocalizations (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns BetaAppLocalizationResponse
* */
const betaAppLocalizationsGet_instance = ({ id, fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket, include, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaAppLocalizationsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
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
* betaAppLocalizationUpdateRequest BetaAppLocalizationUpdateRequest BetaAppLocalization representation
* returns BetaAppLocalizationResponse
* */
const betaAppLocalizationsUpdate_instance = ({ id, betaAppLocalizationUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaAppLocalizationUpdateRequest,
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
  betaAppLocalizationsAppGet_to_one_related,
  betaAppLocalizationsCreate_instance,
  betaAppLocalizationsDelete_instance,
  betaAppLocalizationsGet_collection,
  betaAppLocalizationsGet_instance,
  betaAppLocalizationsUpdate_instance,
};
