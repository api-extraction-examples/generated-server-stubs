/**
 * The IssueTypeSchemesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueTypeSchemesService');
const addIssueTypesToIssueTypeScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.addIssueTypesToIssueTypeScheme);
};

const assignIssueTypeSchemeToProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.assignIssueTypeSchemeToProject);
};

const createIssueTypeScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.createIssueTypeScheme);
};

const deleteIssueTypeScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteIssueTypeScheme);
};

const getAllIssueTypeSchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllIssueTypeSchemes);
};

const getIssueTypeSchemeForProjects = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypeSchemeForProjects);
};

const getIssueTypeSchemesMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypeSchemesMapping);
};

const removeIssueTypeFromIssueTypeScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeIssueTypeFromIssueTypeScheme);
};

const reorderIssueTypesInIssueTypeScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.reorderIssueTypesInIssueTypeScheme);
};

const updateIssueTypeScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateIssueTypeScheme);
};


module.exports = {
  addIssueTypesToIssueTypeScheme,
  assignIssueTypeSchemeToProject,
  createIssueTypeScheme,
  deleteIssueTypeScheme,
  getAllIssueTypeSchemes,
  getIssueTypeSchemeForProjects,
  getIssueTypeSchemesMapping,
  removeIssueTypeFromIssueTypeScheme,
  reorderIssueTypesInIssueTypeScheme,
  updateIssueTypeScheme,
};
