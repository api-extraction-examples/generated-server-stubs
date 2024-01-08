/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Query server for exposed Prometheus metrics
* See Prometheus documentation for a complete data model.
*
* returns String
* */
const getPrometheusMetrics = () => new Promise(
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

module.exports = {
  getPrometheusMetrics,
};
