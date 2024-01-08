/**
 * The MyselfController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MyselfService');
const deleteLocale = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteLocale);
};

const getCurrentUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCurrentUser);
};

const getLocale = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLocale);
};

const getPreference = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPreference);
};

const removePreference = async (request, response) => {
  await Controller.handleRequest(request, response, service.removePreference);
};

const setLocale = async (request, response) => {
  await Controller.handleRequest(request, response, service.setLocale);
};

const setPreference = async (request, response) => {
  await Controller.handleRequest(request, response, service.setPreference);
};


module.exports = {
  deleteLocale,
  getCurrentUser,
  getLocale,
  getPreference,
  removePreference,
  setLocale,
  setPreference,
};
