/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* branchUnderscoretests SplitTestSetup 
* returns splitTest
* */
const createSplitTest = ({ siteUnderscoreid, branchUnderscoretests }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        branchUnderscoretests,
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
* siteUnderscoreid String 
* splitUnderscoretestUnderscoreid String 
* no response value expected for this operation
* */
const disableSplitTest = ({ siteUnderscoreid, splitUnderscoretestUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        splitUnderscoretestUnderscoreid,
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
* siteUnderscoreid String 
* splitUnderscoretestUnderscoreid String 
* no response value expected for this operation
* */
const enableSplitTest = ({ siteUnderscoreid, splitUnderscoretestUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        splitUnderscoretestUnderscoreid,
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
* siteUnderscoreid String 
* splitUnderscoretestUnderscoreid String 
* returns splitTest
* */
const getSplitTest = ({ siteUnderscoreid, splitUnderscoretestUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        splitUnderscoretestUnderscoreid,
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
* siteUnderscoreid String 
* returns List
* */
const getSplitTests = ({ siteUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
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
* siteUnderscoreid String 
* splitUnderscoretestUnderscoreid String 
* branchUnderscoretests SplitTestSetup 
* returns splitTest
* */
const updateSplitTest = ({ siteUnderscoreid, splitUnderscoretestUnderscoreid, branchUnderscoretests }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        splitUnderscoretestUnderscoreid,
        branchUnderscoretests,
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
  createSplitTest,
  disableSplitTest,
  enableSplitTest,
  getSplitTest,
  getSplitTests,
  updateSplitTest,
};
