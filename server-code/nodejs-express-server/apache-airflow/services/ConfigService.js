/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get current configuration
*
* returns Config
* */
const get_config = () => new Promise(
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
  get_config,
};
