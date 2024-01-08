/**
 * The ProjectRolesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectRolesService');
const createProjectRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProjectRole);
};

const deleteProjectRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProjectRole);
};

const fullyUpdateProjectRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.fullyUpdateProjectRole);
};

const getAllProjectRoles = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllProjectRoles);
};

const getProjectRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectRole);
};

const getProjectRoleById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectRoleById);
};

const getProjectRoleDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectRoleDetails);
};

const getProjectRoles = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectRoles);
};

const partialUpdateProjectRole = async (request, response) => {
  await Controller.handleRequest(request, response, service.partialUpdateProjectRole);
};


module.exports = {
  createProjectRole,
  deleteProjectRole,
  fullyUpdateProjectRole,
  getAllProjectRoles,
  getProjectRole,
  getProjectRoleById,
  getProjectRoleDetails,
  getProjectRoles,
  partialUpdateProjectRole,
};
