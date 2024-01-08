/**
 * The StartupController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/StartupService');
const completeWizard = async (request, response) => {
  await Controller.handleRequest(request, response, service.completeWizard);
};

const getFirstUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFirstUser);
};

const getFirstUser_2 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFirstUser_2);
};

const getStartupConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStartupConfiguration);
};

const setRemoteAccess = async (request, response) => {
  await Controller.handleRequest(request, response, service.setRemoteAccess);
};

const updateInitialConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateInitialConfiguration);
};

const updateStartupUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateStartupUser);
};


module.exports = {
  completeWizard,
  getFirstUser,
  getFirstUser_2,
  getStartupConfiguration,
  setRemoteAccess,
  updateInitialConfiguration,
  updateStartupUser,
};
