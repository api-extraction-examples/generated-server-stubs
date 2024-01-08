/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* getListOfCountries
* Get name name, alpha-2, alpha-3 code, latitude and longitude for every country.
*
* format String Format of the response (optional)
* returns List
* */
const getListOfCountries = ({ format }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        format,
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
  getListOfCountries,
};
