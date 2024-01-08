/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Retrieve a list of API Requests that have been made.
*
* limit Integer How many API Events should be retrieved in a single request. (optional)
* offset Integer How far into the collection of API Events should the response start (optional)
* returns List
* */
const getApiActivity = ({ limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
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
  getApiActivity,
};
