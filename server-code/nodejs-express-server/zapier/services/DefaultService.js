/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Check
* Test that the API and auth are working.
*
* no response value expected for this operation
* */
const check = () => new Promise(
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
* Execute App Action Endpoint
* Give us a plain english description of exact action you want to do. There should be dynamically generated documentation for this endpoint for each action that is exposed.
*
* exposedUnderscoreappUnderscoreactionUnderscoreid String 
* executeRequest ExecuteRequest 
* returns ExecuteResponse
* */
const execute_app_action_endpoint = ({ exposedUnderscoreappUnderscoreactionUnderscoreid, executeRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        exposedUnderscoreappUnderscoreactionUnderscoreid,
        executeRequest,
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
* Get Configuration Link
* Provides a link to configure more actions. Alternatively, searching through apps and actions will provide more specific configuration links.
*
* no response value expected for this operation
* */
const get_configuration_link = () => new Promise(
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
* Get Execution Log Endpoint
* Get the execution log for a given execution log id.
*
* executionUnderscorelogUnderscoreid String 
* returns ExecuteResponse
* */
const get_execution_log_endpoint = ({ executionUnderscorelogUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        executionUnderscorelogUnderscoreid,
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
* List Exposed Actions
* List all the currently exposed actions for the given account.
*
* returns ExposedActionResponseSchema
* */
const list_exposed_actions = () => new Promise(
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

module.exports = {
  check,
  execute_app_action_endpoint,
  get_configuration_link,
  get_execution_log_endpoint,
  list_exposed_actions,
};
