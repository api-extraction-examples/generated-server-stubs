/**
 * The IssueNotificationSchemesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueNotificationSchemesService');
const addNotifications = async (request, response) => {
  await Controller.handleRequest(request, response, service.addNotifications);
};

const createNotificationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.createNotificationScheme);
};

const deleteNotificationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteNotificationScheme);
};

const getNotificationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNotificationScheme);
};

const getNotificationSchemeToProjectMappings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNotificationSchemeToProjectMappings);
};

const getNotificationSchemes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNotificationSchemes);
};

const removeNotificationFromNotificationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeNotificationFromNotificationScheme);
};

const updateNotificationScheme = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateNotificationScheme);
};


module.exports = {
  addNotifications,
  createNotificationScheme,
  deleteNotificationScheme,
  getNotificationScheme,
  getNotificationSchemeToProjectMappings,
  getNotificationSchemes,
  removeNotificationFromNotificationScheme,
  updateNotificationScheme,
};
