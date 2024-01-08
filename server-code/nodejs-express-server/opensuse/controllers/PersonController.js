/**
 * The PersonController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PersonService');
const personGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.personGET);
};

const personLoginGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.personLoginGET);
};

const personLoginGroupGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.personLoginGroupGET);
};

const personLoginPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.personLoginPOST);
};

const personLoginPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.personLoginPUT);
};

const personLoginTokenGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.personLoginTokenGET);
};

const personLoginTokenIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.personLoginTokenIdDELETE);
};

const personLoginTokenPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.personLoginTokenPOST);
};

const personPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.personPOST);
};

const personRegisterPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.personRegisterPOST);
};


module.exports = {
  personGET,
  personLoginGET,
  personLoginGroupGET,
  personLoginPOST,
  personLoginPUT,
  personLoginTokenGET,
  personLoginTokenIdDELETE,
  personLoginTokenPOST,
  personPOST,
  personRegisterPOST,
};
