/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Copies the feature flag configuration from one environment to the same feature flag in another environment.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* featureFlagCopyBody CopyFeatureFlagRequest Copy feature flag configurations between environments.
* returns FeatureFlag
* */
const copyFeatureFlag = ({ projectKey, featureFlagKey, featureFlagCopyBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        featureFlagCopyBody,
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
* Delete an approval request for a feature flag config
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* approvalRequestId String The approval request ID
* approvalRequestConfigBody PostApprovalRequestRequest Create a new approval request (optional)
* no response value expected for this operation
* */
const deleteApprovalRequest = ({ projectKey, environmentKey, featureFlagKey, approvalRequestId, approvalRequestConfigBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        featureFlagKey,
        approvalRequestId,
        approvalRequestConfigBody,
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
* Delete a feature flag in all environments. Be careful-- only delete feature flags that are no longer being used by your application.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* no response value expected for this operation
* */
const deleteFeatureFlag = ({ projectKey, featureFlagKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
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
* Delete a scheduled change on a feature flag in an environment.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* scheduledChangeId String The id of the scheduled change
* no response value expected for this operation
* */
const deleteFlagConfigScheduledChanges = ({ projectKey, featureFlagKey, environmentKey, scheduledChangeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        scheduledChangeId,
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
* Get dependent flags for the flag in the environment specified in path parameters
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* returns DependentFlagsByEnvironment
* */
const flagsProjectKeyEnvironmentKeyFeatureFlagKeyDependentFlagsGET = ({ projectKey, environmentKey, featureFlagKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
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
* Get dependent flags across all environments for the flag specified in the path parameters
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* returns MultiEnvironmentDependentFlags
* */
const flagsProjectKeyFeatureFlagKeyDependentFlagsGET = ({ projectKey, featureFlagKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
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
* Get a single approval request for a feature flag config
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* approvalRequestId String The approval request ID
* returns ApprovalRequests
* */
const getApprovalRequest = ({ projectKey, featureFlagKey, environmentKey, approvalRequestId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        approvalRequestId,
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
* Get all approval requests for a feature flag config
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* returns ApprovalRequests
* */
const getApprovalRequests = ({ projectKey, featureFlagKey, environmentKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
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
* Get expiring user targets for feature flag
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* returns UserTargetingExpirationForFlags
* */
const getExpiringUserTargets = ({ projectKey, environmentKey, featureFlagKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
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
* Get a single feature flag by key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* env List By default, each feature will include configurations for each environment. You can filter environments with the env query parameter. For example, setting env=[\"production\"] will restrict the returned configurations to just your production environment. (optional)
* returns FeatureFlag
* */
const getFeatureFlag = ({ projectKey, featureFlagKey, env }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        env,
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
* Get the status for a particular feature flag.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* returns FeatureFlagStatus
* */
const getFeatureFlagStatus = ({ projectKey, environmentKey, featureFlagKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
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
* Get the status for a particular feature flag across environments
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* returns FeatureFlagStatusAcrossEnvironments
* */
const getFeatureFlagStatusAcrossEnvironments = ({ projectKey, featureFlagKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
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
* Get a list of statuses for all feature flags. The status includes the last time the feature flag was requested, as well as the state of the flag.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* returns FeatureFlagStatuses
* */
const getFeatureFlagStatuses = ({ projectKey, environmentKey }) => new Promise(
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
* Get a list of all features in the given project.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* env List By default, each feature will include configurations for each environment. You can filter environments with the env query parameter. For example, setting env=[\"production\"] will restrict the returned configurations to just your production environment. (optional)
* summary Boolean By default in api version >= 1, flags will _not_ include their list of prerequisites, targets or rules.  Set summary=0 to include these fields for each flag returned. (optional)
* archived Boolean When set to 1, only archived flags will be included in the list of flags returned.  By default, archived flags are not included in the list of flags. (optional)
* limit BigDecimal The number of objects to return. Defaults to -1, which returns everything. (optional)
* offset BigDecimal Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items. (optional)
* filter String A comma-separated list of filters. Each filter is of the form field:value. (optional)
* sort String A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order. (optional)
* tag String Filter by tag. A tag can be used to group flags across projects. (optional)
* returns FeatureFlags
* */
const getFeatureFlags = ({ projectKey, env, summary, archived, limit, offset, filter, sort, tag }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        env,
        summary,
        archived,
        limit,
        offset,
        filter,
        sort,
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
* Get a scheduled change on a feature flag by id.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* scheduledChangeId String The id of the scheduled change
* returns FeatureFlagScheduledChange
* */
const getFlagConfigScheduledChange = ({ projectKey, featureFlagKey, environmentKey, scheduledChangeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        scheduledChangeId,
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
* Get all scheduled workflows for a feature flag by key.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* returns FeatureFlagScheduledChanges
* */
const getFlagConfigScheduledChanges = ({ projectKey, featureFlagKey, environmentKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
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
* Lists conflicts between the given instructions and any existing scheduled changes for the feature flag. The actual HTTP verb should be REPORT, not POST.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* flagConfigScheduledChangesConflictsBody GetFlagConfigScheduledChangesConflictsRequest Used to determine if a semantic patch will result in conflicts with scheduled changes on a feature flag.
* returns FeatureFlagScheduledChangesConflicts
* */
const getFlagConfigScheduledChangesConflicts = ({ projectKey, featureFlagKey, environmentKey, flagConfigScheduledChangesConflictsBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        flagConfigScheduledChangesConflictsBody,
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
* Update, add, or delete expiring user targets on feature flag
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* semanticPatchWithComment List Requires a Semantic Patch representation of the desired changes to the resource. 'https://apidocs.launchdarkly.com/reference#updates-via-semantic-patches'. The addition of comments is also supported.
* returns UserTargetingExpirationForFlags
* */
const patchExpiringUserTargets = ({ projectKey, environmentKey, featureFlagKey, semanticPatchWithComment }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        environmentKey,
        featureFlagKey,
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
* Perform a partial update to a feature.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* patchComment PatchFeatureFlagRequest Requires a JSON Patch representation of the desired changes to the project, and an optional comment. 'http://jsonpatch.com/' Feature flag patches also support JSON Merge Patch format. 'https://tools.ietf.org/html/rfc7386' The addition of comments is also supported.
* returns FeatureFlag
* */
const patchFeatureFlag = ({ projectKey, featureFlagKey, patchComment }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        patchComment,
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
* Updates an existing scheduled-change on a feature flag in an environment.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* scheduledChangeId String The id of the scheduled change
* flagConfigScheduledChangesPatchBody PatchFlagConfigScheduledChangeRequest Update scheduled changes on a feature flag.
* returns FeatureFlagScheduledChange
* */
const patchFlagConfigScheduledChange = ({ projectKey, featureFlagKey, environmentKey, scheduledChangeId, flagConfigScheduledChangesPatchBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        scheduledChangeId,
        flagConfigScheduledChangesPatchBody,
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
* Apply approval request for a feature flag config
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* approvalRequestId String The approval request ID
* approvalRequestApplyConfigBody PostApplyApprovalRequestRequest Apply an approval request
* returns ApprovalRequests
* */
const postApplyApprovalRequest = ({ projectKey, featureFlagKey, environmentKey, approvalRequestId, approvalRequestApplyConfigBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        approvalRequestId,
        approvalRequestApplyConfigBody,
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
* Create an approval request for a feature flag config
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* approvalRequestId String The approval request ID
* approvalRequestConfigBody PostApprovalRequestRequest Create a new approval request (optional)
* returns ApprovalRequest
* */
const postApprovalRequest = ({ projectKey, featureFlagKey, environmentKey, approvalRequestId, approvalRequestConfigBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        approvalRequestId,
        approvalRequestConfigBody,
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
* Creates a new feature flag.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagBody PostFeatureFlagRequest Create a new feature flag.
* clone String The key of the feature flag to be cloned. The key identifies the flag in your code.  For example, setting clone=flagKey will copy the full targeting configuration for all environments (including on/off state) from the original flag to the new flag. (optional)
* returns FeatureFlag
* */
const postFeatureFlag = ({ projectKey, featureFlagBody, clone }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagBody,
        clone,
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
* Creates a new scheduled change for a feature flag.
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* flagConfigScheduledChangesPostBody PostFlagConfigScheduledChangesRequest Create scheduled changes on a feature flag.
* returns FeatureFlagScheduledChange
* */
const postFlagConfigScheduledChanges = ({ projectKey, featureFlagKey, environmentKey, flagConfigScheduledChangesPostBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        flagConfigScheduledChangesPostBody,
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
* Review approval request for a feature flag config
*
* projectKey String The project key, used to tie the flags together under one project so they can be managed together.
* featureFlagKey String The feature flag's key. The key identifies the flag in your code.
* environmentKey String The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
* approvalRequestId String The approval request ID
* approvalRequestReviewConfigBody PostReviewApprovalRequestRequest Review an approval request
* returns ApprovalRequests
* */
const postReviewApprovalRequest = ({ projectKey, featureFlagKey, environmentKey, approvalRequestId, approvalRequestReviewConfigBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        featureFlagKey,
        environmentKey,
        approvalRequestId,
        approvalRequestReviewConfigBody,
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
  copyFeatureFlag,
  deleteApprovalRequest,
  deleteFeatureFlag,
  deleteFlagConfigScheduledChanges,
  flagsProjectKeyEnvironmentKeyFeatureFlagKeyDependentFlagsGET,
  flagsProjectKeyFeatureFlagKeyDependentFlagsGET,
  getApprovalRequest,
  getApprovalRequests,
  getExpiringUserTargets,
  getFeatureFlag,
  getFeatureFlagStatus,
  getFeatureFlagStatusAcrossEnvironments,
  getFeatureFlagStatuses,
  getFeatureFlags,
  getFlagConfigScheduledChange,
  getFlagConfigScheduledChanges,
  getFlagConfigScheduledChangesConflicts,
  patchExpiringUserTargets,
  patchFeatureFlag,
  patchFlagConfigScheduledChange,
  postApplyApprovalRequest,
  postApprovalRequest,
  postFeatureFlag,
  postFlagConfigScheduledChanges,
  postReviewApprovalRequest,
};
