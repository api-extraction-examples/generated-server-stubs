/**
 * The IssuePropertiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssuePropertiesService');
const bulkDeleteIssueProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.bulkDeleteIssueProperty);
};

const bulkSetIssuePropertiesByIssue = async (request, response) => {
  await Controller.handleRequest(request, response, service.bulkSetIssuePropertiesByIssue);
};

const bulkSetIssueProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.bulkSetIssueProperty);
};

const bulkSetIssuesPropertiesList = async (request, response) => {
  await Controller.handleRequest(request, response, service.bulkSetIssuesPropertiesList);
};

const deleteIssueProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteIssueProperty);
};

const getIssueProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueProperty);
};

const getIssuePropertyKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssuePropertyKeys);
};

const setIssueProperty = async (request, response) => {
  await Controller.handleRequest(request, response, service.setIssueProperty);
};


module.exports = {
  bulkDeleteIssueProperty,
  bulkSetIssuePropertiesByIssue,
  bulkSetIssueProperty,
  bulkSetIssuesPropertiesList,
  deleteIssueProperty,
  getIssueProperty,
  getIssuePropertyKeys,
  setIssueProperty,
};
