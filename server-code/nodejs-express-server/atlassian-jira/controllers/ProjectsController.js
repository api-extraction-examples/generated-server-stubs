/**
 * The ProjectsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectsService');
const archiveProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.archiveProject);
};

const createProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProject);
};

const deleteProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProject);
};

const deleteProjectAsynchronously = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProjectAsynchronously);
};

const getAllProjects = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllProjects);
};

const getAllStatuses = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllStatuses);
};

const getHierarchy = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHierarchy);
};

const getNotificationSchemeForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNotificationSchemeForProject);
};

const getProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProject);
};

const getRecent = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecent);
};

const restore = async (request, response) => {
  await Controller.handleRequest(request, response, service.restore);
};

const searchProjects = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchProjects);
};

const updateProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateProject);
};

const updateProjectType = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateProjectType);
};


module.exports = {
  archiveProject,
  createProject,
  deleteProject,
  deleteProjectAsynchronously,
  getAllProjects,
  getAllStatuses,
  getHierarchy,
  getNotificationSchemeForProject,
  getProject,
  getRecent,
  restore,
  searchProjects,
  updateProject,
  updateProjectType,
};
