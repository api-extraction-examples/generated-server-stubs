/**
 * The GameCenterEnabledVersionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GameCenterEnabledVersionsService');
const gameCenterEnabledVersionsCompatibleVersionsCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.gameCenterEnabledVersionsCompatibleVersionsCreate_to_many_relationship);
};

const gameCenterEnabledVersionsCompatibleVersionsDelete_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.gameCenterEnabledVersionsCompatibleVersionsDelete_to_many_relationship);
};

const gameCenterEnabledVersionsCompatibleVersionsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.gameCenterEnabledVersionsCompatibleVersionsGet_to_many_related);
};

const gameCenterEnabledVersionsCompatibleVersionsGet_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.gameCenterEnabledVersionsCompatibleVersionsGet_to_many_relationship);
};

const gameCenterEnabledVersionsCompatibleVersionsReplace_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.gameCenterEnabledVersionsCompatibleVersionsReplace_to_many_relationship);
};


module.exports = {
  gameCenterEnabledVersionsCompatibleVersionsCreate_to_many_relationship,
  gameCenterEnabledVersionsCompatibleVersionsDelete_to_many_relationship,
  gameCenterEnabledVersionsCompatibleVersionsGet_to_many_related,
  gameCenterEnabledVersionsCompatibleVersionsGet_to_many_relationship,
  gameCenterEnabledVersionsCompatibleVersionsReplace_to_many_relationship,
};
