/**
 * The AppScreenshotSetsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppScreenshotSetsService');
const appScreenshotSetsAppScreenshotsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotSetsAppScreenshotsGet_to_many_related);
};

const appScreenshotSetsAppScreenshotsGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotSetsAppScreenshotsGet_to_many_relationship);
};

const appScreenshotSetsAppScreenshotsReplace_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotSetsAppScreenshotsReplace_to_many_relationship);
};

const appScreenshotSetsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotSetsCreate_instance);
};

const appScreenshotSetsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotSetsDelete_instance);
};

const appScreenshotSetsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appScreenshotSetsGet_instance);
};


module.exports = {
  appScreenshotSetsAppScreenshotsGet_to_many_related,
  appScreenshotSetsAppScreenshotsGet_to_many_relationship,
  appScreenshotSetsAppScreenshotsReplace_to_many_relationship,
  appScreenshotSetsCreate_instance,
  appScreenshotSetsDelete_instance,
  appScreenshotSetsGet_instance,
};
