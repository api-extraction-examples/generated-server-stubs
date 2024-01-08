/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get all status categories
* Returns a list of all status categories.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* returns List
* */
const getStatusCategories = () => new Promise(
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
* Get status category
* Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-3-status-idOrName-get).  **[Permissions](#permissions) required:** Permission to access Jira.
*
* idOrKey String The ID or key of the status category.
* returns StatusCategory
* */
const getStatusCategory = ({ idOrKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        idOrKey,
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
  getStatusCategories,
  getStatusCategory,
};
