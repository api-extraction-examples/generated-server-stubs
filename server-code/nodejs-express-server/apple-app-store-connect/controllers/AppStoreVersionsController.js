/**
 * The AppStoreVersionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppStoreVersionsService');
const appStoreVersionsAgeRatingDeclarationGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsAgeRatingDeclarationGet_to_one_related);
};

const appStoreVersionsAppStoreReviewDetailGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsAppStoreReviewDetailGet_to_one_related);
};

const appStoreVersionsAppStoreVersionLocalizationsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsAppStoreVersionLocalizationsGet_to_many_related);
};

const appStoreVersionsAppStoreVersionPhasedReleaseGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsAppStoreVersionPhasedReleaseGet_to_one_related);
};

const appStoreVersionsAppStoreVersionSubmissionGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsAppStoreVersionSubmissionGet_to_one_related);
};

const appStoreVersionsBuildGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsBuildGet_to_one_related);
};

const appStoreVersionsBuildGet_to_one_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsBuildGet_to_one_relationship);
};

const appStoreVersionsBuildUpdate_to_one_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsBuildUpdate_to_one_relationship);
};

const appStoreVersionsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsCreate_instance);
};

const appStoreVersionsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsDelete_instance);
};

const appStoreVersionsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsGet_instance);
};

const appStoreVersionsIdfaDeclarationGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsIdfaDeclarationGet_to_one_related);
};

const appStoreVersionsRoutingAppCoverageGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsRoutingAppCoverageGet_to_one_related);
};

const appStoreVersionsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appStoreVersionsUpdate_instance);
};


module.exports = {
  appStoreVersionsAgeRatingDeclarationGet_to_one_related,
  appStoreVersionsAppStoreReviewDetailGet_to_one_related,
  appStoreVersionsAppStoreVersionLocalizationsGet_to_many_related,
  appStoreVersionsAppStoreVersionPhasedReleaseGet_to_one_related,
  appStoreVersionsAppStoreVersionSubmissionGet_to_one_related,
  appStoreVersionsBuildGet_to_one_related,
  appStoreVersionsBuildGet_to_one_relationship,
  appStoreVersionsBuildUpdate_to_one_relationship,
  appStoreVersionsCreate_instance,
  appStoreVersionsDelete_instance,
  appStoreVersionsGet_instance,
  appStoreVersionsIdfaDeclarationGet_to_one_related,
  appStoreVersionsRoutingAppCoverageGet_to_one_related,
  appStoreVersionsUpdate_instance,
};
