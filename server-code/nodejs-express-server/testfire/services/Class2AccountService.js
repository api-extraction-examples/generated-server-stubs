/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns a list of all the accounts owned by the user
*
* authorization String Authorization token (provided upon successful login)
* no response value expected for this operation
* */
const getAccount = ({ authorization }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
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
* Returns details about a specific account
*
* authorization String Authorization token (provided upon successful login)
* accountNo String Account id
* no response value expected for this operation
* */
const getAccountBalance = ({ authorization, accountNo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        accountNo,
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
* Return transactions between 2 specific dates
*
* authorization String Authorization token (provided upon successful login)
* accountNo String Account id
* body Dates A start date and an end date
* no response value expected for this operation
* */
const getTransactions = ({ authorization, accountNo, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        accountNo,
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
/**
* Returns the last 10 transactions attached to an account
*
* authorization String Authorization token (provided upon successful login)
* accountNo String Account id
* no response value expected for this operation
* */
const showLastTenTransactions = ({ authorization, accountNo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        accountNo,
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
  getAccount,
  getAccountBalance,
  getTransactions,
  showLastTenTransactions,
};
