/**
 * The AppStoreVersionLocalizationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppStoreVersionLocalizationsService');
const appStoreVersionLocalizationsAppPreviewSetsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionLocalizationsAppPreviewSetsGet_to_many_related);
};

const appStoreVersionLocalizationsAppScreenshotSetsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionLocalizationsAppScreenshotSetsGet_to_many_related);
};

const appStoreVersionLocalizationsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionLocalizationsCreate_instance);
};

const appStoreVersionLocalizationsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionLocalizationsDelete_instance);
};

const appStoreVersionLocalizationsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionLocalizationsGet_instance);
};

const appStoreVersionLocalizationsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionLocalizationsUpdate_instance);
};


module.exports = {
  appStoreVersionLocalizationsAppPreviewSetsGet_to_many_related,
  appStoreVersionLocalizationsAppScreenshotSetsGet_to_many_related,
  appStoreVersionLocalizationsCreate_instance,
  appStoreVersionLocalizationsDelete_instance,
  appStoreVersionLocalizationsGet_instance,
  appStoreVersionLocalizationsUpdate_instance,
};
