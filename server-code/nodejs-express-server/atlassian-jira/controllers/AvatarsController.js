/**
 * The AvatarsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AvatarsService');
const deleteAvatar = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteAvatar);
};

const getAllSystemAvatars = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllSystemAvatars);
};

const getAvatarImageByID = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAvatarImageByID);
};

const getAvatarImageByOwner = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAvatarImageByOwner);
};

const getAvatarImageByType = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAvatarImageByType);
};

const getAvatars = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAvatars);
};

const storeAvatar = async (request, response) => {
  await Controller.handleRequest(request, response, service.storeAvatar);
};


module.exports = {
  deleteAvatar,
  getAllSystemAvatars,
  getAvatarImageByID,
  getAvatarImageByOwner,
  getAvatarImageByType,
  getAvatars,
  storeAvatar,
};
