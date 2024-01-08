/**
 * The ServiceInstanceController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ServiceInstanceService');
const createServiceInstance = async (request, response) => {
  await Controller.handleRequest(request, response, service.createServiceInstance);
};

const deleteServiceInstance = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteServiceInstance);
};

const listServiceInstancesForSite = async (request, response) => {
  await Controller.handleRequest(request, response, service.listServiceInstancesForSite);
};

const showServiceInstance = async (request, response) => {
  await Controller.handleRequest(request, response, service.showServiceInstance);
};

const updateServiceInstance = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateServiceInstance);
};


module.exports = {
  createServiceInstance,
  deleteServiceInstance,
  listServiceInstancesForSite,
  showServiceInstance,
  updateServiceInstance,
};
