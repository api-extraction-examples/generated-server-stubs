/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Check if any user is logged in
* If a user is loggedin the username will be returned
*
* authorization String Authorization token (provided upon successful login)
* no response value expected for this operation
* */
const checkLogin = ({ authorization }) => new Promise(
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
* Login method
* After a successful login a token is returned. This is a Bearer token. To authenticate with it use the Authorization header and set value to Bearer empty space and the token value.
*
* body Login Username and password combination to allow users to log-in
* no response value expected for this operation
* */
const login = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  checkLogin,
  login,
};
