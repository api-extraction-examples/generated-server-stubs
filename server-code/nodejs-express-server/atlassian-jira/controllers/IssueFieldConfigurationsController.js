/**
 * The IssueFieldConfigurationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueFieldConfigurationsService');
const assignFieldConfigurationSchemeToProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.assignFieldConfigurationSchemeToProject);
};

const createFieldConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.createFieldConfiguration);
};

const createFieldConfigurationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.createFieldConfigurationScheme);
};

const deleteFieldConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteFieldConfiguration);
};

const deleteFieldConfigurationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteFieldConfigurationScheme);
};

const getAllFieldConfigurationSchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllFieldConfigurationSchemes);
};

const getAllFieldConfigurations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllFieldConfigurations);
};

const getFieldConfigurationItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFieldConfigurationItems);
};

const getFieldConfigurationSchemeMappings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFieldConfigurationSchemeMappings);
};

const getFieldConfigurationSchemeProjectMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFieldConfigurationSchemeProjectMapping);
};

const removeIssueTypesFromGlobalFieldConfigurationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeIssueTypesFromGlobalFieldConfigurationScheme);
};

const setFieldConfigurationSchemeMapping = async (request, response) => {
  await Controller.handleRequest(request, response, service.setFieldConfigurationSchemeMapping);
};

const updateFieldConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateFieldConfiguration);
};

const updateFieldConfigurationItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateFieldConfigurationItems);
};

const updateFieldConfigurationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateFieldConfigurationScheme);
};


module.exports = {
  assignFieldConfigurationSchemeToProject,
  createFieldConfiguration,
  createFieldConfigurationScheme,
  deleteFieldConfiguration,
  deleteFieldConfigurationScheme,
  getAllFieldConfigurationSchemes,
  getAllFieldConfigurations,
  getFieldConfigurationItems,
  getFieldConfigurationSchemeMappings,
  getFieldConfigurationSchemeProjectMapping,
  removeIssueTypesFromGlobalFieldConfigurationScheme,
  setFieldConfigurationSchemeMapping,
  updateFieldConfiguration,
  updateFieldConfigurationItems,
  updateFieldConfigurationScheme,
};
