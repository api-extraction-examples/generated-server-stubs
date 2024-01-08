/**
 * The TeamMembersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/TeamMembersService');
const deleteMember = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteMember);
};

const getMe = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMe);
};

const getMember = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMember);
};

const getMembers = async (request, response) => {
  await Controller.handleRequest(request, response, service.getMembers);
};

const patchMember = async (request, response) => {
  await Controller.handleRequest(request, response, service.patchMember);
};

const postMembers = async (request, response) => {
  await Controller.handleRequest(request, response, service.postMembers);
};


module.exports = {
  deleteMember,
  getMe,
  getMember,
  getMembers,
  patchMember,
  postMembers,
};
