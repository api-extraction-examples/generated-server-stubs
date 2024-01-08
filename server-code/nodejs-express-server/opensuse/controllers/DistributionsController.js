/**
 * The DistributionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DistributionsService');
const distributionsBulkReplacePUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.distributionsBulkReplacePUT);
};

const distributionsDistributionIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.distributionsDistributionIdDELETE);
};

const distributionsDistributionIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.distributionsDistributionIdGET);
};

const distributionsDistributionIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.distributionsDistributionIdPUT);
};

const distributionsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.distributionsGET);
};

const distributionsIncludeRemotesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.distributionsIncludeRemotesGET);
};

const distributionsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.distributionsPOST);
};


module.exports = {
  distributionsBulkReplacePUT,
  distributionsDistributionIdDELETE,
  distributionsDistributionIdGET,
  distributionsDistributionIdPUT,
  distributionsGET,
  distributionsIncludeRemotesGET,
  distributionsPOST,
};
