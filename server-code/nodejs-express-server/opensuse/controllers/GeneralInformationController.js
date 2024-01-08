/**
 * The GeneralInformationController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GeneralInformationService');
const aboutGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.aboutGET);
};

const architecturesArchitectureNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.architecturesArchitectureNameGET);
};

const architecturesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.architecturesGET);
};


module.exports = {
  aboutGET,
  architecturesArchitectureNameGET,
  architecturesGET,
};
