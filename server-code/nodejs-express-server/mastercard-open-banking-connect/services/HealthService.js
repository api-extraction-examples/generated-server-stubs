/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns the status of each connectivity provider
* Returns the status of each connectivity provider
*
* returns ApiHealth
* */
const paymentsHealthGET = () => new Promise(
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
  paymentsHealthGET,
};
