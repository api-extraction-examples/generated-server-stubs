/**
 * The ApiKeyController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ApiKeyService');
const createKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.createKey);
};

const getKeys = async (request, response) => {
  await Controller.handleRequest(request, response, service.getKeys);
};

const revokeKey = async (request, response) => {
  await Controller.handleRequest(request, response, service.revokeKey);
};


module.exports = {
  createKey,
  getKeys,
  revokeKey,
};
