/**
 * The AppPreviewsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppPreviewsService');
const appPreviewsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewsCreate_instance);
};

const appPreviewsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewsDelete_instance);
};

const appPreviewsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewsGet_instance);
};

const appPreviewsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewsUpdate_instance);
};


module.exports = {
  appPreviewsCreate_instance,
  appPreviewsDelete_instance,
  appPreviewsGet_instance,
  appPreviewsUpdate_instance,
};
