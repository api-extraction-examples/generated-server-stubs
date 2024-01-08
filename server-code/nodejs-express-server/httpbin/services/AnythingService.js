/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns anything passed in request data.
*
* anything String Automatically added
* no response value expected for this operation
* */
const anythingAnythingDELETE = ({ anything }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        anything,
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
* Returns anything passed in request data.
*
* anything String Automatically added
* no response value expected for this operation
* */
const anythingAnythingGET = ({ anything }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        anything,
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
* Returns anything passed in request data.
*
* anything String Automatically added
* no response value expected for this operation
* */
const anythingAnythingPATCH = ({ anything }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        anything,
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
* Returns anything passed in request data.
*
* anything String Automatically added
* no response value expected for this operation
* */
const anythingAnythingPOST = ({ anything }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        anything,
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
* Returns anything passed in request data.
*
* anything String Automatically added
* no response value expected for this operation
* */
const anythingAnythingPUT = ({ anything }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        anything,
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
* Returns anything passed in request data.
*
* anything String Automatically added
* no response value expected for this operation
* */
const anythingAnythingTRACE = ({ anything }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        anything,
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
* Returns anything passed in request data.
*
* no response value expected for this operation
* */
const anythingDELETE = () => new Promise(
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
* Returns anything passed in request data.
*
* no response value expected for this operation
* */
const anythingGET = () => new Promise(
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
* Returns anything passed in request data.
*
* no response value expected for this operation
* */
const anythingPATCH = () => new Promise(
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
* Returns anything passed in request data.
*
* no response value expected for this operation
* */
const anythingPOST = () => new Promise(
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
* Returns anything passed in request data.
*
* no response value expected for this operation
* */
const anythingPUT = () => new Promise(
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
* Returns anything passed in request data.
*
* no response value expected for this operation
* */
const anythingTRACE = () => new Promise(
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

module.exports = {
  anythingAnythingDELETE,
  anythingAnythingGET,
  anythingAnythingPATCH,
  anythingAnythingPOST,
  anythingAnythingPUT,
  anythingAnythingTRACE,
  anythingDELETE,
  anythingGET,
  anythingPATCH,
  anythingPOST,
  anythingPUT,
  anythingTRACE,
};
