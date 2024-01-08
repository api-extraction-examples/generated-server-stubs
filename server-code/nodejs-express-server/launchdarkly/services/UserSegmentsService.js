/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete a user segment.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userSegmentKey String The user segment's key. The key identifies the user segment in your code.
* no response value expected for this operation
* */
const deleteUserSegment = ({ projectKey, environmentKey, userSegmentKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userSegmentKey,
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
* Get expiring user targets for user segment
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userSegmentKey String The user segment's key. The key identifies the user segment in your code.
* returns UserTargetingExpirationForSegment
* */
const getExpiringUserTargetsOnSegment = ({ projectKey, environmentKey, userSegmentKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userSegmentKey,
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
* Get a single user segment by key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userSegmentKey String The user segment's key. The key identifies the user segment in your code.
* returns UserSegment
* */
const getUserSegment = ({ projectKey, environmentKey, userSegmentKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userSegmentKey,
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
* Get a list of all user segments in the given project.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* tag String Filter by tag. A tag can be used to group flags across projects. (optional)
* returns UserSegments
* */
const getUserSegments = ({ projectKey, environmentKey, tag }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        tag,
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
* Update, add, or delete expiring user targets on user segment
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userSegmentKey String The user segment's key. The key identifies the user segment in your code.
* semanticPatchWithComment List Requires a Semantic Patch representation of the desired changes to the resource. 'https://apidocs.launchdarkly.com/reference#updates-via-semantic-patches'. The addition of comments is also supported.
* returns UserTargetingExpirationForSegment
* */
const patchExpiringUserTargetsOnSegment = ({ projectKey, environmentKey, userSegmentKey, semanticPatchWithComment }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userSegmentKey,
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
* Perform a partial update to a user segment.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userSegmentKey String The user segment's key. The key identifies the user segment in your code.
* patchOnly List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/' Feature flag patches also support JSON Merge Patch format. 'https://tools.ietf.org/html/rfc7386' The addition of comments is also supported.
* returns UserSegment
* */
const patchUserSegment = ({ projectKey, environmentKey, userSegmentKey, patchOnly }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userSegmentKey,
        patchOnly,
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
* Creates a new user segment.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userSegmentBody PostUserSegmentRequest Create a new user segment.
* returns UserSegment
* */
const postUserSegment = ({ projectKey, environmentKey, userSegmentBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userSegmentBody,
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
* Update targets included or excluded in a big segment
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* userSegmentKey String The user segment's key. The key identifies the user segment in your code.
* bigSegmentTargetsBody UpdateBigSegmentTargetsRequest Add or remove user targets to the included or excluded lists on a big segment. Contact your account manager for early access to this feature.
* no response value expected for this operation
* */
const updateBigSegmentTargets = ({ projectKey, environmentKey, userSegmentKey, bigSegmentTargetsBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        userSegmentKey,
        bigSegmentTargetsBody,
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
  deleteUserSegment,
  getExpiringUserTargetsOnSegment,
  getUserSegment,
  getUserSegments,
  patchExpiringUserTargetsOnSegment,
  patchUserSegment,
  postUserSegment,
  updateBigSegmentTargets,
};
