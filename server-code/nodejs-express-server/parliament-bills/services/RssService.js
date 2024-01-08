/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns an Rss feed of all Bills.
*
* no response value expected for this operation
* */
const apiV1RssAllbillsRssGET = () => new Promise(
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
* Returns an Rss feed of a certain Bill.
*
* id Integer Id of Bill
* no response value expected for this operation
* */
const apiV1RssBillsIdRssGET = ({ id }) => new Promise(
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
* Returns an Rss feed of private Bills.
*
* no response value expected for this operation
* */
const apiV1RssPrivatebillsRssGET = () => new Promise(
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
* Returns an Rss feed of public Bills.
*
* no response value expected for this operation
* */
const apiV1RssPublicbillsRssGET = () => new Promise(
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
  apiV1RssAllbillsRssGET,
  apiV1RssBillsIdRssGET,
  apiV1RssPrivatebillsRssGET,
  apiV1RssPublicbillsRssGET,
};
