/**
 * The PlaystateController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PlaystateService');
const markPlayedItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.markPlayedItem);
};

const markUnplayedItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.markUnplayedItem);
};

const onPlaybackProgress = async (request, response) => {
  await Controller.handleRequest(request, response, service.onPlaybackProgress);
};

const onPlaybackStart = async (request, response) => {
  await Controller.handleRequest(request, response, service.onPlaybackStart);
};

const onPlaybackStopped = async (request, response) => {
  await Controller.handleRequest(request, response, service.onPlaybackStopped);
};

const pingPlaybackSession = async (request, response) => {
  await Controller.handleRequest(request, response, service.pingPlaybackSession);
};

const reportPlaybackProgress = async (request, response) => {
  await Controller.handleRequest(request, response, service.reportPlaybackProgress);
};

const reportPlaybackStart = async (request, response) => {
  await Controller.handleRequest(request, response, service.reportPlaybackStart);
};

const reportPlaybackStopped = async (request, response) => {
  await Controller.handleRequest(request, response, service.reportPlaybackStopped);
};


module.exports = {
  markPlayedItem,
  markUnplayedItem,
  onPlaybackProgress,
  onPlaybackStart,
  onPlaybackStopped,
  pingPlaybackSession,
  reportPlaybackProgress,
  reportPlaybackStart,
  reportPlaybackStopped,
};
