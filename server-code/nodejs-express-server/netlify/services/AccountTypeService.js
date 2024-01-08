/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* returns List
* */
const listAccountTypesForUser = () => new Promise(
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
  listAccountTypesForUser,
};
