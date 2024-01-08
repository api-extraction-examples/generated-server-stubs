/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Collection Members
* Episodes and Clips from Collection 
*
* xAPIKey String API_KEY
* pid String pid
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns ProgrammesResponse
* */
const getCollectionMembers = ({ xAPIKey, pid, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        pid,
        offset,
        limit,
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
  getCollectionMembers,
};
