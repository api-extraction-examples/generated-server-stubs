/**
 * The AppStoreReviewAttachmentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppStoreReviewAttachmentsService');
const appStoreReviewAttachmentsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreReviewAttachmentsCreate_instance);
};

const appStoreReviewAttachmentsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreReviewAttachmentsDelete_instance);
};

const appStoreReviewAttachmentsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreReviewAttachmentsGet_instance);
};

const appStoreReviewAttachmentsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreReviewAttachmentsUpdate_instance);
};


module.exports = {
  appStoreReviewAttachmentsCreate_instance,
  appStoreReviewAttachmentsDelete_instance,
  appStoreReviewAttachmentsGet_instance,
  appStoreReviewAttachmentsUpdate_instance,
};
