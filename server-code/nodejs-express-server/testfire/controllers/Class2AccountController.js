/**
 * The Class2AccountController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/Class2AccountService');
const getAccount = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAccount);
};

const getAccountBalance = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAccountBalance);
};

const getTransactions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTransactions);
};

const showLastTenTransactions = async (request, response) => {
  await Controller.handleRequest(request, response, service.showLastTenTransactions);
};


module.exports = {
  getAccount,
  getAccountBalance,
  getTransactions,
  showLastTenTransactions,
};
