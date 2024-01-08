/**
 * The AppInfosController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppInfosService');
const appInfosAgeRatingDeclarationGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosAgeRatingDeclarationGet_to_one_related);
};

const appInfosAppInfoLocalizationsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosAppInfoLocalizationsGet_to_many_related);
};

const appInfosGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosGet_instance);
};

const appInfosPrimaryCategoryGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosPrimaryCategoryGet_to_one_related);
};

const appInfosPrimarySubcategoryOneGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosPrimarySubcategoryOneGet_to_one_related);
};

const appInfosPrimarySubcategoryTwoGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosPrimarySubcategoryTwoGet_to_one_related);
};

const appInfosSecondaryCategoryGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosSecondaryCategoryGet_to_one_related);
};

const appInfosSecondarySubcategoryOneGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosSecondarySubcategoryOneGet_to_one_related);
};

const appInfosSecondarySubcategoryTwoGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosSecondarySubcategoryTwoGet_to_one_related);
};

const appInfosUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appInfosUpdate_instance);
};


module.exports = {
  appInfosAgeRatingDeclarationGet_to_one_related,
  appInfosAppInfoLocalizationsGet_to_many_related,
  appInfosGet_instance,
  appInfosPrimaryCategoryGet_to_one_related,
  appInfosPrimarySubcategoryOneGet_to_one_related,
  appInfosPrimarySubcategoryTwoGet_to_one_related,
  appInfosSecondaryCategoryGet_to_one_related,
  appInfosSecondarySubcategoryOneGet_to_one_related,
  appInfosSecondarySubcategoryTwoGet_to_one_related,
  appInfosUpdate_instance,
};
