/**
 * The MediaInfoController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MediaInfoService');
const closeLiveStream = async (request, response) => {
  await Controller.handleRequest(request, response, service.closeLiveStream);
};

const getBitrateTestBytes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBitrateTestBytes);
};

const getPlaybackInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPlaybackInfo);
};

const getPostedPlaybackInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPostedPlaybackInfo);
};

const openLiveStream = async (request, response) => {
  await Controller.handleRequest(request, response, service.openLiveStream);
};


module.exports = {
  closeLiveStream,
  getBitrateTestBytes,
  getPlaybackInfo,
  getPostedPlaybackInfo,
  openLiveStream,
};
