/**
 * The ItemsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ItemsService');
const createVaultItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.createVaultItem);
};

const deleteVaultItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteVaultItem);
};

const getVaultItemById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVaultItemById);
};

const getVaultItems = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVaultItems);
};

const patchVaultItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchVaultItem);
};

const updateVaultItem = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateVaultItem);
};


module.exports = {
  createVaultItem,
  deleteVaultItem,
  getVaultItemById,
  getVaultItems,
  patchVaultItem,
  updateVaultItem,
};
