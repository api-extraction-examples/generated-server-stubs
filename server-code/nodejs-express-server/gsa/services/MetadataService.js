/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This endpoint returns metadata for the most recent data loads of SAM and FPDS data
* <p>This endpoint returns metadata for the most recent data loads of SAM and FPDS data. It takes no parameters.</p>
*
* returns Object
* */
const metadata_GET = () => new Promise(
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
  metadata_GET,
};
