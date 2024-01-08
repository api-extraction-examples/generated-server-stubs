/**
 * The SectionsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SectionsService');
const addTaskForSection = async (request, response) => {
  await Controller.handleRequest(request, response, service.addTaskForSection);
};

const createSectionForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSectionForProject);
};

const deleteSection = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteSection);
};

const getSection = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSection);
};

const getSectionsForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSectionsForProject);
};

const insertSectionForProject = async (request, response) => {
  await Controller.handleRequest(request, response, service.insertSectionForProject);
};

const updateSection = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSection);
};


module.exports = {
  addTaskForSection,
  createSectionForProject,
  deleteSection,
  getSection,
  getSectionsForProject,
  insertSectionForProject,
  updateSection,
};
