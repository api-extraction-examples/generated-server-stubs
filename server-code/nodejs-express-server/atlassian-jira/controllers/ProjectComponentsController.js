/**
 * The ProjectComponentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectComponentsService');
const createComponent = async (request, response) => {
  await Controller.handleRequest(request, response, service.createComponent);
};

const deleteComponent = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteComponent);
};

const getComponent = async (request, response) => {
  await Controller.handleRequest(request, response, service.getComponent);
};

const getComponentRelatedIssues = async (request, response) => {
  await Controller.handleRequest(request, response, service.getComponentRelatedIssues);
};

const getProjectComponents = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectComponents);
};

const getProjectComponentsPaginated = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectComponentsPaginated);
};

const updateComponent = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateComponent);
};


module.exports = {
  createComponent,
  deleteComponent,
  getComponent,
  getComponentRelatedIssues,
  getProjectComponents,
  getProjectComponentsPaginated,
  updateComponent,
};
