/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* userInvitationCreateRequest UserInvitationCreateRequest UserInvitation representation
* returns UserInvitationResponse
* */
const userInvitationsCreate_instance = ({ userInvitationCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userInvitationCreateRequest,
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
const userInvitationsDelete_instance = ({ id }) => new Promise(
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
* filterLeft_Square_BracketrolesRight_Square_Bracket List filter by attribute 'roles' (optional)
* filterLeft_Square_BracketvisibleAppsRight_Square_Bracket List filter by id(s) of related 'visibleApps' (optional)
* sort List comma-separated list of sort expressions; resources will be sorted as specified (optional)
* fieldsLeft_Square_BracketuserInvitationsRight_Square_Bracket List the fields to include for returned resources of type userInvitations (optional)
* limit Integer maximum resources per page (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketvisibleAppsRight_Square_Bracket Integer maximum number of related visibleApps returned (when they are included) (optional)
* returns UserInvitationsResponse
* */
const userInvitationsGet_collection = ({ filterLeft_Square_BracketemailRight_Square_Bracket, filterLeft_Square_BracketrolesRight_Square_Bracket, filterLeft_Square_BracketvisibleAppsRight_Square_Bracket, sort, fieldsLeft_Square_BracketuserInvitationsRight_Square_Bracket, limit, include, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketvisibleAppsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        filterLeft_Square_BracketemailRight_Square_Bracket,
        filterLeft_Square_BracketrolesRight_Square_Bracket,
        filterLeft_Square_BracketvisibleAppsRight_Square_Bracket,
        sort,
        fieldsLeft_Square_BracketuserInvitationsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketuserInvitationsRight_Square_Bracket List the fields to include for returned resources of type userInvitations (optional)
* include List comma-separated list of relationships to include (optional)
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limitLeft_Square_BracketvisibleAppsRight_Square_Bracket Integer maximum number of related visibleApps returned (when they are included) (optional)
* returns UserInvitationResponse
* */
const userInvitationsGet_instance = ({ id, fieldsLeft_Square_BracketuserInvitationsRight_Square_Bracket, include, fieldsLeft_Square_BracketappsRight_Square_Bracket, limitLeft_Square_BracketvisibleAppsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketuserInvitationsRight_Square_Bracket,
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
* fieldsLeft_Square_BracketappsRight_Square_Bracket List the fields to include for returned resources of type apps (optional)
* limit Integer maximum resources per page (optional)
* returns AppsResponse
* */
const userInvitationsVisibleAppsGet_to_many_related = ({ id, fieldsLeft_Square_BracketappsRight_Square_Bracket, limit }) => new Promise(
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

module.exports = {
  userInvitationsCreate_instance,
  userInvitationsDelete_instance,
  userInvitationsGet_collection,
  userInvitationsGet_instance,
  userInvitationsVisibleAppsGet_to_many_related,
};
