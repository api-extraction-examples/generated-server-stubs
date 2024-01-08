/**
 * The PermissionSchemesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PermissionSchemesService');
const createPermissionGrant = async (request, response) => {
  await Controller.handleRequest(request, response, service.createPermissionGrant);
};

const createPermissionScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.createPermissionScheme);
};

const deletePermissionScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePermissionScheme);
};

const deletePermissionSchemeEntity = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePermissionSchemeEntity);
};

const getAllPermissionSchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllPermissionSchemes);
};

const getPermissionScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPermissionScheme);
};

const getPermissionSchemeGrant = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPermissionSchemeGrant);
};

const getPermissionSchemeGrants = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPermissionSchemeGrants);
};

const updatePermissionScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePermissionScheme);
};


module.exports = {
  createPermissionGrant,
  createPermissionScheme,
  deletePermissionScheme,
  deletePermissionSchemeEntity,
  getAllPermissionSchemes,
  getPermissionScheme,
  getPermissionSchemeGrant,
  getPermissionSchemeGrants,
  updatePermissionScheme,
};
