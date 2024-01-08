/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise.
*
* ifModifiedSince String  (optional)
* ifNoneMatch String  (optional)
* no response value expected for this operation
* */
const cacheGET = ({ ifModifiedSince, ifNoneMatch }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        ifModifiedSince,
        ifNoneMatch,
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
* Sets a Cache-Control header for n seconds.
*
* value Integer 
* no response value expected for this operation
* */
const cacheValueGET = ({ value }) => new Promise(
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
* Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately.
*
* etag String Automatically added
* ifNoneMatch String  (optional)
* ifMatch String  (optional)
* no response value expected for this operation
* */
const etagEtagGET = ({ etag, ifNoneMatch, ifMatch }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        etag,
        ifNoneMatch,
        ifMatch,
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
* Returns a set of response headers from the query string.
*
* freeform Map  (optional)
* no response value expected for this operation
* */
const response_headersGET = ({ freeform }) => new Promise(
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
* Returns a set of response headers from the query string.
*
* freeform Map  (optional)
* no response value expected for this operation
* */
const response_headersPOST = ({ freeform }) => new Promise(
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

module.exports = {
  cacheGET,
  cacheValueGET,
  etagEtagGET,
  response_headersGET,
  response_headersPOST,
};
