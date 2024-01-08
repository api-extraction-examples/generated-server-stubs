/**
 * The TimeTrackingController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TimeTrackingService');
const getAvailableTimeTrackingImplementations = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAvailableTimeTrackingImplementations);
};

const getSelectedTimeTrackingImplementation = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSelectedTimeTrackingImplementation);
};

const getSharedTimeTrackingConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSharedTimeTrackingConfiguration);
};

const selectTimeTrackingImplementation = async (request, response) => {
  await Controller.handleRequest(request, response, service.selectTimeTrackingImplementation);
};

const setSharedTimeTrackingConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.setSharedTimeTrackingConfiguration);
};


module.exports = {
  getAvailableTimeTrackingImplementations,
  getSelectedTimeTrackingImplementation,
  getSharedTimeTrackingConfiguration,
  selectTimeTrackingImplementation,
  setSharedTimeTrackingConfiguration,
};
