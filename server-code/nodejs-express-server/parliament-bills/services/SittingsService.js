/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns a list of Sittings.
*
* house House  (optional)
* dateFrom Date  (optional)
* dateTo Date  (optional)
* skip Integer  (optional)
* take Integer  (optional)
* returns BillStageSittingSearchResult
* */
const getSittings = ({ house, dateFrom, dateTo, skip, take }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        house,
        dateFrom,
        dateTo,
        skip,
        take,
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
  getSittings,
};
