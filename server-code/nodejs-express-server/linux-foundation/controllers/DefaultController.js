/**
 * The DefaultController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DefaultService');
const expenseAction = async (request, response) => {
  await Controller.handleRequest(request, response, service.expenseAction);
};

const healthCheck = async (request, response) => {
  await Controller.handleRequest(request, response, service.healthCheck);
};

const resetPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.resetPolicy);
};

const tagPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.tagPolicy);
};


module.exports = {
  expenseAction,
  healthCheck,
  resetPolicy,
  tagPolicy,
};
