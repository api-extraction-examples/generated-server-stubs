/**
 * The AccountController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AccountService');
const accountGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.accountGET);
};

const billingActionsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.billingActionsPOST);
};

const billingEstimatePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.billingEstimatePOST);
};

const billingGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.billingGET);
};

const billingPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.billingPATCH);
};

const billingPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.billingPUT);
};

const billingSubscribePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.billingSubscribePOST);
};

const target_actionsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.target_actionsPOST);
};


module.exports = {
  accountGET,
  billingActionsPOST,
  billingEstimatePOST,
  billingGET,
  billingPATCH,
  billingPUT,
  billingSubscribePOST,
  target_actionsPOST,
};
