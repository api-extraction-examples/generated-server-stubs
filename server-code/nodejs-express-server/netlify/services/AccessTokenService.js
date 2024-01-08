/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* ticketUnderscoreid String 
* returns accessToken
* */
const exchangeTicket = ({ ticketUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        ticketUnderscoreid,
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
  exchangeTicket,
};
