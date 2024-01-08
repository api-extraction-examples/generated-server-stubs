/**
 * The RoleController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RoleService');
const delete_role = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_role);
};

const get_role = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_role);
};

const get_roles = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_roles);
};

const patch_role = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_role);
};

const post_role = async (request, response) => {
  await Controller.handleRequest(request, response, service.post_role);
};


module.exports = {
  delete_role,
  get_role,
  get_roles,
  patch_role,
  post_role,
};
