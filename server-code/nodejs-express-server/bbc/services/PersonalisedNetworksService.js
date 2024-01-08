/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Unfollow network
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* body Body3 
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* no response value expected for this operation
* */
const myNetworksFollowsDELETE = ({ authorization, xAPIKey, body, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAPIKey,
        body,
        offset,
        limit,
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
* List of followed networks
* List of followed networks for a given user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns PersonalisedNetworksResponse
* */
const myNetworksFollowsGET = ({ authorization, xAPIKey, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAPIKey,
        offset,
        limit,
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
* Follow network
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* body Body2 
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* no response value expected for this operation
* */
const myNetworksFollowsPOST = ({ authorization, xAPIKey, body, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAPIKey,
        body,
        offset,
        limit,
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
  myNetworksFollowsDELETE,
  myNetworksFollowsGET,
  myNetworksFollowsPOST,
};
