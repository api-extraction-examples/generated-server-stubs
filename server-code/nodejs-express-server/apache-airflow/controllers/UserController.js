/**
 * The UserController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserService');
const delete_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_user);
};

const get_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_user);
};

const get_users = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_users);
};

const patch_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_user);
};

const post_user = async (request, response) => {
  await Controller.handleRequest(request, response, service.post_user);
};


module.exports = {
  delete_user,
  get_user,
  get_users,
  patch_user,
  post_user,
};
