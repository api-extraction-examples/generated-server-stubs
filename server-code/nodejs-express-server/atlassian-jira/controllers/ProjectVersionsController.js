/**
 * The ProjectVersionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectVersionsService');
const createVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.createVersion);
};

const deleteAndReplaceVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteAndReplaceVersion);
};

const deleteVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteVersion);
};

const getProjectVersions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectVersions);
};

const getProjectVersionsPaginated = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectVersionsPaginated);
};

const getVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVersion);
};

const getVersionRelatedIssues = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVersionRelatedIssues);
};

const getVersionUnresolvedIssues = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVersionUnresolvedIssues);
};

const mergeVersions = async (request, response) => {
  await Controller.handleRequest(request, response, service.mergeVersions);
};

const moveVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.moveVersion);
};

const updateVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateVersion);
};


module.exports = {
  createVersion,
  deleteAndReplaceVersion,
  deleteVersion,
  getProjectVersions,
  getProjectVersionsPaginated,
  getVersion,
  getVersionRelatedIssues,
  getVersionUnresolvedIssues,
  mergeVersions,
  moveVersion,
  updateVersion,
};
