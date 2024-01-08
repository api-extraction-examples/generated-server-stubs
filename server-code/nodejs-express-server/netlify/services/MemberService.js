/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* accountUnderscoreslug String 
* accountAddMemberSetup AccountAddMemberSetup 
* returns List
* */
const addMemberToAccount = ({ accountUnderscoreslug, accountAddMemberSetup }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreslug,
        accountAddMemberSetup,
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
* accountUnderscoreslug String 
* memberUnderscoreid String 
* returns member
* */
const getAccountMember = ({ accountUnderscoreslug, memberUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreslug,
        memberUnderscoreid,
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
* accountUnderscoreslug String 
* returns List
* */
const listMembersForAccount = ({ accountUnderscoreslug }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreslug,
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
* accountUnderscoreslug String 
* memberUnderscoreid String 
* no response value expected for this operation
* */
const removeAccountMember = ({ accountUnderscoreslug, memberUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreslug,
        memberUnderscoreid,
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
* accountUnderscoreslug String 
* memberUnderscoreid String 
* accountUpdateMemberSetup AccountUpdateMemberSetup 
* returns member
* */
const updateAccountMember = ({ accountUnderscoreslug, memberUnderscoreid, accountUpdateMemberSetup }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreslug,
        memberUnderscoreid,
        accountUpdateMemberSetup,
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
  addMemberToAccount,
  getAccountMember,
  listMembersForAccount,
  removeAccountMember,
  updateAccountMember,
};
