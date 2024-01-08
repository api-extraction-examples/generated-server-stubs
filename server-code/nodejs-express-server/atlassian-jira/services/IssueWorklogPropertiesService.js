/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete worklog property
* Deletes a worklog property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* issueIdOrKey String The ID or key of the issue.
* worklogId String The ID of the worklog.
* propertyKey String The key of the property.
* no response value expected for this operation
* */
const deleteWorklogProperty = ({ issueIdOrKey, worklogId, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        worklogId,
        propertyKey,
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
* Get worklog property
* Returns the value of a worklog property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* issueIdOrKey String The ID or key of the issue.
* worklogId String The ID of the worklog.
* propertyKey String The key of the property.
* returns EntityProperty
* */
const getWorklogProperty = ({ issueIdOrKey, worklogId, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        worklogId,
        propertyKey,
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
* Get worklog property keys
* Returns the keys of all properties for a worklog.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* issueIdOrKey String The ID or key of the issue.
* worklogId String The ID of the worklog.
* returns PropertyKeys
* */
const getWorklogPropertyKeys = ({ issueIdOrKey, worklogId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        worklogId,
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
* Set worklog property
* Sets the value of a worklog property. Use this operation to store custom data against the worklog.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* issueIdOrKey String The ID or key of the issue.
* worklogId String The ID of the worklog.
* propertyKey String The key of the issue property. The maximum length is 255 characters.
* body oas_any_type_not_mapped 
* returns oas_any_type_not_mapped
* */
const setWorklogProperty = ({ issueIdOrKey, worklogId, propertyKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        worklogId,
        propertyKey,
        body,
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
  deleteWorklogProperty,
  getWorklogProperty,
  getWorklogPropertyKeys,
  setWorklogProperty,
};
