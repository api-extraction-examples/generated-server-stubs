/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Jira instance info
* Returns information about the Jira instance.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* returns ServerInformation
* */
const getServerInfo = () => new Promise(
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
  getServerInfo,
};
