/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This is an internal-only endpoint.
*
* deployUnderscoreid String 
* pluginUnderscorerun PluginRunData  (optional)
* returns pluginRun
* */
const createPluginRun = ({ deployUnderscoreid, pluginUnderscorerun }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
        pluginUnderscorerun,
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
* This is an internal-only endpoint.
*
* siteUnderscoreid String 
* packages List 
* state String  (optional)
* returns List
* */
const getLatestPluginRuns = ({ siteUnderscoreid, packages, state }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        packages,
        state,
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
* This is an internal-only endpoint.
*
* siteUnderscoreid String 
* package String 
* pluginUnderscoreparams PluginParams  (optional)
* returns plugin
* */
const updatePlugin = ({ siteUnderscoreid, package, pluginUnderscoreparams }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        package,
        pluginUnderscoreparams,
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
  createPluginRun,
  getLatestPluginRuns,
  updatePlugin,
};
