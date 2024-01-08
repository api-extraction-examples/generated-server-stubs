/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* betaTesterAppsLinkagesRequest BetaTesterAppsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaTestersAppsDelete_to_many_relationship = ({ id, betaTesterAppsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaTesterAppsLinkagesRequest,
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
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* returns AppsResponse
* */
const betaTestersAppsGet_to_many_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
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
* limit Integer maximum resources per page (optional)
* returns BetaTesterAppsLinkagesResponse
* */
const betaTestersAppsGet_to_many_relationship = ({ id, limit }) => new Promise(
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
* betaTesterBetaGroupsLinkagesRequest BetaTesterBetaGroupsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaTestersBetaGroupsCreate_to_many_relationship = ({ id, betaTesterBetaGroupsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaTesterBetaGroupsLinkagesRequest,
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
* betaTesterBetaGroupsLinkagesRequest BetaTesterBetaGroupsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaTestersBetaGroupsDelete_to_many_relationship = ({ id, betaTesterBetaGroupsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaTesterBetaGroupsLinkagesRequest,
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
* fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket List the fields to include for returned resources of type betaGroups (optional)
* limit Integer maximum resources per page (optional)
* returns BetaGroupsResponse
* */
const betaTestersBetaGroupsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket,
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
* limit Integer maximum resources per page (optional)
* returns BetaTesterBetaGroupsLinkagesResponse
* */
const betaTestersBetaGroupsGet_to_many_relationship = ({ id, limit }) => new Promise(
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
* betaTesterBuildsLinkagesRequest BetaTesterBuildsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaTestersBuildsCreate_to_many_relationship = ({ id, betaTesterBuildsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaTesterBuildsLinkagesRequest,
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
* betaTesterBuildsLinkagesRequest BetaTesterBuildsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaTestersBuildsDelete_to_many_relationship = ({ id, betaTesterBuildsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaTesterBuildsLinkagesRequest,
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
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* limit Integer maximum resources per page (optional)
* returns BuildsResponse
* */
const betaTestersBuildsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
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
* limit Integer maximum resources per page (optional)
* returns BetaTesterBuildsLinkagesResponse
* */
const betaTestersBuildsGet_to_many_relationship = ({ id, limit }) => new Promise(
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
* betaTesterCreateRequest BetaTesterCreateRequest BetaTester representation
* returns BetaTesterResponse
* */
const betaTestersCreate_instance = ({ betaTesterCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        betaTesterCreateRequest,
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
const betaTestersDelete_instance = ({ id }) => new Promise(
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
* filterLeft_Square_BracketemailRight_Square_Bracket List filter by attribute 'email' (optional)
* filterLeft_Square_BracketfirstNameRight_Square_Bracket List filter by attribute 'firstName' (optional)
* filterLeft_Square_BracketinviteTypeRight_Square_Bracket List filter by attribute 'inviteType' (optional)
* filterLeft_Square_BracketlastNameRight_Square_Bracket List filter by attribute 'lastName' (optional)
* filterLeft_Square_BracketappsRight_Square_Bracket List filter by id(s) of related 'apps' (optional)
* filterLeft_Square_BracketbetaGroupsRight_Square_Bracket List filter by id(s) of related 'betaGroups' (optional)
* filterLeft_Square_BracketbuildsRight_Square_Bracket List filter by id(s) of related 'builds' (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket List the fields to include for returned resources of type betaTesters (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket List the fields to include for returned resources of type betaGroups (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketappsRight_Square_Bracket Integer maximum number of related apps returned (when they are included) (optional)
* limitLeft_Square_BracketbetaGroupsRight_Square_Bracket Integer maximum number of related betaGroups returned (when they are included) (optional)
* limitLeft_Square_BracketbuildsRight_Square_Bracket Integer maximum number of related builds returned (when they are included) (optional)
* returns BetaTestersResponse
* */
const betaTestersGet_collection = ({ filterLeft_Square_BracketemailRight_Square_Bracket, filterLeft_Square_BracketfirstNameRight_Square_Bracket, filterLeft_Square_BracketinviteTypeRight_Square_Bracket, filterLeft_Square_BracketlastNameRight_Square_Bracket, filterLeft_Square_BracketappsRight_Square_Bracket, filterLeft_Square_BracketbetaGroupsRight_Square_Bracket, filterLeft_Square_BracketbuildsRight_Square_Bracket, sort, fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbetaGroupsRight_Square_Bracket, limitLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketemailRight_Square_Bracket,
        filterLeft_Square_BracketfirstNameRight_Square_Bracket,
        filterLeft_Square_BracketinviteTypeRight_Square_Bracket,
        filterLeft_Square_BracketlastNameRight_Square_Bracket,
        filterLeft_Square_BracketappsRight_Square_Bracket,
        filterLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        filterLeft_Square_BracketbuildsRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        limitLeft_Square_BracketbuildsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket List the fields to include for returned resources of type betaTesters (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket List the fields to include for returned resources of type betaGroups (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketappsRight_Square_Bracket Integer maximum number of related apps returned (when they are included) (optional)
* limitLeft_Square_BracketbetaGroupsRight_Square_Bracket Integer maximum number of related betaGroups returned (when they are included) (optional)
* limitLeft_Square_BracketbuildsRight_Square_Bracket Integer maximum number of related builds returned (when they are included) (optional)
* returns BetaTesterResponse
* */
const betaTestersGet_instance = ({ id, fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket, include, fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbetaGroupsRight_Square_Bracket, limitLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        limitLeft_Square_BracketbuildsRight_Square_Bracket,
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
  betaTestersAppsDelete_to_many_relationship,
  betaTestersAppsGet_to_many_related,
  betaTestersAppsGet_to_many_relationship,
  betaTestersBetaGroupsCreate_to_many_relationship,
  betaTestersBetaGroupsDelete_to_many_relationship,
  betaTestersBetaGroupsGet_to_many_related,
  betaTestersBetaGroupsGet_to_many_relationship,
  betaTestersBuildsCreate_to_many_relationship,
  betaTestersBuildsDelete_to_many_relationship,
  betaTestersBuildsGet_to_many_related,
  betaTestersBuildsGet_to_many_relationship,
  betaTestersCreate_instance,
  betaTestersDelete_instance,
  betaTestersGet_collection,
  betaTestersGet_instance,
};
