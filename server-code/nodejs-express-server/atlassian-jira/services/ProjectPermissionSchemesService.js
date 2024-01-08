/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Assign permission scheme
* Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)
*
* projectKeyOrId String The project ID or project key (case sensitive).
* idBean IdBean 
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission. (optional)
* returns PermissionScheme
* */
const assignPermissionScheme = ({ projectKeyOrId, idBean, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKeyOrId,
        idBean,
        expand,
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
* Get assigned permission scheme
* Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
*
* projectKeyOrId String The project ID or project key (case sensitive).
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `permissions` Returns all permission grants for each permission scheme.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission. (optional)
* returns PermissionScheme
* */
const getAssignedPermissionScheme = ({ projectKeyOrId, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKeyOrId,
        expand,
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
* Get project issue security scheme
* Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
*
* projectKeyOrId String The project ID or project key (case sensitive).
* returns SecurityScheme
* */
const getProjectIssueSecurityScheme = ({ projectKeyOrId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKeyOrId,
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
* Get project issue security levels
* Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project.
*
* projectKeyOrId String The project ID or project key (case sensitive).
* returns ProjectIssueSecurityLevels
* */
const getSecurityLevelsForProject = ({ projectKeyOrId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectKeyOrId,
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
  assignPermissionScheme,
  getAssignedPermissionScheme,
  getProjectIssueSecurityScheme,
  getSecurityLevelsForProject,
};
