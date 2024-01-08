/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get payment status
* Get the status for an existing domestic credit transfer payment.
*
* body PostPaymentsDomesticCreditTransfersPaymentStatusParamsBody Request Body
* returns postPaymentsDomesticCreditTransfersPaymentStatusOKBody
* */
const paymentsDomesticCreditTransfersPaymentStatusPOST = ({ body }) => new Promise(
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
  paymentsDomesticCreditTransfersPaymentStatusPOST,
};
