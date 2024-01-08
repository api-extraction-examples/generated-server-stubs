/**
 * The AuthController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AuthService');
const basic_authUserPasswdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.basic_authUserPasswdGET);
};

const bearerGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.bearerGET);
};

const digest_authQopUserPasswdAlgorithmGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.digest_authQopUserPasswdAlgorithmGET);
};

const digest_authQopUserPasswdAlgorithmStaleAfterGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.digest_authQopUserPasswdAlgorithmStaleAfterGET);
};

const digest_authQopUserPasswdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.digest_authQopUserPasswdGET);
};

const hidden_basic_authUserPasswdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.hidden_basic_authUserPasswdGET);
};


module.exports = {
  basic_authUserPasswdGET,
  bearerGET,
  digest_authQopUserPasswdAlgorithmGET,
  digest_authQopUserPasswdAlgorithmStaleAfterGET,
  digest_authQopUserPasswdGET,
  hidden_basic_authUserPasswdGET,
};
