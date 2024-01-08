/**
 * The JQLController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/JQLService');
const getAutoComplete = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAutoComplete);
};

const getAutoCompletePost = async (request, response) => {
  await Controller.handleRequest(request, response, service.getAutoCompletePost);
};

const getFieldAutoCompleteForQueryString = async (request, response) => {
  await Controller.handleRequest(request, response, service.getFieldAutoCompleteForQueryString);
};

const migrateQueries = async (request, response) => {
  await Controller.handleRequest(request, response, service.migrateQueries);
};

const parseJqlQueries = async (request, response) => {
  await Controller.handleRequest(request, response, service.parseJqlQueries);
};

const sanitiseJqlQueries = async (request, response) => {
  await Controller.handleRequest(request, response, service.sanitiseJqlQueries);
};


module.exports = {
  getAutoComplete,
  getAutoCompletePost,
  getFieldAutoCompleteForQueryString,
  migrateQueries,
  parseJqlQueries,
  sanitiseJqlQueries,
};
