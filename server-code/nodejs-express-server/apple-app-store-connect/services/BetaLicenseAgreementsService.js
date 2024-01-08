/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppResponse
* */
const betaLicenseAgreementsAppGet_to_one_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
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
* filterLeft_Square_BracketappRight_Square_Bracket List filter by id(s) of related 'app' (optional)
* fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type betaLicenseAgreements (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns BetaLicenseAgreementsResponse
* */
const betaLicenseAgreementsGet_collection = ({ filterLeft_Square_BracketappRight_Square_Bracket, fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketappRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type betaLicenseAgreements (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns BetaLicenseAgreementResponse
* */
const betaLicenseAgreementsGet_instance = ({ id, fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket, include, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaLicenseAgreementsRight_Square_Bracket,
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
* betaLicenseAgreementUpdateRequest BetaLicenseAgreementUpdateRequest BetaLicenseAgreement representation
* returns BetaLicenseAgreementResponse
* */
const betaLicenseAgreementsUpdate_instance = ({ id, betaLicenseAgreementUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaLicenseAgreementUpdateRequest,
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
  betaLicenseAgreementsAppGet_to_one_related,
  betaLicenseAgreementsGet_collection,
  betaLicenseAgreementsGet_instance,
  betaLicenseAgreementsUpdate_instance,
};
