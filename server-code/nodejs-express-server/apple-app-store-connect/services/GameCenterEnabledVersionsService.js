/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* gameCenterEnabledVersionCompatibleVersionsLinkagesRequest GameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const gameCenterEnabledVersionsCompatibleVersionsCreate_to_many_relationship = ({ id, gameCenterEnabledVersionCompatibleVersionsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        gameCenterEnabledVersionCompatibleVersionsLinkagesRequest,
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
* gameCenterEnabledVersionCompatibleVersionsLinkagesRequest GameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const gameCenterEnabledVersionsCompatibleVersionsDelete_to_many_relationship = ({ id, gameCenterEnabledVersionCompatibleVersionsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        gameCenterEnabledVersionCompatibleVersionsLinkagesRequest,
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
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* filterLeft_Square_BracketversionStringRight_Square_Bracket List filter by attribute 'versionString' (optional)
* filterLeft_Square_BracketappRight_Square_Bracket List filter by id(s) of related 'app' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket List the fields to include for returned resources of type gameCenterEnabledVersions (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* returns GameCenterEnabledVersionsResponse
* */
const gameCenterEnabledVersionsCompatibleVersionsGet_to_many_related = ({ id, filterLeft_Square_BracketplatformRight_Square_Bracket, filterLeft_Square_BracketversionStringRight_Square_Bracket, filterLeft_Square_BracketappRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, sort, fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit, include }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        filterLeft_Square_BracketplatformRight_Square_Bracket,
        filterLeft_Square_BracketversionStringRight_Square_Bracket,
        filterLeft_Square_BracketappRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketgameCenterEnabledVersionsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
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
* returns GameCenterEnabledVersionCompatibleVersionsLinkagesResponse
* */
const gameCenterEnabledVersionsCompatibleVersionsGet_to_many_relationship = ({ id, limit }) => new Promise(
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
* gameCenterEnabledVersionCompatibleVersionsLinkagesRequest GameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const gameCenterEnabledVersionsCompatibleVersionsReplace_to_many_relationship = ({ id, gameCenterEnabledVersionCompatibleVersionsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        gameCenterEnabledVersionCompatibleVersionsLinkagesRequest,
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
  gameCenterEnabledVersionsCompatibleVersionsCreate_to_many_relationship,
  gameCenterEnabledVersionsCompatibleVersionsDelete_to_many_relationship,
  gameCenterEnabledVersionsCompatibleVersionsGet_to_many_related,
  gameCenterEnabledVersionsCompatibleVersionsGet_to_many_relationship,
  gameCenterEnabledVersionsCompatibleVersionsReplace_to_many_relationship,
};
