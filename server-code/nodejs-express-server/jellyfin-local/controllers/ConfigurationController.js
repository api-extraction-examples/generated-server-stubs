/**
 * The ConfigurationController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ConfigurationService');
const getConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.getConfiguration);
};

const getDefaultMetadataOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDefaultMetadataOptions);
};

const getNamedConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNamedConfiguration);
};

const updateConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateConfiguration);
};

const updateMediaEncoderPath = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateMediaEncoderPath);
};

const updateNamedConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateNamedConfiguration);
};


module.exports = {
  getConfiguration,
  getDefaultMetadataOptions,
  getNamedConfiguration,
  updateConfiguration,
  updateMediaEncoderPath,
  updateNamedConfiguration,
};
