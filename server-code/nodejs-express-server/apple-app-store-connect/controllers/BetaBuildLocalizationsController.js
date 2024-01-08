/**
 * The BetaBuildLocalizationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BetaBuildLocalizationsService');
const betaBuildLocalizationsBuildGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaBuildLocalizationsBuildGet_to_one_related);
};

const betaBuildLocalizationsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaBuildLocalizationsCreate_instance);
};

const betaBuildLocalizationsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaBuildLocalizationsDelete_instance);
};

const betaBuildLocalizationsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaBuildLocalizationsGet_collection);
};

const betaBuildLocalizationsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaBuildLocalizationsGet_instance);
};

const betaBuildLocalizationsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaBuildLocalizationsUpdate_instance);
};


module.exports = {
  betaBuildLocalizationsBuildGet_to_one_related,
  betaBuildLocalizationsCreate_instance,
  betaBuildLocalizationsDelete_instance,
  betaBuildLocalizationsGet_collection,
  betaBuildLocalizationsGet_instance,
  betaBuildLocalizationsUpdate_instance,
};
