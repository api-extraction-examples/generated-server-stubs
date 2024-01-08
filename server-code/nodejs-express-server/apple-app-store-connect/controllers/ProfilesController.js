/**
 * The ProfilesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProfilesService');
const profilesBundleIdGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.profilesBundleIdGet_to_one_related);
};

const profilesCertificatesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.profilesCertificatesGet_to_many_related);
};

const profilesCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.profilesCreate_instance);
};

const profilesDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.profilesDelete_instance);
};

const profilesDevicesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.profilesDevicesGet_to_many_related);
};

const profilesGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.profilesGet_collection);
};

const profilesGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.profilesGet_instance);
};


module.exports = {
  profilesBundleIdGet_to_one_related,
  profilesCertificatesGet_to_many_related,
  profilesCreate_instance,
  profilesDelete_instance,
  profilesDevicesGet_to_many_related,
  profilesGet_collection,
  profilesGet_instance,
};
