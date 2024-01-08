/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Arena and venue information
* Venues
*
* returns List
* */
const getVenues = () => new Promise(
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
  getVenues,
};
