/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BuildResponse
* */
const betaAppReviewSubmissionsBuildGet_to_one_related = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
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
* betaAppReviewSubmissionCreateRequest BetaAppReviewSubmissionCreateRequest BetaAppReviewSubmission representation
* returns BetaAppReviewSubmissionResponse
* */
const betaAppReviewSubmissionsCreate_instance = ({ betaAppReviewSubmissionCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        betaAppReviewSubmissionCreateRequest,
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
* filterLeft_Square_BracketbuildRight_Square_Bracket List filter by id(s) of related 'build'
* filterLeft_Square_BracketbetaReviewStateRight_Square_Bracket List filter by attribute 'betaReviewState' (optional)
* fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewSubmissions (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BetaAppReviewSubmissionsResponse
* */
const betaAppReviewSubmissionsGet_collection = ({ filterLeft_Square_BracketbuildRight_Square_Bracket, filterLeft_Square_BracketbetaReviewStateRight_Square_Bracket, fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketbuildRight_Square_Bracket,
        filterLeft_Square_BracketbetaReviewStateRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket List the fields to include for returned resources of type betaAppReviewSubmissions (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* returns BetaAppReviewSubmissionResponse
* */
const betaAppReviewSubmissionsGet_instance = ({ id, fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaAppReviewSubmissionsRight_Square_Bracket,
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

module.exports = {
  betaAppReviewSubmissionsBuildGet_to_one_related,
  betaAppReviewSubmissionsCreate_instance,
  betaAppReviewSubmissionsGet_collection,
  betaAppReviewSubmissionsGet_instance,
};
