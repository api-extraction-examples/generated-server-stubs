/**
 * The EnvironmentVariablesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/EnvironmentVariablesService');
const createEnvVars = async (request, response) => {
  await Controller.handleRequest(request, response, service.createEnvVars);
};

const deleteEnvVar = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteEnvVar);
};

const deleteEnvVarValue = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteEnvVarValue);
};

const getEnvVar = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEnvVar);
};

const getEnvVars = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEnvVars);
};

const setEnvVarValue = async (request, response) => {
  await Controller.handleRequest(request, response, service.setEnvVarValue);
};

const updateEnvVar = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateEnvVar);
};


module.exports = {
  createEnvVars,
  deleteEnvVar,
  deleteEnvVarValue,
  getEnvVar,
  getEnvVars,
  setEnvVarValue,
  updateEnvVar,
};
