/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets the configuration pages.
*
* enableInMainMenu Boolean Whether to enable in the main menu. (optional)
* pageType ConfigurationPageType The Jellyfin.Api.Models.ConfigurationPageInfo. (optional)
* returns List
* */
const getConfigurationPages = ({ enableInMainMenu, pageType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        enableInMainMenu,
        pageType,
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
* Gets a dashboard configuration page.
*
* name String The name of the page. (optional)
* returns File
* */
const getDashboardConfigurationPage = ({ name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
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
  getConfigurationPages,
  getDashboardConfigurationPage,
};
