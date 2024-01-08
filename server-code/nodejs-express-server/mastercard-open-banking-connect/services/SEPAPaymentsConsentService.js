/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Request consent initiation via redirect
* Request a SEPA credit transfer consent on behalf of the PSU via a URL redirect to the ASPSP.
*
* body PostPaymentsSepaCreditTransfersConsentsParamsBody 
* returns postPaymentsSepaCreditTransfersConsentsOKBody
* */
const paymentsSepaCreditTransfersConsentsPOST = ({ body }) => new Promise(
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
  paymentsSepaCreditTransfersConsentsPOST,
};
