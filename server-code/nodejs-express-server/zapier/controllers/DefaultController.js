/**
 * The DefaultController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DefaultService');
const check = async (request, response) => {
  await Controller.handleRequest(request, response, service.check);
};

const execute_app_action_endpoint = async (request, response) => {
  await Controller.handleRequest(request, response, service.execute_app_action_endpoint);
};

const get_configuration_link = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_configuration_link);
};

const get_execution_log_endpoint = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_execution_log_endpoint);
};

const list_exposed_actions = async (request, response) => {
  await Controller.handleRequest(request, response, service.list_exposed_actions);
};


module.exports = {
  check,
  execute_app_action_endpoint,
  get_configuration_link,
  get_execution_log_endpoint,
  list_exposed_actions,
};
