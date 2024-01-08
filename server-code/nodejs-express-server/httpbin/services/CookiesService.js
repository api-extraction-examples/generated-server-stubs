/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Deletes cookie(s) as provided by the query string and redirects to cookie list.
*
* freeform Map  (optional)
* no response value expected for this operation
* */
const cookiesDeleteGET = ({ freeform }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        freeform,
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
* Returns cookie data.
*
* no response value expected for this operation
* */
const cookiesGET = () => new Promise(
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
* Sets cookie(s) as provided by the query string and redirects to cookie list.
*
* freeform Map  (optional)
* no response value expected for this operation
* */
const cookiesSetGET = ({ freeform }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        freeform,
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
* Sets a cookie and redirects to cookie list.
*
* name String 
* value String 
* no response value expected for this operation
* */
const cookiesSetNameValueGET = ({ name, value }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        value,
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
  cookiesDeleteGET,
  cookiesGET,
  cookiesSetGET,
  cookiesSetNameValueGET,
};
