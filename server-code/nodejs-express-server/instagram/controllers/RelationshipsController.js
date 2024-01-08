/**
 * The RelationshipsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/RelationshipsService');
const usersSelfRequestedByGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersSelfRequestedByGET);
};

const usersUserIdFollowedByGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersUserIdFollowedByGET);
};

const usersUserIdFollowsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersUserIdFollowsGET);
};

const usersUserIdRelationshipGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersUserIdRelationshipGET);
};

const usersUserIdRelationshipPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.usersUserIdRelationshipPOST);
};


module.exports = {
  usersSelfRequestedByGET,
  usersUserIdFollowedByGET,
  usersUserIdFollowsGET,
  usersUserIdRelationshipGET,
  usersUserIdRelationshipPOST,
};
