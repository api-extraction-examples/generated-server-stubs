/**
 * The DeployController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DeployService');
const cancelSiteDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelSiteDeploy);
};

const createSiteDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSiteDeploy);
};

const deleteDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteDeploy);
};

const deleteSiteDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteSiteDeploy);
};

const getDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDeploy);
};

const getSiteDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSiteDeploy);
};

const listSiteDeploys = async (request, response) => {
  await Controller.handleRequest(request, response, service.listSiteDeploys);
};

const lockDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.lockDeploy);
};

const restoreSiteDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.restoreSiteDeploy);
};

const rollbackSiteDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.rollbackSiteDeploy);
};

const unlockDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.unlockDeploy);
};

const updateSiteDeploy = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSiteDeploy);
};


module.exports = {
  cancelSiteDeploy,
  createSiteDeploy,
  deleteDeploy,
  deleteSiteDeploy,
  getDeploy,
  getSiteDeploy,
  listSiteDeploys,
  lockDeploy,
  restoreSiteDeploy,
  rollbackSiteDeploy,
  unlockDeploy,
  updateSiteDeploy,
};
