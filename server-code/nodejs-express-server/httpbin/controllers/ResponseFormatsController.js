/**
 * The ResponseFormatsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ResponseFormatsService');
const brotliGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.brotliGET);
};

const deflateGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.deflateGET);
};

const denyGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.denyGET);
};

const encodingUtf8GET = async (request, response) => {
  await Controller.handleRequest(request, response, service.encodingUtf8GET);
};

const gzipGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.gzipGET);
};

const htmlGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.htmlGET);
};

const jsonGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.jsonGET);
};

const robots_txtGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.robots_txtGET);
};

const xmlGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.xmlGET);
};


module.exports = {
  brotliGET,
  deflateGET,
  denyGET,
  encodingUtf8GET,
  gzipGET,
  htmlGET,
  jsonGET,
  robots_txtGET,
  xmlGET,
};
