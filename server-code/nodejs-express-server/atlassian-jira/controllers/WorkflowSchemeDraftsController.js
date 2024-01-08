/**
 * The WorkflowSchemeDraftsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/WorkflowSchemeDraftsService');
const createWorkflowSchemeDraftFromParent = async (request, response) => {
  await Controller.handleRequest(request, response, service.createWorkflowSchemeDraftFromParent);
};

const deleteDraftDefaultWorkflow = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDraftDefaultWorkflow);
};

const deleteDraftWorkflowMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDraftWorkflowMapping);
};

const deleteWorkflowSchemeDraft = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteWorkflowSchemeDraft);
};

const deleteWorkflowSchemeDraftIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteWorkflowSchemeDraftIssueType);
};

const getDraftDefaultWorkflow = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDraftDefaultWorkflow);
};

const getDraftWorkflow = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDraftWorkflow);
};

const getWorkflowSchemeDraft = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorkflowSchemeDraft);
};

const getWorkflowSchemeDraftIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorkflowSchemeDraftIssueType);
};

const publishDraftWorkflowScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.publishDraftWorkflowScheme);
};

const setWorkflowSchemeDraftIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.setWorkflowSchemeDraftIssueType);
};

const updateDraftDefaultWorkflow = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateDraftDefaultWorkflow);
};

const updateDraftWorkflowMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateDraftWorkflowMapping);
};

const updateWorkflowSchemeDraft = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateWorkflowSchemeDraft);
};


module.exports = {
  createWorkflowSchemeDraftFromParent,
  deleteDraftDefaultWorkflow,
  deleteDraftWorkflowMapping,
  deleteWorkflowSchemeDraft,
  deleteWorkflowSchemeDraftIssueType,
  getDraftDefaultWorkflow,
  getDraftWorkflow,
  getWorkflowSchemeDraft,
  getWorkflowSchemeDraftIssueType,
  publishDraftWorkflowScheme,
  setWorkflowSchemeDraftIssueType,
  updateDraftDefaultWorkflow,
  updateDraftWorkflowMapping,
  updateWorkflowSchemeDraft,
};
