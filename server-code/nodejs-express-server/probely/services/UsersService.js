/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Change user password
* Our password policy requires a minimum password length of 10 chars with at least one symbol or number. 
*
* profileChangePasswordPostRequest ProfileChangePasswordPostRequest 
* returns _check__post_200_response
* */
const profileChangePasswordPOST = ({ profileChangePasswordPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        profileChangePasswordPostRequest,
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
* User data
*
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns User
* */
const profileGET = ({ page, length, ordering, search }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        page,
        length,
        ordering,
        search,
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
* List users
*
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _users__get_200_response
* */
const usersGET = ({ page, length, ordering, search }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        page,
        length,
        ordering,
        search,
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
* Deactivate a user
*
* id String Object Id
* no response value expected for this operation
* */
const usersIdDELETE = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Retrieve user
*
* id String Object Id
* returns User
* */
const usersIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Partial update user
*
* id String Object Id
* usersPostRequest UsersPostRequest 
* returns User
* */
const usersIdPATCH = ({ id, usersPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        usersPostRequest,
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
* Update user
*
* id String Object Id
* usersPostRequest UsersPostRequest 
* returns User
* */
const usersIdPUT = ({ id, usersPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        usersPostRequest,
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
* Create/Reactivate a user.
*
* usersPostRequest UsersPostRequest 
* returns User
* */
const usersPOST = ({ usersPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        usersPostRequest,
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
  profileChangePasswordPOST,
  profileGET,
  usersGET,
  usersIdDELETE,
  usersIdGET,
  usersIdPATCH,
  usersIdPUT,
  usersPOST,
};
