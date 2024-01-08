/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Unfollow category
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* body Body1 
* no response value expected for this operation
* */
const myCategoriesFollowsDELETE = ({ authorization, xAPIKey, body }) => new Promise(
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
/**
* List of followed categories
* List of followed categories for a given user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns PersonalisedCategoriesResponse
* */
const myCategoriesFollowsGET = ({ authorization, xAPIKey, offset, limit }) => new Promise(
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
* Follow category
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* body Body 
* no response value expected for this operation
* */
const myCategoriesFollowsPOST = ({ authorization, xAPIKey, body }) => new Promise(
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
  myCategoriesFollowsDELETE,
  myCategoriesFollowsGET,
  myCategoriesFollowsPOST,
};
