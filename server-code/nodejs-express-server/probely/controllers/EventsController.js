/**
 * The EventsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/EventsService');
const eventsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.eventsGET);
};

const eventsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.eventsIdGET);
};

const targetsTargetIdEventsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdEventsGET);
};

const targetsTargetIdEventsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdEventsIdGET);
};

const targetsTargetIdWebhooksGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdWebhooksGET);
};

const targetsTargetIdWebhooksIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdWebhooksIdDELETE);
};

const targetsTargetIdWebhooksIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdWebhooksIdGET);
};

const targetsTargetIdWebhooksIdPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdWebhooksIdPATCH);
};

const targetsTargetIdWebhooksIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdWebhooksIdPUT);
};

const targetsTargetIdWebhooksPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdWebhooksPOST);
};

const webhooksGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.webhooksGET);
};

const webhooksIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.webhooksIdDELETE);
};

const webhooksIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.webhooksIdGET);
};

const webhooksIdPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.webhooksIdPATCH);
};

const webhooksIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.webhooksIdPUT);
};

const webhooksPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.webhooksPOST);
};


module.exports = {
  eventsGET,
  eventsIdGET,
  targetsTargetIdEventsGET,
  targetsTargetIdEventsIdGET,
  targetsTargetIdWebhooksGET,
  targetsTargetIdWebhooksIdDELETE,
  targetsTargetIdWebhooksIdGET,
  targetsTargetIdWebhooksIdPATCH,
  targetsTargetIdWebhooksIdPUT,
  targetsTargetIdWebhooksPOST,
  webhooksGET,
  webhooksIdDELETE,
  webhooksIdGET,
  webhooksIdPATCH,
  webhooksIdPUT,
  webhooksPOST,
};
