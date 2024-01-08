/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Request consent initiation via redirect
*
* body PostPaymentsCrossBorderCreditTransfersConsentsParamsBody Cross border payment consent
* returns postPaymentsCrossBorderCreditTransfersConsentsOKBody
* */
const paymentsCrossBorderCreditTransfersConsentsPOST = ({ body }) => new Promise(
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
  paymentsCrossBorderCreditTransfersConsentsPOST,
};
