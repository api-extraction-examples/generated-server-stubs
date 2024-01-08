/**
 * The ProjectPropertiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectPropertiesService');
const deleteProjectProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProjectProperty);
};

const getProjectProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectProperty);
};

const getProjectPropertyKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectPropertyKeys);
};

const setProjectProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.setProjectProperty);
};


module.exports = {
  deleteProjectProperty,
  getProjectProperty,
  getProjectPropertyKeys,
  setProjectProperty,
};
