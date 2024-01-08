/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* formUnderscoreid String 
* no response value expected for this operation
* */
const deleteSiteForm = ({ siteUnderscoreid, formUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        siteUnderscoreid,
        formUnderscoreid,
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
const listSiteForms = ({ siteUnderscoreid }) => new Promise(
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

module.exports = {
  deleteSiteForm,
  listSiteForms,
};
