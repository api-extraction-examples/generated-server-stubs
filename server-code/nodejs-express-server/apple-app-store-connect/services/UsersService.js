/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* no response value expected for this operation
* */
const usersDelete_instance = ({ id }) => new Promise(
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
* filterLeft_Square_BracketrolesRight_Square_Bracket List filter by attribute 'roles' (optional)
* filterLeft_Square_BracketusernameRight_Square_Bracket List filter by attribute 'username' (optional)
* filterLeft_Square_BracketvisibleAppsRight_Square_Bracket List filter by id(s) of related 'visibleApps' (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketusersRight_Square_Bracket List the fields to include for returned resources of type users (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketvisibleAppsRight_Square_Bracket Integer maximum number of related visibleApps returned (when they are included) (optional)
* returns UsersResponse
* */
const usersGet_collection = ({ filterLeft_Square_BracketrolesRight_Square_Bracket, filterLeft_Square_BracketusernameRight_Square_Bracket, filterLeft_Square_BracketvisibleAppsRight_Square_Bracket, sort, fieldsLeft_Square_BracketusersRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketvisibleAppsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketrolesRight_Square_Bracket,
        filterLeft_Square_BracketusernameRight_Square_Bracket,
        filterLeft_Square_BracketvisibleAppsRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketusersRight_Square_Bracket,
        limit,
        include,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketvisibleAppsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketusersRight_Square_Bracket List the fields to include for returned resources of type users (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketvisibleAppsRight_Square_Bracket Integer maximum number of related visibleApps returned (when they are included) (optional)
* returns UserResponse
* */
const usersGet_instance = ({ id, fieldsLeft_Square_BracketusersRight_Square_Bracket, include, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketvisibleAppsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketusersRight_Square_Bracket,
        include,
        fieldsLeft_Square_BracketappsRight_Square_Bracket,
        limitLeft_Square_BracketvisibleAppsRight_Square_Bracket,
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
* userUpdateRequest UserUpdateRequest User representation
* returns UserResponse
* */
const usersUpdate_instance = ({ id, userUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userUpdateRequest,
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
* userVisibleAppsLinkagesRequest UserVisibleAppsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const usersVisibleAppsCreate_to_many_relationship = ({ id, userVisibleAppsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userVisibleAppsLinkagesRequest,
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
* userVisibleAppsLinkagesRequest UserVisibleAppsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const usersVisibleAppsDelete_to_many_relationship = ({ id, userVisibleAppsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userVisibleAppsLinkagesRequest,
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
const usersVisibleAppsGet_to_many_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit }) => new Promise(
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
* returns UserVisibleAppsLinkagesResponse
* */
const usersVisibleAppsGet_to_many_relationship = ({ id, limit }) => new Promise(
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
* userVisibleAppsLinkagesRequest UserVisibleAppsLinkagesRequest List of related linkages
* no response value expected for this operation
* */
const usersVisibleAppsReplace_to_many_relationship = ({ id, userVisibleAppsLinkagesRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userVisibleAppsLinkagesRequest,
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
  usersDelete_instance,
  usersGet_collection,
  usersGet_instance,
  usersUpdate_instance,
  usersVisibleAppsCreate_to_many_relationship,
  usersVisibleAppsDelete_to_many_relationship,
  usersVisibleAppsGet_to_many_related,
  usersVisibleAppsGet_to_many_relationship,
  usersVisibleAppsReplace_to_many_relationship,
};
