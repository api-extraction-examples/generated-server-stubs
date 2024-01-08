/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get approximate application license count
* Returns the total approximate user account for a specific `jira licence application key`. Please note this information is cached with a 7-day lifecycle and could be stale at the time of call.  #### Application Key ####  An application key represents a specific version of Jira. See \\{@link ApplicationKey\\} for details  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* applicationKey String 
* returns LicenseMetric
* */
const getApproximateApplicationLicenseCount = ({ applicationKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        applicationKey,
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
* Get approximate license count
* Returns the total approximate user account across all jira licenced application keys. Please note this information is cached with a 7-day lifecycle and could be stale at the time of call.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* returns LicenseMetric
* */
const getApproximateLicenseCount = () => new Promise(
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
  getApproximateApplicationLicenseCount,
  getApproximateLicenseCount,
};
