/**
 * The UsersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UsersService');
const bulkGetUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.bulkGetUsers);
};

const bulkGetUsersMigration = async (request, response) => {
  await Controller.handleRequest(request, response, service.bulkGetUsersMigration);
};

const createUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.createUser);
};

const getAllUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllUsers);
};

const getAllUsersDefault = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAllUsersDefault);
};

const getUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUser);
};

const getUserDefaultColumns = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserDefaultColumns);
};

const getUserEmail = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserEmail);
};

const getUserEmailBulk = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserEmailBulk);
};

const getUserGroups = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserGroups);
};

const removeUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeUser);
};

const resetUserColumns = async (request, response) => {
  await Controller.handleRequest(request, response, service.resetUserColumns);
};

const setUserColumns = async (request, response) => {
  await Controller.handleRequest(request, response, service.setUserColumns);
};


module.exports = {
  bulkGetUsers,
  bulkGetUsersMigration,
  createUser,
  getAllUsers,
  getAllUsersDefault,
  getUser,
  getUserDefaultColumns,
  getUserEmail,
  getUserEmailBulk,
  getUserGroups,
  removeUser,
  resetUserColumns,
  setUserColumns,
};
