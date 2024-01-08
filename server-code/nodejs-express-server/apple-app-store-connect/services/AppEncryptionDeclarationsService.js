/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppResponse
* */
const appEncryptionDeclarationsAppGet_to_one_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
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
* id String the id of the requested resource
* appEncryptionDeclarationBuildsLinkagesRequest AppEncryptionDeclarationBuildsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const appEncryptionDeclarationsBuildsCreate_to_many_relationship = ({ id, appEncryptionDeclarationBuildsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        appEncryptionDeclarationBuildsLinkagesRequest,
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
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* filterLeft_Square_BracketappRight_Square_Bracket List filter by id(s) of related 'app' (optional)
* filterLeft_Square_BracketbuildsRight_Square_Bracket List filter by id(s) of related 'builds' (optional)
* fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket List the fields to include for returned resources of type appEncryptionDeclarations (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppEncryptionDeclarationsResponse
* */
const appEncryptionDeclarationsGet_collection = ({ filterLeft_Square_BracketplatformRight_Square_Bracket, filterLeft_Square_BracketappRight_Square_Bracket, filterLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketplatformRight_Square_Bracket,
        filterLeft_Square_BracketappRight_Square_Bracket,
        filterLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket List the fields to include for returned resources of type appEncryptionDeclarations (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppEncryptionDeclarationResponse
* */
const appEncryptionDeclarationsGet_instance = ({ id, fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket, include, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappEncryptionDeclarationsRight_Square_Bracket,
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

module.exports = {
  appEncryptionDeclarationsAppGet_to_one_related,
  appEncryptionDeclarationsBuildsCreate_to_many_relationship,
  appEncryptionDeclarationsGet_collection,
  appEncryptionDeclarationsGet_instance,
};
