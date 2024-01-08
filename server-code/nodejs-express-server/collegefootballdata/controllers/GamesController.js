/**
 * The GamesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GamesService');
const getAdvancedBoxScore = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAdvancedBoxScore);
};

const getCalendar = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCalendar);
};

const getGameMedia = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGameMedia);
};

const getGameWeather = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGameWeather);
};

const getGames = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGames);
};

const getPlayerGameStats = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPlayerGameStats);
};

const getScoreboard = async (request, response) => {
  await Controller.handleRequest(request, response, service.getScoreboard);
};

const getTeamGameStats = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTeamGameStats);
};

const getTeamRecords = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTeamRecords);
};


module.exports = {
  getAdvancedBoxScore,
  getCalendar,
  getGameMedia,
  getGameWeather,
  getGames,
  getPlayerGameStats,
  getScoreboard,
  getTeamGameStats,
  getTeamRecords,
};
