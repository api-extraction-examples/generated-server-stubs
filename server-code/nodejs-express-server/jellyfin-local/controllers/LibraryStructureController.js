/**
 * The LibraryStructureController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/LibraryStructureService');
const addMediaPath = async (request, response) => {
  await Controller.handleRequest(request, response, service.addMediaPath);
};

const addVirtualFolder = async (request, response) => {
  await Controller.handleRequest(request, response, service.addVirtualFolder);
};

const getVirtualFolders = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVirtualFolders);
};

const removeMediaPath = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeMediaPath);
};

const removeVirtualFolder = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeVirtualFolder);
};

const renameVirtualFolder = async (request, response) => {
  await Controller.handleRequest(request, response, service.renameVirtualFolder);
};

const updateLibraryOptions = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateLibraryOptions);
};

const updateMediaPath = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateMediaPath);
};


module.exports = {
  addMediaPath,
  addVirtualFolder,
  getVirtualFolders,
  removeMediaPath,
  removeVirtualFolder,
  renameVirtualFolder,
  updateLibraryOptions,
  updateMediaPath,
};
