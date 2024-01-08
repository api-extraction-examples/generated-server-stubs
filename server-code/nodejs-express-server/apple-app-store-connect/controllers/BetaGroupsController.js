/**
 * The BetaGroupsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BetaGroupsService');
const betaGroupsAppGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsAppGet_to_one_related);
};

const betaGroupsBetaTestersCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsBetaTestersCreate_to_many_relationship);
};

const betaGroupsBetaTestersDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsBetaTestersDelete_to_many_relationship);
};

const betaGroupsBetaTestersGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsBetaTestersGet_to_many_related);
};

const betaGroupsBetaTestersGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsBetaTestersGet_to_many_relationship);
};

const betaGroupsBuildsCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsBuildsCreate_to_many_relationship);
};

const betaGroupsBuildsDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsBuildsDelete_to_many_relationship);
};

const betaGroupsBuildsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsBuildsGet_to_many_related);
};

const betaGroupsBuildsGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsBuildsGet_to_many_relationship);
};

const betaGroupsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsCreate_instance);
};

const betaGroupsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsDelete_instance);
};

const betaGroupsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsGet_collection);
};

const betaGroupsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsGet_instance);
};

const betaGroupsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaGroupsUpdate_instance);
};


module.exports = {
  betaGroupsAppGet_to_one_related,
  betaGroupsBetaTestersCreate_to_many_relationship,
  betaGroupsBetaTestersDelete_to_many_relationship,
  betaGroupsBetaTestersGet_to_many_related,
  betaGroupsBetaTestersGet_to_many_relationship,
  betaGroupsBuildsCreate_to_many_relationship,
  betaGroupsBuildsDelete_to_many_relationship,
  betaGroupsBuildsGet_to_many_related,
  betaGroupsBuildsGet_to_many_relationship,
  betaGroupsCreate_instance,
  betaGroupsDelete_instance,
  betaGroupsGet_collection,
  betaGroupsGet_instance,
  betaGroupsUpdate_instance,
};
