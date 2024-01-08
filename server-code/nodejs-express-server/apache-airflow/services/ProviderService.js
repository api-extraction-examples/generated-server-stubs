/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List providers
* Get a list of providers.  *New in version 2.1.0* 
*
* returns get_providers_200_response
* */
const get_providers = () => new Promise(
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
  get_providers,
};
