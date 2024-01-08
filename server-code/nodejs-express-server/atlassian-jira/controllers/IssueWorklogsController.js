/**
 * The IssueWorklogsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueWorklogsService');
const addWorklog = async (request, response) => {
  await Controller.handleRequest(request, response, service.addWorklog);
};

const deleteWorklog = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteWorklog);
};

const getIdsOfWorklogsDeletedSince = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIdsOfWorklogsDeletedSince);
};

const getIdsOfWorklogsModifiedSince = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIdsOfWorklogsModifiedSince);
};

const getIssueWorklog = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueWorklog);
};

const getWorklog = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorklog);
};

const getWorklogsForIds = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWorklogsForIds);
};

const updateWorklog = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateWorklog);
};


module.exports = {
  addWorklog,
  deleteWorklog,
  getIdsOfWorklogsDeletedSince,
  getIdsOfWorklogsModifiedSince,
  getIssueWorklog,
  getWorklog,
  getWorklogsForIds,
  updateWorklog,
};
