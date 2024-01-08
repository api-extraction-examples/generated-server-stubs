/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Decodes base64url-encoded string.
*
* value String 
* no response value expected for this operation
* */
const base64ValueGET = ({ value }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
/**
* Returns n random bytes generated with given seed
*
* n Integer 
* no response value expected for this operation
* */
const bytesNGET = ({ n }) => new Promise(
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
* Returns a delayed response (max of 10 seconds).
*
* delay Integer 
* no response value expected for this operation
* */
const delayDelayDELETE = ({ delay }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        delay,
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
* Returns a delayed response (max of 10 seconds).
*
* delay Integer 
* no response value expected for this operation
* */
const delayDelayGET = ({ delay }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        delay,
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
* Returns a delayed response (max of 10 seconds).
*
* delay Integer 
* no response value expected for this operation
* */
const delayDelayPATCH = ({ delay }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        delay,
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
* Returns a delayed response (max of 10 seconds).
*
* delay Integer 
* no response value expected for this operation
* */
const delayDelayPOST = ({ delay }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        delay,
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
* Returns a delayed response (max of 10 seconds).
*
* delay Integer 
* no response value expected for this operation
* */
const delayDelayPUT = ({ delay }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        delay,
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
* Returns a delayed response (max of 10 seconds).
*
* delay Integer 
* no response value expected for this operation
* */
const delayDelayTRACE = ({ delay }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        delay,
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
* Drips data over a duration after an optional initial delay.
*
* duration BigDecimal The amount of time (in seconds) over which to drip each byte (optional)
* numbytes Integer The number of bytes to respond with (optional)
* code Integer The response code that will be returned (optional)
* delay BigDecimal The amount of time (in seconds) to delay before responding (optional)
* no response value expected for this operation
* */
const dripGET = ({ duration, numbytes, code, delay }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        duration,
        numbytes,
        code,
        delay,
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
* Generate a page containing n links to other pages which do the same.
*
* n Integer 
* offset Integer 
* no response value expected for this operation
* */
const linksNOffsetGET = ({ n, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        n,
        offset,
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
* Streams n random bytes generated with given seed, at given chunk size per packet.
*
* numbytes Integer 
* no response value expected for this operation
* */
const rangeNumbytesGET = ({ numbytes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        numbytes,
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
* Stream n JSON responses
*
* n Integer 
* no response value expected for this operation
* */
const streamNGET = ({ n }) => new Promise(
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
* Streams n random bytes generated with given seed, at given chunk size per packet.
*
* n Integer 
* no response value expected for this operation
* */
const stream_bytesNGET = ({ n }) => new Promise(
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
* Return a UUID4.
*
* no response value expected for this operation
* */
const uuidGET = () => new Promise(
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
  base64ValueGET,
  bytesNGET,
  delayDelayDELETE,
  delayDelayGET,
  delayDelayPATCH,
  delayDelayPOST,
  delayDelayPUT,
  delayDelayTRACE,
  dripGET,
  linksNOffsetGET,
  rangeNumbytesGET,
  streamNGET,
  stream_bytesNGET,
  uuidGET,
};
