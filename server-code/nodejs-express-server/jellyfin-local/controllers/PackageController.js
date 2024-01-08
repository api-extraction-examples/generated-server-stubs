/**
 * The PackageController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PackageService');
const cancelPackageInstallation = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelPackageInstallation);
};

const getPackageInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPackageInfo);
};

const getPackages = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPackages);
};

const getRepositories = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRepositories);
};

const installPackage = async (request, response) => {
  await Controller.handleRequest(request, response, service.installPackage);
};

const setRepositories = async (request, response) => {
  await Controller.handleRequest(request, response, service.setRepositories);
};


module.exports = {
  cancelPackageInstallation,
  getPackageInfo,
  getPackages,
  getRepositories,
  installPackage,
  setRepositories,
};
