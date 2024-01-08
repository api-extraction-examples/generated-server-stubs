/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create issue link type
* Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link's inward and outward relationships.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueLinkType IssueLinkType 
* returns IssueLinkType
* */
const createIssueLinkType = ({ issueLinkType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueLinkType,
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
* Delete issue link type
* Deletes an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueLinkTypeId String The ID of the issue link type.
* no response value expected for this operation
* */
const deleteIssueLinkType = ({ issueLinkTypeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueLinkTypeId,
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
* Get issue link type
* Returns an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
*
* issueLinkTypeId String The ID of the issue link type.
* returns IssueLinkType
* */
const getIssueLinkType = ({ issueLinkTypeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueLinkTypeId,
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
* Get issue link types
* Returns a list of all issue link types.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
*
* returns IssueLinkTypes
* */
const getIssueLinkTypes = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Update issue link type
* Updates an issue link type.  To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueLinkTypeId String The ID of the issue link type.
* issueLinkType IssueLinkType 
* returns IssueLinkType
* */
const updateIssueLinkType = ({ issueLinkTypeId, issueLinkType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueLinkTypeId,
        issueLinkType,
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
  createIssueLinkType,
  deleteIssueLinkType,
  getIssueLinkType,
  getIssueLinkTypes,
  updateIssueLinkType,
};
