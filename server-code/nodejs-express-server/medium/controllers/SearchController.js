/**
 * The SearchController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/SearchService');
const searchArticlesqueryqueryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchArticlesqueryqueryGET);
};

const searchListsqueryqueryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchListsqueryqueryGET);
};

const searchPublicationsqueryqueryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchPublicationsqueryqueryGET);
};

const searchTagsqueryqueryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchTagsqueryqueryGET);
};

const searchUsersqueryqueryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.searchUsersqueryqueryGET);
};


module.exports = {
  searchArticlesqueryqueryGET,
  searchListsqueryqueryGET,
  searchPublicationsqueryqueryGET,
  searchTagsqueryqueryGET,
  searchUsersqueryqueryGET,
};
