/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Redeem the payment
* Redeem the payment which was previously consented by the PSU.
*
* body PostPaymentsDomesticCreditTransfersParamsBody Request Body
* returns postPaymentsDomesticCreditTransfersOKBody
* */
const paymentsDomesticCreditTransfersPOST = ({ body }) => new Promise(
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
  paymentsDomesticCreditTransfersPOST,
};
