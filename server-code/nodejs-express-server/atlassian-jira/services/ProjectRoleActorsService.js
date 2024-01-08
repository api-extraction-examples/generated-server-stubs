/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add actors to project role
* Adds actors to a project role for the project.  To replace all actors for the project, use [Set actors for project role](#api-rest-api-3-project-projectIdOrKey-role-id-put).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectIdOrKey String The project ID or project key (case sensitive).
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* actorsMap ActorsMap The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group's name can change, use of group ID is recommended.
* returns ProjectRole
* */
const addActorUsers = ({ projectIdOrKey, id, actorsMap }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        id,
        actorsMap,
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
* Add default actors to project role
* Adds [default actors](#api-rest-api-3-resolution-get) to a role. You may add groups or users, but you cannot add groups and users in the same request.  Changing a project role's default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* actorInputBean ActorInputBean 
* returns ProjectRole
* */
const addProjectRoleActorsToRole = ({ id, actorInputBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        actorInputBean,
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
* Delete actors from project role
* Deletes actors from a project role for the project.  To remove default actors from the project role, use [Delete default actors from project role](#api-rest-api-3-role-id-actors-delete).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectIdOrKey String The project ID or project key (case sensitive).
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* user String The user account ID of the user to remove from the project role. (optional)
* group String The name of the group to remove from the project role. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended. (optional)
* groupId String The ID of the group to remove from the project role. This parameter cannot be used with the `group` parameter. (optional)
* no response value expected for this operation
* */
const deleteActor = ({ projectIdOrKey, id, user, group, groupId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        id,
        user,
        group,
        groupId,
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
* Delete default actors from project role
* Deletes the [default actors](#api-rest-api-3-resolution-get) from a project role. You may delete a group or user, but you cannot delete a group and a user in the same request.  Changing a project role's default actors does not affect project role members for projects already created.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* user String The user account ID of the user to remove as a default actor. (optional)
* groupId String The group ID of the group to be removed as a default actor. This parameter cannot be used with the `group` parameter. (optional)
* group String The group name of the group to be removed as a default actor.This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended. (optional)
* returns ProjectRole
* */
const deleteProjectRoleActorsFromRole = ({ id, user, groupId, group }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        user,
        groupId,
        group,
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
* Get default actors for project role
* Returns the [default actors](#api-rest-api-3-resolution-get) for the project role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* returns ProjectRole
* */
const getProjectRoleActorsForRole = ({ id }) => new Promise(
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
* Set actors for project role
* Sets the actors for a project role for a project, replacing all existing actors.  To add actors to the project without overwriting the existing list, use [Add actors to project role](#api-rest-api-3-project-projectIdOrKey-role-id-post).  **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectIdOrKey String The project ID or project key (case sensitive).
* id Long The ID of the project role. Use [Get all project roles](#api-rest-api-3-role-get) to get a list of project role IDs.
* projectRoleActorsUpdateBean ProjectRoleActorsUpdateBean The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group's name can change, use of group ID is recommended.
* returns ProjectRole
* */
const setActors = ({ projectIdOrKey, id, projectRoleActorsUpdateBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        id,
        projectRoleActorsUpdateBean,
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
  addActorUsers,
  addProjectRoleActorsToRole,
  deleteActor,
  deleteProjectRoleActorsFromRole,
  getProjectRoleActorsForRole,
  setActors,
};
