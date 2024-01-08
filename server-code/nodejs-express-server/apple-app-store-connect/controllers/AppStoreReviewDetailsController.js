/**
 * The AppStoreReviewDetailsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppStoreReviewDetailsService');
const appStoreReviewDetailsAppStoreReviewAttachmentsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreReviewDetailsAppStoreReviewAttachmentsGet_to_many_related);
};

const appStoreReviewDetailsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreReviewDetailsCreate_instance);
};

const appStoreReviewDetailsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreReviewDetailsGet_instance);
};

const appStoreReviewDetailsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreReviewDetailsUpdate_instance);
};


module.exports = {
  appStoreReviewDetailsAppStoreReviewAttachmentsGet_to_many_related,
  appStoreReviewDetailsCreate_instance,
  appStoreReviewDetailsGet_instance,
  appStoreReviewDetailsUpdate_instance,
};
