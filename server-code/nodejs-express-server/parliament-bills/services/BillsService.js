/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns all Bill stages.
*
* billId Integer Stages relating to a Bill with Bill ID specified
* skip Integer  (optional)
* take Integer  (optional)
* returns StageSummarySearchResult
* */
const apiV1BillsBillIdStagesGET = ({ billId, skip, take }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billId,
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
/**
* Return a Bill.
*
* billId Integer Bill with ID specified
* returns Bill
* */
const getBill = ({ billId }) => new Promise(
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
/**
* Returns a Bill stage.
*
* billId Integer Bill stage relating to Bill with Bill ID specified
* billStageId Integer Bill stage with ID specified
* returns BillStageDetails
* */
const getBillStageDetails = ({ billId, billStageId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billId,
        billStageId,
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
* Returns a list of Bills.
*
* searchTerm String  (optional)
* session Integer  (optional)
* currentHouse House  (optional)
* originatingHouse OriginatingHouse  (optional)
* memberId Integer  (optional)
* departmentId Integer  (optional)
* billStage List  (optional)
* billStagesExcluded List  (optional)
* isDefeated Boolean  (optional)
* isWithdrawn Boolean  (optional)
* billType List  (optional)
* sortOrder BillSortOrder  (optional)
* billIds List  (optional)
* skip Integer  (optional)
* take Integer  (optional)
* returns BillSummarySearchResult
* */
const getBills = ({ searchTerm, session, currentHouse, originatingHouse, memberId, departmentId, billStage, billStagesExcluded, isDefeated, isWithdrawn, billType, sortOrder, billIds, skip, take }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        searchTerm,
        session,
        currentHouse,
        originatingHouse,
        memberId,
        departmentId,
        billStage,
        billStagesExcluded,
        isDefeated,
        isWithdrawn,
        billType,
        sortOrder,
        billIds,
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
  apiV1BillsBillIdStagesGET,
  getBill,
  getBillStageDetails,
  getBills,
};
