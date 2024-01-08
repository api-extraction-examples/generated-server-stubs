/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppResponse
* */
const preReleaseVersionsAppGet_to_one_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
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
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* limit Integer maximum resources per page (optional)
* returns BuildsResponse
* */
const preReleaseVersionsBuildsGet_to_many_related = ({ id, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, limit }) => new Promise(
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
* filterLeft_Square_BracketbuildsPeriodexpiredRight_Square_Bracket List filter by attribute 'builds.expired' (optional)
* filterLeft_Square_BracketbuildsPeriodprocessingStateRight_Square_Bracket List filter by attribute 'builds.processingState' (optional)
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* filterLeft_Square_BracketversionRight_Square_Bracket List filter by attribute 'version' (optional)
* filterLeft_Square_BracketappRight_Square_Bracket List filter by id(s) of related 'app' (optional)
* filterLeft_Square_BracketbuildsRight_Square_Bracket List filter by id(s) of related 'builds' (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket List the fields to include for returned resources of type preReleaseVersions (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketbuildsRight_Square_Bracket Integer maximum number of related builds returned (when they are included) (optional)
* returns PreReleaseVersionsResponse
* */
const preReleaseVersionsGet_collection = ({ filterLeft_Square_BracketbuildsPeriodexpiredRight_Square_Bracket, filterLeft_Square_BracketbuildsPeriodprocessingStateRight_Square_Bracket, filterLeft_Square_BracketplatformRight_Square_Bracket, filterLeft_Square_BracketversionRight_Square_Bracket, filterLeft_Square_BracketappRight_Square_Bracket, filterLeft_Square_BracketbuildsRight_Square_Bracket, sort, fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketbuildsPeriodexpiredRight_Square_Bracket,
        filterLeft_Square_BracketbuildsPeriodprocessingStateRight_Square_Bracket,
        filterLeft_Square_BracketplatformRight_Square_Bracket,
        filterLeft_Square_BracketversionRight_Square_Bracket,
        filterLeft_Square_BracketappRight_Square_Bracket,
        filterLeft_Square_BracketbuildsRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket List the fields to include for returned resources of type preReleaseVersions (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbuildsRight_Square_Bracket List the fields to include for returned resources of type builds (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketbuildsRight_Square_Bracket Integer maximum number of related builds returned (when they are included) (optional)
* returns PrereleaseVersionResponse
* */
const preReleaseVersionsGet_instance = ({ id, fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket, include, fieldsLeft_Square_BracketbuildsRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbuildsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketpreReleaseVersionsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketbuildsRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
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
  preReleaseVersionsAppGet_to_one_related,
  preReleaseVersionsBuildsGet_to_many_related,
  preReleaseVersionsGet_collection,
  preReleaseVersionsGet_instance,
};
