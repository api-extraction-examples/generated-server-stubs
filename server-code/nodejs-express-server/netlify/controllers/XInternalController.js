/**
 * The XInternalController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/XInternalService');
const createPluginRun = async (request, response) => {
  await Controller.handleRequest(request, response, service.createPluginRun);
};

const getLatestPluginRuns = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLatestPluginRuns);
};

const updatePlugin = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePlugin);
};


module.exports = {
  createPluginRun,
  getLatestPluginRuns,
  updatePlugin,
};
