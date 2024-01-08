/**
 * The QuickConnectController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/QuickConnectService');
const activate = async (request, response) => {
  await Controller.handleRequest(request, response, service.activate);
};

const authorize = async (request, response) => {
  await Controller.handleRequest(request, response, service.authorize);
};

const available = async (request, response) => {
  await Controller.handleRequest(request, response, service.available);
};

const connect = async (request, response) => {
  await Controller.handleRequest(request, response, service.connect);
};

const deauthorize = async (request, response) => {
  await Controller.handleRequest(request, response, service.deauthorize);
};

const getStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStatus);
};

const initiate = async (request, response) => {
  await Controller.handleRequest(request, response, service.initiate);
};


module.exports = {
  activate,
  authorize,
  available,
  connect,
  deauthorize,
  getStatus,
  initiate,
};
