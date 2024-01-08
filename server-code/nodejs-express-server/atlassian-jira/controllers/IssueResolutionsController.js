/**
 * The IssueResolutionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueResolutionsService');
const createResolution = async (request, response) => {
  await Controller.handleRequest(request, response, service.createResolution);
};

const deleteResolution = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteResolution);
};

const getResolution = async (request, response) => {
  await Controller.handleRequest(request, response, service.getResolution);
};

const getResolutions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getResolutions);
};

const moveResolutions = async (request, response) => {
  await Controller.handleRequest(request, response, service.moveResolutions);
};

const searchResolutions = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchResolutions);
};

const setDefaultResolution = async (request, response) => {
  await Controller.handleRequest(request, response, service.setDefaultResolution);
};

const updateResolution = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateResolution);
};


module.exports = {
  createResolution,
  deleteResolution,
  getResolution,
  getResolutions,
  moveResolutions,
  searchResolutions,
  setDefaultResolution,
  updateResolution,
};
