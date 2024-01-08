/**
 * The HlsSegmentController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/HlsSegmentService');
const getHlsAudioSegmentLegacyAac = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHlsAudioSegmentLegacyAac);
};

const getHlsAudioSegmentLegacyMp3 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHlsAudioSegmentLegacyMp3);
};

const getHlsPlaylistLegacy = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHlsPlaylistLegacy);
};

const getHlsVideoSegmentLegacy = async (request, response) => {
  await Controller.handleRequest(request, response, service.getHlsVideoSegmentLegacy);
};

const stopEncodingProcess = async (request, response) => {
  await Controller.handleRequest(request, response, service.stopEncodingProcess);
};


module.exports = {
  getHlsAudioSegmentLegacyAac,
  getHlsAudioSegmentLegacyMp3,
  getHlsPlaylistLegacy,
  getHlsVideoSegmentLegacy,
  stopEncodingProcess,
};
