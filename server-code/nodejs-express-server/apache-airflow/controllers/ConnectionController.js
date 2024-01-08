/**
 * The ConnectionController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ConnectionService');
const delete_connection = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_connection);
};

const get_connection = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_connection);
};

const get_connections = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_connections);
};

const patch_connection = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_connection);
};

const post_connection = async (request, response) => {
  await Controller.handleRequest(request, response, service.post_connection);
};

const test_connection = async (request, response) => {
  await Controller.handleRequest(request, response, service.test_connection);
};


module.exports = {
  delete_connection,
  get_connection,
  get_connections,
  patch_connection,
  post_connection,
  test_connection,
};
