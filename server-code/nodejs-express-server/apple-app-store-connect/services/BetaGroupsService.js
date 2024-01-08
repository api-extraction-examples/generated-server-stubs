/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppResponse
* */
const betaGroupsAppGet_to_one_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
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
* betaGroupBetaTestersLinkagesRequest BetaGroupBetaTestersLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaGroupsBetaTestersCreate_to_many_relationship = ({ id, betaGroupBetaTestersLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaGroupBetaTestersLinkagesRequest,
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
* betaGroupBetaTestersLinkagesRequest BetaGroupBetaTestersLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaGroupsBetaTestersDelete_to_many_relationship = ({ id, betaGroupBetaTestersLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaGroupBetaTestersLinkagesRequest,
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
* limit Integer maximum resources per page (optional)
* returns BetaTestersResponse
* */
const betaGroupsBetaTestersGet_to_many_related = ({ id, fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket,
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
* returns BetaGroupBetaTestersLinkagesResponse
* */
const betaGroupsBetaTestersGet_to_many_relationship = ({ id, limit }) => new Promise(
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
* betaGroupBuildsLinkagesRequest BetaGroupBuildsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaGroupsBuildsCreate_to_many_relationship = ({ id, betaGroupBuildsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaGroupBuildsLinkagesRequest,
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
* betaGroupBuildsLinkagesRequest BetaGroupBuildsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const betaGroupsBuildsDelete_to_many_relationship = ({ id, betaGroupBuildsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaGroupBuildsLinkagesRequest,
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
const betaGroupsBuildsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, limit }) => new Promise(
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
* returns BetaGroupBuildsLinkagesResponse
* */
const betaGroupsBuildsGet_to_many_relationship = ({ id, limit }) => new Promise(
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
* betaGroupCreateRequest BetaGroupCreateRequest BetaGroup representation
* returns BetaGroupResponse
* */
const betaGroupsCreate_instance = ({ betaGroupCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        betaGroupCreateRequest,
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
const betaGroupsDelete_instance = ({ id }) => new Promise(
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
* filterLeft_Square_BracketisInternalGroupRight_Square_Bracket List filter by attribute 'isInternalGroup' (optional)
* filterLeft_Square_BracketnameRight_Square_Bracket List filter by attribute 'name' (optional)
* filterLeft_Square_BracketpublicLinkRight_Square_Bracket List filter by attribute 'publicLink' (optional)
* filterLeft_Square_BracketpublicLinkEnabledRight_Square_Bracket List filter by attribute 'publicLinkEnabled' (optional)
* filterLeft_Square_BracketpublicLinkLimitEnabledRight_Square_Bracket List filter by attribute 'publicLinkLimitEnabled' (optional)
* filterLeft_Square_BracketappRight_Square_Bracket List filter by id(s) of related 'app' (optional)
* filterLeft_Square_BracketbuildsRight_Square_Bracket List filter by id(s) of related 'builds' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket List the fields to include for returned resources of type betaGroups (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket List the fields to include for returned resources of type betaTesters (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketbetaTestersRight_Square_Bracket Integer maximum number of related betaTesters returned (when they are included) (optional)
* limitLeft_Square_BracketbuildsRight_Square_Bracket Integer maximum number of related builds returned (when they are included) (optional)
* returns BetaGroupsResponse
* */
const betaGroupsGet_collection = ({ filterLeft_Square_BracketisInternalGroupRight_Square_Bracket, filterLeft_Square_BracketnameRight_Square_Bracket, filterLeft_Square_BracketpublicLinkRight_Square_Bracket, filterLeft_Square_BracketpublicLinkEnabledRight_Square_Bracket, filterLeft_Square_BracketpublicLinkLimitEnabledRight_Square_Bracket, filterLeft_Square_BracketappRight_Square_Bracket, filterLeft_Square_BracketbuildsRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, sort, fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbetaTestersRight_Square_Bracket, limitLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketisInternalGroupRight_Square_Bracket,
        filterLeft_Square_BracketnameRight_Square_Bracket,
        filterLeft_Square_BracketpublicLinkRight_Square_Bracket,
        filterLeft_Square_BracketpublicLinkEnabledRight_Square_Bracket,
        filterLeft_Square_BracketpublicLinkLimitEnabledRight_Square_Bracket,
        filterLeft_Square_BracketappRight_Square_Bracket,
        filterLeft_Square_BracketbuildsRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketbetaTestersRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket List the fields to include for returned resources of type betaGroups (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket List the fields to include for returned resources of type betaTesters (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketbetaTestersRight_Square_Bracket Integer maximum number of related betaTesters returned (when they are included) (optional)
* limitLeft_Square_BracketbuildsRight_Square_Bracket Integer maximum number of related builds returned (when they are included) (optional)
* returns BetaGroupResponse
* */
const betaGroupsGet_instance = ({ id, fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbetaTestersRight_Square_Bracket, limitLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbetaGroupsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketbetaTestersRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketbetaTestersRight_Square_Bracket,
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
* betaGroupUpdateRequest BetaGroupUpdateRequest BetaGroup representation
* returns BetaGroupResponse
* */
const betaGroupsUpdate_instance = ({ id, betaGroupUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        betaGroupUpdateRequest,
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
  betaGroupsAppGet_to_one_related,
  betaGroupsBetaTestersCreate_to_many_relationship,
  betaGroupsBetaTestersDelete_to_many_relationship,
  betaGroupsBetaTestersGet_to_many_related,
  betaGroupsBetaTestersGet_to_many_relationship,
  betaGroupsBuildsCreate_to_many_relationship,
  betaGroupsBuildsDelete_to_many_relationship,
  betaGroupsBuildsGet_to_many_related,
  betaGroupsBuildsGet_to_many_relationship,
  betaGroupsCreate_instance,
  betaGroupsDelete_instance,
  betaGroupsGet_collection,
  betaGroupsGet_instance,
  betaGroupsUpdate_instance,
};
