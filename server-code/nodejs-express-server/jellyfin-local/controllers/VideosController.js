/**
 * The VideosController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/VideosService');
const deleteAlternateSources = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteAlternateSources);
};

const getAdditionalPart = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAdditionalPart);
};

const getVideoStream = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVideoStream);
};

const getVideoStreamByContainer = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVideoStreamByContainer);
};

const headVideoStream = async (request, response) => {
  await Controller.handleRequest(request, response, service.headVideoStream);
};

const headVideoStreamByContainer = async (request, response) => {
  await Controller.handleRequest(request, response, service.headVideoStreamByContainer);
};

const mergeVersions = async (request, response) => {
  await Controller.handleRequest(request, response, service.mergeVersions);
};


module.exports = {
  deleteAlternateSources,
  getAdditionalPart,
  getVideoStream,
  getVideoStreamByContainer,
  headVideoStream,
  headVideoStreamByContainer,
  mergeVersions,
};
