/**
 * The SessionController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SessionService');
const addUserToSession = async (request, response) => {
  await Controller.handleRequest(request, response, service.addUserToSession);
};

const displayContent = async (request, response) => {
  await Controller.handleRequest(request, response, service.displayContent);
};

const getAuthProviders = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAuthProviders);
};

const getPasswordResetProviders = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPasswordResetProviders);
};

const getSessions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSessions);
};

const play = async (request, response) => {
  await Controller.handleRequest(request, response, service.play);
};

const postCapabilities = async (request, response) => {
  await Controller.handleRequest(request, response, service.postCapabilities);
};

const postFullCapabilities = async (request, response) => {
  await Controller.handleRequest(request, response, service.postFullCapabilities);
};

const removeUserFromSession = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeUserFromSession);
};

const reportSessionEnded = async (request, response) => {
  await Controller.handleRequest(request, response, service.reportSessionEnded);
};

const reportViewing = async (request, response) => {
  await Controller.handleRequest(request, response, service.reportViewing);
};

const sendFullGeneralCommand = async (request, response) => {
  await Controller.handleRequest(request, response, service.sendFullGeneralCommand);
};

const sendGeneralCommand = async (request, response) => {
  await Controller.handleRequest(request, response, service.sendGeneralCommand);
};

const sendMessageCommand = async (request, response) => {
  await Controller.handleRequest(request, response, service.sendMessageCommand);
};

const sendPlaystateCommand = async (request, response) => {
  await Controller.handleRequest(request, response, service.sendPlaystateCommand);
};

const sendSystemCommand = async (request, response) => {
  await Controller.handleRequest(request, response, service.sendSystemCommand);
};


module.exports = {
  addUserToSession,
  displayContent,
  getAuthProviders,
  getPasswordResetProviders,
  getSessions,
  play,
  postCapabilities,
  postFullCapabilities,
  removeUserFromSession,
  reportSessionEnded,
  reportViewing,
  sendFullGeneralCommand,
  sendGeneralCommand,
  sendMessageCommand,
  sendPlaystateCommand,
  sendSystemCommand,
};
