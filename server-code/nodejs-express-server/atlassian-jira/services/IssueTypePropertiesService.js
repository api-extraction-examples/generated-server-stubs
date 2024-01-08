/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete issue type property
* Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeId String The ID of the issue type.
* propertyKey String The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
* no response value expected for this operation
* */
const deleteIssueTypeProperty = ({ issueTypeId, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeId,
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
* Get issue type property
* Returns the key and value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the details of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the details of any issue types associated with the projects the user has permission to browse.
*
* issueTypeId String The ID of the issue type.
* propertyKey String The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
* returns EntityProperty
* */
const getIssueTypeProperty = ({ issueTypeId, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeId,
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
* Get issue type property keys
* Returns all the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys of the issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the property keys of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the property keys of any issue types associated with the projects the user has permission to browse.
*
* issueTypeId String The ID of the issue type.
* returns PropertyKeys
* */
const getIssueTypePropertyKeys = ({ issueTypeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeId,
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
* Set issue type property
* Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeId String The ID of the issue type.
* propertyKey String The key of the issue type property. The maximum length is 255 characters.
* body oas_any_type_not_mapped 
* returns oas_any_type_not_mapped
* */
const setIssueTypeProperty = ({ issueTypeId, propertyKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeId,
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
  deleteIssueTypeProperty,
  getIssueTypeProperty,
  getIssueTypePropertyKeys,
  setIssueTypeProperty,
};
