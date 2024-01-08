/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns a list of Bill stages.
*
* skip Integer  (optional)
* take Integer  (optional)
* returns StageReferenceSearchResult
* */
const apiV1StagesGET = ({ skip, take }) => new Promise(
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
  apiV1StagesGET,
};
