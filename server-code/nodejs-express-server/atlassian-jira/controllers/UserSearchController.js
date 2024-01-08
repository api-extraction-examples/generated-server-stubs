/**
 * The UserSearchController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserSearchService');
const findAssignableUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.findAssignableUsers);
};

const findBulkAssignableUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.findBulkAssignableUsers);
};

const findUserKeysByQuery = async (request, response) => {
  await Controller.handleRequest(request, response, service.findUserKeysByQuery);
};

const findUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.findUsers);
};

const findUsersByQuery = async (request, response) => {
  await Controller.handleRequest(request, response, service.findUsersByQuery);
};

const findUsersForPicker = async (request, response) => {
  await Controller.handleRequest(request, response, service.findUsersForPicker);
};

const findUsersWithAllPermissions = async (request, response) => {
  await Controller.handleRequest(request, response, service.findUsersWithAllPermissions);
};

const findUsersWithBrowsePermission = async (request, response) => {
  await Controller.handleRequest(request, response, service.findUsersWithBrowsePermission);
};


module.exports = {
  findAssignableUsers,
  findBulkAssignableUsers,
  findUserKeysByQuery,
  findUsers,
  findUsersByQuery,
  findUsersForPicker,
  findUsersWithAllPermissions,
  findUsersWithBrowsePermission,
};
