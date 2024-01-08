/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create project role
* Creates a new project role with no [default actors](#api-rest-api-3-resolution-get). You can use the [Add default actors to project role](#api-rest-api-3-role-id-actors-post) operation to add default actors to the project role after creating it.  *Note that although a new project role is available to all projects upon creation, any default actors that are associated with the project role are not added to projects that existed prior to the role being created.*<  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* createUpdateRoleRequestBean CreateUpdateRoleRequestBean 
* returns ProjectRole
* */
const createProjectRole = ({ createUpdateRoleRequestBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createUpdateRoleRequestBean,
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
* Delete project role
* Deletes a project role. You must specify a replacement project role if you wish to delete a project role that is in use.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the project role to delete. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* swap Long The ID of the project role that will replace the one being deleted. (optional)
* no response value expected for this operation
* */
const deleteProjectRole = ({ id, swap }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        swap,
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
* Fully update project role
* Updates the project role's name and description. You must include both a name and a description in the request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* createUpdateRoleRequestBean CreateUpdateRoleRequestBean 
* returns ProjectRole
* */
const fullyUpdateProjectRole = ({ id, createUpdateRoleRequestBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        createUpdateRoleRequestBean,
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
* Get all project roles
* Gets a list of all project roles, complete with project role details and default actors.  ### About project roles ###  [Project roles](https://confluence.atlassian.com/x/3odKLg) are a flexible way to to associate users and groups with projects. In Jira Cloud, the list of project roles is shared globally with all projects, but each project can have a different set of actors associated with it (unlike groups, which have the same membership throughout all Jira applications).  Project roles are used in [permission schemes](#api-rest-api-3-permissionscheme-get), [email notification schemes](#api-rest-api-3-notificationscheme-get), [issue security levels](#api-rest-api-3-issuesecurityschemes-get), [comment visibility](#api-rest-api-3-comment-list-post), and workflow conditions.  #### Members and actors ####  In the Jira REST API, a member of a project role is called an *actor*. An *actor* is a group or user associated with a project role.  Actors may be set as [default members](https://confluence.atlassian.com/x/3odKLg#Managingprojectroles-Specifying'defaultmembers'foraprojectrole) of the project role or set at the project level:   *  Default actors: Users and groups that are assigned to the project role for all newly created projects. The default actors can be removed at the project level later if desired.  *  Actors: Users and groups that are associated with a project role for a project, which may differ from the default actors. This enables you to assign a user to different roles in different projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* returns List
* */
const getAllProjectRoles = () => new Promise(
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
* Get project role for project
* Returns a project role's details and actors associated with the project. The list of actors is sorted by display name.  To check whether a user belongs to a role based on their group memberships, use [Get user](#api-rest-api-3-user-get) with the `groups` expand parameter selected. Then check whether the user keys and groups match with the actors returned for the project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectIdOrKey String The project ID or project key (case sensitive).
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* excludeInactiveUsers Boolean Exclude inactive users. (optional)
* returns ProjectRole
* */
const getProjectRole = ({ projectIdOrKey, id, excludeInactiveUsers }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        id,
        excludeInactiveUsers,
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
* Get project role by ID
* Gets the project role details and the default actors associated with the role. The list of default actors is sorted by display name.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* returns ProjectRole
* */
const getProjectRoleById = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* Get project role details
* Returns all [project roles](https://confluence.atlassian.com/x/3odKLg) and the details for each role. Note that the list of project roles is common to all projects.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
*
* projectIdOrKey String The project ID or project key (case sensitive).
* currentMember Boolean Whether the roles should be filtered to include only those the user is assigned to. (optional)
* excludeConnectAddons Boolean  (optional)
* returns List
* */
const getProjectRoleDetails = ({ projectIdOrKey, currentMember, excludeConnectAddons }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        currentMember,
        excludeConnectAddons,
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
* Get project roles for project
* Returns a list of [project roles](https://confluence.atlassian.com/x/3odKLg) for the project returning the name and self URL for each role.  Note that all project roles are shared with all projects in Jira Cloud. See [Get all project roles](#api-rest-api-3-role-get) for more information.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for any project on the site or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectIdOrKey String The project ID or project key (case sensitive).
* returns Map
* */
const getProjectRoles = ({ projectIdOrKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
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
* Partial update project role
* Updates either the project role's name or its description.  You cannot update both the name and description at the same time using this operation. If you send a request with a name and a description only the name is updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* createUpdateRoleRequestBean CreateUpdateRoleRequestBean 
* returns ProjectRole
* */
const partialUpdateProjectRole = ({ id, createUpdateRoleRequestBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        createUpdateRoleRequestBean,
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
  createProjectRole,
  deleteProjectRole,
  fullyUpdateProjectRole,
  getAllProjectRoles,
  getProjectRole,
  getProjectRoleById,
  getProjectRoleDetails,
  getProjectRoles,
  partialUpdateProjectRole,
};
