/**
 * The BuildBetaDetailsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BuildBetaDetailsService');
const buildBetaDetailsBuildGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildBetaDetailsBuildGet_to_one_related);
};

const buildBetaDetailsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildBetaDetailsGet_collection);
};

const buildBetaDetailsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildBetaDetailsGet_instance);
};

const buildBetaDetailsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.buildBetaDetailsUpdate_instance);
};


module.exports = {
  buildBetaDetailsBuildGet_to_one_related,
  buildBetaDetailsGet_collection,
  buildBetaDetailsGet_instance,
  buildBetaDetailsUpdate_instance,
};
