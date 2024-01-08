/**
 * The CustomerMetricsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CustomerMetricsService');
const getEvaluations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEvaluations);
};

const getEvent = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEvent);
};

const getEvents = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEvents);
};

const getMAU = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMAU);
};

const getMAUByCategory = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMAUByCategory);
};

const getStream = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStream);
};

const getStreamBySDK = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStreamBySDK);
};

const getStreamSDKVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStreamSDKVersion);
};

const getStreams = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStreams);
};

const getUsage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUsage);
};


module.exports = {
  getEvaluations,
  getEvent,
  getEvents,
  getMAU,
  getMAUByCategory,
  getStream,
  getStreamBySDK,
  getStreamSDKVersion,
  getStreams,
  getUsage,
};
