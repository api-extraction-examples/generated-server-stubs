/**
 * The ScheduledTasksController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ScheduledTasksService');
const getTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTask);
};

const getTasks = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTasks);
};

const startTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.startTask);
};

const stopTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.stopTask);
};

const updateTask = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateTask);
};


module.exports = {
  getTask,
  getTasks,
  startTask,
  stopTask,
  updateTask,
};
