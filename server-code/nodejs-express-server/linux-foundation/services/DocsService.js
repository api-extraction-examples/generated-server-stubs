/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get swagger documentation
*
* no response value expected for this operation
* */
const getDoc = () => new Promise(
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
  getDoc,
};
