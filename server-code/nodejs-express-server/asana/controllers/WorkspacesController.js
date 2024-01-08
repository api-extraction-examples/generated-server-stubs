/**
 * The WorkspacesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/WorkspacesService');
const addUserForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.addUserForWorkspace);
};

const getWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorkspace);
};

const getWorkspaces = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorkspaces);
};

const removeUserForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeUserForWorkspace);
};

const updateWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateWorkspace);
};


module.exports = {
  addUserForWorkspace,
  getWorkspace,
  getWorkspaces,
  removeUserForWorkspace,
  updateWorkspace,
};
