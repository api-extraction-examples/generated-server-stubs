/**
 * The ItemLookupController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ItemLookupService');
const applySearchCriteria = async (request, response) => {
  await Controller.handleRequest(request, response, service.applySearchCriteria);
};

const getBookRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBookRemoteSearchResults);
};

const getBoxSetRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBoxSetRemoteSearchResults);
};

const getExternalIdInfos = async (request, response) => {
  await Controller.handleRequest(request, response, service.getExternalIdInfos);
};

const getMovieRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMovieRemoteSearchResults);
};

const getMusicAlbumRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicAlbumRemoteSearchResults);
};

const getMusicArtistRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicArtistRemoteSearchResults);
};

const getMusicVideoRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicVideoRemoteSearchResults);
};

const getPersonRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonRemoteSearchResults);
};

const getRemoteSearchImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRemoteSearchImage);
};

const getSeriesRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSeriesRemoteSearchResults);
};

const getTrailerRemoteSearchResults = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTrailerRemoteSearchResults);
};


module.exports = {
  applySearchCriteria,
  getBookRemoteSearchResults,
  getBoxSetRemoteSearchResults,
  getExternalIdInfos,
  getMovieRemoteSearchResults,
  getMusicAlbumRemoteSearchResults,
  getMusicArtistRemoteSearchResults,
  getMusicVideoRemoteSearchResults,
  getPersonRemoteSearchResults,
  getRemoteSearchImage,
  getSeriesRemoteSearchResults,
  getTrailerRemoteSearchResults,
};
