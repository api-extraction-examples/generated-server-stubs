/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Prompts the user for authorization using HTTP Basic Auth.
*
* user String 
* passwd String 
* no response value expected for this operation
* */
const basic_authUserPasswdGET = ({ user, passwd }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        user,
        passwd,
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
* Prompts the user for authorization using bearer authentication.
*
* authorization String  (optional)
* no response value expected for this operation
* */
const bearerGET = ({ authorization }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
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
* Prompts the user for authorization using Digest Auth + Algorithm.
*
* qop String auth or auth-int
* user String 
* passwd String 
* algorithm String MD5, SHA-256, SHA-512
* no response value expected for this operation
* */
const digest_authQopUserPasswdAlgorithmGET = ({ qop, user, passwd, algorithm }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qop,
        user,
        passwd,
        algorithm,
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
* Prompts the user for authorization using Digest Auth + Algorithm.
* allow settings the stale_after argument. 
*
* qop String auth or auth-int
* user String 
* passwd String 
* algorithm String MD5, SHA-256, SHA-512
* staleUnderscoreafter String 
* no response value expected for this operation
* */
const digest_authQopUserPasswdAlgorithmStaleAfterGET = ({ qop, user, passwd, algorithm, staleUnderscoreafter }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qop,
        user,
        passwd,
        algorithm,
        staleUnderscoreafter,
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
* Prompts the user for authorization using Digest Auth.
*
* qop String auth or auth-int
* user String 
* passwd String 
* no response value expected for this operation
* */
const digest_authQopUserPasswdGET = ({ qop, user, passwd }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qop,
        user,
        passwd,
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
* Prompts the user for authorization using HTTP Basic Auth.
*
* user String 
* passwd String 
* no response value expected for this operation
* */
const hidden_basic_authUserPasswdGET = ({ user, passwd }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        user,
        passwd,
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
  basic_authUserPasswdGET,
  bearerGET,
  digest_authQopUserPasswdAlgorithmGET,
  digest_authQopUserPasswdAlgorithmStaleAfterGET,
  digest_authQopUserPasswdGET,
  hidden_basic_authUserPasswdGET,
};
