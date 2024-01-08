/**
 * The GroupsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GroupsService');
const groupGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.groupGET);
};

const groupGroupTitleDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.groupGroupTitleDELETE);
};

const groupGroupTitleGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.groupGroupTitleGET);
};

const groupGroupTitlePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.groupGroupTitlePOST);
};

const groupGroupTitlePUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.groupGroupTitlePUT);
};


module.exports = {
  groupGET,
  groupGroupTitleDELETE,
  groupGroupTitleGET,
  groupGroupTitlePOST,
  groupGroupTitlePUT,
};
