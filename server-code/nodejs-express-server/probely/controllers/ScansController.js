/**
 * The ScansController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ScansService');
const targetsAllScansGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsAllScansGET);
};

const targetsTargetIdScanNowPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScanNowPOST);
};

const targetsTargetIdScansDatesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansDatesGET);
};

const targetsTargetIdScansGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansGET);
};

const targetsTargetIdScansIdCancelPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansIdCancelPOST);
};

const targetsTargetIdScansIdEndpointsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansIdEndpointsGET);
};

const targetsTargetIdScansIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansIdGET);
};

const targetsTargetIdScansIdReportDefaultGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansIdReportDefaultGET);
};

const targetsTargetIdScansIdReportGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansIdReportGET);
};

const targetsTargetIdScansIdReportOwaspGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansIdReportOwaspGET);
};

const targetsTargetIdScansIdReportPciGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansIdReportPciGET);
};

const targetsTargetIdScansRetrievePageGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScansRetrievePageGET);
};


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
