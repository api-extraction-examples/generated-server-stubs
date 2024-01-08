/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get payment status
*
* body PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody Request Body
* returns postPaymentsCrossBorderCreditTransfersPaymentStatusOKBody
* */
const paymentsCrossBorderCreditTransfersPaymentStatusPOST = ({ body }) => new Promise(
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
  paymentsCrossBorderCreditTransfersPaymentStatusPOST,
};
