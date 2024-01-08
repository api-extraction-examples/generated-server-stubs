/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppResponse
* */
const betaAppReviewDetailsAppGet_to_one_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
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
* filterLeft_Square_BracketappRight_Square_Bracket List filter by id(s) of related 'app'
* fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewDetails (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns BetaAppReviewDetailsResponse
* */
const betaAppReviewDetailsGet_collection = ({ filterLeft_Square_BracketappRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketappRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewDetails (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns BetaAppReviewDetailResponse
* */
const betaAppReviewDetailsGet_instance = ({ id, fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket, include, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaAppReviewDetailsRight_Square_Bracket,
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
* betaAppReviewDetailUpdateRequest BetaAppReviewDetailUpdateRequest BetaAppReviewDetail representation
* returns BetaAppReviewDetailResponse
* */
const betaAppReviewDetailsUpdate_instance = ({ id, betaAppReviewDetailUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaAppReviewDetailUpdateRequest,
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
  betaAppReviewDetailsAppGet_to_one_related,
  betaAppReviewDetailsGet_collection,
  betaAppReviewDetailsGet_instance,
  betaAppReviewDetailsUpdate_instance,
};
