/**
 * The SiteController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SiteService');
const createSite = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSite);
};

const createSiteInTeam = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSiteInTeam);
};

const deleteSite = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteSite);
};

const getSite = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSite);
};

const listSites = async (request, response) => {
  await Controller.handleRequest(request, response, service.listSites);
};

const listSitesForAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.listSitesForAccount);
};

const unlinkSiteRepo = async (request, response) => {
  await Controller.handleRequest(request, response, service.unlinkSiteRepo);
};

const updateSite = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSite);
};


module.exports = {
  createSite,
  createSiteInTeam,
  deleteSite,
  getSite,
  listSites,
  listSitesForAccount,
  unlinkSiteRepo,
  updateSite,
};
