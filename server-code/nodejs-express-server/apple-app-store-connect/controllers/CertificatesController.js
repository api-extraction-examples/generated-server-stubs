/**
 * The CertificatesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CertificatesService');
const certificatesCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.certificatesCreate_instance);
};

const certificatesDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.certificatesDelete_instance);
};

const certificatesGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.certificatesGet_collection);
};

const certificatesGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.certificatesGet_instance);
};


module.exports = {
  certificatesCreate_instance,
  certificatesDelete_instance,
  certificatesGet_collection,
  certificatesGet_instance,
};
