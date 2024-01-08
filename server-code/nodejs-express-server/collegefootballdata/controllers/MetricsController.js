/**
 * The MetricsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MetricsService');
const getGamePPA = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGamePPA);
};

const getPlayerGamePPA = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPlayerGamePPA);
};

const getPlayerSeasonPPA = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPlayerSeasonPPA);
};

const getPredictedPoints = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPredictedPoints);
};

const getPregameWinProbabilities = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPregameWinProbabilities);
};

const getTeamPPA = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTeamPPA);
};

const getWinProbabilityData = async (request, response) => {
  await Controller.handleRequest(request, response, service.getWinProbabilityData);
};


module.exports = {
  getGamePPA,
  getPlayerGamePPA,
  getPlayerSeasonPPA,
  getPredictedPoints,
  getPregameWinProbabilities,
  getTeamPPA,
  getWinProbabilityData,
};
