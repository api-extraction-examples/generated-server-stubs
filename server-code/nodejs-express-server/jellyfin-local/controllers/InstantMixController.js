/**
 * The InstantMixController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/InstantMixService');
const getInstantMixFromAlbum = async (request, response) => {
  await Controller.handleRequest(request, response, service.getInstantMixFromAlbum);
};

const getInstantMixFromArtists = async (request, response) => {
  await Controller.handleRequest(request, response, service.getInstantMixFromArtists);
};

const getInstantMixFromItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.getInstantMixFromItem);
};

const getInstantMixFromMusicGenre = async (request, response) => {
  await Controller.handleRequest(request, response, service.getInstantMixFromMusicGenre);
};

const getInstantMixFromMusicGenres = async (request, response) => {
  await Controller.handleRequest(request, response, service.getInstantMixFromMusicGenres);
};

const getInstantMixFromPlaylist = async (request, response) => {
  await Controller.handleRequest(request, response, service.getInstantMixFromPlaylist);
};

const getInstantMixFromSong = async (request, response) => {
  await Controller.handleRequest(request, response, service.getInstantMixFromSong);
};


module.exports = {
  getInstantMixFromAlbum,
  getInstantMixFromArtists,
  getInstantMixFromItem,
  getInstantMixFromMusicGenre,
  getInstantMixFromMusicGenres,
  getInstantMixFromPlaylist,
  getInstantMixFromSong,
};
