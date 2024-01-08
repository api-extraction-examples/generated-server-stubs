/**
 * The PermissionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PermissionsService');
const getAllPermissions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllPermissions);
};

const getBulkPermissions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBulkPermissions);
};

const getMyPermissions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMyPermissions);
};

const getPermittedProjects = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPermittedProjects);
};


module.exports = {
  getAllPermissions,
  getBulkPermissions,
  getMyPermissions,
  getPermittedProjects,
};
