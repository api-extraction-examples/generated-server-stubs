/**
 * The UserController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserService');
const authenticateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.authenticateUser);
};

const authenticateUserByName = async (request, response) => {
  await Controller.handleRequest(request, response, service.authenticateUserByName);
};

const authenticateWithQuickConnect = async (request, response) => {
  await Controller.handleRequest(request, response, service.authenticateWithQuickConnect);
};

const createUserByName = async (request, response) => {
  await Controller.handleRequest(request, response, service.createUserByName);
};

const deleteUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteUser);
};

const forgotPassword = async (request, response) => {
  await Controller.handleRequest(request, response, service.forgotPassword);
};

const forgotPasswordPin = async (request, response) => {
  await Controller.handleRequest(request, response, service.forgotPasswordPin);
};

const getCurrentUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCurrentUser);
};

const getPublicUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPublicUsers);
};

const getUserById = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserById);
};

const getUsers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUsers);
};

const updateUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUser);
};

const updateUserConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUserConfiguration);
};

const updateUserEasyPassword = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUserEasyPassword);
};

const updateUserPassword = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUserPassword);
};

const updateUserPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateUserPolicy);
};


module.exports = {
  authenticateUser,
  authenticateUserByName,
  authenticateWithQuickConnect,
  createUserByName,
  deleteUser,
  forgotPassword,
  forgotPasswordPin,
  getCurrentUser,
  getPublicUsers,
  getUserById,
  getUsers,
  updateUser,
  updateUserConfiguration,
  updateUserEasyPassword,
  updateUserPassword,
  updateUserPolicy,
};
