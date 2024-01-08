/**
 * The LoginController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/LoginService');
const authObtainPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.authObtainPOST);
};

const authRefreshPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.authRefreshPOST);
};

const authRevokePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.authRevokePOST);
};

const authVerifyPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.authVerifyPOST);
};

const enterpriseAuthObtainPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.enterpriseAuthObtainPOST);
};

const enterpriseAuthRefreshPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.enterpriseAuthRefreshPOST);
};

const enterpriseAuthRevokePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.enterpriseAuthRevokePOST);
};

const enterpriseAuthVerifyPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.enterpriseAuthVerifyPOST);
};


module.exports = {
  authObtainPOST,
  authRefreshPOST,
  authRevokePOST,
  authVerifyPOST,
  enterpriseAuthObtainPOST,
  enterpriseAuthRefreshPOST,
  enterpriseAuthRevokePOST,
  enterpriseAuthVerifyPOST,
};
