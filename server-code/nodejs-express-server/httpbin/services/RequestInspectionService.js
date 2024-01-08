/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Return the incoming request's HTTP headers.
*
* no response value expected for this operation
* */
const headersGET = () => new Promise(
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
* Returns the requester's IP Address.
*
* no response value expected for this operation
* */
const ipGET = () => new Promise(
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
* Return the incoming requests's User-Agent header.
*
* no response value expected for this operation
* */
const user_agentGET = () => new Promise(
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
  headersGET,
  ipGET,
  user_agentGET,
};
