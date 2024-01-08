/**
 * The StatusUpdatesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/StatusUpdatesService');
const createStatusForObject = async (request, response) => {
  await Controller.handleRequest(request, response, service.createStatusForObject);
};

const deleteStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteStatus);
};

const getStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStatus);
};

const getStatusesForObject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStatusesForObject);
};


module.exports = {
  createStatusForObject,
  deleteStatus,
  getStatus,
  getStatusesForObject,
};
