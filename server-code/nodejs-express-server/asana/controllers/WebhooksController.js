/**
 * The WebhooksController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/WebhooksService');
const createWebhook = async (request, response) => {
  await Controller.handleRequest(request, response, service.createWebhook);
};

const deleteWebhook = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteWebhook);
};

const getWebhook = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWebhook);
};

const getWebhooks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWebhooks);
};

const updateWebhook = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateWebhook);
};


module.exports = {
  createWebhook,
  deleteWebhook,
  getWebhook,
  getWebhooks,
  updateWebhook,
};
