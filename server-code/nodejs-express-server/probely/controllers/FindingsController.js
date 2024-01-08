/**
 * The FindingsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/FindingsService');
const targetsTargetIdFindingsBulkReportPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsBulkReportPOST);
};

const targetsTargetIdFindingsBulkRetestPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsBulkRetestPOST);
};

const targetsTargetIdFindingsBulkUpdatePATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsBulkUpdatePATCH);
};

const targetsTargetIdFindingsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsGET);
};

const targetsTargetIdFindingsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdGET);
};

const targetsTargetIdFindingsIdLogGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdLogGET);
};

const targetsTargetIdFindingsIdPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdPATCH);
};

const targetsTargetIdFindingsIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdPUT);
};

const targetsTargetIdFindingsIdRetestPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdRetestPOST);
};

const targetsTargetIdFindingsReportGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsReportGET);
};


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
