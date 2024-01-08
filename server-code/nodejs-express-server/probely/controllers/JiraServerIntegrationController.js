/**
 * The JiraServerIntegrationController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/JiraServerIntegrationService');
const integrationsJiraServerProjectsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrationsJiraServerProjectsGET);
};

const integrationsJiraServerProjectsProjectIdIssueTypesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrationsJiraServerProjectsProjectIdIssueTypesGET);
};

const integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET);
};

const integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdStatusGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdStatusGET);
};

const targetsTargetIdFindingsIdIntegrationsJiraServerGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdIntegrationsJiraServerGET);
};

const targetsTargetIdFindingsIdIntegrationsJiraServerPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdIntegrationsJiraServerPATCH);
};

const targetsTargetIdFindingsIdIntegrationsJiraServerPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdIntegrationsJiraServerPUT);
};

const targetsTargetIdIntegrationsJiraServerGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdIntegrationsJiraServerGET);
};

const targetsTargetIdIntegrationsJiraServerPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdIntegrationsJiraServerPATCH);
};

const targetsTargetIdIntegrationsJiraServerPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdIntegrationsJiraServerPUT);
};


module.exports = {
  integrationsJiraServerProjectsGET,
  integrationsJiraServerProjectsProjectIdIssueTypesGET,
  integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET,
  integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdStatusGET,
  targetsTargetIdFindingsIdIntegrationsJiraServerGET,
  targetsTargetIdFindingsIdIntegrationsJiraServerPATCH,
  targetsTargetIdFindingsIdIntegrationsJiraServerPUT,
  targetsTargetIdIntegrationsJiraServerGET,
  targetsTargetIdIntegrationsJiraServerPATCH,
  targetsTargetIdIntegrationsJiraServerPUT,
};
