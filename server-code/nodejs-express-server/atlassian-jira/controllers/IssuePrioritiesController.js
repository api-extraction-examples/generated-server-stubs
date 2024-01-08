/**
 * The IssuePrioritiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssuePrioritiesService');
const createPriority = async (request, response) => {
  await Controller.handleRequest(request, response, service.createPriority);
};

const deletePriority = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePriority);
};

const getPriorities = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPriorities);
};

const getPriority = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPriority);
};

const movePriorities = async (request, response) => {
  await Controller.handleRequest(request, response, service.movePriorities);
};

const searchPriorities = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchPriorities);
};

const setDefaultPriority = async (request, response) => {
  await Controller.handleRequest(request, response, service.setDefaultPriority);
};

const updatePriority = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePriority);
};


module.exports = {
  createPriority,
  deletePriority,
  getPriorities,
  getPriority,
  movePriorities,
  searchPriorities,
  setDefaultPriority,
  updatePriority,
};
