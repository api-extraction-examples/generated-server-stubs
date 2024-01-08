/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket List the fields to include for returned resources of type inAppPurchases (optional)
* include List comma-separated list of relationships to include (optional)
* limitLeft_Square_BracketappsRight_Square_Bracket Integer maximum number of related apps returned (when they are included) (optional)
* returns InAppPurchaseResponse
* */
const inAppPurchasesGet_instance = ({ id, fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket, include, limitLeft_Square_BracketappsRight_Square_Bracket }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        fieldsLeft_Square_BracketinAppPurchasesRight_Square_Bracket,
        include,
        limitLeft_Square_BracketappsRight_Square_Bracket,
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
  inAppPurchasesGet_instance,
};
