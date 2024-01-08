/**
 * The AppMigrationController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AppMigrationService');
const appIssueFieldValueUpdateResource.updateIssueFields_put = async (request, response) => {
  await Controller.handleRequest(request, response, service.appIssueFieldValueUpdateResource.updateIssueFields_put);
};

const migrationResource.updateEntityPropertiesValue_put = async (request, response) => {
  await Controller.handleRequest(request, response, service.migrationResource.updateEntityPropertiesValue_put);
};

const migrationResource.workflowRuleSearch_post = async (request, response) => {
  await Controller.handleRequest(request, response, service.migrationResource.workflowRuleSearch_post);
};


module.exports = {
  appIssueFieldValueUpdateResource.updateIssueFields_put,
  migrationResource.updateEntityPropertiesValue_put,
  migrationResource.workflowRuleSearch_post,
};
