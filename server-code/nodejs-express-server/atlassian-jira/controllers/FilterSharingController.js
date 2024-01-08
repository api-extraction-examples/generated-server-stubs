/**
 * The FilterSharingController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FilterSharingService');
const addSharePermission = async (request, response) => {
  await Controller.handleRequest(request, response, service.addSharePermission);
};

const deleteSharePermission = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteSharePermission);
};

const getDefaultShareScope = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDefaultShareScope);
};

const getSharePermission = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSharePermission);
};

const getSharePermissions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSharePermissions);
};

const setDefaultShareScope = async (request, response) => {
  await Controller.handleRequest(request, response, service.setDefaultShareScope);
};


module.exports = {
  addSharePermission,
  deleteSharePermission,
  getDefaultShareScope,
  getSharePermission,
  getSharePermissions,
  setDefaultShareScope,
};
