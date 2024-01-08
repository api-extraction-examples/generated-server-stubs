/**
 * The BundleIdCapabilitiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BundleIdCapabilitiesService');
const bundleIdCapabilitiesCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdCapabilitiesCreate_instance);
};

const bundleIdCapabilitiesDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdCapabilitiesDelete_instance);
};

const bundleIdCapabilitiesUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.bundleIdCapabilitiesUpdate_instance);
};


module.exports = {
  bundleIdCapabilitiesCreate_instance,
  bundleIdCapabilitiesDelete_instance,
  bundleIdCapabilitiesUpdate_instance,
};
