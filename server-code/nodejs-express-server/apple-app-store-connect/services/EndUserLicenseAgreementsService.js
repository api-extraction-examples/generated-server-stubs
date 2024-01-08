/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* endUserLicenseAgreementCreateRequest EndUserLicenseAgreementCreateRequest EndUserLicenseAgreement representation
* returns EndUserLicenseAgreementResponse
* */
const endUserLicenseAgreementsCreate_instance = ({ endUserLicenseAgreementCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        endUserLicenseAgreementCreateRequest,
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
const endUserLicenseAgreementsDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket List the fields to include for returned resources of type endUserLicenseAgreements (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* limitLeft_Square_BracketterritoriesRight_Square_Bracket Integer maximum number of related territories returned (when they are included) (optional)
* returns EndUserLicenseAgreementResponse
* */
const endUserLicenseAgreementsGet_instance = ({ id, fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket, include, fieldsLeft_Square_BracketterritoriesRight_Square_Bracket, limitLeft_Square_BracketterritoriesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketendUserLicenseAgreementsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
        limitLeft_Square_BracketterritoriesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketterritoriesRight_Square_Bracket List the fields to include for returned resources of type territories (optional)
* limit Integer maximum resources per page (optional)
* returns TerritoriesResponse
* */
const endUserLicenseAgreementsTerritoriesGet_to_many_related = ({ id, fieldsLeft_Square_BracketterritoriesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketterritoriesRight_Square_Bracket,
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
* endUserLicenseAgreementUpdateRequest EndUserLicenseAgreementUpdateRequest EndUserLicenseAgreement representation
* returns EndUserLicenseAgreementResponse
* */
const endUserLicenseAgreementsUpdate_instance = ({ id, endUserLicenseAgreementUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        endUserLicenseAgreementUpdateRequest,
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
  endUserLicenseAgreementsCreate_instance,
  endUserLicenseAgreementsDelete_instance,
  endUserLicenseAgreementsGet_instance,
  endUserLicenseAgreementsTerritoriesGet_to_many_related,
  endUserLicenseAgreementsUpdate_instance,
};
