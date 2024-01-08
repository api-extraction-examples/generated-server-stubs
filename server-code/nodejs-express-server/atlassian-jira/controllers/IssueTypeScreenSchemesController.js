/**
 * The IssueTypeScreenSchemesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueTypeScreenSchemesService');
const appendMappingsForIssueTypeScreenScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.appendMappingsForIssueTypeScreenScheme);
};

const assignIssueTypeScreenSchemeToProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.assignIssueTypeScreenSchemeToProject);
};

const createIssueTypeScreenScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.createIssueTypeScreenScheme);
};

const deleteIssueTypeScreenScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteIssueTypeScreenScheme);
};

const getIssueTypeScreenSchemeMappings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypeScreenSchemeMappings);
};

const getIssueTypeScreenSchemeProjectAssociations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypeScreenSchemeProjectAssociations);
};

const getIssueTypeScreenSchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypeScreenSchemes);
};

const getProjectsForIssueTypeScreenScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectsForIssueTypeScreenScheme);
};

const removeMappingsFromIssueTypeScreenScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeMappingsFromIssueTypeScreenScheme);
};

const updateDefaultScreenScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateDefaultScreenScheme);
};

const updateIssueTypeScreenScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateIssueTypeScreenScheme);
};


module.exports = {
  appendMappingsForIssueTypeScreenScheme,
  assignIssueTypeScreenSchemeToProject,
  createIssueTypeScreenScheme,
  deleteIssueTypeScreenScheme,
  getIssueTypeScreenSchemeMappings,
  getIssueTypeScreenSchemeProjectAssociations,
  getIssueTypeScreenSchemes,
  getProjectsForIssueTypeScreenScheme,
  removeMappingsFromIssueTypeScreenScheme,
  updateDefaultScreenScheme,
  updateIssueTypeScreenScheme,
};
