/**
 * The JiraCloudIntegrationController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/JiraCloudIntegrationService');
const integrationsJiraCloudProjectsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrationsJiraCloudProjectsGET);
};

const integrationsJiraCloudProjectsProjectIdIssueTypesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrationsJiraCloudProjectsProjectIdIssueTypesGET);
};

const integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET);
};

const integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdStatusGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdStatusGET);
};

const targetsTargetIdFindingsIdIntegrationsJiraCloudGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdIntegrationsJiraCloudGET);
};

const targetsTargetIdFindingsIdIntegrationsJiraCloudPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdIntegrationsJiraCloudPATCH);
};

const targetsTargetIdFindingsIdIntegrationsJiraCloudPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdFindingsIdIntegrationsJiraCloudPUT);
};

const targetsTargetIdIntegrationsJiraCloudGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdIntegrationsJiraCloudGET);
};

const targetsTargetIdIntegrationsJiraCloudPATCH = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdIntegrationsJiraCloudPATCH);
};

const targetsTargetIdIntegrationsJiraCloudPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.targetsTargetIdIntegrationsJiraCloudPUT);
};


module.exports = {
  integrationsJiraCloudProjectsGET,
  integrationsJiraCloudProjectsProjectIdIssueTypesGET,
  integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET,
  integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdStatusGET,
  targetsTargetIdFindingsIdIntegrationsJiraCloudGET,
  targetsTargetIdFindingsIdIntegrationsJiraCloudPATCH,
  targetsTargetIdFindingsIdIntegrationsJiraCloudPUT,
  targetsTargetIdIntegrationsJiraCloudGET,
  targetsTargetIdIntegrationsJiraCloudPATCH,
  targetsTargetIdIntegrationsJiraCloudPUT,
};
