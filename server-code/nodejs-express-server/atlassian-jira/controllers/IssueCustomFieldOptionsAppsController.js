/**
 * The IssueCustomFieldOptionsAppsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueCustomFieldOptionsAppsService');
const createIssueFieldOption = async (request, response) => {
  await Controller.handleRequest(request, response, service.createIssueFieldOption);
};

const deleteIssueFieldOption = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteIssueFieldOption);
};

const getAllIssueFieldOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllIssueFieldOptions);
};

const getIssueFieldOption = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssueFieldOption);
};

const getSelectableIssueFieldOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSelectableIssueFieldOptions);
};

const getVisibleIssueFieldOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVisibleIssueFieldOptions);
};

const replaceIssueFieldOption = async (request, response) => {
  await Controller.handleRequest(request, response, service.replaceIssueFieldOption);
};

const updateIssueFieldOption = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateIssueFieldOption);
};


module.exports = {
  createIssueFieldOption,
  deleteIssueFieldOption,
  getAllIssueFieldOptions,
  getIssueFieldOption,
  getSelectableIssueFieldOptions,
  getVisibleIssueFieldOptions,
  replaceIssueFieldOption,
  updateIssueFieldOption,
};
