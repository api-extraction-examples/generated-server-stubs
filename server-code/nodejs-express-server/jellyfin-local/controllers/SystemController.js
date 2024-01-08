/**
 * The SystemController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SystemService');
const getEndpointInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEndpointInfo);
};

const getLogFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLogFile);
};

const getPingSystem = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPingSystem);
};

const getPublicSystemInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPublicSystemInfo);
};

const getServerLogs = async (request, response) => {
  await Controller.handleRequest(request, response, service.getServerLogs);
};

const getSystemInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSystemInfo);
};

const getWakeOnLanInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWakeOnLanInfo);
};

const postPingSystem = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPingSystem);
};

const restartApplication = async (request, response) => {
  await Controller.handleRequest(request, response, service.restartApplication);
};

const shutdownApplication = async (request, response) => {
  await Controller.handleRequest(request, response, service.shutdownApplication);
};


module.exports = {
  getEndpointInfo,
  getLogFile,
  getPingSystem,
  getPublicSystemInfo,
  getServerLogs,
  getSystemInfo,
  getWakeOnLanInfo,
  postPingSystem,
  restartApplication,
  shutdownApplication,
};
