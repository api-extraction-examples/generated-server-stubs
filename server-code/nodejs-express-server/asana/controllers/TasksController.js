/**
 * The TasksController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TasksService');
const addDependenciesForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.addDependenciesForTask);
};

const addDependentsForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.addDependentsForTask);
};

const addFollowersForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.addFollowersForTask);
};

const addProjectForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.addProjectForTask);
};

const addTagForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.addTagForTask);
};

const createSubtaskForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSubtaskForTask);
};

const createTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.createTask);
};

const deleteTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteTask);
};

const duplicateTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.duplicateTask);
};

const getDependenciesForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDependenciesForTask);
};

const getDependentsForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDependentsForTask);
};

const getSubtasksForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSubtasksForTask);
};

const getTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTask);
};

const getTasks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTasks);
};

const getTasksForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTasksForProject);
};

const getTasksForSection = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTasksForSection);
};

const getTasksForTag = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTasksForTag);
};

const getTasksForUserTaskList = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTasksForUserTaskList);
};

const removeDependenciesForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeDependenciesForTask);
};

const removeDependentsForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeDependentsForTask);
};

const removeFollowerForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeFollowerForTask);
};

const removeProjectForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeProjectForTask);
};

const removeTagForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeTagForTask);
};

const searchTasksForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchTasksForWorkspace);
};

const setParentForTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.setParentForTask);
};

const updateTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateTask);
};


module.exports = {
  addDependenciesForTask,
  addDependentsForTask,
  addFollowersForTask,
  addProjectForTask,
  addTagForTask,
  createSubtaskForTask,
  createTask,
  deleteTask,
  duplicateTask,
  getDependenciesForTask,
  getDependentsForTask,
  getSubtasksForTask,
  getTask,
  getTasks,
  getTasksForProject,
  getTasksForSection,
  getTasksForTag,
  getTasksForUserTaskList,
  removeDependenciesForTask,
  removeDependentsForTask,
  removeFollowerForTask,
  removeProjectForTask,
  removeTagForTask,
  searchTasksForWorkspace,
  setParentForTask,
  updateTask,
};
