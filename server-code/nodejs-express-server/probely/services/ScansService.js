/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List scans for all targets
*
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* started List Filter by scan start dates (optional)
* status ScanStatus Filter by scan statuses (optional)
* returns _targets_all_scans__get_200_response
* */
const targetsAllScansGET = ({ page, length, ordering, search, started, status }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        page,
        length,
        ordering,
        search,
        started,
        status,
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
* Start a scan on the target
*
* targetUnderscoreid String Target id
* targetsTargetIdScanNowPostRequest TargetsTargetIdScanNowPostRequest  (optional)
* returns Scan
* */
const targetsTargetIdScanNowPOST = ({ targetUnderscoreid, targetsTargetIdScanNowPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        targetsTargetIdScanNowPostRequest,
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
* Dates where scans have ocurred
*
* targetUnderscoreid String Target id
* returns List
* */
const targetsTargetIdScansDatesGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* List scans
*
* targetUnderscoreid String Target id
* page Integer Page number within the paginated result set (optional)
* length Integer Number of results to return per page (optional)
* ordering String Which field to use when ordering the results, prefix with `-` to invert ordering.  (optional)
* search String Search term (optional)
* started List Filter by scan start dates (optional)
* status ScanStatus Filter by scan statuses (optional)
* returns _targets_all_scans__get_200_response
* */
const targetsTargetIdScansGET = ({ targetUnderscoreid, page, length, ordering, search, started, status }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        page,
        length,
        ordering,
        search,
        started,
        status,
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
* Cancel running scan
*
* targetUnderscoreid String Target id
* id String Object Id
* returns Scan
* */
const targetsTargetIdScansIdCancelPOST = ({ targetUnderscoreid, id }) => new Promise(
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
* Scan endpoints file
*
* targetUnderscoreid String Target id
* id String Object Id
* returns File
* */
const targetsTargetIdScansIdEndpointsGET = ({ targetUnderscoreid, id }) => new Promise(
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
* Retrieve scan
*
* targetUnderscoreid String Target id
* id String Object Id
* returns Scan
* */
const targetsTargetIdScansIdGET = ({ targetUnderscoreid, id }) => new Promise(
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
* Scan report PDF, using the default report type
*
* targetUnderscoreid String Target id
* id String Object Id
* returns File
* */
const targetsTargetIdScansIdReportDefaultGET = ({ targetUnderscoreid, id }) => new Promise(
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
* Scan report PDF, using the report type specified for the target
*
* targetUnderscoreid String Target id
* id String Object Id
* returns File
* */
const targetsTargetIdScansIdReportGET = ({ targetUnderscoreid, id }) => new Promise(
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
* Scan report PDF, using the OWASP report type
*
* targetUnderscoreid String Target id
* id String Object Id
* returns File
* */
const targetsTargetIdScansIdReportOwaspGET = ({ targetUnderscoreid, id }) => new Promise(
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
* Scan report PDF, using the PCI report type
*
* targetUnderscoreid String Target id
* id String Object Id
* returns File
* */
const targetsTargetIdScansIdReportPciGET = ({ targetUnderscoreid, id }) => new Promise(
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
* Scan page
* Given a date return the page number
*
* targetUnderscoreid String Target id
* date date Date
* length Integer Number of results to return per page (optional)
* returns _targets__target_id__scans_retrieve_page__get_200_response
* */
const targetsTargetIdScansRetrievePageGET = ({ targetUnderscoreid, date, length }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        date,
        length,
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
  targetsAllScansGET,
  targetsTargetIdScanNowPOST,
  targetsTargetIdScansDatesGET,
  targetsTargetIdScansGET,
  targetsTargetIdScansIdCancelPOST,
  targetsTargetIdScansIdEndpointsGET,
  targetsTargetIdScansIdGET,
  targetsTargetIdScansIdReportDefaultGET,
  targetsTargetIdScansIdReportGET,
  targetsTargetIdScansIdReportOwaspGET,
  targetsTargetIdScansIdReportPciGET,
  targetsTargetIdScansRetrievePageGET,
};
