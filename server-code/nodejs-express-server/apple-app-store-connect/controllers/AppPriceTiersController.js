/**
 * The AppPriceTiersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppPriceTiersService');
const appPriceTiersGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPriceTiersGet_collection);
};

const appPriceTiersGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPriceTiersGet_instance);
};

const appPriceTiersPricePointsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPriceTiersPricePointsGet_to_many_related);
};


module.exports = {
  appPriceTiersGet_collection,
  appPriceTiersGet_instance,
  appPriceTiersPricePointsGet_to_many_related,
};
