/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List frameworks
*
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _frameworks__get_200_response
* */
const frameworksGET = ({ page, length, ordering, search }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        page,
        length,
        ordering,
        search,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Retrieve framework
*
* id String Object Id
* returns Framework
* */
const frameworksIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
  frameworksGET,
  frameworksIdGET,
};
