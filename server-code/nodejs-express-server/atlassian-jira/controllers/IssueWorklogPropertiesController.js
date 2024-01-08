/**
 * The IssueWorklogPropertiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueWorklogPropertiesService');
const deleteWorklogProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteWorklogProperty);
};

const getWorklogProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorklogProperty);
};

const getWorklogPropertyKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorklogPropertyKeys);
};

const setWorklogProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.setWorklogProperty);
};


module.exports = {
  deleteWorklogProperty,
  getWorklogProperty,
  getWorklogPropertyKeys,
  setWorklogProperty,
};
