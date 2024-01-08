/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* submissionUnderscoreid String 
* no response value expected for this operation
* */
const deleteSubmission = ({ submissionUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        submissionUnderscoreid,
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
* submissionUnderscoreid String 
* query String  (optional)
* page Integer  (optional)
* perUnderscorepage Integer  (optional)
* returns List
* */
const listFormSubmission = ({ submissionUnderscoreid, query, page, perUnderscorepage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        submissionUnderscoreid,
        query,
        page,
        perUnderscorepage,
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
* formUnderscoreid String 
* page Integer  (optional)
* perUnderscorepage Integer  (optional)
* returns List
* */
const listFormSubmissions = ({ formUnderscoreid, page, perUnderscorepage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        formUnderscoreid,
        page,
        perUnderscorepage,
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
* page Integer  (optional)
* perUnderscorepage Integer  (optional)
* returns List
* */
const listSiteSubmissions = ({ siteUnderscoreid, page, perUnderscorepage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        page,
        perUnderscorepage,
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
  deleteSubmission,
  listFormSubmission,
  listFormSubmissions,
  listSiteSubmissions,
};
