/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get all permissions
* Returns all permissions, including:   *  global permissions.  *  project permissions.  *  global permissions added by plugins.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* returns Permissions
* */
const getAllPermissions = () => new Promise(
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
* Get bulk permissions
* Returns:   *  for a list of global permissions, the global permissions granted to a user.  *  for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues a user can access or manipulate.  If no account ID is provided, the operation returns details for the logged in user.  Note that:   *  Invalid project and issue IDs are ignored.  *  A maximum of 1000 projects and 1000 issues can be checked.  *  Null values in `globalPermissions`, `projectPermissions`, `projectPermissions.projects`, and `projectPermissions.issues` are ignored.  *  Empty strings in `projectPermissions.permissions` are ignored.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn't apply to calls made using AP.request() in a browser.
*
* bulkPermissionsRequestBean BulkPermissionsRequestBean Details of the permissions to check.
* returns BulkPermissionGrants
* */
const getBulkPermissions = ({ bulkPermissionsRequestBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bulkPermissionsRequestBean,
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
* Get my permissions
* Returns a list of permissions indicating which permissions the user has. Details of the user's permissions can be obtained in a global, project, issue or comment context.  The user is reported as having a project permission:   *  in the global context, if the user has the project permission in any project.  *  for a project, where the project permission is determined using issue data, if the user meets the permission's criteria for any issue in the project. Otherwise, if the user has the project permission in the project.  *  for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.  *  for a comment, where the user has both the permission to browse the comment and the project permission for the comment's parent issue. Only the BROWSE\\_PROJECTS permission is supported. If a `commentId` is provided whose `permissions` does not equal BROWSE\\_PROJECTS, a 400 error will be returned.  This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.  Global permissions are unaffected by context.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* projectKey String The key of project. Ignored if `projectId` is provided. (optional)
* projectId String The ID of project. (optional)
* issueKey String The key of the issue. Ignored if `issueId` is provided. (optional)
* issueId String The ID of the issue. (optional)
* permissions String A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get). (optional)
* projectUuid String  (optional)
* projectConfigurationUuid String  (optional)
* commentId String The ID of the comment. (optional)
* returns Permissions
* */
const getMyPermissions = ({ projectKey, projectId, issueKey, issueId, permissions, projectUuid, projectConfigurationUuid, commentId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKey,
        projectId,
        issueKey,
        issueId,
        permissions,
        projectUuid,
        projectConfigurationUuid,
        commentId,
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
* Get permitted projects
* Returns all the projects where the user is granted a list of project permissions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* permissionsKeysBean PermissionsKeysBean 
* returns PermittedProjects
* */
const getPermittedProjects = ({ permissionsKeysBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        permissionsKeysBean,
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
  getAllPermissions,
  getBulkPermissions,
  getMyPermissions,
  getPermittedProjects,
};
