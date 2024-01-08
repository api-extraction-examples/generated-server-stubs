/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* deployUnderscoreid String 
* name String 
* fileUnderscorebody File 
* runtime String  (optional)
* size Integer  (optional)
* xNfRetryCount Integer  (optional)
* returns function
* */
const uploadDeployFunction = ({ deployUnderscoreid, name, fileUnderscorebody, runtime, size, xNfRetryCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deployUnderscoreid,
        name,
        fileUnderscorebody,
        runtime,
        size,
        xNfRetryCount,
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
  uploadDeployFunction,
};
