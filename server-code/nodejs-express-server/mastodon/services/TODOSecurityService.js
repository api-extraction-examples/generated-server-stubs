/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Creates a user and account records. Returns an account access token for the app that initiated the request. The app should save this token for later, and should wait for the user to confirm their account by clicking a link in their email inbox.
*
* apiV1AccountsPostRequest ApiV1AccountsPostRequest  (optional)
* no response value expected for this operation
* */
const apiV1AccountsPOST = ({ apiV1AccountsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1AccountsPostRequest,
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
  apiV1AccountsPOST,
};
