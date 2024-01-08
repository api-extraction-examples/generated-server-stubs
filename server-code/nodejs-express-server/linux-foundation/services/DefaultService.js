/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Expense Action
* approves or rejects expense report
*
* action String 
* reportId String 
* no response value expected for this operation
* */
const expenseAction = ({ action, reportId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        action,
        reportId,
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
* Get API Health Status
*
* returns health
* */
const healthCheck = () => new Promise(
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
* Reset Policy
* Reset an existing policy to match with templatePolicy
*
* body PolicyResetInput 
* no response value expected for this operation
* */
const resetPolicy = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Tag Policy
* Tag adds a tag to the policy
*
* body PolicyTagInput 
* no response value expected for this operation
* */
const tagPolicy = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  expenseAction,
  healthCheck,
  resetPolicy,
  tagPolicy,
};
