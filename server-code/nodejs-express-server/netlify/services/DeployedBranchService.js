/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* siteUnderscoreid String 
* returns List
* */
const listSiteDeployedBranches = ({ siteUnderscoreid }) => new Promise(
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
  listSiteDeployedBranches,
};
