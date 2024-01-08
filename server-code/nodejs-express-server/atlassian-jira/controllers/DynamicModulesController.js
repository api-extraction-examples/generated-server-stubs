/**
 * The DynamicModulesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DynamicModulesService');
const dynamicModulesResource.getModules_get = async (request, response) => {
  await Controller.handleRequest(request, response, service.dynamicModulesResource.getModules_get);
};

const dynamicModulesResource.registerModules_post = async (request, response) => {
  await Controller.handleRequest(request, response, service.dynamicModulesResource.registerModules_post);
};

const dynamicModulesResource.removeModules_delete = async (request, response) => {
  await Controller.handleRequest(request, response, service.dynamicModulesResource.removeModules_delete);
};


module.exports = {
  dynamicModulesResource.getModules_get,
  dynamicModulesResource.registerModules_post,
  dynamicModulesResource.removeModules_delete,
};
