/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This method retrieves a list of subscriptions associated with the seller account.
*
* limit String This field is for future use. (optional)
* continuationUnderscoretoken String This field is for future use. (optional)
* returns SubscriptionResponse
* */
const getSubscription = ({ limit, continuationUnderscoretoken }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        continuationUnderscoretoken,
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
  getSubscription,
};
