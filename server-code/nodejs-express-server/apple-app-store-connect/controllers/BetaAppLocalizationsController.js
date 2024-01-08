/**
 * The BetaAppLocalizationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BetaAppLocalizationsService');
const betaAppLocalizationsAppGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppLocalizationsAppGet_to_one_related);
};

const betaAppLocalizationsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppLocalizationsCreate_instance);
};

const betaAppLocalizationsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppLocalizationsDelete_instance);
};

const betaAppLocalizationsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppLocalizationsGet_collection);
};

const betaAppLocalizationsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppLocalizationsGet_instance);
};

const betaAppLocalizationsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppLocalizationsUpdate_instance);
};


module.exports = {
  betaAppLocalizationsAppGet_to_one_related,
  betaAppLocalizationsCreate_instance,
  betaAppLocalizationsDelete_instance,
  betaAppLocalizationsGet_collection,
  betaAppLocalizationsGet_instance,
  betaAppLocalizationsUpdate_instance,
};
