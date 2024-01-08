/**
 * The TeamsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TeamsService');
const addUserForTeam = async (request, response) => {
  await Controller.handleRequest(request, response, service.addUserForTeam);
};

const createTeam = async (request, response) => {
  await Controller.handleRequest(request, response, service.createTeam);
};

const getTeam = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTeam);
};

const getTeamsForUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTeamsForUser);
};

const getTeamsForWorkspace = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTeamsForWorkspace);
};

const removeUserForTeam = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeUserForTeam);
};

const updateTeam = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateTeam);
};


module.exports = {
  addUserForTeam,
  createTeam,
  getTeam,
  getTeamsForUser,
  getTeamsForWorkspace,
  removeUserForTeam,
  updateTeam,
};
