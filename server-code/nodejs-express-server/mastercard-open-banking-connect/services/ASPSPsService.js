/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get list of ASPSPs
* Get the list of all active ASPSPs supported by the Open Banking Connect platform at this time with possibility to filter by id, name or country. This list is updated regularly as new ASPSPs are connected.
*
* body PostAspspsParamsBody Request Body
* returns postAspspsOKBody
* */
const paymentsAspspsPOST = ({ body }) => new Promise(
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
  paymentsAspspsPOST,
};
