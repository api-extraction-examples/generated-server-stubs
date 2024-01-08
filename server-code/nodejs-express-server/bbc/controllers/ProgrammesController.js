/**
 * The ProgrammesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ProgrammesService');
const getPopularEpisodesClips = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPopularEpisodesClips);
};

const getRadioProgrammes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRadioProgrammes);
};

const getRadioProgrammesByPid = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRadioProgrammesByPid);
};

const getRecommendations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRecommendations);
};


module.exports = {
  getPopularEpisodesClips,
  getRadioProgrammes,
  getRadioProgrammesByPid,
  getRecommendations,
};
