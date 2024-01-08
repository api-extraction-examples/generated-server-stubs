/**
 * The ImageByNameController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ImageByNameService');
const getGeneralImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGeneralImage);
};

const getGeneralImages = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGeneralImages);
};

const getMediaInfoImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMediaInfoImage);
};

const getMediaInfoImages = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMediaInfoImages);
};

const getRatingImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRatingImage);
};

const getRatingImages = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRatingImages);
};


module.exports = {
  getGeneralImage,
  getGeneralImages,
  getMediaInfoImage,
  getMediaInfoImages,
  getRatingImage,
  getRatingImages,
};
