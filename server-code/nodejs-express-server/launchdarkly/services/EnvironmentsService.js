/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete an environment in a specific project.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* no response value expected for this operation
* */
const deleteEnvironment = ({ projectKey, environmentKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
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
* Get an environment given a project and key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* returns Environment
* */
const getEnvironment = ({ projectKey, environmentKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
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
* Modify an environment by ID. If you try to patch the environment by setting both required and requiredApprovalTags, it will result in an error. Users can specify either required approvals for all flags in an environment or those with specific tags, but not both. Only customers on an Enterprise plan can require approval for flag updates with either mechanism.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* patchDelta List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'
* returns Environment
* */
const patchEnvironment = ({ projectKey, environmentKey, patchDelta }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        patchDelta,
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
* Create a new environment in a specified project with a given name, key, and swatch color.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentBody EnvironmentPost New environment.
* returns Environment
* */
const postEnvironment = ({ projectKey, environmentBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentBody,
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
* Reset an environment's mobile key. The optional expiry for the old key is deprecated for this endpoint, so the old key will always expire immediately.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* expiry Long The expiry parameter is deprecated for this endpoint, so the old mobile key will always expire immediately. This parameter will be removed in an upcoming major API client version. (optional)
* returns Environment
* */
const resetEnvironmentMobileKey = ({ projectKey, environmentKey, expiry }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        expiry,
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
* Reset an environment's SDK key with an optional expiry time for the old key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* expiry Long An expiration time for the old environment SDK key, expressed as a Unix epoch time in milliseconds. By default, the key will expire immediately. (optional)
* returns Environment
* */
const resetEnvironmentSDKKey = ({ projectKey, environmentKey, expiry }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        expiry,
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
  deleteEnvironment,
  getEnvironment,
  patchEnvironment,
  postEnvironment,
  resetEnvironmentMobileKey,
  resetEnvironmentSDKKey,
};
