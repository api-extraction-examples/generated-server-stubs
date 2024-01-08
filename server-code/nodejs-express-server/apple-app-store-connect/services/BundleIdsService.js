/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* returns AppResponse
* */
const bundleIdsAppGet_to_one_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
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
* fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket List the fields to include for returned resources of type bundleIdCapabilities (optional)
* limit Integer maximum resources per page (optional)
* returns BundleIdCapabilitiesResponse
* */
const bundleIdsBundleIdCapabilitiesGet_to_many_related = ({ id, fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket,
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
* bundleIdCreateRequest BundleIdCreateRequest BundleId representation
* returns BundleIdResponse
* */
const bundleIdsCreate_instance = ({ bundleIdCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bundleIdCreateRequest,
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
const bundleIdsDelete_instance = ({ id }) => new Promise(
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
* filterLeft_Square_BracketidentifierRight_Square_Bracket List filter by attribute 'identifier' (optional)
* filterLeft_Square_BracketnameRight_Square_Bracket List filter by attribute 'name' (optional)
* filterLeft_Square_BracketplatformRight_Square_Bracket List filter by attribute 'platform' (optional)
* filterLeft_Square_BracketseedIdRight_Square_Bracket List filter by attribute 'seedId' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket List the fields to include for returned resources of type bundleIds (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket List the fields to include for returned resources of type bundleIdCapabilities (optional)
* fieldsLeft_Square_BracketprofilesRight_Square_Bracket List the fields to include for returned resources of type profiles (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket Integer maximum number of related bundleIdCapabilities returned (when they are included) (optional)
* limitLeft_Square_BracketprofilesRight_Square_Bracket Integer maximum number of related profiles returned (when they are included) (optional)
* returns BundleIdsResponse
* */
const bundleIdsGet_collection = ({ filterLeft_Square_BracketidentifierRight_Square_Bracket, filterLeft_Square_BracketnameRight_Square_Bracket, filterLeft_Square_BracketplatformRight_Square_Bracket, filterLeft_Square_BracketseedIdRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, sort, fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket, fieldsLeft_Square_BracketprofilesRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket, limitLeft_Square_BracketprofilesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketidentifierRight_Square_Bracket,
        filterLeft_Square_BracketnameRight_Square_Bracket,
        filterLeft_Square_BracketplatformRight_Square_Bracket,
        filterLeft_Square_BracketseedIdRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket,
        fieldsLeft_Square_BracketprofilesRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket,
        limitLeft_Square_BracketprofilesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket List the fields to include for returned resources of type bundleIds (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket List the fields to include for returned resources of type bundleIdCapabilities (optional)
* fieldsLeft_Square_BracketprofilesRight_Square_Bracket List the fields to include for returned resources of type profiles (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket Integer maximum number of related bundleIdCapabilities returned (when they are included) (optional)
* limitLeft_Square_BracketprofilesRight_Square_Bracket Integer maximum number of related profiles returned (when they are included) (optional)
* returns BundleIdResponse
* */
const bundleIdsGet_instance = ({ id, fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket, include, fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket, fieldsLeft_Square_BracketprofilesRight_Square_Bracket, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket, limitLeft_Square_BracketprofilesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket,
        fieldsLeft_Square_BracketprofilesRight_Square_Bracket,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketbundleIdCapabilitiesRight_Square_Bracket,
        limitLeft_Square_BracketprofilesRight_Square_Bracket,
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
* fieldsLeft_Square_BracketprofilesRight_Square_Bracket List the fields to include for returned resources of type profiles (optional)
* limit Integer maximum resources per page (optional)
* returns ProfilesResponse
* */
const bundleIdsProfilesGet_to_many_related = ({ id, fieldsLeft_Square_BracketprofilesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketprofilesRight_Square_Bracket,
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
* bundleIdUpdateRequest BundleIdUpdateRequest BundleId representation
* returns BundleIdResponse
* */
const bundleIdsUpdate_instance = ({ id, bundleIdUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        bundleIdUpdateRequest,
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
  bundleIdsAppGet_to_one_related,
  bundleIdsBundleIdCapabilitiesGet_to_many_related,
  bundleIdsCreate_instance,
  bundleIdsDelete_instance,
  bundleIdsGet_collection,
  bundleIdsGet_instance,
  bundleIdsProfilesGet_to_many_related,
  bundleIdsUpdate_instance,
};
