/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* clientUnderscoreid String 
* returns ticket
* */
const createTicket = ({ clientUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        clientUnderscoreid,
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
*
* ticketUnderscoreid String 
* returns ticket
* */
const showTicket = ({ ticketUnderscoreid }) => new Promise(
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
  createTicket,
  showTicket,
};
