/**
 * The VariableController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/VariableService');
const delete_variable = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_variable);
};

const get_variable = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_variable);
};

const get_variables = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_variables);
};

const patch_variable = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_variable);
};

const post_variables = async (request, response) => {
  await Controller.handleRequest(request, response, service.post_variables);
};


module.exports = {
  delete_variable,
  get_variable,
  get_variables,
  patch_variable,
  post_variables,
};
