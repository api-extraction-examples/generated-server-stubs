/**
 * The RadioController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RadioService');
const deletePersonalisedRadioByActivityTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePersonalisedRadioByActivityTypeById);
};

const deletePersonalisedRadioFollowsByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePersonalisedRadioFollowsByTypeById);
};

const getPersonalisedRadioByActivityTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedRadioByActivityTypeById);
};

const getPersonalisedRadioFavourites = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedRadioFavourites);
};

const getPersonalisedRadioFavouritesByType = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedRadioFavouritesByType);
};

const getPersonalisedRadioFollows = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedRadioFollows);
};

const getPersonalisedRadioFollowsByType = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedRadioFollowsByType);
};

const getPersonalisedRadioFollowsByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedRadioFollowsByTypeById);
};

const getPersonalisedRadioPlays = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPersonalisedRadioPlays);
};

const postPersonalisedRadioBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPersonalisedRadioBatch);
};

const postPersonalisedRadioByActivityTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPersonalisedRadioByActivityTypeById);
};

const postPersonalisedRadioFollowsBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPersonalisedRadioFollowsBatch);
};

const postPersonalisedRadioFollowsByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.postPersonalisedRadioFollowsByTypeById);
};

const putPersonalisedRadioBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.putPersonalisedRadioBatch);
};

const putPersonalisedRadioByActivityTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.putPersonalisedRadioByActivityTypeById);
};

const putPersonalisedRadioFollowsBatch = async (request, response) => {
  await Controller.handleRequest(request, response, service.putPersonalisedRadioFollowsBatch);
};

const putPersonalisedRadioFollowsByTypeById = async (request, response) => {
  await Controller.handleRequest(request, response, service.putPersonalisedRadioFollowsByTypeById);
};


module.exports = {
  deletePersonalisedRadioByActivityTypeById,
  deletePersonalisedRadioFollowsByTypeById,
  getPersonalisedRadioByActivityTypeById,
  getPersonalisedRadioFavourites,
  getPersonalisedRadioFavouritesByType,
  getPersonalisedRadioFollows,
  getPersonalisedRadioFollowsByType,
  getPersonalisedRadioFollowsByTypeById,
  getPersonalisedRadioPlays,
  postPersonalisedRadioBatch,
  postPersonalisedRadioByActivityTypeById,
  postPersonalisedRadioFollowsBatch,
  postPersonalisedRadioFollowsByTypeById,
  putPersonalisedRadioBatch,
  putPersonalisedRadioByActivityTypeById,
  putPersonalisedRadioFollowsBatch,
  putPersonalisedRadioFollowsByTypeById,
};
