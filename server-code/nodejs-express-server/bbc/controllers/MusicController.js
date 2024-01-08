/**
 * The MusicController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MusicService');
const deletePersonalisedMusicFavouritesByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePersonalisedMusicFavouritesByTypeById);
};

const deletePersonalisedMusicFollowsByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePersonalisedMusicFollowsByTypeById);
};

const getMusicPopularArtistById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicPopularArtistById);
};

const getMusicPopularArtists = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicPopularArtists);
};

const getMusicPopularPlaylistById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicPopularPlaylistById);
};

const getMusicPopularPlaylists = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicPopularPlaylists);
};

const getMusicPopularTrackById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicPopularTrackById);
};

const getMusicPopularTracks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicPopularTracks);
};

const getPersonalisedMusicFavourites = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedMusicFavourites);
};

const getPersonalisedMusicFavouritesByType = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedMusicFavouritesByType);
};

const getPersonalisedMusicFavouritesByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedMusicFavouritesByTypeById);
};

const getPersonalisedMusicFollows = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedMusicFollows);
};

const getPersonalisedMusicFollowsByType = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedMusicFollowsByType);
};

const getPersonalisedMusicFollowsByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedMusicFollowsByTypeById);
};

const postPersonalisedMusicFavouritesBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPersonalisedMusicFavouritesBatch);
};

const postPersonalisedMusicFavouritesByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPersonalisedMusicFavouritesByTypeById);
};

const postPersonalisedMusicFollowsBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPersonalisedMusicFollowsBatch);
};

const postPersonalisedMusicFollowsByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPersonalisedMusicFollowsByTypeById);
};

const putPersonalisedMusicFavouritesBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.putPersonalisedMusicFavouritesBatch);
};

const putPersonalisedMusicFavouritesByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.putPersonalisedMusicFavouritesByTypeById);
};

const putPersonalisedMusicFollowsBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.putPersonalisedMusicFollowsBatch);
};

const putPersonalisedMusicFollowsByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.putPersonalisedMusicFollowsByTypeById);
};


module.exports = {
  deletePersonalisedMusicFavouritesByTypeById,
  deletePersonalisedMusicFollowsByTypeById,
  getMusicPopularArtistById,
  getMusicPopularArtists,
  getMusicPopularPlaylistById,
  getMusicPopularPlaylists,
  getMusicPopularTrackById,
  getMusicPopularTracks,
  getPersonalisedMusicFavourites,
  getPersonalisedMusicFavouritesByType,
  getPersonalisedMusicFavouritesByTypeById,
  getPersonalisedMusicFollows,
  getPersonalisedMusicFollowsByType,
  getPersonalisedMusicFollowsByTypeById,
  postPersonalisedMusicFavouritesBatch,
  postPersonalisedMusicFavouritesByTypeById,
  postPersonalisedMusicFollowsBatch,
  postPersonalisedMusicFollowsByTypeById,
  putPersonalisedMusicFavouritesBatch,
  putPersonalisedMusicFavouritesByTypeById,
  putPersonalisedMusicFollowsBatch,
  putPersonalisedMusicFollowsByTypeById,
};
