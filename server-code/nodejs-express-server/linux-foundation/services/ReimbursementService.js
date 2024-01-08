/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create Reimbursement
* Create a new Reimbursement policy
*
* projectId String 
* body CreateReimbursementRequest 
* no response value expected for this operation
* */
const createReimbursement = ({ projectId, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectId,
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
* Update Reimbursement
* Update an existing Reimbursement policy
*
* projectId String 
* body PolicyUpdateInput 
* no response value expected for this operation
* */
const updateReimbursement = ({ projectId, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectId,
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
  createReimbursement,
  updateReimbursement,
};
