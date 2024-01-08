/**
 * The DlnaController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DlnaService');
const createProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.createProfile);
};

const deleteProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteProfile);
};

const getDefaultProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getDefaultProfile);
};

const getProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProfile);
};

const getProfileInfos = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProfileInfos);
};

const updateProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateProfile);
};


module.exports = {
  createProfile,
  deleteProfile,
  getDefaultProfile,
  getProfile,
  getProfileInfos,
  updateProfile,
};
