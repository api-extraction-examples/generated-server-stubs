/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Creates new environment variables. Granular scopes are available on Pro plans and above.  To use this endpoint, your site must no longer be using the <a href=\"https://docs.netlify.com/environment-variables/classic-experience/\">classic environment variables experience</a>.  Migrate now with the Netlify UI.
*
* accountUnderscoreid String Scope response to account_id
* siteUnderscoreid String If provided, create an environment variable on the site level, not the account level (optional)
* envUnderscorevars List  (optional)
* returns List
* */
const createEnvVars = ({ accountUnderscoreid, siteUnderscoreid, envUnderscorevars }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        siteUnderscoreid,
        envUnderscorevars,
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
* Deletes an environment variable. To use this endpoint, your site must no longer be using the <a href=\"https://docs.netlify.com/environment-variables/classic-experience/\">classic environment variables experience</a>.  Migrate now with the Netlify UI.
*
* accountUnderscoreid String Scope response to account_id
* key String The environment variable key (case-sensitive)
* siteUnderscoreid String If provided, delete the environment variable from this site (optional)
* no response value expected for this operation
* */
const deleteEnvVar = ({ accountUnderscoreid, key, siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        key,
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
* Deletes a specific environment variable value. To use this endpoint, your site must no longer be using the <a href=\"https://docs.netlify.com/environment-variables/classic-experience/\">classic environment variables experience</a>.  Migrate now with the Netlify UI.
*
* accountUnderscoreid String Scope response to account_id
* id String The environment variable value's ID
* key String The environment variable key name (case-sensitive)
* siteUnderscoreid String If provided, delete the value from an environment variable on this site (optional)
* no response value expected for this operation
* */
const deleteEnvVarValue = ({ accountUnderscoreid, id, key, siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        id,
        key,
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
* Returns an individual environment variable. To use this endpoint, your site must no longer be using the <a href=\"https://docs.netlify.com/environment-variables/classic-experience/\">classic environment variables experience</a>.  Migrate now with the Netlify UI.
*
* accountUnderscoreid String Scope response to account_id
* key String The environment variable key (case-sensitive)
* siteUnderscoreid String If provided, return the environment variable for a specific site (no merging is performed) (optional)
* returns envVar
* */
const getEnvVar = ({ accountUnderscoreid, key, siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        key,
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
* Returns all environment variables for an account or site. An account corresponds to a team in the Netlify UI. To use this endpoint, your site must no longer be using the <a href=\"https://docs.netlify.com/environment-variables/classic-experience/\">classic environment variables experience</a>.  Migrate now with the Netlify UI.
*
* accountUnderscoreid String Scope response to account_id
* contextUnderscorename String Filter by deploy context (optional)
* scope String Filter by scope (optional)
* siteUnderscoreid String If specified, only return environment variables set on this site (optional)
* returns List
* */
const getEnvVars = ({ accountUnderscoreid, contextUnderscorename, scope, siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        contextUnderscorename,
        scope,
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
* Updates or creates a new value for an existing environment variable. To use this endpoint, your site must no longer be using the <a href=\"https://docs.netlify.com/environment-variables/classic-experience/\">classic environment variables experience</a>.  Migrate now with the Netlify UI.
*
* accountUnderscoreid String Scope response to account_id
* key String The existing environment variable key name (case-sensitive)
* siteUnderscoreid String If provided, update an environment variable set on this site (optional)
* envUnderscorevar SetEnvVarValueRequest  (optional)
* returns envVar
* */
const setEnvVarValue = ({ accountUnderscoreid, key, siteUnderscoreid, envUnderscorevar }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        key,
        siteUnderscoreid,
        envUnderscorevar,
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
* Updates an existing environment variable and all of its values. Existing values will be replaced by values provided. To use this endpoint, your site must no longer be using the <a href=\"https://docs.netlify.com/environment-variables/classic-experience/\">classic environment variables experience</a>.  Migrate now with the Netlify UI.
*
* accountUnderscoreid String Scope response to account_id
* key String The existing environment variable key name (case-sensitive)
* siteUnderscoreid String If provided, update an environment variable set on this site (optional)
* envUnderscorevar CreateEnvVarsRequestInner  (optional)
* returns envVar
* */
const updateEnvVar = ({ accountUnderscoreid, key, siteUnderscoreid, envUnderscorevar }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        key,
        siteUnderscoreid,
        envUnderscorevar,
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
  createEnvVars,
  deleteEnvVar,
  deleteEnvVarValue,
  getEnvVar,
  getEnvVars,
  setEnvVarValue,
  updateEnvVar,
};
