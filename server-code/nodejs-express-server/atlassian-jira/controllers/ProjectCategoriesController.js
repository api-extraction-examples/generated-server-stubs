/**
 * The ProjectCategoriesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectCategoriesService');
const createProjectCategory = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProjectCategory);
};

const getAllProjectCategories = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllProjectCategories);
};

const getProjectCategoryById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectCategoryById);
};

const removeProjectCategory = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeProjectCategory);
};

const updateProjectCategory = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateProjectCategory);
};


module.exports = {
  createProjectCategory,
  getAllProjectCategories,
  getProjectCategoryById,
  removeProjectCategory,
  updateProjectCategory,
};
