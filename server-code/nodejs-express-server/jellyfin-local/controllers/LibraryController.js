/**
 * The LibraryController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/LibraryService');
const deleteItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteItem);
};

const deleteItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteItems);
};

const getAncestors = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAncestors);
};

const getCriticReviews = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCriticReviews);
};

const getDownload = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDownload);
};

const getFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFile);
};

const getItemCounts = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItemCounts);
};

const getLibraryOptionsInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLibraryOptionsInfo);
};

const getMediaFolders = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMediaFolders);
};

const getPhysicalPaths = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPhysicalPaths);
};

const getSimilarAlbums = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSimilarAlbums);
};

const getSimilarArtists = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSimilarArtists);
};

const getSimilarItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSimilarItems);
};

const getSimilarMovies = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSimilarMovies);
};

const getSimilarShows = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSimilarShows);
};

const getSimilarTrailers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSimilarTrailers);
};

const getThemeMedia = async (request, response) => {
  await Controller.handleRequest(request, response, service.getThemeMedia);
};

const getThemeSongs = async (request, response) => {
  await Controller.handleRequest(request, response, service.getThemeSongs);
};

const getThemeVideos = async (request, response) => {
  await Controller.handleRequest(request, response, service.getThemeVideos);
};

const postAddedMovies = async (request, response) => {
  await Controller.handleRequest(request, response, service.postAddedMovies);
};

const postAddedSeries = async (request, response) => {
  await Controller.handleRequest(request, response, service.postAddedSeries);
};

const postUpdatedMedia = async (request, response) => {
  await Controller.handleRequest(request, response, service.postUpdatedMedia);
};

const postUpdatedMovies = async (request, response) => {
  await Controller.handleRequest(request, response, service.postUpdatedMovies);
};

const postUpdatedSeries = async (request, response) => {
  await Controller.handleRequest(request, response, service.postUpdatedSeries);
};

const refreshLibrary = async (request, response) => {
  await Controller.handleRequest(request, response, service.refreshLibrary);
};


module.exports = {
  deleteItem,
  deleteItems,
  getAncestors,
  getCriticReviews,
  getDownload,
  getFile,
  getItemCounts,
  getLibraryOptionsInfo,
  getMediaFolders,
  getPhysicalPaths,
  getSimilarAlbums,
  getSimilarArtists,
  getSimilarItems,
  getSimilarMovies,
  getSimilarShows,
  getSimilarTrailers,
  getThemeMedia,
  getThemeSongs,
  getThemeVideos,
  postAddedMovies,
  postAddedSeries,
  postUpdatedMedia,
  postUpdatedMovies,
  postUpdatedSeries,
  refreshLibrary,
};
