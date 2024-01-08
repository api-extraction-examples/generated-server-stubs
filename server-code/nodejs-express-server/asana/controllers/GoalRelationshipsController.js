/**
 * The GoalRelationshipsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GoalRelationshipsService');
const addSupportingRelationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.addSupportingRelationship);
};

const getGoalRelationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoalRelationship);
};

const getGoalRelationships = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoalRelationships);
};

const removeSupportingRelationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeSupportingRelationship);
};

const updateGoalRelationship = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateGoalRelationship);
};


module.exports = {
  addSupportingRelationship,
  getGoalRelationship,
  getGoalRelationships,
  removeSupportingRelationship,
  updateGoalRelationship,
};
