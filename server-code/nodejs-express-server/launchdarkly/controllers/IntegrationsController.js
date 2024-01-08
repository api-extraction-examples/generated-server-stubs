/**
 * The IntegrationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IntegrationsService');
const deleteIntegrationSubscription = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteIntegrationSubscription);
};

const getIntegrationSubscription = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIntegrationSubscription);
};

const getIntegrationSubscriptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIntegrationSubscriptions);
};

const getIntegrations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIntegrations);
};

const patchIntegrationSubscription = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchIntegrationSubscription);
};

const postIntegrationSubscription = async (request, response) => {
  await Controller.handleRequest(request, response, service.postIntegrationSubscription);
};


module.exports = {
  deleteIntegrationSubscription,
  getIntegrationSubscription,
  getIntegrationSubscriptions,
  getIntegrations,
  patchIntegrationSubscription,
  postIntegrationSubscription,
};
