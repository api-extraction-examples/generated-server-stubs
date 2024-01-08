/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Disable a plugin.
*
* pluginId UUID Plugin id.
* version Version Plugin version.
* no response value expected for this operation
* */
const disablePlugin = ({ pluginId, version }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginId,
        version,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Enables a disabled plugin.
*
* pluginId UUID Plugin id.
* version Version Plugin version.
* no response value expected for this operation
* */
const enablePlugin = ({ pluginId, version }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginId,
        version,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets plugin configuration.
*
* pluginId UUID Plugin id.
* returns Object
* */
const getPluginConfiguration = ({ pluginId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets a plugin's image.
*
* pluginId UUID Plugin id.
* version Version Plugin version.
* returns File
* */
const getPluginImage = ({ pluginId, version }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginId,
        version,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets a plugin's manifest.
*
* pluginId UUID Plugin id.
* no response value expected for this operation
* */
const getPluginManifest = ({ pluginId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets a list of currently installed plugins.
*
* returns List
* */
const getPlugins = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Uninstalls a plugin.
*
* pluginId UUID Plugin id.
* no response value expected for this operation
* */
const uninstallPlugin = ({ pluginId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Uninstalls a plugin by version.
*
* pluginId UUID Plugin id.
* version Version Plugin version.
* no response value expected for this operation
* */
const uninstallPluginByVersion = ({ pluginId, version }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginId,
        version,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Updates plugin configuration.
* Accepts plugin configuration as JSON body.
*
* pluginId UUID Plugin id.
* no response value expected for this operation
* */
const updatePluginConfiguration = ({ pluginId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Updates plugin security info.
*
* pluginSecurityInfo PluginSecurityInfo Plugin security info.
* no response value expected for this operation
* */
const updatePluginSecurityInfo = ({ pluginSecurityInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pluginSecurityInfo,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

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
