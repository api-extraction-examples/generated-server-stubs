/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Retrieve slack integration data
*
* targetUnderscoreid String Target id
* returns Slack
* */
const targetsTargetIdIntegrationsSlackGET = ({ targetUnderscoreid }) => new Promise(
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
/**
* Update slack integration data
*
* targetUnderscoreid String Target id
* slack Slack 
* returns Slack
* */
const targetsTargetIdIntegrationsSlackPATCH = ({ targetUnderscoreid, slack }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        slack,
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
* Update slack integration data
*
* targetUnderscoreid String Target id
* slack Slack 
* returns Slack
* */
const targetsTargetIdIntegrationsSlackPUT = ({ targetUnderscoreid, slack }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        slack,
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
  targetsTargetIdIntegrationsSlackGET,
  targetsTargetIdIntegrationsSlackPATCH,
  targetsTargetIdIntegrationsSlackPUT,
};
