/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns an amendment.
*
* billId Integer Amendment relating to a bill with bill ID specified
* billStageId Integer Amendment relating to a bill stage with bill stage ID specified
* amendmentId Integer Amendment with amendment ID specified
* returns AmendmentDetail
* */
const getAmendment = ({ billId, billStageId, amendmentId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billId,
        billStageId,
        amendmentId,
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
* Returns a list of amendments.
*
* billId Integer Amendments relating to a Bill with Bill ID specified
* billStageId Integer Amendments relating to a Bill stage with Bill stage ID specified
* searchTerm String  (optional)
* decision Decision  (optional)
* memberId Integer  (optional)
* skip Integer  (optional)
* take Integer  (optional)
* returns AmendmentSearchItemSearchResult
* */
const getAmendments = ({ billId, billStageId, searchTerm, decision, memberId, skip, take }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billId,
        billStageId,
        searchTerm,
        decision,
        memberId,
        skip,
        take,
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
  getAmendment,
  getAmendments,
};
