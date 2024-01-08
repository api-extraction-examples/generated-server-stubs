/**
 * The ScreenTabsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ScreenTabsService');
const addScreenTab = async (request, response) => {
  await Controller.handleRequest(request, response, service.addScreenTab);
};

const deleteScreenTab = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteScreenTab);
};

const getAllScreenTabs = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllScreenTabs);
};

const moveScreenTab = async (request, response) => {
  await Controller.handleRequest(request, response, service.moveScreenTab);
};

const renameScreenTab = async (request, response) => {
  await Controller.handleRequest(request, response, service.renameScreenTab);
};


module.exports = {
  addScreenTab,
  deleteScreenTab,
  getAllScreenTabs,
  moveScreenTab,
  renameScreenTab,
};
