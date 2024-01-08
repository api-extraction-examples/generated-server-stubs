/**
 * The SubtitleController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SubtitleService');
const deleteSubtitle = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteSubtitle);
};

const downloadRemoteSubtitles = async (request, response) => {
  await Controller.handleRequest(request, response, service.downloadRemoteSubtitles);
};

const getFallbackFont = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFallbackFont);
};

const getFallbackFontList = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFallbackFontList);
};

const getRemoteSubtitles = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRemoteSubtitles);
};

const getSubtitle = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSubtitle);
};

const getSubtitlePlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSubtitlePlaylist);
};

const getSubtitleWithTicks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSubtitleWithTicks);
};

const searchRemoteSubtitles = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchRemoteSubtitles);
};

const uploadSubtitle = async (request, response) => {
  await Controller.handleRequest(request, response, service.uploadSubtitle);
};


module.exports = {
  deleteSubtitle,
  downloadRemoteSubtitles,
  getFallbackFont,
  getFallbackFontList,
  getRemoteSubtitles,
  getSubtitle,
  getSubtitlePlaylist,
  getSubtitleWithTicks,
  searchRemoteSubtitles,
  uploadSubtitle,
};
