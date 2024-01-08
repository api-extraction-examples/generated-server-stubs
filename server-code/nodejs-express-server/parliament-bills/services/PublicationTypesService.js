/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns a list of publication types.
*
* skip Integer  (optional)
* take Integer  (optional)
* returns PublicationTypeSearchResult
* */
const apiV1PublicationTypesGET = ({ skip, take }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  apiV1PublicationTypesGET,
};
