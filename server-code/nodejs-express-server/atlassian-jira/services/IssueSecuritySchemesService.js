/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add issue security levels
* Adds levels and levels' members to the issue security scheme. You can add up to 100 levels per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* schemeId String The ID of the issue security scheme.
* addSecuritySchemeLevelsRequestBean AddSecuritySchemeLevelsRequestBean 
* returns oas_any_type_not_mapped
* */
const addSecurityLevel = ({ schemeId, addSecuritySchemeLevelsRequestBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        schemeId,
        addSecuritySchemeLevelsRequestBean,
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
* Add issue security level members
* Adds members to the issue security level. You can add up to 100 members per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* schemeId String The ID of the issue security scheme.
* levelId String The ID of the issue security level.
* securitySchemeMembersRequest SecuritySchemeMembersRequest 
* returns oas_any_type_not_mapped
* */
const addSecurityLevelMembers = ({ schemeId, levelId, securitySchemeMembersRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        schemeId,
        levelId,
        securitySchemeMembersRequest,
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
* Create issue security scheme
* Creates a security scheme with security scheme levels and levels' members. You can create up to 100 security scheme levels and security scheme levels' members per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* createIssueSecuritySchemeDetails CreateIssueSecuritySchemeDetails 
* returns SecuritySchemeId
* */
const createIssueSecurityScheme = ({ createIssueSecuritySchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createIssueSecuritySchemeDetails,
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
* Delete issue security scheme
* Deletes an issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* schemeId String The ID of the issue security scheme.
* returns oas_any_type_not_mapped
* */
const deleteSecurityScheme = ({ schemeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        schemeId,
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
* Get issue security scheme
* Returns an issue security scheme along with its security levels.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.
*
* id Long The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
* returns SecurityScheme
* */
const getIssueSecurityScheme = ({ id }) => new Promise(
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
* Get issue security schemes
* Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* returns SecuritySchemes
* */
const getIssueSecuritySchemes = () => new Promise(
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
* Get issue security level members
* Returns a [paginated](#pagination) list of issue security level members.  Only issue security level members in the context of classic projects are returned.  Filtering using parameters is inclusive: if you specify both security scheme IDs and level IDs, the result will include all issue security level members from the specified schemes and levels.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt String The index of the first item to return in a page of results (page offset). (optional)
* maxResults String The maximum number of items to return per page. (optional)
* id Set The list of issue security level member IDs. To include multiple issue security level members separate IDs with an ampersand: `id=10000&id=10001`. (optional)
* schemeId Set The list of issue security scheme IDs. To include multiple issue security schemes separate IDs with an ampersand: `schemeId=10000&schemeId=10001`. (optional)
* levelId Set The list of issue security level IDs. To include multiple issue security levels separate IDs with an ampersand: `levelId=10000&levelId=10001`. (optional)
* expand String Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information  *  `field` Returns information about the custom field granted the permission  *  `group` Returns information about the group that is granted the permission  *  `projectRole` Returns information about the project role granted the permission  *  `user` Returns information about the user who is granted the permission (optional)
* returns PageBeanSecurityLevelMember
* */
const getSecurityLevelMembers = ({ startAt, maxResults, id, schemeId, levelId, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        schemeId,
        levelId,
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
* Get issue security levels
* Returns a [paginated](#pagination) list of issue security levels.  Only issue security levels in the context of classic projects are returned.  Filtering using IDs is inclusive: if you specify both security scheme IDs and level IDs, the result will include both specified issue security levels and all issue security levels from the specified schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt String The index of the first item to return in a page of results (page offset). (optional)
* maxResults String The maximum number of items to return per page. (optional)
* id Set The list of issue security scheme level IDs. To include multiple issue security levels, separate IDs with an ampersand: `id=10000&id=10001`. (optional)
* schemeId Set The list of issue security scheme IDs. To include multiple issue security schemes, separate IDs with an ampersand: `schemeId=10000&schemeId=10001`. (optional)
* onlyDefault Boolean When set to true, returns multiple default levels for each security scheme containing a default. If you provide scheme and level IDs not associated with the default, returns an empty page. The default value is false. (optional)
* returns PageBeanSecurityLevel
* */
const getSecurityLevels = ({ startAt, maxResults, id, schemeId, onlyDefault }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        schemeId,
        onlyDefault,
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
* Remove issue security level
* Deletes an issue security level.  This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* schemeId String The ID of the issue security scheme.
* levelId String The ID of the issue security level to remove.
* replaceWith String The ID of the issue security level that will replace the currently selected level. (optional)
* no response value expected for this operation
* */
const removeLevel = ({ schemeId, levelId, replaceWith }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        schemeId,
        levelId,
        replaceWith,
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
* Remove member from issue security level
* Removes an issue security level member from an issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* schemeId String The ID of the issue security scheme.
* levelId String The ID of the issue security level.
* memberId String The ID of the issue security level member to be removed.
* returns oas_any_type_not_mapped
* */
const removeMemberFromSecurityLevel = ({ schemeId, levelId, memberId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        schemeId,
        levelId,
        memberId,
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
* Get projects using issue security schemes
* Returns a [paginated](#pagination) mapping of projects that are using security schemes. You can provide either one or multiple security scheme IDs or project IDs to filter by. If you don't provide any, this will return a list of all mappings. Only issue security schemes in the context of classic projects are supported. **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt String The index of the first item to return in a page of results (page offset). (optional)
* maxResults String The maximum number of items to return per page. (optional)
* issueSecuritySchemeId Set The list of security scheme IDs to be filtered out. (optional)
* projectId Set The list of project IDs to be filtered out. (optional)
* returns PageBeanIssueSecuritySchemeToProjectMapping
* */
const searchProjectsUsingSecuritySchemes = ({ startAt, maxResults, issueSecuritySchemeId, projectId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        issueSecuritySchemeId,
        projectId,
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
* Search issue security schemes
* Returns a [paginated](#pagination) list of issue security schemes.   If you specify the project ID parameter, the result will contain issue security schemes and related project IDs you filter by. Use \\{@link IssueSecuritySchemeResource\\#searchProjectsUsingSecuritySchemes(String, String, Set, Set)\\} to obtain all projects related to scheme.  Only issue security schemes in the context of classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt String The index of the first item to return in a page of results (page offset). (optional)
* maxResults String The maximum number of items to return per page. (optional)
* id Set The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: `id=10000&id=10001`. (optional)
* projectId Set The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: `projectId=10000&projectId=10001`. (optional)
* returns PageBeanSecuritySchemeWithProjects
* */
const searchSecuritySchemes = ({ startAt, maxResults, id, projectId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        projectId,
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
* Set default issue security levels
* Sets default issue security levels for schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* setDefaultLevelsRequest SetDefaultLevelsRequest 
* returns oas_any_type_not_mapped
* */
const setDefaultLevels = ({ setDefaultLevelsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        setDefaultLevelsRequest,
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
* Update issue security scheme
* Updates the issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the issue security scheme.
* updateIssueSecuritySchemeRequestBean UpdateIssueSecuritySchemeRequestBean 
* returns oas_any_type_not_mapped
* */
const updateIssueSecurityScheme = ({ id, updateIssueSecuritySchemeRequestBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        updateIssueSecuritySchemeRequestBean,
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
* Update issue security level
* Updates the issue security level.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* schemeId String The ID of the issue security scheme level belongs to.
* levelId String The ID of the issue security level to update.
* updateIssueSecurityLevelDetails UpdateIssueSecurityLevelDetails 
* returns oas_any_type_not_mapped
* */
const updateSecurityLevel = ({ schemeId, levelId, updateIssueSecurityLevelDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        schemeId,
        levelId,
        updateIssueSecurityLevelDetails,
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
  addSecurityLevel,
  addSecurityLevelMembers,
  createIssueSecurityScheme,
  deleteSecurityScheme,
  getIssueSecurityScheme,
  getIssueSecuritySchemes,
  getSecurityLevelMembers,
  getSecurityLevels,
  removeLevel,
  removeMemberFromSecurityLevel,
  searchProjectsUsingSecuritySchemes,
  searchSecuritySchemes,
  setDefaultLevels,
  updateIssueSecurityScheme,
  updateSecurityLevel,
};
