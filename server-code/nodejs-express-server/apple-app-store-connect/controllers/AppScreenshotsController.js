/**
 * The AppScreenshotsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppScreenshotsService');
const appScreenshotsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotsCreate_instance);
};

const appScreenshotsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotsDelete_instance);
};

const appScreenshotsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotsGet_instance);
};

const appScreenshotsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotsUpdate_instance);
};


module.exports = {
  appScreenshotsCreate_instance,
  appScreenshotsDelete_instance,
  appScreenshotsGet_instance,
  appScreenshotsUpdate_instance,
};
