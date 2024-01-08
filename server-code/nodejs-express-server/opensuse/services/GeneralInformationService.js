/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get information about API.
* Get generic information about the API.
*
* returns _about_get_200_response
* */
const aboutGET = () => new Promise(
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
* Show one architecture.
* Show information about one architecture.
*
* architectureUnderscorename String Architecture name
* returns _architectures__architecture_name__get_200_response
* */
const architecturesArchitectureNameGET = ({ architectureUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        architectureUnderscorename,
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
* List all known architectures.
* Get a list of all known architectures known to OBS in general. This is not the list of architectures provided by this instance. Check the schedulers element from the `/configuration` route for this. 
*
* returns _architectures_get_200_response
* */
const architecturesGET = () => new Promise(
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
  aboutGET,
  architecturesArchitectureNameGET,
  architecturesGET,
};
