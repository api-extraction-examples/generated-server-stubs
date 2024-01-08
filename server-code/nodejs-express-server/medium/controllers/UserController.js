/**
 * The UserController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/UserService');
const userIdForUsernameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userIdForUsernameGET);
};

const userUserIdArticlesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userUserIdArticlesGET);
};

const userUserIdFollowersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userUserIdFollowersGET);
};

const userUserIdFollowingGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userUserIdFollowingGET);
};

const userUserIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userUserIdGET);
};

const userUserIdInterestsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userUserIdInterestsGET);
};

const userUserIdListsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userUserIdListsGET);
};

const userUserIdPublicationsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userUserIdPublicationsGET);
};

const userUserIdTopArticlesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.userUserIdTopArticlesGET);
};


module.exports = {
  userIdForUsernameGET,
  userUserIdArticlesGET,
  userUserIdFollowersGET,
  userUserIdFollowingGET,
  userUserIdGET,
  userUserIdInterestsGET,
  userUserIdListsGET,
  userUserIdPublicationsGET,
  userUserIdTopArticlesGET,
};
