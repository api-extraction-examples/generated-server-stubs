/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete an access token by ID.
*
* tokenId String The access token ID.
* no response value expected for this operation
* */
const deleteToken = ({ tokenId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tokenId,
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
* Get a single access token by ID.
*
* tokenId String The access token ID.
* returns Token
* */
const getToken = ({ tokenId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tokenId,
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
* Returns a list of tokens in the account.
*
* showAll Boolean If set to true, and the authentication access token has the \"Admin\" role, personal access tokens for all members will be retrieved. (optional)
* returns Tokens
* */
const getTokens = ({ showAll }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        showAll,
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
* Modify an access token by ID.
*
* tokenId String The access token ID.
* patchDelta List Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'
* returns Token
* */
const patchToken = ({ tokenId, patchDelta }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tokenId,
        patchDelta,
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
* Create a new token.
*
* tokenBody PostTokenRequest Create a new access token.
* returns Token
* */
const postToken = ({ tokenBody }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tokenBody,
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
* Reset an access token's secret key with an optional expiry time for the old key.
*
* tokenId String The access token ID.
* expiry Long An expiration time for the old token key, expressed as a Unix epoch time in milliseconds. By default, the token will expire immediately. (optional)
* returns Token
* */
const resetToken = ({ tokenId, expiry }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tokenId,
        expiry,
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
  deleteToken,
  getToken,
  getTokens,
  patchToken,
  postToken,
  resetToken,
};
