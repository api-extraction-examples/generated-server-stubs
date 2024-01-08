/**
 * The VulnerabilitiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/VulnerabilitiesService');
const vulnerability_definitionsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.vulnerability_definitionsGET);
};

const vulnerability_definitionsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.vulnerability_definitionsIdGET);
};


module.exports = {
  vulnerability_definitionsGET,
  vulnerability_definitionsIdGET,
};
