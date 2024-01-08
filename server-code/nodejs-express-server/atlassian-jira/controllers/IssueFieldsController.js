/**
 * The IssueFieldsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueFieldsService');
const createCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.createCustomField);
};

const deleteCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteCustomField);
};

const getContextsForFieldDeprecated = async (request, response) => {
  await Controller.handleRequest(request, response, service.getContextsForFieldDeprecated);
};

const getFields = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFields);
};

const getFieldsPaginated = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFieldsPaginated);
};

const getTrashedFieldsPaginated = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTrashedFieldsPaginated);
};

const restoreCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.restoreCustomField);
};

const trashCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.trashCustomField);
};

const updateCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateCustomField);
};


module.exports = {
  createCustomField,
  deleteCustomField,
  getContextsForFieldDeprecated,
  getFields,
  getFieldsPaginated,
  getTrashedFieldsPaginated,
  restoreCustomField,
  trashCustomField,
  updateCustomField,
};
