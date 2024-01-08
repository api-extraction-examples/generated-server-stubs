/**
 * The PreReleaseVersionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PreReleaseVersionsService');
const preReleaseVersionsAppGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.preReleaseVersionsAppGet_to_one_related);
};

const preReleaseVersionsBuildsGet_to_many_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.preReleaseVersionsBuildsGet_to_many_related);
};

const preReleaseVersionsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.preReleaseVersionsGet_collection);
};

const preReleaseVersionsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.preReleaseVersionsGet_instance);
};


module.exports = {
  preReleaseVersionsAppGet_to_one_related,
  preReleaseVersionsBuildsGet_to_many_related,
  preReleaseVersionsGet_collection,
  preReleaseVersionsGet_instance,
};
