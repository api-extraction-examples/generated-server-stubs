/**
 * The WorkflowSchemesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/WorkflowSchemesService');
const createWorkflowScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.createWorkflowScheme);
};

const deleteDefaultWorkflow = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDefaultWorkflow);
};

const deleteWorkflowMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteWorkflowMapping);
};

const deleteWorkflowScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteWorkflowScheme);
};

const deleteWorkflowSchemeIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteWorkflowSchemeIssueType);
};

const getAllWorkflowSchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllWorkflowSchemes);
};

const getDefaultWorkflow = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDefaultWorkflow);
};

const getWorkflow = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorkflow);
};

const getWorkflowScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorkflowScheme);
};

const getWorkflowSchemeIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorkflowSchemeIssueType);
};

const setWorkflowSchemeIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.setWorkflowSchemeIssueType);
};

const updateDefaultWorkflow = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateDefaultWorkflow);
};

const updateWorkflowMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateWorkflowMapping);
};

const updateWorkflowScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateWorkflowScheme);
};


module.exports = {
  createWorkflowScheme,
  deleteDefaultWorkflow,
  deleteWorkflowMapping,
  deleteWorkflowScheme,
  deleteWorkflowSchemeIssueType,
  getAllWorkflowSchemes,
  getDefaultWorkflow,
  getWorkflow,
  getWorkflowScheme,
  getWorkflowSchemeIssueType,
  setWorkflowSchemeIssueType,
  updateDefaultWorkflow,
  updateWorkflowMapping,
  updateWorkflowScheme,
};
