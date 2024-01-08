/**
 * The IssueTypesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueTypesService');
const createIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.createIssueType);
};

const createIssueTypeAvatar = async (request, response) => {
  await Controller.handleRequest(request, response, service.createIssueTypeAvatar);
};

const deleteIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteIssueType);
};

const getAlternativeIssueTypes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAlternativeIssueTypes);
};

const getIssueAllTypes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueAllTypes);
};

const getIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueType);
};

const getIssueTypesForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypesForProject);
};

const updateIssueType = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateIssueType);
};


module.exports = {
  createIssueType,
  createIssueTypeAvatar,
  deleteIssueType,
  getAlternativeIssueTypes,
  getIssueAllTypes,
  getIssueType,
  getIssueTypesForProject,
  updateIssueType,
};
