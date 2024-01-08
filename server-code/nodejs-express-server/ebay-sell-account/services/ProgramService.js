/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This method gets a list of the seller programs that the seller has opted-in to.
*
* returns Programs
* */
const getOptedInPrograms = () => new Promise(
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
* This method opts the seller in to an eBay seller program. Refer to the <a href=\"/api-docs/sell/account/overview.html#opt-in\" target=\"_blank\">Account API overview</a> for information about available eBay seller programs.<br /><br /><span class=\"tablenote\"><b>Note:</b> It can take up to 24-hours for eBay to process your request to opt-in to a Seller Program. Use the <a href=\"/api-docs/sell/account/resources/program/methods/getOptedInPrograms\" target=\"_blank\">getOptedInPrograms</a> call to check the status of your request after the processing period has passed.</span>
*
* program Program Program being opted-in to.
* returns Object
* */
const optInToProgram = ({ program }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        program,
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
* This method opts the seller out of a seller program to which you have previously opted-in to. Get a list of the seller programs you have opted-in to using the <b>getOptedInPrograms</b> call.
*
* program Program Program being opted-out of.
* returns Object
* */
const optOutOfProgram = ({ program }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        program,
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
  getOptedInPrograms,
  optInToProgram,
  optOutOfProgram,
};
