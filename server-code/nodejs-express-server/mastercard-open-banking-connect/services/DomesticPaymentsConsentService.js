/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Request consent initiation via redirect
* Request Payment Initiation Consent for a domestic credit transfer on behalf of the PSU.
*
* body PostPaymentsDomesticCreditTransfersConsentsParamsBody Domestic Payment consent to be wired via Faster Payment System
* returns postPaymentsDomesticCreditTransfersConsentsOKBody
* */
const paymentsDomesticCreditTransfersConsentsPOST = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
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
  paymentsDomesticCreditTransfersConsentsPOST,
};
