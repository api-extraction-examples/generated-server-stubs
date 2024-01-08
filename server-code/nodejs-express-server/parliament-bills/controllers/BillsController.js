/**
 * The BillsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BillsService');
const apiV1BillsBillIdStagesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1BillsBillIdStagesGET);
};

const getBill = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBill);
};

const getBillStageDetails = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBillStageDetails);
};

const getBills = async (request, response) => {
  await Controller.handleRequest(request, response, service.getBills);
};


module.exports = {
  apiV1BillsBillIdStagesGET,
  getBill,
  getBillStageDetails,
  getBills,
};
