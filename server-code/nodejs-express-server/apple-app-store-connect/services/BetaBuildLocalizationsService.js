/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BuildResponse
* */
const betaBuildLocalizationsBuildGet_to_one_related = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
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
* betaBuildLocalizationCreateRequest BetaBuildLocalizationCreateRequest BetaBuildLocalization representation
* returns BetaBuildLocalizationResponse
* */
const betaBuildLocalizationsCreate_instance = ({ betaBuildLocalizationCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        betaBuildLocalizationCreateRequest,
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
const betaBuildLocalizationsDelete_instance = ({ id }) => new Promise(
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
* filterLeft_Square_BracketbuildRight_Square_Bracket List filter by id(s) of related 'build' (optional)
* fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaBuildLocalizations (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BetaBuildLocalizationsResponse
* */
const betaBuildLocalizationsGet_collection = ({ filterLeft_Square_BracketlocaleRight_Square_Bracket, filterLeft_Square_BracketbuildRight_Square_Bracket, fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketlocaleRight_Square_Bracket,
        filterLeft_Square_BracketbuildRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket List the fields to include for returned resources of type betaBuildLocalizations (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BetaBuildLocalizationResponse
* */
const betaBuildLocalizationsGet_instance = ({ id, fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaBuildLocalizationsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
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
* betaBuildLocalizationUpdateRequest BetaBuildLocalizationUpdateRequest BetaBuildLocalization representation
* returns BetaBuildLocalizationResponse
* */
const betaBuildLocalizationsUpdate_instance = ({ id, betaBuildLocalizationUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaBuildLocalizationUpdateRequest,
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
  betaBuildLocalizationsBuildGet_to_one_related,
  betaBuildLocalizationsCreate_instance,
  betaBuildLocalizationsDelete_instance,
  betaBuildLocalizationsGet_collection,
  betaBuildLocalizationsGet_instance,
  betaBuildLocalizationsUpdate_instance,
};
