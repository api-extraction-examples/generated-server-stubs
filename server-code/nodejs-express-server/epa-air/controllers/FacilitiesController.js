/**
 * The FacilitiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FacilitiesService');
const air_rest_services_get_downloadGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_downloadGET);
};

const air_rest_services_get_downloadPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_downloadPOST);
};

const air_rest_services_get_facilitiesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_facilitiesGET);
};

const air_rest_services_get_facilitiesPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_facilitiesPOST);
};

const air_rest_services_get_facility_infoGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_facility_infoGET);
};

const air_rest_services_get_facility_infoPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_facility_infoPOST);
};

const air_rest_services_get_geojsonGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_geojsonGET);
};

const air_rest_services_get_geojsonPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_geojsonPOST);
};

const air_rest_services_get_info_clustersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_info_clustersGET);
};

const air_rest_services_get_info_clustersPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_info_clustersPOST);
};

const air_rest_services_get_mapGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_mapGET);
};

const air_rest_services_get_mapPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_mapPOST);
};

const air_rest_services_get_qidGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_qidGET);
};

const air_rest_services_get_qidPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.air_rest_services_get_qidPOST);
};


module.exports = {
  air_rest_services_get_downloadGET,
  air_rest_services_get_downloadPOST,
  air_rest_services_get_facilitiesGET,
  air_rest_services_get_facilitiesPOST,
  air_rest_services_get_facility_infoGET,
  air_rest_services_get_facility_infoPOST,
  air_rest_services_get_geojsonGET,
  air_rest_services_get_geojsonPOST,
  air_rest_services_get_info_clustersGET,
  air_rest_services_get_info_clustersPOST,
  air_rest_services_get_mapGET,
  air_rest_services_get_mapPOST,
  air_rest_services_get_qidGET,
  air_rest_services_get_qidPOST,
};
