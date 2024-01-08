/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Check validity of password reset token
*
* checkPostRequest CheckPostRequest 
* returns _check__post_200_response
* */
const checkPOST = ({ checkPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        checkPostRequest,
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
* Send reset password email
*
* resetPostRequest ResetPostRequest 
* returns _check__post_200_response
* */
const resetPOST = ({ resetPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        resetPostRequest,
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
* Reset password after asking for a reset (with the token sent by email). 
*
* setpasswordPostRequest SetpasswordPostRequest 
* returns _check__post_200_response
* */
const setpasswordPOST = ({ setpasswordPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        setpasswordPostRequest,
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
  checkPOST,
  resetPOST,
  setpasswordPOST,
};
