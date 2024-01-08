/**
 * The PluginsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PluginsService');
const disablePlugin = async (request, response) => {
  await Controller.handleRequest(request, response, service.disablePlugin);
};

const enablePlugin = async (request, response) => {
  await Controller.handleRequest(request, response, service.enablePlugin);
};

const getPluginConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPluginConfiguration);
};

const getPluginImage = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPluginImage);
};

const getPluginManifest = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPluginManifest);
};

const getPlugins = async (request, response) => {
  await Controller.handleRequest(request, response, service.getPlugins);
};

const uninstallPlugin = async (request, response) => {
  await Controller.handleRequest(request, response, service.uninstallPlugin);
};

const uninstallPluginByVersion = async (request, response) => {
  await Controller.handleRequest(request, response, service.uninstallPluginByVersion);
};

const updatePluginConfiguration = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePluginConfiguration);
};

const updatePluginSecurityInfo = async (request, response) => {
  await Controller.handleRequest(request, response, service.updatePluginSecurityInfo);
};


module.exports = {
  disablePlugin,
  enablePlugin,
  getPluginConfiguration,
  getPluginImage,
  getPluginManifest,
  getPlugins,
  uninstallPlugin,
  uninstallPluginByVersion,
  updatePluginConfiguration,
  updatePluginSecurityInfo,
};
