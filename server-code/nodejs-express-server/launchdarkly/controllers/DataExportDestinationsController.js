/**
 * The DataExportDestinationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DataExportDestinationsService');
const deleteDestination = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDestination);
};

const getDestination = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDestination);
};

const getDestinations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDestinations);
};

const patchDestination = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchDestination);
};

const postDestination = async (request, response) => {
  await Controller.handleRequest(request, response, service.postDestination);
};


module.exports = {
  deleteDestination,
  getDestination,
  getDestinations,
  patchDestination,
  postDestination,
};
