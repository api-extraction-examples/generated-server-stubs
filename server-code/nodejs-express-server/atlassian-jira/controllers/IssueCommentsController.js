/**
 * The IssueCommentsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueCommentsService');
const addComment = async (request, response) => {
  await Controller.handleRequest(request, response, service.addComment);
};

const deleteComment = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteComment);
};

const getComment = async (request, response) => {
  await Controller.handleRequest(request, response, service.getComment);
};

const getComments = async (request, response) => {
  await Controller.handleRequest(request, response, service.getComments);
};

const getCommentsByIds = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCommentsByIds);
};

const updateComment = async (request, response) => {
  await Controller.handleRequest(request, response, service.updateComment);
};


module.exports = {
  addComment,
  deleteComment,
  getComment,
  getComments,
  getCommentsByIds,
  updateComment,
};
