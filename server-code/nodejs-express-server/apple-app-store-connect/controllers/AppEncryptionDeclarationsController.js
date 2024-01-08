/**
 * The AppEncryptionDeclarationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppEncryptionDeclarationsService');
const appEncryptionDeclarationsAppGet_to_one_related = async (request, response) => {
  await Controller.handleRequest(request, response, service.appEncryptionDeclarationsAppGet_to_one_related);
};

const appEncryptionDeclarationsBuildsCreate_to_many_relationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.appEncryptionDeclarationsBuildsCreate_to_many_relationship);
};

const appEncryptionDeclarationsGet_collection = async (request, response) => {
  await Controller.handleRequest(request, response, service.appEncryptionDeclarationsGet_collection);
};

const appEncryptionDeclarationsGet_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.appEncryptionDeclarationsGet_instance);
};


module.exports = {
  appEncryptionDeclarationsAppGet_to_one_related,
  appEncryptionDeclarationsBuildsCreate_to_many_relationship,
  appEncryptionDeclarationsGet_collection,
  appEncryptionDeclarationsGet_instance,
};
