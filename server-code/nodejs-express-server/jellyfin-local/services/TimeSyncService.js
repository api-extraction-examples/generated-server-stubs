/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets the current UTC time.
*
* returns UtcTimeResponse
* */
const getUtcTime = () => new Promise(
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
  getUtcTime,
};
