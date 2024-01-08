/**
 * The UserSegmentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserSegmentsService');
const deleteUserSegment = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteUserSegment);
};

const getExpiringUserTargetsOnSegment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getExpiringUserTargetsOnSegment);
};

const getUserSegment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserSegment);
};

const getUserSegments = async (request, response) => {
  await Controller.handleRequest(request, response, service.getUserSegments);
};

const patchExpiringUserTargetsOnSegment = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchExpiringUserTargetsOnSegment);
};

const patchUserSegment = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchUserSegment);
};

const postUserSegment = async (request, response) => {
  await Controller.handleRequest(request, response, service.postUserSegment);
};

const updateBigSegmentTargets = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateBigSegmentTargets);
};


module.exports = {
  deleteUserSegment,
  getExpiringUserTargetsOnSegment,
  getUserSegment,
  getUserSegments,
  patchExpiringUserTargetsOnSegment,
  patchUserSegment,
  postUserSegment,
  updateBigSegmentTargets,
};
