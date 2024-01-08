/**
 * The APIKeysController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/APIKeysService');
const keysGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.keysGET);
};

const keysIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.keysIdDELETE);
};

const keysIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.keysIdGET);
};

const keysPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.keysPOST);
};

const targetsTargetIdKeysGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdKeysGET);
};

const targetsTargetIdKeysIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdKeysIdDELETE);
};

const targetsTargetIdKeysIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdKeysIdGET);
};

const targetsTargetIdKeysPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdKeysPOST);
};


module.exports = {
  keysGET,
  keysIdDELETE,
  keysIdGET,
  keysPOST,
  targetsTargetIdKeysGET,
  targetsTargetIdKeysIdDELETE,
  targetsTargetIdKeysIdGET,
  targetsTargetIdKeysPOST,
};
