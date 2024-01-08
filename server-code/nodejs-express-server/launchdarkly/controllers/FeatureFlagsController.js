/**
 * The FeatureFlagsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FeatureFlagsService');
const copyFeatureFlag = async (request, response) => {
  await Controller.handleRequest(request, response, service.copyFeatureFlag);
};

const deleteApprovalRequest = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteApprovalRequest);
};

const deleteFeatureFlag = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteFeatureFlag);
};

const deleteFlagConfigScheduledChanges = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteFlagConfigScheduledChanges);
};

const flagsProjectKeyEnvironmentKeyFeatureFlagKeyDependentFlagsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.flagsProjectKeyEnvironmentKeyFeatureFlagKeyDependentFlagsGET);
};

const flagsProjectKeyFeatureFlagKeyDependentFlagsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.flagsProjectKeyFeatureFlagKeyDependentFlagsGET);
};

const getApprovalRequest = async (request, response) => {
  await Controller.handleRequest(request, response, service.getApprovalRequest);
};

const getApprovalRequests = async (request, response) => {
  await Controller.handleRequest(request, response, service.getApprovalRequests);
};

const getExpiringUserTargets = async (request, response) => {
  await Controller.handleRequest(request, response, service.getExpiringUserTargets);
};

const getFeatureFlag = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeatureFlag);
};

const getFeatureFlagStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeatureFlagStatus);
};

const getFeatureFlagStatusAcrossEnvironments = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeatureFlagStatusAcrossEnvironments);
};

const getFeatureFlagStatuses = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeatureFlagStatuses);
};

const getFeatureFlags = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFeatureFlags);
};

const getFlagConfigScheduledChange = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFlagConfigScheduledChange);
};

const getFlagConfigScheduledChanges = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFlagConfigScheduledChanges);
};

const getFlagConfigScheduledChangesConflicts = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFlagConfigScheduledChangesConflicts);
};

const patchExpiringUserTargets = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchExpiringUserTargets);
};

const patchFeatureFlag = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchFeatureFlag);
};

const patchFlagConfigScheduledChange = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchFlagConfigScheduledChange);
};

const postApplyApprovalRequest = async (request, response) => {
  await Controller.handleRequest(request, response, service.postApplyApprovalRequest);
};

const postApprovalRequest = async (request, response) => {
  await Controller.handleRequest(request, response, service.postApprovalRequest);
};

const postFeatureFlag = async (request, response) => {
  await Controller.handleRequest(request, response, service.postFeatureFlag);
};

const postFlagConfigScheduledChanges = async (request, response) => {
  await Controller.handleRequest(request, response, service.postFlagConfigScheduledChanges);
};

const postReviewApprovalRequest = async (request, response) => {
  await Controller.handleRequest(request, response, service.postReviewApprovalRequest);
};


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
