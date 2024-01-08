/**
 * The DevicesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DevicesService');
const devicesCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.devicesCreate_instance);
};

const devicesGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.devicesGet_collection);
};

const devicesGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.devicesGet_instance);
};

const devicesUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.devicesUpdate_instance);
};


module.exports = {
  devicesCreate_instance,
  devicesGet_collection,
  devicesGet_instance,
  devicesUpdate_instance,
};
