/**
 * The ScheduledController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ScheduledService');
const targetsAllScheduledscansExpandedGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsAllScheduledscansExpandedGET);
};

const targetsTargetIdScheduledscansExpandedGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScheduledscansExpandedGET);
};

const targetsTargetIdScheduledscansGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScheduledscansGET);
};

const targetsTargetIdScheduledscansIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScheduledscansIdDELETE);
};

const targetsTargetIdScheduledscansIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScheduledscansIdGET);
};

const targetsTargetIdScheduledscansIdPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScheduledscansIdPATCH);
};

const targetsTargetIdScheduledscansIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScheduledscansIdPUT);
};

const targetsTargetIdScheduledscansPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdScheduledscansPOST);
};


module.exports = {
  targetsAllScheduledscansExpandedGET,
  targetsTargetIdScheduledscansExpandedGET,
  targetsTargetIdScheduledscansGET,
  targetsTargetIdScheduledscansIdDELETE,
  targetsTargetIdScheduledscansIdGET,
  targetsTargetIdScheduledscansIdPATCH,
  targetsTargetIdScheduledscansIdPUT,
  targetsTargetIdScheduledscansPOST,
};
