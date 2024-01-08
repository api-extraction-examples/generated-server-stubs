/**
 * The PoolController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PoolService');
const delete_pool = async (request, response) => {
  await Controller.handleRequest(request, response, service.delete_pool);
};

const get_pool = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_pool);
};

const get_pools = async (request, response) => {
  await Controller.handleRequest(request, response, service.get_pools);
};

const patch_pool = async (request, response) => {
  await Controller.handleRequest(request, response, service.patch_pool);
};

const post_pool = async (request, response) => {
  await Controller.handleRequest(request, response, service.post_pool);
};


module.exports = {
  delete_pool,
  get_pool,
  get_pools,
  patch_pool,
  post_pool,
};
