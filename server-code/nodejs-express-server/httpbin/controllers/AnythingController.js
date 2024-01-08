/**
 * The AnythingController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AnythingService');
const anythingAnythingDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingAnythingDELETE);
};

const anythingAnythingGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingAnythingGET);
};

const anythingAnythingPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingAnythingPATCH);
};

const anythingAnythingPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingAnythingPOST);
};

const anythingAnythingPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingAnythingPUT);
};

const anythingAnythingTRACE = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingAnythingTRACE);
};

const anythingDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingDELETE);
};

const anythingGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingGET);
};

const anythingPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingPATCH);
};

const anythingPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingPOST);
};

const anythingPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingPUT);
};

const anythingTRACE = async (request, response) => {
  await Controller.handleRequest(request, response, service.anythingTRACE);
};


module.exports = {
  anythingAnythingDELETE,
  anythingAnythingGET,
  anythingAnythingPATCH,
  anythingAnythingPOST,
  anythingAnythingPUT,
  anythingAnythingTRACE,
  anythingDELETE,
  anythingGET,
  anythingPATCH,
  anythingPOST,
  anythingPUT,
  anythingTRACE,
};
