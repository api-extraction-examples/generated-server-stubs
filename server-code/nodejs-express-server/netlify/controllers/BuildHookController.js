/**
 * The BuildHookController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BuildHookService');
const createSiteBuildHook = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSiteBuildHook);
};

const deleteSiteBuildHook = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteSiteBuildHook);
};

const getSiteBuildHook = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSiteBuildHook);
};

const listSiteBuildHooks = async (request, response) => {
  await Controller.handleRequest(request, response, service.listSiteBuildHooks);
};

const updateSiteBuildHook = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSiteBuildHook);
};


module.exports = {
  createSiteBuildHook,
  deleteSiteBuildHook,
  getSiteBuildHook,
  listSiteBuildHooks,
  updateSiteBuildHook,
};
