/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Absolutely 302 Redirects n times.
*
* n Integer 
* no response value expected for this operation
* */
const absolute_redirectNGET = ({ n }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        n,
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
* 302 Redirects n times.
*
* n Integer 
* no response value expected for this operation
* */
const redirectNGET = ({ n }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        n,
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
* 302/3XX Redirects to the given URL.
*
* no response value expected for this operation
* */
const redirect_toDELETE = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* 302/3XX Redirects to the given URL.
*
* url String 
* statusUnderscorecode Integer  (optional)
* no response value expected for this operation
* */
const redirect_toGET = ({ url, statusUnderscorecode }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        url,
        statusUnderscorecode,
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
* 302/3XX Redirects to the given URL.
*
* no response value expected for this operation
* */
const redirect_toPATCH = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* 302/3XX Redirects to the given URL.
*
* redirectToPutRequest RedirectToPutRequest 
* no response value expected for this operation
* */
const redirect_toPOST = ({ redirectToPutRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        redirectToPutRequest,
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
* 302/3XX Redirects to the given URL.
*
* redirectToPutRequest RedirectToPutRequest 
* no response value expected for this operation
* */
const redirect_toPUT = ({ redirectToPutRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        redirectToPutRequest,
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
* 302/3XX Redirects to the given URL.
*
* no response value expected for this operation
* */
const redirect_toTRACE = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Relatively 302 Redirects n times.
*
* n Integer 
* no response value expected for this operation
* */
const relative_redirectNGET = ({ n }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        n,
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
  absolute_redirectNGET,
  redirectNGET,
  redirect_toDELETE,
  redirect_toGET,
  redirect_toPATCH,
  redirect_toPOST,
  redirect_toPUT,
  redirect_toTRACE,
  relative_redirectNGET,
};
