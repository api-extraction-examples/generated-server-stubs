/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This request returns the countries supported by the Dealer API
*
* page Integer The index of the page to be returned. If this parameter is omitted, the first page will be returned.  (optional)
* pageSize Integer The index of the page to be returned. If this parameter is omitted, the first page will be returned.  (optional)
* returns HalifiedCountries
* */
const countriesGET = ({ page, pageSize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        page,
        pageSize,
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
  countriesGET,
};
