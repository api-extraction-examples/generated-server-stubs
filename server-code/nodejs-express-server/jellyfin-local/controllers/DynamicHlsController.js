/**
 * The DynamicHlsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DynamicHlsService');
const getHlsAudioSegment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHlsAudioSegment);
};

const getHlsVideoSegment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHlsVideoSegment);
};

const getMasterHlsAudioPlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMasterHlsAudioPlaylist);
};

const getMasterHlsVideoPlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMasterHlsVideoPlaylist);
};

const getVariantHlsAudioPlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVariantHlsAudioPlaylist);
};

const getVariantHlsVideoPlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVariantHlsVideoPlaylist);
};

const headMasterHlsAudioPlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.headMasterHlsAudioPlaylist);
};

const headMasterHlsVideoPlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.headMasterHlsVideoPlaylist);
};


module.exports = {
  getHlsAudioSegment,
  getHlsVideoSegment,
  getMasterHlsAudioPlaylist,
  getMasterHlsVideoPlaylist,
  getVariantHlsAudioPlaylist,
  getVariantHlsVideoPlaylist,
  headMasterHlsAudioPlaylist,
  headMasterHlsVideoPlaylist,
};
