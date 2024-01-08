/**
 * The MetadataController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MetadataService');
const air_rest_services_metadataGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_metadataGET);
};

const air_rest_services_metadataPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_metadataPOST);
};


module.exports = {
  air_rest_services_metadataGET,
  air_rest_services_metadataPOST,
};
