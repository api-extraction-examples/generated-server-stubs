/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add a custom field to a project
* Custom fields are associated with projects by way of custom field settings.  This method creates a setting for the project.
*
* projectUnderscoregid String Globally unique identifier for the project.
* addCustomFieldSettingForPortfolioRequest AddCustomFieldSettingForPortfolioRequest Information about the custom field setting.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* returns addCustomFieldSettingForPortfolio_200_response
* */
const addCustomFieldSettingForProject = ({ projectUnderscoregid, addCustomFieldSettingForPortfolioRequest, optUnderscorepretty }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        addCustomFieldSettingForPortfolioRequest,
        optUnderscorepretty,
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
* Add followers to a project
* Adds the specified list of users as followers to the project. Followers are a subset of members who have opted in to receive \"tasks added\" notifications for a project. Therefore, if the users are not already members of the project, they will also become members as a result of this operation. Returns the updated project record.
*
* projectUnderscoregid String Globally unique identifier for the project.
* addFollowersForProjectRequest AddFollowersForProjectRequest Information about the followers being added.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const addFollowersForProject = ({ projectUnderscoregid, addFollowersForProjectRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        addFollowersForProjectRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Add users to a project
* Adds the specified list of users as members of the project. Note that a user being added as a member may also be added as a *follower* as a result of this operation. This is because the user's default notification settings (i.e., in the \"Notifcations\" tab of \"My Profile Settings\") will override this endpoint's default behavior of setting \"Tasks added\" notifications to `false`. Returns the updated project record.
*
* projectUnderscoregid String Globally unique identifier for the project.
* addMembersForPortfolioRequest AddMembersForPortfolioRequest Information about the members being added.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const addMembersForProject = ({ projectUnderscoregid, addMembersForPortfolioRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        addMembersForPortfolioRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Create a project
* Create a new project in a workspace or team.  Every project is required to be created in a specific workspace or organization, and this cannot be changed once set. Note that you can use the `workspace` parameter regardless of whether or not it is an organization.  If the workspace for your project is an organization, you must also supply a `team` to share the project with.  Returns the full record of the newly created project.
*
* createProjectRequest CreateProjectRequest The project to create.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const createProject = ({ createProjectRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createProjectRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Create a project in a team
* Creates a project shared with the given team.  Returns the full record of the newly created project.
*
* teamUnderscoregid String Globally unique identifier for the team.
* createProjectRequest CreateProjectRequest The new project to create.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const createProjectForTeam = ({ teamUnderscoregid, createProjectRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamUnderscoregid,
        createProjectRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Create a project in a workspace
* Returns the compact project records for all projects in the workspace.  If the workspace for your project is an organization, you must also supply a team to share the project with.  Returns the full record of the newly created project.
*
* workspaceUnderscoregid String Globally unique identifier for the workspace or organization.
* createProjectRequest CreateProjectRequest The new project to create.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const createProjectForWorkspace = ({ workspaceUnderscoregid, createProjectRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspaceUnderscoregid,
        createProjectRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Delete a project
* A specific, existing project can be deleted by making a DELETE request on the URL for that project.  Returns an empty data record.
*
* projectUnderscoregid String Globally unique identifier for the project.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const deleteProject = ({ projectUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
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
* Duplicate a project
* Creates and returns a job that will asynchronously handle the duplication.
*
* projectUnderscoregid String Globally unique identifier for the project.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* duplicateProjectRequest DuplicateProjectRequest Describes the duplicate's name and the elements that will be duplicated. (optional)
* returns getJob_200_response
* */
const duplicateProject = ({ projectUnderscoregid, optUnderscorepretty, optUnderscorefields, duplicateProjectRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        duplicateProjectRequest,
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
* Get a project
* Returns the complete project record for a single project.
*
* projectUnderscoregid String Globally unique identifier for the project.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const getProject = ({ projectUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
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
* Get multiple projects
* Returns the compact project records for some filtered set of projects. Use one or more of the parameters provided to filter the projects returned. *Note: This endpoint may timeout for large domains. Try filtering by team!*
*
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* workspace String The workspace or organization to filter projects on. (optional)
* team String The team to filter projects on. (optional)
* archived Boolean Only return projects whose `archived` field takes on the value of this parameter. (optional)
* returns getItemsForPortfolio_200_response
* */
const getProjects = ({ optUnderscorepretty, optUnderscorefields, limit, offset, workspace, team, archived }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
        workspace,
        team,
        archived,
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
* Get projects a task is in
* Returns a compact representation of all of the projects the task is in.
*
* taskUnderscoregid String The task to operate on.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getItemsForPortfolio_200_response
* */
const getProjectsForTask = ({ taskUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        taskUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Get a team's projects
* Returns the compact project records for all projects in the team.
*
* teamUnderscoregid String Globally unique identifier for the team.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* archived Boolean Only return projects whose `archived` field takes on the value of this parameter. (optional)
* returns getItemsForPortfolio_200_response
* */
const getProjectsForTeam = ({ teamUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset, archived }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        teamUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
        archived,
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
* Get all projects in a workspace
* Returns the compact project records for all projects in the workspace. *Note: This endpoint may timeout for large domains. Prefer the `/teams/{team_gid}/projects` endpoint.*
*
* workspaceUnderscoregid String Globally unique identifier for the workspace or organization.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* archived Boolean Only return projects whose `archived` field takes on the value of this parameter. (optional)
* returns getItemsForPortfolio_200_response
* */
const getProjectsForWorkspace = ({ workspaceUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset, archived }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspaceUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
        archived,
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
* Get task count of a project
* Get an object that holds task count fields. **All fields are excluded by default**. You must [opt in](/docs/input-output-options) using `opt_fields` to get any information from this endpoint.  This endpoint has an additional [rate limit](/docs/standard-rate-limits) and each field counts especially high against our [cost limits](/docs/cost-limits).  Milestones are just tasks, so they are included in the `num_tasks`, `num_incomplete_tasks`, and `num_completed_tasks` counts.
*
* projectUnderscoregid String Globally unique identifier for the project.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* returns getTaskCountsForProject_200_response
* */
const getTaskCountsForProject = ({ projectUnderscoregid, optUnderscorepretty, optUnderscorefields, limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
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
* Create a project template from a project
* Creates and returns a job that will asynchronously handle the project template creation. Note that while the resulting project template can be accessed with the API, it won't be visible in the Asana UI until Project Templates 2.0 is launched in the app. See more in [this forum post](https://forum.asana.com/t/a-new-api-for-project-templates/156432).
*
* projectUnderscoregid String Globally unique identifier for the project.
* projectSaveAsTemplateRequest ProjectSaveAsTemplateRequest Describes the inputs used for creating a project template, such as the resulting project template's name, which team it should be created in.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns getJob_200_response
* */
const projectSaveAsTemplate = ({ projectUnderscoregid, projectSaveAsTemplateRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        projectSaveAsTemplateRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Remove a custom field from a project
* Removes a custom field setting from a project.
*
* projectUnderscoregid String Globally unique identifier for the project.
* removeCustomFieldSettingForPortfolioRequest RemoveCustomFieldSettingForPortfolioRequest Information about the custom field setting being removed.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* returns deleteAttachment_200_response
* */
const removeCustomFieldSettingForProject = ({ projectUnderscoregid, removeCustomFieldSettingForPortfolioRequest, optUnderscorepretty }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        removeCustomFieldSettingForPortfolioRequest,
        optUnderscorepretty,
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
* Remove followers from a project
* Removes the specified list of users from following the project, this will not affect project membership status. Returns the updated project record.
*
* projectUnderscoregid String Globally unique identifier for the project.
* removeFollowersForProjectRequest RemoveFollowersForProjectRequest Information about the followers being removed.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const removeFollowersForProject = ({ projectUnderscoregid, removeFollowersForProjectRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        removeFollowersForProjectRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Remove users from a project
* Removes the specified list of users from members of the project. Returns the updated project record.
*
* projectUnderscoregid String Globally unique identifier for the project.
* removeMembersForPortfolioRequest RemoveMembersForPortfolioRequest Information about the members being removed.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const removeMembersForProject = ({ projectUnderscoregid, removeMembersForPortfolioRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        removeMembersForPortfolioRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Update a project
* A specific, existing project can be updated by making a PUT request on the URL for that project. Only the fields provided in the `data` block will be updated; any unspecified fields will remain unchanged.  When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the task.  Returns the complete updated project record.
*
* projectUnderscoregid String Globally unique identifier for the project.
* createProjectRequest CreateProjectRequest The updated fields for the project.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createProject_201_response
* */
const updateProject = ({ projectUnderscoregid, createProjectRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoregid,
        createProjectRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
  addCustomFieldSettingForProject,
  addFollowersForProject,
  addMembersForProject,
  createProject,
  createProjectForTeam,
  createProjectForWorkspace,
  deleteProject,
  duplicateProject,
  getProject,
  getProjects,
  getProjectsForTask,
  getProjectsForTeam,
  getProjectsForWorkspace,
  getTaskCountsForProject,
  projectSaveAsTemplate,
  removeCustomFieldSettingForProject,
  removeFollowersForProject,
  removeMembersForProject,
  updateProject,
};
