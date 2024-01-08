/**
 * The RelayProxyConfigurationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RelayProxyConfigurationsService');
const deleteRelayProxyConfig = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteRelayProxyConfig);
};

const getRelayProxyConfig = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRelayProxyConfig);
};

const getRelayProxyConfigs = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRelayProxyConfigs);
};

const patchRelayProxyConfig = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchRelayProxyConfig);
};

const postRelayAutoConfig = async (request, response) => {
  await Controller.handleRequest(request, response, service.postRelayAutoConfig);
};

const resetRelayProxyConfig = async (request, response) => {
  await Controller.handleRequest(request, response, service.resetRelayProxyConfig);
};


module.exports = {
  deleteRelayProxyConfig,
  getRelayProxyConfig,
  getRelayProxyConfigs,
  patchRelayProxyConfig,
  postRelayAutoConfig,
  resetRelayProxyConfig,
};
