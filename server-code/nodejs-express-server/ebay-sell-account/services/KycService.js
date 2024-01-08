/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* <span class=\"tablenote\"><b>Note:</b>This method was originally created to see which onboarding requirements were still pending for sellers being onboarded for eBay managed payments, but now that all seller accounts are onboarded globally, this method should now just returne an empty payload with a <code>204 No Content</code> HTTP status code. </span>
*
* returns KycResponse
* */
const getKYC = () => new Promise(
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
  getKYC,
};
