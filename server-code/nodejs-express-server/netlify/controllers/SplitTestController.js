/**
 * The SplitTestController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SplitTestService');
const createSplitTest = async (request, response) => {
  await Controller.handleRequest(request, response, service.createSplitTest);
};

const disableSplitTest = async (request, response) => {
  await Controller.handleRequest(request, response, service.disableSplitTest);
};

const enableSplitTest = async (request, response) => {
  await Controller.handleRequest(request, response, service.enableSplitTest);
};

const getSplitTest = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSplitTest);
};

const getSplitTests = async (request, response) => {
  await Controller.handleRequest(request, response, service.getSplitTests);
};

const updateSplitTest = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateSplitTest);
};


module.exports = {
  createSplitTest,
  disableSplitTest,
  enableSplitTest,
  getSplitTest,
  getSplitTests,
  updateSplitTest,
};
