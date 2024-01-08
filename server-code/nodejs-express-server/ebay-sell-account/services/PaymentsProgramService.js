/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* <span class=\"tablenote\"><b>Note:</b> This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.</span><br/><br/>This method returns whether or not the user is opted-in to the specified payments program. Sellers opt-in to payments programs by marketplace and you use the <b>marketplace_id</b> path parameter to specify the marketplace of the status flag you want returned.
*
* marketplaceUnderscoreid String This path parameter specifies the eBay marketplace of the payments program for which you want to retrieve the seller's status.
* paymentsUnderscoreprogramUnderscoretype String This path parameter specifies the payments program whose status is returned by the call.
* returns PaymentsProgramResponse
* */
const getPaymentsProgram = ({ marketplaceUnderscoreid, paymentsUnderscoreprogramUnderscoretype }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        marketplaceUnderscoreid,
        paymentsUnderscoreprogramUnderscoretype,
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
  getPaymentsProgram,
};
