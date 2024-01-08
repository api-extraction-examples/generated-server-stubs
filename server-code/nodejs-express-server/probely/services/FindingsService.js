/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Finding report
*
* targetUnderscoreid String Target id
* findingBulkIds FindingBulkIds 
* no response value expected for this operation
* */
const targetsTargetIdFindingsBulkReportPOST = ({ targetUnderscoreid, findingBulkIds }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        findingBulkIds,
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
* Bulk retest findings
*
* targetUnderscoreid String Target id
* findingBulkRetest FindingBulkRetest 
* no response value expected for this operation
* */
const targetsTargetIdFindingsBulkRetestPOST = ({ targetUnderscoreid, findingBulkRetest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        findingBulkRetest,
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
* Bulk update findings
*
* targetUnderscoreid String Target id
* findingBulkUpdate FindingBulkUpdate 
* no response value expected for this operation
* */
const targetsTargetIdFindingsBulkUpdatePATCH = ({ targetUnderscoreid, findingBulkUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        findingBulkUpdate,
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
* List target findings
*
* targetUnderscoreid String Target id
* scan List Filter by scan ids (optional)
* severity FindingSeverity Filter by finding severity (optional)
* state FindingState Filter by finding states (optional)
* assignee List Filter by assignee ids (optional)
* label List Filter by finding labels (optional)
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* returns _targets__target_id__findings__get_200_response
* */
const targetsTargetIdFindingsGET = ({ targetUnderscoreid, scan, severity, state, assignee, label, page, length, ordering, search }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        scan,
        severity,
        state,
        assignee,
        label,
        page,
        length,
        ordering,
        search,
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
* Retrieve finding
*
* targetUnderscoreid String Target id
* id String Object Id
* returns Finding
* */
const targetsTargetIdFindingsIdGET = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Finding activity log.
* Finding activity log.
*
* targetUnderscoreid String Target id
* id String Object Id
* returns List
* */
const targetsTargetIdFindingsIdLogGET = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Partial update finding
*
* targetUnderscoreid String Target id
* id String Object Id
* findingUpdate FindingUpdate 
* returns Finding
* */
const targetsTargetIdFindingsIdPATCH = ({ targetUnderscoreid, id, findingUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        findingUpdate,
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
* Update finding
*
* targetUnderscoreid String Target id
* id String Object Id
* findingUpdate FindingUpdate 
* returns Finding
* */
const targetsTargetIdFindingsIdPUT = ({ targetUnderscoreid, id, findingUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        findingUpdate,
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
* Retest finding
*
* targetUnderscoreid String Target id
* id String Object Id
* returns Scan
* */
const targetsTargetIdFindingsIdRetestPOST = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Retrieve finding report PDF format
*
* targetUnderscoreid String Target id
* token String Token received from the finding report endpoint.
* returns File
* */
const targetsTargetIdFindingsReportGET = ({ targetUnderscoreid, token }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        token,
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
  targetsTargetIdFindingsBulkReportPOST,
  targetsTargetIdFindingsBulkRetestPOST,
  targetsTargetIdFindingsBulkUpdatePATCH,
  targetsTargetIdFindingsGET,
  targetsTargetIdFindingsIdGET,
  targetsTargetIdFindingsIdLogGET,
  targetsTargetIdFindingsIdPATCH,
  targetsTargetIdFindingsIdPUT,
  targetsTargetIdFindingsIdRetestPOST,
  targetsTargetIdFindingsReportGET,
};
