/**
 * The ScreensController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ScreensService');
const addFieldToDefaultScreen = async (request, response) => {
  await Controller.handleRequest(request, response, service.addFieldToDefaultScreen);
};

const createScreen = async (request, response) => {
  await Controller.handleRequest(request, response, service.createScreen);
};

const deleteScreen = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteScreen);
};

const getAvailableScreenFields = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAvailableScreenFields);
};

const getScreens = async (request, response) => {
  await Controller.handleRequest(request, response, service.getScreens);
};

const getScreensForField = async (request, response) => {
  await Controller.handleRequest(request, response, service.getScreensForField);
};

const updateScreen = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateScreen);
};


module.exports = {
  addFieldToDefaultScreen,
  createScreen,
  deleteScreen,
  getAvailableScreenFields,
  getScreens,
  getScreensForField,
  updateScreen,
};
