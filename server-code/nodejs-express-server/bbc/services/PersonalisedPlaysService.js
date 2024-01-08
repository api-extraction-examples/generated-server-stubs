/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Write Play Event
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* body Body4 
* no response value expected for this operation
* */
const myPlaysPOST = ({ authorization, xAPIKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAPIKey,
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
  myPlaysPOST,
};
