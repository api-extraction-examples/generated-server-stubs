/**
 * The AccessTokensController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AccessTokensService');
const deleteToken = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteToken);
};

const getToken = async (request, response) => {
  await Controller.handleRequest(request, response, service.getToken);
};

const getTokens = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTokens);
};

const patchToken = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchToken);
};

const postToken = async (request, response) => {
  await Controller.handleRequest(request, response, service.postToken);
};

const resetToken = async (request, response) => {
  await Controller.handleRequest(request, response, service.resetToken);
};


module.exports = {
  deleteToken,
  getToken,
  getTokens,
  patchToken,
  postToken,
  resetToken,
};
