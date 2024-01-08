/**
 * The ImageController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ImageService');
const deleteItemImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteItemImage);
};

const deleteItemImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteItemImageByIndex);
};

const deleteUserImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteUserImage);
};

const deleteUserImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteUserImageByIndex);
};

const getArtistImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getArtistImage);
};

const getGenreImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGenreImage);
};

const getGenreImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGenreImageByIndex);
};

const getItemImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItemImage);
};

const getItemImage2 = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItemImage2);
};

const getItemImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItemImageByIndex);
};

const getItemImageInfos = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItemImageInfos);
};

const getMusicGenreImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicGenreImage);
};

const getMusicGenreImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMusicGenreImageByIndex);
};

const getPersonImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonImage);
};

const getPersonImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonImageByIndex);
};

const getStudioImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStudioImage);
};

const getStudioImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.getStudioImageByIndex);
};

const getUserImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserImage);
};

const getUserImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserImageByIndex);
};

const headArtistImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.headArtistImage);
};

const headGenreImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.headGenreImage);
};

const headGenreImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.headGenreImageByIndex);
};

const headItemImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.headItemImage);
};

const headItemImage2 = async (request, response) => {
  await Controller.handleRequest(request, response, service.headItemImage2);
};

const headItemImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.headItemImageByIndex);
};

const headMusicGenreImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.headMusicGenreImage);
};

const headMusicGenreImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.headMusicGenreImageByIndex);
};

const headPersonImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.headPersonImage);
};

const headPersonImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.headPersonImageByIndex);
};

const headStudioImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.headStudioImage);
};

const headStudioImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.headStudioImageByIndex);
};

const headUserImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.headUserImage);
};

const headUserImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.headUserImageByIndex);
};

const postUserImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.postUserImage);
};

const postUserImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.postUserImageByIndex);
};

const setItemImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.setItemImage);
};

const setItemImageByIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.setItemImageByIndex);
};

const updateItemImageIndex = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateItemImageIndex);
};


module.exports = {
  deleteItemImage,
  deleteItemImageByIndex,
  deleteUserImage,
  deleteUserImageByIndex,
  getArtistImage,
  getGenreImage,
  getGenreImageByIndex,
  getItemImage,
  getItemImage2,
  getItemImageByIndex,
  getItemImageInfos,
  getMusicGenreImage,
  getMusicGenreImageByIndex,
  getPersonImage,
  getPersonImageByIndex,
  getStudioImage,
  getStudioImageByIndex,
  getUserImage,
  getUserImageByIndex,
  headArtistImage,
  headGenreImage,
  headGenreImageByIndex,
  headItemImage,
  headItemImage2,
  headItemImageByIndex,
  headMusicGenreImage,
  headMusicGenreImageByIndex,
  headPersonImage,
  headPersonImageByIndex,
  headStudioImage,
  headStudioImageByIndex,
  headUserImage,
  headUserImageByIndex,
  postUserImage,
  postUserImageByIndex,
  setItemImage,
  setItemImageByIndex,
  updateItemImageIndex,
};
