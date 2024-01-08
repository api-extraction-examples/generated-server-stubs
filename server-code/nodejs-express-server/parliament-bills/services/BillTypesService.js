/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns a list of Bill types.
*
* category BillTypeCategory  (optional)
* skip Integer  (optional)
* take Integer  (optional)
* returns BillTypeSearchResult
* */
const apiV1BillTypesGET = ({ category, skip, take }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        category,
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
  apiV1BillTypesGET,
};
