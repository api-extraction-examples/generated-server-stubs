/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add issue types to issue type scheme
* Adds issue types to an issue type scheme.  The added issue types are appended to the issue types list.  If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeSchemeId Long The ID of the issue type scheme.
* issueTypeIds IssueTypeIds 
* returns oas_any_type_not_mapped
* */
const addIssueTypesToIssueTypeScheme = ({ issueTypeSchemeId, issueTypeIds }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeSchemeId,
        issueTypeIds,
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
* Assign issue type scheme to project
* Assigns an issue type scheme to a project.  If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.  Issue type schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeSchemeProjectAssociation IssueTypeSchemeProjectAssociation 
* returns oas_any_type_not_mapped
* */
const assignIssueTypeSchemeToProject = ({ issueTypeSchemeProjectAssociation }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeSchemeProjectAssociation,
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
* Create issue type scheme
* Creates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeSchemeDetails IssueTypeSchemeDetails 
* returns IssueTypeSchemeID
* */
const createIssueTypeScheme = ({ issueTypeSchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeSchemeDetails,
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
* Delete issue type scheme
* Deletes an issue type scheme.  Only issue type schemes used in classic projects can be deleted.  Any projects assigned to the scheme are reassigned to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeSchemeId Long The ID of the issue type scheme.
* returns oas_any_type_not_mapped
* */
const deleteIssueTypeScheme = ({ issueTypeSchemeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeSchemeId,
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
* Get all issue type schemes
* Returns a [paginated](#pagination) list of issue type schemes.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* id Set The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`. (optional)
* orderBy String [Order](#ordering) the results by a field:   *  `name` Sorts by issue type scheme name.  *  `id` Sorts by issue type scheme ID. (optional)
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `projects` For each issue type schemes, returns information about the projects the issue type scheme is assigned to.  *  `issueTypes` For each issue type schemes, returns information about the issueTypes the issue type scheme have. (optional)
* queryString String String used to perform a case-insensitive partial match with issue type scheme name. (optional)
* returns PageBeanIssueTypeScheme
* */
const getAllIssueTypeSchemes = ({ startAt, maxResults, id, orderBy, expand, queryString }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        orderBy,
        expand,
        queryString,
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
* Get issue type schemes for projects
* Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectId Set The list of project IDs. To include multiple project IDs, provide an ampersand-separated list. For example, `projectId=10000&projectId=10001`.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageBeanIssueTypeSchemeProjects
* */
const getIssueTypeSchemeForProjects = ({ projectId, startAt, maxResults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectId,
        startAt,
        maxResults,
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
* Get issue type scheme items
* Returns a [paginated](#pagination) list of issue type scheme items.  Only issue type scheme items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* issueTypeSchemeId Set The list of issue type scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `issueTypeSchemeId=10000&issueTypeSchemeId=10001`. (optional)
* returns PageBeanIssueTypeSchemeMapping
* */
const getIssueTypeSchemesMapping = ({ startAt, maxResults, issueTypeSchemeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        issueTypeSchemeId,
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
* Remove issue type from issue type scheme
* Removes an issue type from an issue type scheme.  This operation cannot remove:   *  any issue type used by issues.  *  any issue types from the default issue type scheme.  *  the last standard issue type from an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeSchemeId Long The ID of the issue type scheme.
* issueTypeId Long The ID of the issue type.
* returns oas_any_type_not_mapped
* */
const removeIssueTypeFromIssueTypeScheme = ({ issueTypeSchemeId, issueTypeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeSchemeId,
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
* Change order of issue types
* Changes the order of issue types in an issue type scheme.  The request body parameters must meet the following requirements:   *  all of the issue types must belong to the issue type scheme.  *  either `after` or `position` must be provided.  *  the issue type in `after` must not be in the issue type list.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeSchemeId Long The ID of the issue type scheme.
* orderOfIssueTypes OrderOfIssueTypes 
* returns oas_any_type_not_mapped
* */
const reorderIssueTypesInIssueTypeScheme = ({ issueTypeSchemeId, orderOfIssueTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeSchemeId,
        orderOfIssueTypes,
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
* Update issue type scheme
* Updates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeSchemeId Long The ID of the issue type scheme.
* issueTypeSchemeUpdateDetails IssueTypeSchemeUpdateDetails 
* returns oas_any_type_not_mapped
* */
const updateIssueTypeScheme = ({ issueTypeSchemeId, issueTypeSchemeUpdateDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeSchemeId,
        issueTypeSchemeUpdateDetails,
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
  addIssueTypesToIssueTypeScheme,
  assignIssueTypeSchemeToProject,
  createIssueTypeScheme,
  deleteIssueTypeScheme,
  getAllIssueTypeSchemes,
  getIssueTypeSchemeForProjects,
  getIssueTypeSchemesMapping,
  removeIssueTypeFromIssueTypeScheme,
  reorderIssueTypesInIssueTypeScheme,
  updateIssueTypeScheme,
};
