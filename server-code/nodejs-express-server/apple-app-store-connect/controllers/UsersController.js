/**
 * The UsersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UsersService');
const usersDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersDelete_instance);
};

const usersGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersGet_collection);
};

const usersGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersGet_instance);
};

const usersUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersUpdate_instance);
};

const usersVisibleAppsCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersVisibleAppsCreate_to_many_relationship);
};

const usersVisibleAppsDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersVisibleAppsDelete_to_many_relationship);
};

const usersVisibleAppsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersVisibleAppsGet_to_many_related);
};

const usersVisibleAppsGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersVisibleAppsGet_to_many_relationship);
};

const usersVisibleAppsReplace_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersVisibleAppsReplace_to_many_relationship);
};


module.exports = {
  usersDelete_instance,
  usersGet_collection,
  usersGet_instance,
  usersUpdate_instance,
  usersVisibleAppsCreate_to_many_relationship,
  usersVisibleAppsDelete_to_many_relationship,
  usersVisibleAppsGet_to_many_related,
  usersVisibleAppsGet_to_many_relationship,
  usersVisibleAppsReplace_to_many_relationship,
};
