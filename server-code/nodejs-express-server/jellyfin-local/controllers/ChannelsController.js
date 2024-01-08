/**
 * The ChannelsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ChannelsService');
const getAllChannelFeatures = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllChannelFeatures);
};

const getChannelFeatures = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChannelFeatures);
};

const getChannelItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChannelItems);
};

const getChannels = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChannels);
};

const getLatestChannelItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLatestChannelItems);
};


module.exports = {
  getAllChannelFeatures,
  getChannelFeatures,
  getChannelItems,
  getChannels,
  getLatestChannelItems,
};
