/**
 * The GoalsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GoalsService');
const addFollowers = async (request, response) => {
  await Controller.handleRequest(request, response, service.addFollowers);
};

const createGoal = async (request, response) => {
  await Controller.handleRequest(request, response, service.createGoal);
};

const createGoalMetric = async (request, response) => {
  await Controller.handleRequest(request, response, service.createGoalMetric);
};

const deleteGoal = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteGoal);
};

const getGoal = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoal);
};

const getGoals = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGoals);
};

const getParentGoalsForGoal = async (request, response) => {
  await Controller.handleRequest(request, response, service.getParentGoalsForGoal);
};

const removeFollowers = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeFollowers);
};

const updateGoal = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateGoal);
};

const updateGoalMetric = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateGoalMetric);
};


module.exports = {
  addFollowers,
  createGoal,
  createGoalMetric,
  deleteGoal,
  getGoal,
  getGoals,
  getParentGoalsForGoal,
  removeFollowers,
  updateGoal,
  updateGoalMetric,
};
