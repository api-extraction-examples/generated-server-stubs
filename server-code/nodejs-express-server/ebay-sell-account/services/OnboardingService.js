/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* <span class=\"tablenote\"><b>Note:</b> This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.</span><br/><br/>This method retrieves a seller's onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.
*
* marketplaceUnderscoreid String The eBay marketplace ID associated with the onboarding status to retrieve.
* paymentsUnderscoreprogramUnderscoretype String The type of payments program whose status is returned by the method.
* returns PaymentsProgramOnboardingResponse
* */
const getPaymentsProgramOnboarding = ({ marketplaceUnderscoreid, paymentsUnderscoreprogramUnderscoretype }) => new Promise(
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
  getPaymentsProgramOnboarding,
};
