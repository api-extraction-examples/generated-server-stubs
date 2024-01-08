/**
 * The BundleIdsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BundleIdsService');
const bundleIdsAppGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdsAppGet_to_one_related);
};

const bundleIdsBundleIdCapabilitiesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdsBundleIdCapabilitiesGet_to_many_related);
};

const bundleIdsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdsCreate_instance);
};

const bundleIdsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdsDelete_instance);
};

const bundleIdsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdsGet_collection);
};

const bundleIdsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdsGet_instance);
};

const bundleIdsProfilesGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdsProfilesGet_to_many_related);
};

const bundleIdsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdsUpdate_instance);
};


module.exports = {
  bundleIdsAppGet_to_one_related,
  bundleIdsBundleIdCapabilitiesGet_to_many_related,
  bundleIdsCreate_instance,
  bundleIdsDelete_instance,
  bundleIdsGet_collection,
  bundleIdsGet_instance,
  bundleIdsProfilesGet_to_many_related,
  bundleIdsUpdate_instance,
};
