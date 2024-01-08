/**
 * The AppPricePointsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppPricePointsService');
const appPricePointsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPricePointsGet_collection);
};

const appPricePointsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPricePointsGet_instance);
};

const appPricePointsTerritoryGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appPricePointsTerritoryGet_to_one_related);
};


module.exports = {
  appPricePointsGet_collection,
  appPricePointsGet_instance,
  appPricePointsTerritoryGet_to_one_related,
};
