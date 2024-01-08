/**
 * The ReturnPolicyController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ReturnPolicyService');
const createReturnPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.createReturnPolicy);
};

const deleteReturnPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteReturnPolicy);
};

const getReturnPolicies = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturnPolicies);
};

const getReturnPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturnPolicy);
};

const getReturnPolicyByName = async (request, response) => {
  await Controller.handleRequest(request, response, service.getReturnPolicyByName);
};

const updateReturnPolicy = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateReturnPolicy);
};


module.exports = {
  createReturnPolicy,
  deleteReturnPolicy,
  getReturnPolicies,
  getReturnPolicy,
  getReturnPolicyByName,
  updateReturnPolicy,
};
