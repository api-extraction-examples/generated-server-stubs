/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get all time tracking providers
* Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [ Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* returns List
* */
const getAvailableTimeTrackingImplementations = () => new Promise(
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
* Get selected time tracking provider
* Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* returns TimeTrackingProvider
* */
const getSelectedTimeTrackingImplementation = () => new Promise(
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
* Get time tracking settings
* Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* returns TimeTrackingConfiguration
* */
const getSharedTimeTrackingConfiguration = () => new Promise(
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
* Select time tracking provider
* Selects a time tracking provider.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* timeTrackingProvider TimeTrackingProvider 
* returns oas_any_type_not_mapped
* */
const selectTimeTrackingImplementation = ({ timeTrackingProvider }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timeTrackingProvider,
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
* Set time tracking settings
* Sets the time tracking settings.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* timeTrackingConfiguration TimeTrackingConfiguration 
* returns TimeTrackingConfiguration
* */
const setSharedTimeTrackingConfiguration = ({ timeTrackingConfiguration }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timeTrackingConfiguration,
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
  getAvailableTimeTrackingImplementations,
  getSelectedTimeTrackingImplementation,
  getSharedTimeTrackingConfiguration,
  selectTimeTrackingImplementation,
  setSharedTimeTrackingConfiguration,
};
