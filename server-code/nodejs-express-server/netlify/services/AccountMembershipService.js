/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* accountUnderscoreid String 
* no response value expected for this operation
* */
const cancelAccount = ({ accountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
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
* accountSetup AccountSetup 
* returns accountMembership
* */
const createAccount = ({ accountSetup }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountSetup,
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
* accountUnderscoreid String 
* returns List
* */
const getAccount = ({ accountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
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
* returns List
* */
const listAccountsForUser = () => new Promise(
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
*
* accountUnderscoreid String 
* accountUpdateSetup AccountUpdateSetup  (optional)
* returns accountMembership
* */
const updateAccount = ({ accountUnderscoreid, accountUpdateSetup }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        accountUpdateSetup,
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
  cancelAccount,
  createAccount,
  getAccount,
  listAccountsForUser,
  updateAccount,
};
