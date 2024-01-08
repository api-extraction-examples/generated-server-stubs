/**
 * The ItemsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ItemsService');
const getItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItems);
};

const getItemsByUserId = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItemsByUserId);
};

const getResumeItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.getResumeItems);
};


module.exports = {
  getItems,
  getItemsByUserId,
  getResumeItems,
};
