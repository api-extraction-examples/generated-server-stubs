/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get custom field configurations
* Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  `id`.  *  `fieldContextId`.  *  `issueId`.  *  `projectKeyOrId` and `issueTypeId`.  Otherwise, all configurations are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
*
* fieldIdOrKey String The ID or key of the custom field, for example `customfield_10000`.
* id Set The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: `id=10000&id=10001`. Can't be provided with `fieldContextId`, `issueId`, `projectKeyOrId`, or `issueTypeId`. (optional)
* fieldContextId Set The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: `fieldContextId=10000&fieldContextId=10001`. Can't be provided with `id`, `issueId`, `projectKeyOrId`, or `issueTypeId`. (optional)
* issueId Long The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with `projectKeyOrId`, or `issueTypeId`. (optional)
* projectKeyOrId String The ID or key of the project to filter results by. Must be provided with `issueTypeId`. Can't be provided with `issueId`. (optional)
* issueTypeId String The ID of the issue type to filter results by. Must be provided with `projectKeyOrId`. Can't be provided with `issueId`. (optional)
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageBeanContextualConfiguration
* */
const getCustomFieldConfiguration = ({ fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldIdOrKey,
        id,
        fieldContextId,
        issueId,
        projectKeyOrId,
        issueTypeId,
        startAt,
        maxResults,
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
* Update custom field configurations
* Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
*
* fieldIdOrKey String The ID or key of the custom field, for example `customfield_10000`.
* customFieldConfigurations CustomFieldConfigurations 
* returns oas_any_type_not_mapped
* */
const updateCustomFieldConfiguration = ({ fieldIdOrKey, customFieldConfigurations }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldIdOrKey,
        customFieldConfigurations,
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
  getCustomFieldConfiguration,
  updateCustomFieldConfiguration,
};
