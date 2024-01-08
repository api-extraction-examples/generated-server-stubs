/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get license
* Returns licensing information about the Jira instance.  **[Permissions](#permissions) required:** None.
*
* returns License
* */
const getLicense = () => new Promise(
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
  getLicense,
};
