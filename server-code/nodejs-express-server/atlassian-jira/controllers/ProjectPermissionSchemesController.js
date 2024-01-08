/**
 * The ProjectPermissionSchemesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectPermissionSchemesService');
const assignPermissionScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.assignPermissionScheme);
};

const getAssignedPermissionScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAssignedPermissionScheme);
};

const getProjectIssueSecurityScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectIssueSecurityScheme);
};

const getSecurityLevelsForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSecurityLevelsForProject);
};


module.exports = {
  assignPermissionScheme,
  getAssignedPermissionScheme,
  getProjectIssueSecurityScheme,
  getSecurityLevelsForProject,
};
