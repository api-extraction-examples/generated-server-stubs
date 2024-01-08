/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Redeem the payment
* Redeem a SEPA credit transfer previously consented by the PSU.
*
* body PostPaymentsSepaCreditTransfersParamsBody Request Body
* returns postPaymentsSepaCreditTransfersOKBody
* */
const paymentsSepaCreditTransfersPOST = ({ body }) => new Promise(
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
  paymentsSepaCreditTransfersPOST,
};
