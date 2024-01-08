/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Transfer money between two accounts
*
* authorization String Authorization token (provided upon successful login)
* body Transfer Transfer details including ammount, sender and receiver
* no response value expected for this operation
* */
const trasnfer = ({ authorization, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
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
  trasnfer,
};
