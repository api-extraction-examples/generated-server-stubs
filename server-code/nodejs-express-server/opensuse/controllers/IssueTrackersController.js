/**
 * The IssueTrackersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/IssueTrackersService');
const issue_trackersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.issue_trackersGET);
};

const issue_trackersIssueTrackerNameDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.issue_trackersIssueTrackerNameDELETE);
};

const issue_trackersIssueTrackerNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.issue_trackersIssueTrackerNameGET);
};

const issue_trackersIssueTrackerNameIssuesIssueNameGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.issue_trackersIssueTrackerNameIssuesIssueNameGET);
};

const issue_trackersIssueTrackerNamePUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.issue_trackersIssueTrackerNamePUT);
};

const issue_trackersPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.issue_trackersPOST);
};


module.exports = {
  issue_trackersGET,
  issue_trackersIssueTrackerNameDELETE,
  issue_trackersIssueTrackerNameGET,
  issue_trackersIssueTrackerNameIssuesIssueNameGET,
  issue_trackersIssueTrackerNamePUT,
  issue_trackersPOST,
};
