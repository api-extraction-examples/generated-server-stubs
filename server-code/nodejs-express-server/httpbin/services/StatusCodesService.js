/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Return status code or random status code if more than one are given
*
* codes String 
* no response value expected for this operation
* */
const statusCodesDELETE = ({ codes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        codes,
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
* Return status code or random status code if more than one are given
*
* codes String 
* no response value expected for this operation
* */
const statusCodesGET = ({ codes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        codes,
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
* Return status code or random status code if more than one are given
*
* codes String 
* no response value expected for this operation
* */
const statusCodesPATCH = ({ codes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        codes,
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
* Return status code or random status code if more than one are given
*
* codes String 
* no response value expected for this operation
* */
const statusCodesPOST = ({ codes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        codes,
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
* Return status code or random status code if more than one are given
*
* codes String 
* no response value expected for this operation
* */
const statusCodesPUT = ({ codes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        codes,
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
* Return status code or random status code if more than one are given
*
* codes String 
* no response value expected for this operation
* */
const statusCodesTRACE = ({ codes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        codes,
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
  statusCodesDELETE,
  statusCodesGET,
  statusCodesPATCH,
  statusCodesPOST,
  statusCodesPUT,
  statusCodesTRACE,
};
