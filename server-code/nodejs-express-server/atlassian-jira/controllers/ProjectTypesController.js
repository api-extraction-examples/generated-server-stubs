/**
 * The ProjectTypesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProjectTypesService');
const getAccessibleProjectTypeByKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAccessibleProjectTypeByKey);
};

const getAllAccessibleProjectTypes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllAccessibleProjectTypes);
};

const getAllProjectTypes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllProjectTypes);
};

const getProjectTypeByKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProjectTypeByKey);
};


module.exports = {
  getAccessibleProjectTypeByKey,
  getAllAccessibleProjectTypes,
  getAllProjectTypes,
  getProjectTypeByKey,
};
