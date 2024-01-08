/**
 * The BetaLicenseAgreementsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BetaLicenseAgreementsService');
const betaLicenseAgreementsAppGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaLicenseAgreementsAppGet_to_one_related);
};

const betaLicenseAgreementsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaLicenseAgreementsGet_collection);
};

const betaLicenseAgreementsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaLicenseAgreementsGet_instance);
};

const betaLicenseAgreementsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.betaLicenseAgreementsUpdate_instance);
};


module.exports = {
  betaLicenseAgreementsAppGet_to_one_related,
  betaLicenseAgreementsGet_collection,
  betaLicenseAgreementsGet_instance,
  betaLicenseAgreementsUpdate_instance,
};
