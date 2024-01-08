/**
 * The DlnaServerController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DlnaServerService');
const getConnectionManager = async (request, response) => {
  await Controller.handleRequest(request, response, service.getConnectionManager);
};

const getConnectionManager_2 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getConnectionManager_2);
};

const getConnectionManager_3 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getConnectionManager_3);
};

const getContentDirectory = async (request, response) => {
  await Controller.handleRequest(request, response, service.getContentDirectory);
};

const getContentDirectory_2 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getContentDirectory_2);
};

const getContentDirectory_3 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getContentDirectory_3);
};

const getDescriptionXml = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDescriptionXml);
};

const getDescriptionXml_2 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDescriptionXml_2);
};

const getIcon = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIcon);
};

const getIconId = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIconId);
};

const getMediaReceiverRegistrar = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMediaReceiverRegistrar);
};

const getMediaReceiverRegistrar_2 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMediaReceiverRegistrar_2);
};

const getMediaReceiverRegistrar_3 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMediaReceiverRegistrar_3);
};

const processConnectionManagerControlRequest = async (request, response) => {
  await Controller.handleRequest(request, response, service.processConnectionManagerControlRequest);
};

const processContentDirectoryControlRequest = async (request, response) => {
  await Controller.handleRequest(request, response, service.processContentDirectoryControlRequest);
};

const processMediaReceiverRegistrarControlRequest = async (request, response) => {
  await Controller.handleRequest(request, response, service.processMediaReceiverRegistrarControlRequest);
};


module.exports = {
  getConnectionManager,
  getConnectionManager_2,
  getConnectionManager_3,
  getContentDirectory,
  getContentDirectory_2,
  getContentDirectory_3,
  getDescriptionXml,
  getDescriptionXml_2,
  getIcon,
  getIconId,
  getMediaReceiverRegistrar,
  getMediaReceiverRegistrar_2,
  getMediaReceiverRegistrar_3,
  processConnectionManagerControlRequest,
  processContentDirectoryControlRequest,
  processMediaReceiverRegistrarControlRequest,
};
