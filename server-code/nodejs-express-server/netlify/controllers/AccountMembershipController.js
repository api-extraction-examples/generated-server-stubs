/**
 * The AccountMembershipController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AccountMembershipService');
const cancelAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.cancelAccount);
};

const createAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.createAccount);
};

const getAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAccount);
};

const listAccountsForUser = async (request, response) => {
  await Controller.handleRequest(request, response, service.listAccountsForUser);
};

const updateAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateAccount);
};


module.exports = {
  cancelAccount,
  createAccount,
  getAccount,
  listAccountsForUser,
  updateAccount,
};
