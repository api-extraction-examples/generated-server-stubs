/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create or update remote issue link
* Creates or updates a remote issue link for an issue.  If a `globalId` is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* issueIdOrKey String The ID or key of the issue.
* remoteIssueLinkRequest RemoteIssueLinkRequest 
* returns RemoteIssueLinkIdentifies
* */
const createOrUpdateRemoteIssueLink = ({ issueIdOrKey, remoteIssueLinkRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        remoteIssueLinkRequest,
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
* Delete remote issue link by global ID
* Deletes the remote issue link from the issue using the link's global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass `system=http://www.mycompany.com/support&id=1` as `system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1`.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue.
*
* issueIdOrKey String The ID or key of the issue.
* globalId String The global ID of a remote issue link.
* no response value expected for this operation
* */
const deleteRemoteIssueLinkByGlobalId = ({ issueIdOrKey, globalId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        globalId,
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
* Delete remote issue link by ID
* Deletes a remote issue link from an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects*, *Edit issues*, and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* issueIdOrKey String The ID or key of the issue.
* linkId String The ID of a remote issue link.
* no response value expected for this operation
* */
const deleteRemoteIssueLinkById = ({ issueIdOrKey, linkId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        linkId,
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
* Get remote issue link by ID
* Returns a remote issue link for an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* issueIdOrKey String The ID or key of the issue.
* linkId String The ID of the remote issue link.
* returns RemoteIssueLink
* */
const getRemoteIssueLinkById = ({ issueIdOrKey, linkId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        linkId,
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
* Get remote issue links
* Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass `system=http://www.mycompany.com/support&id=1` as `system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1`.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* issueIdOrKey String The ID or key of the issue.
* globalId String The global ID of the remote issue link. (optional)
* returns RemoteIssueLink
* */
const getRemoteIssueLinks = ({ issueIdOrKey, globalId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        globalId,
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
* Update remote issue link by ID
* Updates a remote issue link for an issue.  Note: Fields without values in the request are set to null.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* issueIdOrKey String The ID or key of the issue.
* linkId String The ID of the remote issue link.
* remoteIssueLinkRequest RemoteIssueLinkRequest 
* returns oas_any_type_not_mapped
* */
const updateRemoteIssueLink = ({ issueIdOrKey, linkId, remoteIssueLinkRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        linkId,
        remoteIssueLinkRequest,
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
  createOrUpdateRemoteIssueLink,
  deleteRemoteIssueLinkByGlobalId,
  deleteRemoteIssueLinkById,
  getRemoteIssueLinkById,
  getRemoteIssueLinks,
  updateRemoteIssueLink,
};
