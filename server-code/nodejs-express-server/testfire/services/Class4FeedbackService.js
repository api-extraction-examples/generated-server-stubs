/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Retrieve feedback
*
* authorization String Authorization token (provided upon successful login)
* feedbackId String 
* no response value expected for this operation
* */
const getFeedback = ({ authorization, feedbackId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        feedbackId,
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
* Submit feedback for the bank
*
* body Feedback Feedback details including name, email the subject and complete message
* no response value expected for this operation
* */
const sendFeedback = ({ body }) => new Promise(
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
  getFeedback,
  sendFeedback,
};
