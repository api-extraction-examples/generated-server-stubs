/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* **Note:** Environment variable keys and values will soon be moved from `build_settings.env` and `repo.env` to a new endpoint. Please use [createEnvVars](#tag/environmentVariables/operation/createEnvVars) to create environment variables for a site.
*
* site SiteSetup 
* configureUnderscoredns Boolean  (optional)
* returns site
* */
const createSite = ({ site, configureUnderscoredns }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        site,
        configureUnderscoredns,
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
* **Note:** Environment variable keys and values will soon be moved from `build_settings.env` and `repo.env` to a new endpoint. Please use [createEnvVars](#tag/environmentVariables/operation/createEnvVars) to create environment variables for a site.
*
* accountUnderscoreslug String 
* configureUnderscoredns Boolean  (optional)
* site SiteSetup  (optional)
* returns site
* */
const createSiteInTeam = ({ accountUnderscoreslug, configureUnderscoredns, site }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreslug,
        configureUnderscoredns,
        site,
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
*
* siteUnderscoreid String 
* no response value expected for this operation
* */
const deleteSite = ({ siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
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
* **Note:** Environment variable keys and values will soon be moved from `build_settings.env` and `repo.env` to a new endpoint. Please use [getEnvVars](#tag/environmentVariables/operation/getEnvVars) to retrieve site environment variables.
*
* siteUnderscoreid String 
* returns site
* */
const getSite = ({ siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
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
* **Note:** Environment variable keys and values will soon be moved from `build_settings.env` and `repo.env` to a new endpoint. Please use [getEnvVars](#tag/environmentVariables/operation/getEnvVars) to retrieve site environment variables.
*
* name String  (optional)
* filter String  (optional)
* page Integer  (optional)
* perUnderscorepage Integer  (optional)
* returns List
* */
const listSites = ({ name, filter, page, perUnderscorepage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        filter,
        page,
        perUnderscorepage,
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
* **Note:** Environment variable keys and values will soon be moved from `build_settings.env` and `repo.env` to a new endpoint. Please use [getEnvVars](#tag/environmentVariables/operation/getEnvVars) to retrieve site environment variables.
*
* accountUnderscoreslug String 
* name String  (optional)
* page Integer  (optional)
* perUnderscorepage Integer  (optional)
* returns List
* */
const listSitesForAccount = ({ accountUnderscoreslug, name, page, perUnderscorepage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreslug,
        name,
        page,
        perUnderscorepage,
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
* [Beta] Unlinks the repo from the site.  This action will also: - Delete associated deploy keys - Delete outgoing webhooks for the repo - Delete the site's build hooks
*
* siteUnderscoreid String 
* returns site
* */
const unlinkSiteRepo = ({ siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
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
* **Note:** Environment variable keys and values will soon be moved from `build_settings.env` and `repo.env` to a new endpoint. Please use [updateEnvVar](#tag/environmentVariables/operation/updateEnvVar) to update a site's environment variables.
*
* siteUnderscoreid String 
* site SiteSetup 
* returns site
* */
const updateSite = ({ siteUnderscoreid, site }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        site,
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
  createSite,
  createSiteInTeam,
  deleteSite,
  getSite,
  listSites,
  listSitesForAccount,
  unlinkSiteRepo,
  updateSite,
};
