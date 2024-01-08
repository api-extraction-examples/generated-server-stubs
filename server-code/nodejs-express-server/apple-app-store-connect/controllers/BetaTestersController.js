/**
 * The BetaTestersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BetaTestersService');
const betaTestersAppsDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersAppsDelete_to_many_relationship);
};

const betaTestersAppsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersAppsGet_to_many_related);
};

const betaTestersAppsGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersAppsGet_to_many_relationship);
};

const betaTestersBetaGroupsCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersBetaGroupsCreate_to_many_relationship);
};

const betaTestersBetaGroupsDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersBetaGroupsDelete_to_many_relationship);
};

const betaTestersBetaGroupsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersBetaGroupsGet_to_many_related);
};

const betaTestersBetaGroupsGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersBetaGroupsGet_to_many_relationship);
};

const betaTestersBuildsCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersBuildsCreate_to_many_relationship);
};

const betaTestersBuildsDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersBuildsDelete_to_many_relationship);
};

const betaTestersBuildsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersBuildsGet_to_many_related);
};

const betaTestersBuildsGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersBuildsGet_to_many_relationship);
};

const betaTestersCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersCreate_instance);
};

const betaTestersDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersDelete_instance);
};

const betaTestersGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersGet_collection);
};

const betaTestersGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaTestersGet_instance);
};


module.exports = {
  betaTestersAppsDelete_to_many_relationship,
  betaTestersAppsGet_to_many_related,
  betaTestersAppsGet_to_many_relationship,
  betaTestersBetaGroupsCreate_to_many_relationship,
  betaTestersBetaGroupsDelete_to_many_relationship,
  betaTestersBetaGroupsGet_to_many_related,
  betaTestersBetaGroupsGet_to_many_relationship,
  betaTestersBuildsCreate_to_many_relationship,
  betaTestersBuildsDelete_to_many_relationship,
  betaTestersBuildsGet_to_many_related,
  betaTestersBuildsGet_to_many_relationship,
  betaTestersCreate_instance,
  betaTestersDelete_instance,
  betaTestersGet_collection,
  betaTestersGet_instance,
};
