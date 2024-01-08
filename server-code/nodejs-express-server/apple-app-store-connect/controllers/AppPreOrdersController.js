/**
 * The AppPreOrdersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppPreOrdersService');
const appPreOrdersCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreOrdersCreate_instance);
};

const appPreOrdersDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreOrdersDelete_instance);
};

const appPreOrdersGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreOrdersGet_instance);
};

const appPreOrdersUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreOrdersUpdate_instance);
};


module.exports = {
  appPreOrdersCreate_instance,
  appPreOrdersDelete_instance,
  appPreOrdersGet_instance,
  appPreOrdersUpdate_instance,
};
