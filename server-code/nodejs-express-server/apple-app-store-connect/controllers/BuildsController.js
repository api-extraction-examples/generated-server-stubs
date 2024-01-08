/**
 * The BuildsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BuildsService');
const buildsAppEncryptionDeclarationGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsAppEncryptionDeclarationGet_to_one_related);
};

const buildsAppEncryptionDeclarationGet_to_one_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsAppEncryptionDeclarationGet_to_one_relationship);
};

const buildsAppEncryptionDeclarationUpdate_to_one_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsAppEncryptionDeclarationUpdate_to_one_relationship);
};

const buildsAppGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsAppGet_to_one_related);
};

const buildsAppStoreVersionGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsAppStoreVersionGet_to_one_related);
};

const buildsBetaAppReviewSubmissionGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsBetaAppReviewSubmissionGet_to_one_related);
};

const buildsBetaBuildLocalizationsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsBetaBuildLocalizationsGet_to_many_related);
};

const buildsBetaGroupsCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsBetaGroupsCreate_to_many_relationship);
};

const buildsBetaGroupsDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsBetaGroupsDelete_to_many_relationship);
};

const buildsBuildBetaDetailGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsBuildBetaDetailGet_to_one_related);
};

const buildsDiagnosticSignaturesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsDiagnosticSignaturesGet_to_many_related);
};

const buildsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsGet_collection);
};

const buildsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsGet_instance);
};

const buildsIconsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsIconsGet_to_many_related);
};

const buildsIndividualTestersCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsIndividualTestersCreate_to_many_relationship);
};

const buildsIndividualTestersDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsIndividualTestersDelete_to_many_relationship);
};

const buildsIndividualTestersGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsIndividualTestersGet_to_many_related);
};

const buildsIndividualTestersGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsIndividualTestersGet_to_many_relationship);
};

const buildsPerfPowerMetricsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsPerfPowerMetricsGet_to_many_related);
};

const buildsPreReleaseVersionGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsPreReleaseVersionGet_to_one_related);
};

const buildsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildsUpdate_instance);
};


module.exports = {
  buildsAppEncryptionDeclarationGet_to_one_related,
  buildsAppEncryptionDeclarationGet_to_one_relationship,
  buildsAppEncryptionDeclarationUpdate_to_one_relationship,
  buildsAppGet_to_one_related,
  buildsAppStoreVersionGet_to_one_related,
  buildsBetaAppReviewSubmissionGet_to_one_related,
  buildsBetaBuildLocalizationsGet_to_many_related,
  buildsBetaGroupsCreate_to_many_relationship,
  buildsBetaGroupsDelete_to_many_relationship,
  buildsBuildBetaDetailGet_to_one_related,
  buildsDiagnosticSignaturesGet_to_many_related,
  buildsGet_collection,
  buildsGet_instance,
  buildsIconsGet_to_many_related,
  buildsIndividualTestersCreate_to_many_relationship,
  buildsIndividualTestersDelete_to_many_relationship,
  buildsIndividualTestersGet_to_many_related,
  buildsIndividualTestersGet_to_many_relationship,
  buildsPerfPowerMetricsGet_to_many_related,
  buildsPreReleaseVersionGet_to_one_related,
  buildsUpdate_instance,
};
