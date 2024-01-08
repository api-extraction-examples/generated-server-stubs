/**
 * The IdfaDeclarationsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IdfaDeclarationsService');
const idfaDeclarationsCreate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.idfaDeclarationsCreate_instance);
};

const idfaDeclarationsDelete_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.idfaDeclarationsDelete_instance);
};

const idfaDeclarationsUpdate_instance = async (request, response) => {
  await Controller.handleRequest(request, response, service.idfaDeclarationsUpdate_instance);
};


module.exports = {
  idfaDeclarationsCreate_instance,
  idfaDeclarationsDelete_instance,
  idfaDeclarationsUpdate_instance,
};
