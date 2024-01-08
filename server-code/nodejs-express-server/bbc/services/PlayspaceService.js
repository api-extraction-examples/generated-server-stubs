/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Playspace Container by ID
* Playspace Container by ID 
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* id String Playspace Container ID
* returns PlayspaceContainer
* */
const getContainer = ({ authorization, xAPIKey, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAPIKey,
        id,
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
* Suggested Playspace Container
* Suggested Playspace Container 
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* previousUnderscorepid String Clip or Episode PID of the previous or first content item in the Playspace stream.
* previousUnderscorecontainer String Container ID of the previous container in the Playspace stream. (optional)
* returns PlayspaceContainer
* */
const suggestContainer = ({ authorization, xAPIKey, previousUnderscorepid, previousUnderscorecontainer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAPIKey,
        previousUnderscorepid,
        previousUnderscorecontainer,
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
  getContainer,
  suggestContainer,
};
