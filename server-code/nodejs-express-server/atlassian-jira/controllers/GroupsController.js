/**
 * The GroupsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GroupsService');
const addUserToGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.addUserToGroup);
};

const bulkGetGroups = async (request, response) => {
  await Controller.handleRequest(request, response, service.bulkGetGroups);
};

const createGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.createGroup);
};

const findGroups = async (request, response) => {
  await Controller.handleRequest(request, response, service.findGroups);
};

const getGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.getGroup);
};

const getUsersFromGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUsersFromGroup);
};

const removeGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeGroup);
};

const removeUserFromGroup = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeUserFromGroup);
};


module.exports = {
  addUserToGroup,
  bulkGetGroups,
  createGroup,
  findGroups,
  getGroup,
  getUsersFromGroup,
  removeGroup,
  removeUserFromGroup,
};
