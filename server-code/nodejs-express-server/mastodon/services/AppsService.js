/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create a new application to obtain OAuth2 credentials.
*
* apiV1AppsPostRequest ApiV1AppsPostRequest  (optional)
* returns _api_v1_apps_post_200_response
* */
const apiV1AppsPOST = ({ apiV1AppsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1AppsPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Confirm that the app's OAuth2 credentials work.
*
* returns Application
* */
const apiV1AppsVerifyCredentialsGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  apiV1AppsPOST,
  apiV1AppsVerifyCredentialsGET,
};
