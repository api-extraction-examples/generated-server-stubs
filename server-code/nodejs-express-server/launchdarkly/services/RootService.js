/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* You can issue a GET request to the root resource to find all of the resource categories supported by the API.
*
* returns Links
* */
const getRoot = () => new Promise(
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
  getRoot,
};
