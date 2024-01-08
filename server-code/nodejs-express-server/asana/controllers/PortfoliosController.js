/**
 * The PortfoliosController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PortfoliosService');
const addCustomFieldSettingForPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.addCustomFieldSettingForPortfolio);
};

const addItemForPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.addItemForPortfolio);
};

const addMembersForPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.addMembersForPortfolio);
};

const createPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.createPortfolio);
};

const deletePortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.deletePortfolio);
};

const getItemsForPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.getItemsForPortfolio);
};

const getPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPortfolio);
};

const getPortfolios = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPortfolios);
};

const removeCustomFieldSettingForPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeCustomFieldSettingForPortfolio);
};

const removeItemForPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeItemForPortfolio);
};

const removeMembersForPortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeMembersForPortfolio);
};

const updatePortfolio = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePortfolio);
};


module.exports = {
  addCustomFieldSettingForPortfolio,
  addItemForPortfolio,
  addMembersForPortfolio,
  createPortfolio,
  deletePortfolio,
  getItemsForPortfolio,
  getPortfolio,
  getPortfolios,
  removeCustomFieldSettingForPortfolio,
  removeItemForPortfolio,
  removeMembersForPortfolio,
  updatePortfolio,
};
