/**
 * The ProjectsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectsService');
const deleteProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProject);
};

const getProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProject);
};

const getProjects = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjects);
};

const patchProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchProject);
};

const postProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.postProject);
};


module.exports = {
  deleteProject,
  getProject,
  getProjects,
  patchProject,
  postProject,
};
