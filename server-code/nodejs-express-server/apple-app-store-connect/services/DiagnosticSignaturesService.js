/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* limit Integer maximum resources per page (optional)
* returns DiagnosticLogsResponse
* */
const diagnosticSignaturesLogsGet_to_many_related = ({ id, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        limit,
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
  diagnosticSignaturesLogsGet_to_many_related,
};
