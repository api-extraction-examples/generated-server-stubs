/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Display the configuration of this Open Build Service instance
* Display the configuration of this Open Build Service instance. 
*
* returns _configuration_get_200_response
* */
const configurationGET = () => new Promise(
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
/**
* Update the configuration of this Open Build Service instance
* Update the configuration of this Open Build Service instance.  This is for admins only. 
*
* body Object Configuration definition. (optional)
* returns Object
* */
const configurationPUT = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
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
  configurationGET,
  configurationPUT,
};
