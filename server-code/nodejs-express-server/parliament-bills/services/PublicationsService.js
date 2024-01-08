/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Return a list of Bill stage publications.
*
* billId Integer 
* stageId Integer 
* returns BillStagePublicationList
* */
const apiV1BillsBillIdStagesStageIdPublicationsGET = ({ billId, stageId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billId,
        stageId,
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
* Return a list of Bill publications.
*
* billId Integer Publications relating to Bill with Bill ID specified
* returns BillPublicationList
* */
const getBillPublication = ({ billId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billId,
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
  apiV1BillsBillIdStagesStageIdPublicationsGET,
  getBillPublication,
};
