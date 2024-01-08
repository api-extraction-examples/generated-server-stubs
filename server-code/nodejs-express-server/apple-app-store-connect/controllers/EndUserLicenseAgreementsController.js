/**
 * The EndUserLicenseAgreementsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/EndUserLicenseAgreementsService');
const endUserLicenseAgreementsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.endUserLicenseAgreementsCreate_instance);
};

const endUserLicenseAgreementsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.endUserLicenseAgreementsDelete_instance);
};

const endUserLicenseAgreementsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.endUserLicenseAgreementsGet_instance);
};

const endUserLicenseAgreementsTerritoriesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.endUserLicenseAgreementsTerritoriesGet_to_many_related);
};

const endUserLicenseAgreementsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.endUserLicenseAgreementsUpdate_instance);
};


module.exports = {
  endUserLicenseAgreementsCreate_instance,
  endUserLicenseAgreementsDelete_instance,
  endUserLicenseAgreementsGet_instance,
  endUserLicenseAgreementsTerritoriesGet_to_many_related,
  endUserLicenseAgreementsUpdate_instance,
};
