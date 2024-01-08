/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get payment status
* Get the status of an existing SEPA credit transfer
*
* body PostPaymentsSepaCreditTransfersPaymentStatusParamsBody Request Body
* returns postPaymentsSepaCreditTransfersPaymentStatusOKBody
* */
const paymentsSepaCreditTransfersPaymentStatusPOST = ({ body }) => new Promise(
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
  paymentsSepaCreditTransfersPaymentStatusPOST,
};
