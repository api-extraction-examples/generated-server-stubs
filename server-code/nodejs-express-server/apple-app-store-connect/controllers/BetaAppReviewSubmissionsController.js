/**
 * The BetaAppReviewSubmissionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BetaAppReviewSubmissionsService');
const betaAppReviewSubmissionsBuildGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppReviewSubmissionsBuildGet_to_one_related);
};

const betaAppReviewSubmissionsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppReviewSubmissionsCreate_instance);
};

const betaAppReviewSubmissionsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppReviewSubmissionsGet_collection);
};

const betaAppReviewSubmissionsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaAppReviewSubmissionsGet_instance);
};


module.exports = {
  betaAppReviewSubmissionsBuildGet_to_one_related,
  betaAppReviewSubmissionsCreate_instance,
  betaAppReviewSubmissionsGet_collection,
  betaAppReviewSubmissionsGet_instance,
};
