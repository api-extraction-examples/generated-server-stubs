/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Retrieve account information
*
* returns Account
* */
const accountGET = () => new Promise(
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
* Action that should be taken to enable the selected targets
*
* string List 
* returns Action
* */
const billingActionsPOST = ({ string }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        string,
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
* Estimate costs of updating a subscription
*
* subscription Subscription 
* returns Invoice
* */
const billingEstimatePOST = ({ subscription }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        subscription,
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
* Retrieve billing information
*
* returns Billing
* */
const billingGET = () => new Promise(
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
* Partial update billing information
*
* billing Billing 
* returns Billing
* */
const billingPATCH = ({ billing }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billing,
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
* Update billing information
*
* billing Billing 
* returns Billing
* */
const billingPUT = ({ billing }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billing,
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
* Update a subscription
*
* subscription Subscription 
* returns Invoice
* */
const billingSubscribePOST = ({ subscription }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        subscription,
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
* Available actions for the selected targets
*
* string List 
* returns List
* */
const target_actionsPOST = ({ string }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        string,
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
  accountGET,
  billingActionsPOST,
  billingEstimatePOST,
  billingGET,
  billingPATCH,
  billingPUT,
  billingSubscribePOST,
  target_actionsPOST,
};
