/**
 * The RequestInspectionController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RequestInspectionService');
const headersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.headersGET);
};

const ipGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.ipGET);
};

const user_agentGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.user_agentGET);
};


module.exports = {
  headersGET,
  ipGET,
  user_agentGET,
};
