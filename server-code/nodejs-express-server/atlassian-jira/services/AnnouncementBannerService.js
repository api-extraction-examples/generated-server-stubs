/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get announcement banner configuration
* Returns the current announcement banner configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* returns AnnouncementBannerConfiguration
* */
const getBanner = () => new Promise(
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
* Update announcement banner configuration
* Updates the announcement banner configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* announcementBannerConfigurationUpdate AnnouncementBannerConfigurationUpdate 
* returns oas_any_type_not_mapped
* */
const setBanner = ({ announcementBannerConfigurationUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        announcementBannerConfigurationUpdate,
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
  getBanner,
  setBanner,
};
