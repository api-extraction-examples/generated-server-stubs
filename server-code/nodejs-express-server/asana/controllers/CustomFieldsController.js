/**
 * The CustomFieldsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CustomFieldsService');
const createCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.createCustomField);
};

const createEnumOptionForCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.createEnumOptionForCustomField);
};

const deleteCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteCustomField);
};

const getCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCustomField);
};

const getCustomFieldsForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCustomFieldsForWorkspace);
};

const insertEnumOptionForCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.insertEnumOptionForCustomField);
};

const updateCustomField = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateCustomField);
};

const updateEnumOption = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateEnumOption);
};


module.exports = {
  createCustomField,
  createEnumOptionForCustomField,
  deleteCustomField,
  getCustomField,
  getCustomFieldsForWorkspace,
  insertEnumOptionForCustomField,
  updateCustomField,
  updateEnumOption,
};
