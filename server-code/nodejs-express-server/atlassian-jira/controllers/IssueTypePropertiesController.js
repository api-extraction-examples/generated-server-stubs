/**
 * The IssueTypePropertiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueTypePropertiesService');
const deleteIssueTypeProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteIssueTypeProperty);
};

const getIssueTypeProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypeProperty);
};

const getIssueTypePropertyKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueTypePropertyKeys);
};

const setIssueTypeProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.setIssueTypeProperty);
};


module.exports = {
  deleteIssueTypeProperty,
  getIssueTypeProperty,
  getIssueTypePropertyKeys,
  setIssueTypeProperty,
};
