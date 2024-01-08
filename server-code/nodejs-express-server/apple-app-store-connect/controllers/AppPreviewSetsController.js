/**
 * The AppPreviewSetsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppPreviewSetsService');
const appPreviewSetsAppPreviewsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewSetsAppPreviewsGet_to_many_related);
};

const appPreviewSetsAppPreviewsGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewSetsAppPreviewsGet_to_many_relationship);
};

const appPreviewSetsAppPreviewsReplace_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewSetsAppPreviewsReplace_to_many_relationship);
};

const appPreviewSetsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewSetsCreate_instance);
};

const appPreviewSetsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewSetsDelete_instance);
};

const appPreviewSetsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPreviewSetsGet_instance);
};


module.exports = {
  appPreviewSetsAppPreviewsGet_to_many_related,
  appPreviewSetsAppPreviewsGet_to_many_relationship,
  appPreviewSetsAppPreviewsReplace_to_many_relationship,
  appPreviewSetsCreate_instance,
  appPreviewSetsDelete_instance,
  appPreviewSetsGet_instance,
};
