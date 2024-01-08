/**
 * The MemberController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MemberService');
const addMemberToAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.addMemberToAccount);
};

const getAccountMember = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAccountMember);
};

const listMembersForAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.listMembersForAccount);
};

const removeAccountMember = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeAccountMember);
};

const updateAccountMember = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateAccountMember);
};


module.exports = {
  addMemberToAccount,
  getAccountMember,
  listMembersForAccount,
  removeAccountMember,
  updateAccountMember,
};
