/**
 * The MediaController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MediaService');
const mediaMediaIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.mediaMediaIdGET);
};

const mediaPopularGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.mediaPopularGET);
};

const mediaSearchGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.mediaSearchGET);
};

const mediaShortcodeShortcodeGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.mediaShortcodeShortcodeGET);
};


module.exports = {
  mediaMediaIdGET,
  mediaPopularGET,
  mediaSearchGET,
  mediaShortcodeShortcodeGET,
};
