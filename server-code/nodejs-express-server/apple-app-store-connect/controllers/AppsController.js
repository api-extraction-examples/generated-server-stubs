/**
 * The AppsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppsService');
const appsAppInfosGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsAppInfosGet_to_many_related);
};

const appsAppStoreVersionsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsAppStoreVersionsGet_to_many_related);
};

const appsAvailableTerritoriesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsAvailableTerritoriesGet_to_many_related);
};

const appsBetaAppLocalizationsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsBetaAppLocalizationsGet_to_many_related);
};

const appsBetaAppReviewDetailGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsBetaAppReviewDetailGet_to_one_related);
};

const appsBetaGroupsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsBetaGroupsGet_to_many_related);
};

const appsBetaLicenseAgreementGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsBetaLicenseAgreementGet_to_one_related);
};

const appsBetaTestersDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsBetaTestersDelete_to_many_relationship);
};

const appsBuildsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsBuildsGet_to_many_related);
};

const appsEndUserLicenseAgreementGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsEndUserLicenseAgreementGet_to_one_related);
};

const appsGameCenterEnabledVersionsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsGameCenterEnabledVersionsGet_to_many_related);
};

const appsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsGet_collection);
};

const appsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsGet_instance);
};

const appsInAppPurchasesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsInAppPurchasesGet_to_many_related);
};

const appsPerfPowerMetricsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsPerfPowerMetricsGet_to_many_related);
};

const appsPreOrderGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsPreOrderGet_to_one_related);
};

const appsPreReleaseVersionsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsPreReleaseVersionsGet_to_many_related);
};

const appsPricesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsPricesGet_to_many_related);
};

const appsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appsUpdate_instance);
};


module.exports = {
  appsAppInfosGet_to_many_related,
  appsAppStoreVersionsGet_to_many_related,
  appsAvailableTerritoriesGet_to_many_related,
  appsBetaAppLocalizationsGet_to_many_related,
  appsBetaAppReviewDetailGet_to_one_related,
  appsBetaGroupsGet_to_many_related,
  appsBetaLicenseAgreementGet_to_one_related,
  appsBetaTestersDelete_to_many_relationship,
  appsBuildsGet_to_many_related,
  appsEndUserLicenseAgreementGet_to_one_related,
  appsGameCenterEnabledVersionsGet_to_many_related,
  appsGet_collection,
  appsGet_instance,
  appsInAppPurchasesGet_to_many_related,
  appsPerfPowerMetricsGet_to_many_related,
  appsPreOrderGet_to_one_related,
  appsPreReleaseVersionsGet_to_many_related,
  appsPricesGet_to_many_related,
  appsUpdate_instance,
};
