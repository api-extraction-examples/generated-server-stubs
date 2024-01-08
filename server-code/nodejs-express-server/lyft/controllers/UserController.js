/**
 * The UserController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserService');
const cancelRide = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelRide);
};

const getProfile = async (request, response) => {
  await Controller.handleRequest(request, response, service.getProfile);
};

const getRide = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRide);
};

const getRideReceipt = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRideReceipt);
};

const getRides = async (request, response) => {
  await Controller.handleRequest(request, response, service.getRides);
};

const newRide = async (request, response) => {
  await Controller.handleRequest(request, response, service.newRide);
};

const setRideDestination = async (request, response) => {
  await Controller.handleRequest(request, response, service.setRideDestination);
};

const setRideRating = async (request, response) => {
  await Controller.handleRequest(request, response, service.setRideRating);
};


module.exports = {
  cancelRide,
  getProfile,
  getRide,
  getRideReceipt,
  getRides,
  newRide,
  setRideDestination,
  setRideRating,
};
