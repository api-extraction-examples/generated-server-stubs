/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Bulk update custom field value
* Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
*
* atlassianTransferId UUID The ID of the transfer.
* connectCustomFieldValues ConnectCustomFieldValues 
* returns oas_any_type_not_mapped
* */
const appIssueFieldValueUpdateResource.updateIssueFields_put = ({ atlassianTransferId, connectCustomFieldValues }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        atlassianTransferId,
        connectCustomFieldValues,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Bulk update entity properties
* Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
*
* atlassianTransferId UUID The app migration transfer ID.
* entityType String The type indicating the object that contains the entity properties.
* entityPropertyDetails List 
* no response value expected for this operation
* */
const migrationResource.updateEntityPropertiesValue_put = ({ atlassianTransferId, entityType, entityPropertyDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        atlassianTransferId,
        entityType,
        entityPropertyDetails,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get workflow transition rule configurations
* Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
*
* atlassianTransferId UUID The app migration transfer ID.
* workflowRulesSearch WorkflowRulesSearch 
* returns WorkflowRulesSearchDetails
* */
const migrationResource.workflowRuleSearch_post = ({ atlassianTransferId, workflowRulesSearch }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        atlassianTransferId,
        workflowRulesSearch,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  appIssueFieldValueUpdateResource.updateIssueFields_put,
  migrationResource.updateEntityPropertiesValue_put,
  migrationResource.workflowRuleSearch_post,
};
