/**
 * The UserLibraryController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserLibraryService');
const deleteUserItemRating = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteUserItemRating);
};

const getIntros = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIntros);
};

const getItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItem);
};

const getLatestMedia = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLatestMedia);
};

const getLocalTrailers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getLocalTrailers);
};

const getRootFolder = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRootFolder);
};

const getSpecialFeatures = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSpecialFeatures);
};

const markFavoriteItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.markFavoriteItem);
};

const unmarkFavoriteItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.unmarkFavoriteItem);
};

const updateUserItemRating = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUserItemRating);
};


module.exports = {
  deleteUserItemRating,
  getIntros,
  getItem,
  getLatestMedia,
  getLocalTrailers,
  getRootFolder,
  getSpecialFeatures,
  markFavoriteItem,
  unmarkFavoriteItem,
  updateUserItemRating,
};
