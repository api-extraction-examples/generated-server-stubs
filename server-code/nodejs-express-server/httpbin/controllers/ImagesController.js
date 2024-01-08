/**
 * The ImagesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ImagesService');
const imageGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.imageGET);
};

const imageJpegGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.imageJpegGET);
};

const imagePngGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.imagePngGET);
};

const imageSvgGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.imageSvgGET);
};

const imageWebpGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.imageWebpGET);
};


module.exports = {
  imageGET,
  imageJpegGET,
  imagePngGET,
  imageSvgGET,
  imageWebpGET,
};
