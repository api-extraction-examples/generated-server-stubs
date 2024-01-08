/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Extracts the original raw consent given by the aspsp
* Extracts the original raw consent given by the aspsp
*
* body PostPaymentsConsentsRawParamsBody Request Body
* returns postPaymentsConsentsRawOKBody
* */
const paymentsConsentsRawPOST = ({ body }) => new Promise(
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
  paymentsConsentsRawPOST,
};
