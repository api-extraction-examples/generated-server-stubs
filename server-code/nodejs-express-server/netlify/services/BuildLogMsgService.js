/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* buildUnderscoreid String 
* msg BuildLogMsg 
* no response value expected for this operation
* */
const updateSiteBuildLog = ({ buildUnderscoreid, msg }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        buildUnderscoreid,
        msg,
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
  updateSiteBuildLog,
};
