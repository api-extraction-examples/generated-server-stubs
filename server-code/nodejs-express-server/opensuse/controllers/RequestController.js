/**
 * The RequestController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RequestService');
const requestGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.requestGET);
};

const requestIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.requestIdDELETE);
};

const requestIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.requestIdGET);
};

const requestIdPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.requestIdPOST);
};

const requestIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.requestIdPUT);
};

const requestIdcmddiffPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.requestIdcmddiffPOST);
};

const requestPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.requestPOST);
};

const requestviewcollectionGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.requestviewcollectionGET);
};


module.exports = {
  requestGET,
  requestIdDELETE,
  requestIdGET,
  requestIdPOST,
  requestIdPUT,
  requestIdcmddiffPOST,
  requestPOST,
  requestviewcollectionGET,
};
