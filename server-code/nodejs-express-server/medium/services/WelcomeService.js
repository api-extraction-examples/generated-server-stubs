/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Welcome
* **Test Endpoint** Returns the information about the Medium API 
*
* returns __get_200_response
* */
const rootGET = () => new Promise(
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
  rootGET,
};
