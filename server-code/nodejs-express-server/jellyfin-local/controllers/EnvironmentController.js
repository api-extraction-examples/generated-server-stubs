/**
 * The EnvironmentController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/EnvironmentService');
const getDefaultDirectoryBrowser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDefaultDirectoryBrowser);
};

const getDirectoryContents = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDirectoryContents);
};

const getDrives = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDrives);
};

const getNetworkShares = async (request, response) => {
  await Controller.handleRequest(request, response, service.getNetworkShares);
};

const getParentPath = async (request, response) => {
  await Controller.handleRequest(request, response, service.getParentPath);
};

const validatePath = async (request, response) => {
  await Controller.handleRequest(request, response, service.validatePath);
};


module.exports = {
  getDefaultDirectoryBrowser,
  getDirectoryContents,
  getDrives,
  getNetworkShares,
  getParentPath,
  validatePath,
};
