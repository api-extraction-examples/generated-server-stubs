/**
 * The EnvironmentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/EnvironmentsService');
const deleteEnvironment = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteEnvironment);
};

const getEnvironment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEnvironment);
};

const patchEnvironment = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchEnvironment);
};

const postEnvironment = async (request, response) => {
  await Controller.handleRequest(request, response, service.postEnvironment);
};

const resetEnvironmentMobileKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.resetEnvironmentMobileKey);
};

const resetEnvironmentSDKKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.resetEnvironmentSDKKey);
};


module.exports = {
  deleteEnvironment,
  getEnvironment,
  patchEnvironment,
  postEnvironment,
  resetEnvironmentMobileKey,
  resetEnvironmentSDKKey,
};
