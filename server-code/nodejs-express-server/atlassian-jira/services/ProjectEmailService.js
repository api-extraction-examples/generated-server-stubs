/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get project's sender email
* Returns the [project's sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
*
* projectId Long The project ID.
* returns ProjectEmailAddress
* */
const getProjectEmail = ({ projectId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectId,
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
* Set project's sender email
* Sets the [project's sender email address](https://confluence.atlassian.com/x/dolKLg).  If `emailAddress` is an empty string, the default email address is restored.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
*
* projectId Long The project ID.
* projectEmailAddress ProjectEmailAddress The project's sender email address to be set.
* returns oas_any_type_not_mapped
* */
const updateProjectEmail = ({ projectId, projectEmailAddress }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectId,
        projectEmailAddress,
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
  getProjectEmail,
  updateProjectEmail,
};
