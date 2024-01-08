/**
 * The IssueVotesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueVotesService');
const addVote = async (request, response) => {
  await Controller.handleRequest(request, response, service.addVote);
};

const getVotes = async (request, response) => {
  await Controller.handleRequest(request, response, service.getVotes);
};

const removeVote = async (request, response) => {
  await Controller.handleRequest(request, response, service.removeVote);
};


module.exports = {
  addVote,
  getVotes,
  removeVote,
};
