/**
 * The AppPropertiesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppPropertiesService');
const addonPropertiesResource.deleteAddonProperty_delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.addonPropertiesResource.deleteAddonProperty_delete);
};

const addonPropertiesResource.getAddonProperties_get = async (request, response) => {
  await Controller.handleRequest(request, response, service.addonPropertiesResource.getAddonProperties_get);
};

const addonPropertiesResource.getAddonProperty_get = async (request, response) => {
  await Controller.handleRequest(request, response, service.addonPropertiesResource.getAddonProperty_get);
};

const addonPropertiesResource.putAddonProperty_put = async (request, response) => {
  await Controller.handleRequest(request, response, service.addonPropertiesResource.putAddonProperty_put);
};


module.exports = {
  addonPropertiesResource.deleteAddonProperty_delete,
  addonPropertiesResource.getAddonProperties_get,
  addonPropertiesResource.getAddonProperty_get,
  addonPropertiesResource.putAddonProperty_put,
};
