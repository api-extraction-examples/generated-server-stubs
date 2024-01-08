/**
 * The IssueCustomFieldContextsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueCustomFieldContextsService');
const addIssueTypesToContext = async (request, response) => {
  await Controller.handleRequest(request, response, service.addIssueTypesToContext);
};

const assignProjectsToCustomFieldContext = async (request, response) => {
  await Controller.handleRequest(request, response, service.assignProjectsToCustomFieldContext);
};

const createCustomFieldContext = async (request, response) => {
  await Controller.handleRequest(request, response, service.createCustomFieldContext);
};

const deleteCustomFieldContext = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteCustomFieldContext);
};

const getContextsForField = async (request, response) => {
  await Controller.handleRequest(request, response, service.getContextsForField);
};

const getCustomFieldContextsForProjectsAndIssueTypes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCustomFieldContextsForProjectsAndIssueTypes);
};

const getDefaultValues = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDefaultValues);
};

const getIssueTypeMappingsForContexts = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypeMappingsForContexts);
};

const getProjectContextMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectContextMapping);
};

const removeCustomFieldContextFromProjects = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeCustomFieldContextFromProjects);
};

const removeIssueTypesFromContext = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeIssueTypesFromContext);
};

const setDefaultValues = async (request, response) => {
  await Controller.handleRequest(request, response, service.setDefaultValues);
};

const updateCustomFieldContext = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateCustomFieldContext);
};


module.exports = {
  addIssueTypesToContext,
  assignProjectsToCustomFieldContext,
  createCustomFieldContext,
  deleteCustomFieldContext,
  getContextsForField,
  getCustomFieldContextsForProjectsAndIssueTypes,
  getDefaultValues,
  getIssueTypeMappingsForContexts,
  getProjectContextMapping,
  removeCustomFieldContextFromProjects,
  removeIssueTypesFromContext,
  setDefaultValues,
  updateCustomFieldContext,
};
