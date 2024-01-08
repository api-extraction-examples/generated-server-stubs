/**
 * The TargetsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TargetsService');
const targetsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsGET);
};

const targetsIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsIdDELETE);
};

const targetsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsIdGET);
};

const targetsIdPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsIdPATCH);
};

const targetsIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsIdPUT);
};

const targetsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsPOST);
};


module.exports = {
  targetsGET,
  targetsIdDELETE,
  targetsIdGET,
  targetsIdPATCH,
  targetsIdPUT,
  targetsPOST,
};
