/**
 * The BetaAppReviewDetailsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BetaAppReviewDetailsService');
const betaAppReviewDetailsAppGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppReviewDetailsAppGet_to_one_related);
};

const betaAppReviewDetailsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppReviewDetailsGet_collection);
};

const betaAppReviewDetailsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppReviewDetailsGet_instance);
};

const betaAppReviewDetailsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppReviewDetailsUpdate_instance);
};


module.exports = {
  betaAppReviewDetailsAppGet_to_one_related,
  betaAppReviewDetailsGet_collection,
  betaAppReviewDetailsGet_instance,
  betaAppReviewDetailsUpdate_instance,
};
