/**
 * The ProjectsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectsService');
const addCustomFieldSettingForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.addCustomFieldSettingForProject);
};

const addFollowersForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.addFollowersForProject);
};

const addMembersForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.addMembersForProject);
};

const createProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProject);
};

const createProjectForTeam = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProjectForTeam);
};

const createProjectForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProjectForWorkspace);
};

const deleteProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProject);
};

const duplicateProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.duplicateProject);
};

const getProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProject);
};

const getProjects = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjects);
};

const getProjectsForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectsForTask);
};

const getProjectsForTeam = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectsForTeam);
};

const getProjectsForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectsForWorkspace);
};

const getTaskCountsForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTaskCountsForProject);
};

const projectSaveAsTemplate = async (request, response) => {
  await Controller.handleRequest(request, response, service.projectSaveAsTemplate);
};

const removeCustomFieldSettingForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeCustomFieldSettingForProject);
};

const removeFollowersForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeFollowersForProject);
};

const removeMembersForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeMembersForProject);
};

const updateProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateProject);
};


module.exports = {
  addCustomFieldSettingForProject,
  addFollowersForProject,
  addMembersForProject,
  createProject,
  createProjectForTeam,
  createProjectForWorkspace,
  deleteProject,
  duplicateProject,
  getProject,
  getProjects,
  getProjectsForTask,
  getProjectsForTeam,
  getProjectsForWorkspace,
  getTaskCountsForProject,
  projectSaveAsTemplate,
  removeCustomFieldSettingForProject,
  removeFollowersForProject,
  removeMembersForProject,
  updateProject,
};
