/**
 * The ProjectStatusesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectStatusesService');
const createProjectStatusForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProjectStatusForProject);
};

const deleteProjectStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProjectStatus);
};

const getProjectStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectStatus);
};

const getProjectStatusesForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectStatusesForProject);
};


module.exports = {
  createProjectStatusForProject,
  deleteProjectStatus,
  getProjectStatus,
  getProjectStatusesForProject,
};
