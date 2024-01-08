/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* accountUnderscoreid String 
* query String  (optional)
* logUnderscoretype String  (optional)
* page Integer  (optional)
* perUnderscorepage Integer  (optional)
* returns List
* */
const listAccountAuditEvents = ({ accountUnderscoreid, query, logUnderscoretype, page, perUnderscorepage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        accountUnderscoreid,
        query,
        logUnderscoretype,
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
  listAccountAuditEvents,
};
