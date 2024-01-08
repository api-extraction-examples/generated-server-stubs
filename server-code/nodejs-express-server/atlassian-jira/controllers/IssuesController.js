/**
 * The IssuesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssuesService');
const assignIssue = async (request, response) => {
  await Controller.handleRequest(request, response, service.assignIssue);
};

const createIssue = async (request, response) => {
  await Controller.handleRequest(request, response, service.createIssue);
};

const createIssues = async (request, response) => {
  await Controller.handleRequest(request, response, service.createIssues);
};

const deleteIssue = async (request, response) => {
  await Controller.handleRequest(request, response, service.deleteIssue);
};

const doTransition = async (request, response) => {
  await Controller.handleRequest(request, response, service.doTransition);
};

const editIssue = async (request, response) => {
  await Controller.handleRequest(request, response, service.editIssue);
};

const getChangeLogs = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChangeLogs);
};

const getChangeLogsByIds = async (request, response) => {
  await Controller.handleRequest(request, response, service.getChangeLogsByIds);
};

const getCreateIssueMeta = async (request, response) => {
  await Controller.handleRequest(request, response, service.getCreateIssueMeta);
};

const getEditIssueMeta = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEditIssueMeta);
};

const getEvents = async (request, response) => {
  await Controller.handleRequest(request, response, service.getEvents);
};

const getIssue = async (request, response) => {
  await Controller.handleRequest(request, response, service.getIssue);
};

const getTransitions = async (request, response) => {
  await Controller.handleRequest(request, response, service.getTransitions);
};

const notify = async (request, response) => {
  await Controller.handleRequest(request, response, service.notify);
};


module.exports = {
  assignIssue,
  createIssue,
  createIssues,
  deleteIssue,
  doTransition,
  editIssue,
  getChangeLogs,
  getChangeLogsByIds,
  getCreateIssueMeta,
  getEditIssueMeta,
  getEvents,
  getIssue,
  getTransitions,
  notify,
};
