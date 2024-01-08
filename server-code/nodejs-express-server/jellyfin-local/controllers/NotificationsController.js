/**
 * The NotificationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/NotificationsService');
const createAdminNotification = async (request, response) => {
  await Controller.handleRequest(request, response, service.createAdminNotification);
};

const getNotificationServices = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNotificationServices);
};

const getNotificationTypes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNotificationTypes);
};

const getNotifications = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNotifications);
};

const getNotificationsSummary = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNotificationsSummary);
};

const setRead = async (request, response) => {
  await Controller.handleRequest(request, response, service.setRead);
};

const setUnread = async (request, response) => {
  await Controller.handleRequest(request, response, service.setUnread);
};


module.exports = {
  createAdminNotification,
  getNotificationServices,
  getNotificationTypes,
  getNotifications,
  getNotificationsSummary,
  setRead,
  setUnread,
};
