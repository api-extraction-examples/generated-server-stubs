/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket List the fields to include for returned resources of type bundleIds (optional)
* returns BundleIdResponse
* */
const profilesBundleIdGet_to_one_related = ({ id, fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketcertificatesRight_Square_Bracket List the fields to include for returned resources of type certificates (optional)
* limit Integer maximum resources per page (optional)
* returns CertificatesResponse
* */
const profilesCertificatesGet_to_many_related = ({ id, fieldsLeft_Square_BracketcertificatesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketcertificatesRight_Square_Bracket,
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
* profileCreateRequest ProfileCreateRequest Profile representation
* returns ProfileResponse
* */
const profilesCreate_instance = ({ profileCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        profileCreateRequest,
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
const profilesDelete_instance = ({ id }) => new Promise(
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
* fieldsLeft_Square_BracketdevicesRight_Square_Bracket List the fields to include for returned resources of type devices (optional)
* limit Integer maximum resources per page (optional)
* returns DevicesResponse
* */
const profilesDevicesGet_to_many_related = ({ id, fieldsLeft_Square_BracketdevicesRight_Square_Bracket, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketdevicesRight_Square_Bracket,
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
* filterLeft_Square_BracketnameRight_Square_Bracket List filter by attribute 'name' (optional)
* filterLeft_Square_BracketprofileStateRight_Square_Bracket List filter by attribute 'profileState' (optional)
* filterLeft_Square_BracketprofileTypeRight_Square_Bracket List filter by attribute 'profileType' (optional)
* filterLeft_Square_BracketidRight_Square_Bracket List filter by id(s) (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketprofilesRight_Square_Bracket List the fields to include for returned resources of type profiles (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketcertificatesRight_Square_Bracket List the fields to include for returned resources of type certificates (optional)
* fieldsLeft_Square_BracketdevicesRight_Square_Bracket List the fields to include for returned resources of type devices (optional)
* fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket List the fields to include for returned resources of type bundleIds (optional)
* limitLeft_Square_BracketcertificatesRight_Square_Bracket Integer maximum number of related certificates returned (when they are included) (optional)
* limitLeft_Square_BracketdevicesRight_Square_Bracket Integer maximum number of related devices returned (when they are included) (optional)
* returns ProfilesResponse
* */
const profilesGet_collection = ({ filterLeft_Square_BracketnameRight_Square_Bracket, filterLeft_Square_BracketprofileStateRight_Square_Bracket, filterLeft_Square_BracketprofileTypeRight_Square_Bracket, filterLeft_Square_BracketidRight_Square_Bracket, sort, fieldsLeft_Square_BracketprofilesRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketcertificatesRight_Square_Bracket, fieldsLeft_Square_BracketdevicesRight_Square_Bracket, fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket, limitLeft_Square_BracketcertificatesRight_Square_Bracket, limitLeft_Square_BracketdevicesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketnameRight_Square_Bracket,
        filterLeft_Square_BracketprofileStateRight_Square_Bracket,
        filterLeft_Square_BracketprofileTypeRight_Square_Bracket,
        filterLeft_Square_BracketidRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketprofilesRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketcertificatesRight_Square_Bracket,
        fieldsLeft_Square_BracketdevicesRight_Square_Bracket,
        fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket,
        limitLeft_Square_BracketcertificatesRight_Square_Bracket,
        limitLeft_Square_BracketdevicesRight_Square_Bracket,
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
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketcertificatesRight_Square_Bracket List the fields to include for returned resources of type certificates (optional)
* fieldsLeft_Square_BracketdevicesRight_Square_Bracket List the fields to include for returned resources of type devices (optional)
* fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket List the fields to include for returned resources of type bundleIds (optional)
* limitLeft_Square_BracketcertificatesRight_Square_Bracket Integer maximum number of related certificates returned (when they are included) (optional)
* limitLeft_Square_BracketdevicesRight_Square_Bracket Integer maximum number of related devices returned (when they are included) (optional)
* returns ProfileResponse
* */
const profilesGet_instance = ({ id, fieldsLeft_Square_BracketprofilesRight_Square_Bracket, include, fieldsLeft_Square_BracketcertificatesRight_Square_Bracket, fieldsLeft_Square_BracketdevicesRight_Square_Bracket, fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket, limitLeft_Square_BracketcertificatesRight_Square_Bracket, limitLeft_Square_BracketdevicesRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketprofilesRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketcertificatesRight_Square_Bracket,
        fieldsLeft_Square_BracketdevicesRight_Square_Bracket,
        fieldsLeft_Square_BracketbundleIdsRight_Square_Bracket,
        limitLeft_Square_BracketcertificatesRight_Square_Bracket,
        limitLeft_Square_BracketdevicesRight_Square_Bracket,
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
  profilesBundleIdGet_to_one_related,
  profilesCertificatesGet_to_many_related,
  profilesCreate_instance,
  profilesDelete_instance,
  profilesDevicesGet_to_many_related,
  profilesGet_collection,
  profilesGet_instance,
};
