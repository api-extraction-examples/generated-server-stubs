/**
 * The UserSettingsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserSettingsService');
const getExpiringUserTargetsForUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.getExpiringUserTargetsForUser);
};

const getUserFlagSetting = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserFlagSetting);
};

const getUserFlagSettings = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserFlagSettings);
};

const patchExpiringUserTargetsForFlags = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchExpiringUserTargetsForFlags);
};

const putFlagSetting = async (request, response) => {
  await Controller.handleRequest(request, response, service.putFlagSetting);
};


module.exports = {
  getExpiringUserTargetsForUser,
  getUserFlagSetting,
  getUserFlagSettings,
  patchExpiringUserTargetsForFlags,
  putFlagSetting,
};
