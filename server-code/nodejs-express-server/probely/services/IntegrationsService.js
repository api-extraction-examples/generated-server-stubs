/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Integrations available and installed in the account
*
* returns Integrations
* */
const integrationsGET = () => new Promise(
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
* Integrations available and installed for the target
*
* targetUnderscoreid String Target id
* returns Integrations
* */
const targetsTargetIdIntegrationsGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
  integrationsGET,
  targetsTargetIdIntegrationsGET,
};
