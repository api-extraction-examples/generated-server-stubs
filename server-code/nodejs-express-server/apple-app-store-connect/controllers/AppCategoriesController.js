/**
 * The AppCategoriesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppCategoriesService');
const appCategoriesGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.appCategoriesGet_collection);
};

const appCategoriesGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appCategoriesGet_instance);
};

const appCategoriesParentGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appCategoriesParentGet_to_one_related);
};

const appCategoriesSubcategoriesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appCategoriesSubcategoriesGet_to_many_related);
};


module.exports = {
  appCategoriesGet_collection,
  appCategoriesGet_instance,
  appCategoriesParentGet_to_one_related,
  appCategoriesSubcategoriesGet_to_many_related,
};
