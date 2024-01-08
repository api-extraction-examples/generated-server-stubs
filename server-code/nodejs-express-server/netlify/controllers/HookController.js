/**
 * The HookController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/HookService');
const createHookBySiteId = async (request, response) => {
  await Controller.handleRequest(request, response, service.createHookBySiteId);
};

const deleteHook = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteHook);
};

const enableHook = async (request, response) => {
  await Controller.handleRequest(request, response, service.enableHook);
};

const getHook = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHook);
};

const listHooksBySiteId = async (request, response) => {
  await Controller.handleRequest(request, response, service.listHooksBySiteId);
};

const updateHook = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateHook);
};


module.exports = {
  createHookBySiteId,
  deleteHook,
  enableHook,
  getHook,
  listHooksBySiteId,
  updateHook,
};
