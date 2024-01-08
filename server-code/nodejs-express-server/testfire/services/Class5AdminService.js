/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add new user
*
* authorization String Authorization token (provided upon successful login)
* body NewUser Details of a new user including first name, last name, desired username and a password
* no response value expected for this operation
* */
const addUser = ({ authorization, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
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
* Change user password
*
* authorization String Authorization token (provided upon successful login)
* body ChangePassword Information about the user password to be changed including id and new password
* no response value expected for this operation
* */
const changePassword = ({ authorization, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
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
  addUser,
  changePassword,
};
