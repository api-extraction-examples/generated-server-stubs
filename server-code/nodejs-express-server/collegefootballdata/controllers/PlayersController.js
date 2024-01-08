/**
 * The PlayersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PlayersService');
const getPlayerSeasonStats = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPlayerSeasonStats);
};

const getPlayerUsage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPlayerUsage);
};

const getReturningProduction = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturningProduction);
};

const getTransferPortal = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTransferPortal);
};

const playerSearch = async (request, response) => {
  await Controller.handleRequest(request, response, service.playerSearch);
};


module.exports = {
  getPlayerSeasonStats,
  getPlayerUsage,
  getReturningProduction,
  getTransferPortal,
  playerSearch,
};
