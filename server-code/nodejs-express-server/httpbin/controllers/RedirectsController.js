/**
 * The RedirectsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RedirectsService');
const absolute_redirectNGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.absolute_redirectNGET);
};

const redirectNGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.redirectNGET);
};

const redirect_toDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.redirect_toDELETE);
};

const redirect_toGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.redirect_toGET);
};

const redirect_toPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.redirect_toPATCH);
};

const redirect_toPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.redirect_toPOST);
};

const redirect_toPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.redirect_toPUT);
};

const redirect_toTRACE = async (request, response) => {
  await Controller.handleRequest(request, response, service.redirect_toTRACE);
};

const relative_redirectNGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.relative_redirectNGET);
};


module.exports = {
  absolute_redirectNGET,
  redirectNGET,
  redirect_toDELETE,
  redirect_toGET,
  redirect_toPATCH,
  redirect_toPOST,
  redirect_toPUT,
  redirect_toTRACE,
  relative_redirectNGET,
};
