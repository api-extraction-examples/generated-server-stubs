/**
 * The DevicesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DevicesService');
const deleteDevice = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDevice);
};

const getDeviceInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDeviceInfo);
};

const getDeviceOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDeviceOptions);
};

const getDevices = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDevices);
};

const updateDeviceOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateDeviceOptions);
};


module.exports = {
  deleteDevice,
  getDeviceInfo,
  getDeviceOptions,
  getDevices,
  updateDeviceOptions,
};
