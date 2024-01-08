/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Authenticate user
* The received token should be used for authenticated requests by including in the Authorization header as `Authorization: JWT <token>`. 
*
* login Login 
* returns _auth_obtain__post_200_response
* */
const authObtainPOST = ({ login }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        login,
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
* Replace token with a new one
*
* authRefreshPostRequest AuthRefreshPostRequest 
* returns _auth_obtain__post_200_response
* */
const authRefreshPOST = ({ authRefreshPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authRefreshPostRequest,
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
* Revoke a token
*
* authRefreshPostRequest AuthRefreshPostRequest 
* returns _auth_obtain__post_200_response
* */
const authRevokePOST = ({ authRefreshPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authRefreshPostRequest,
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
* Verify a token
* Check for the validity of a user token. 
*
* authRefreshPostRequest AuthRefreshPostRequest 
* returns _auth_obtain__post_200_response
* */
const authVerifyPOST = ({ authRefreshPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authRefreshPostRequest,
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
* Enterprise user authentication
* The received token should be used for authenticated requests by including in the Authorization header as `Authorization: JWT <token>`. 
*
* login Login 
* returns _auth_obtain__post_200_response
* */
const enterpriseAuthObtainPOST = ({ login }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        login,
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
* Enterprise token refresh
*
* authRefreshPostRequest AuthRefreshPostRequest 
* returns _auth_obtain__post_200_response
* */
const enterpriseAuthRefreshPOST = ({ authRefreshPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authRefreshPostRequest,
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
* Enterprise token revokation
*
* authRefreshPostRequest AuthRefreshPostRequest 
* returns _auth_obtain__post_200_response
* */
const enterpriseAuthRevokePOST = ({ authRefreshPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authRefreshPostRequest,
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
* Enterprise token verification
* Check for the validity of a user token. 
*
* authRefreshPostRequest AuthRefreshPostRequest 
* returns _auth_obtain__post_200_response
* */
const enterpriseAuthVerifyPOST = ({ authRefreshPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authRefreshPostRequest,
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
  authObtainPOST,
  authRefreshPOST,
  authRevokePOST,
  authVerifyPOST,
  enterpriseAuthObtainPOST,
  enterpriseAuthRefreshPOST,
  enterpriseAuthRevokePOST,
  enterpriseAuthVerifyPOST,
};
