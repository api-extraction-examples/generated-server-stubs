/**
 * The IssueSecuritySchemesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueSecuritySchemesService');
const addSecurityLevel = async (request, response) => {
  await Controller.handleRequest(request, response, service.addSecurityLevel);
};

const addSecurityLevelMembers = async (request, response) => {
  await Controller.handleRequest(request, response, service.addSecurityLevelMembers);
};

const createIssueSecurityScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.createIssueSecurityScheme);
};

const deleteSecurityScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteSecurityScheme);
};

const getIssueSecurityScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueSecurityScheme);
};

const getIssueSecuritySchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueSecuritySchemes);
};

const getSecurityLevelMembers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSecurityLevelMembers);
};

const getSecurityLevels = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSecurityLevels);
};

const removeLevel = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeLevel);
};

const removeMemberFromSecurityLevel = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeMemberFromSecurityLevel);
};

const searchProjectsUsingSecuritySchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchProjectsUsingSecuritySchemes);
};

const searchSecuritySchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchSecuritySchemes);
};

const setDefaultLevels = async (request, response) => {
  await Controller.handleRequest(request, response, service.setDefaultLevels);
};

const updateIssueSecurityScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateIssueSecurityScheme);
};

const updateSecurityLevel = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSecurityLevel);
};


module.exports = {
  addSecurityLevel,
  addSecurityLevelMembers,
  createIssueSecurityScheme,
  deleteSecurityScheme,
  getIssueSecurityScheme,
  getIssueSecuritySchemes,
  getSecurityLevelMembers,
  getSecurityLevels,
  removeLevel,
  removeMemberFromSecurityLevel,
  searchProjectsUsingSecuritySchemes,
  searchSecuritySchemes,
  setDefaultLevels,
  updateIssueSecurityScheme,
  updateSecurityLevel,
};
