/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get expiring dates on flags for user
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userKey String The user's key.
* returns UserTargetingExpirationOnFlagsForUser
* */
const getExpiringUserTargetsForUser = ({ projectKey, environmentKey, userKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userKey,
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
* Fetch a single flag setting for a user by key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userKey String The user's key.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* returns UserFlagSetting
* */
const getUserFlagSetting = ({ projectKey, environmentKey, userKey, featureFlagKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userKey,
        featureFlagKey,
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
* Fetch a single flag setting for a user by key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userKey String The user's key.
* returns UserFlagSettings
* */
const getUserFlagSettings = ({ projectKey, environmentKey, userKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userKey,
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
* Update, add, or delete expiring user targets for a single user on all flags
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userKey String The user's key.
* semanticPatchWithComment List Requires a Semantic Patch representation of the desired changes to the resource. 'https://apidocs.launchdarkly.com/reference#updates-via-semantic-patches'. The addition of comments is also supported.
* returns UserTargetingExpirationOnFlagsForUser
* */
const patchExpiringUserTargetsForFlags = ({ projectKey, environmentKey, userKey, semanticPatchWithComment }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userKey,
        semanticPatchWithComment,
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
* Specifically enable or disable a feature flag for a user based on their key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userKey String The user's key.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* userSettingsBody PutFlagSettingRequest 
* no response value expected for this operation
* */
const putFlagSetting = ({ projectKey, environmentKey, userKey, featureFlagKey, userSettingsBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userKey,
        featureFlagKey,
        userSettingsBody,
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
  getExpiringUserTargetsForUser,
  getUserFlagSetting,
  getUserFlagSettings,
  patchExpiringUserTargetsForFlags,
  putFlagSetting,
};
