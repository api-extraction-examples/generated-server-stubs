/**
 * The BuildController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BuildService');
const createSiteBuild = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSiteBuild);
};

const getAccountBuildStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAccountBuildStatus);
};

const getSiteBuild = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSiteBuild);
};

const listSiteBuilds = async (request, response) => {
  await Controller.handleRequest(request, response, service.listSiteBuilds);
};

const notifyBuildStart = async (request, response) => {
  await Controller.handleRequest(request, response, service.notifyBuildStart);
};


module.exports = {
  createSiteBuild,
  getAccountBuildStatus,
  getSiteBuild,
  listSiteBuilds,
  notifyBuildStart,
};
