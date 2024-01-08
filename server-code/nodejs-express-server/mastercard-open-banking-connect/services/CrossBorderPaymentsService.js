/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Redeem the payment
*
* body PostPaymentsCrossBorderCreditTransfersParamsBody Request Body
* returns postPaymentsCrossBorderCreditTransfersOKBody
* */
const paymentsCrossBorderCreditTransfersPOST = ({ body }) => new Promise(
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
  paymentsCrossBorderCreditTransfersPOST,
};
