/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Append mappings to issue type screen scheme
* Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeScreenSchemeId String The ID of the issue type screen scheme.
* issueTypeScreenSchemeMappingDetails IssueTypeScreenSchemeMappingDetails 
* returns oas_any_type_not_mapped
* */
const appendMappingsForIssueTypeScreenScheme = ({ issueTypeScreenSchemeId, issueTypeScreenSchemeMappingDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeScreenSchemeId,
        issueTypeScreenSchemeMappingDetails,
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
* Assign issue type screen scheme to project
* Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeScreenSchemeProjectAssociation IssueTypeScreenSchemeProjectAssociation 
* returns oas_any_type_not_mapped
* */
const assignIssueTypeScreenSchemeToProject = ({ issueTypeScreenSchemeProjectAssociation }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeScreenSchemeProjectAssociation,
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
* Create issue type screen scheme
* Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeScreenSchemeDetails IssueTypeScreenSchemeDetails An issue type screen scheme bean.
* returns IssueTypeScreenSchemeId
* */
const createIssueTypeScreenScheme = ({ issueTypeScreenSchemeDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeScreenSchemeDetails,
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
* Delete issue type screen scheme
* Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeScreenSchemeId String The ID of the issue type screen scheme.
* returns oas_any_type_not_mapped
* */
const deleteIssueTypeScreenScheme = ({ issueTypeScreenSchemeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeScreenSchemeId,
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
* Get issue type screen scheme items
* Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* issueTypeScreenSchemeId Set The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: `issueTypeScreenSchemeId=10000&issueTypeScreenSchemeId=10001`. (optional)
* returns PageBeanIssueTypeScreenSchemeItem
* */
const getIssueTypeScreenSchemeMappings = ({ startAt, maxResults, issueTypeScreenSchemeId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        issueTypeScreenSchemeId,
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
* Get issue type screen schemes for projects
* Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectId Set The list of project IDs. To include multiple projects, separate IDs with ampersand: `projectId=10000&projectId=10001`.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageBeanIssueTypeScreenSchemesProjects
* */
const getIssueTypeScreenSchemeProjectAssociations = ({ projectId, startAt, maxResults }) => new Promise(
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
* Get issue type screen schemes
* Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* id Set The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&id=10001`. (optional)
* queryString String String used to perform a case-insensitive partial match with issue type screen scheme name. (optional)
* orderBy String [Order](#ordering) the results by a field:   *  `name` Sorts by issue type screen scheme name.  *  `id` Sorts by issue type screen scheme ID. (optional)
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts `projects` that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to. (optional)
* returns PageBeanIssueTypeScreenScheme
* */
const getIssueTypeScreenSchemes = ({ startAt, maxResults, id, queryString, orderBy, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
        queryString,
        orderBy,
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
* Get issue type screen scheme projects
* Returns a [paginated](#pagination) list of projects associated with an issue type screen scheme.  Only company-managed projects associated with an issue type screen scheme are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeScreenSchemeId Long The ID of the issue type screen scheme.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* query String  (optional)
* returns PageBeanProjectDetails
* */
const getProjectsForIssueTypeScreenScheme = ({ issueTypeScreenSchemeId, startAt, maxResults, query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeScreenSchemeId,
        startAt,
        maxResults,
        query,
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
* Remove mappings from issue type screen scheme
* Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeScreenSchemeId String The ID of the issue type screen scheme.
* issueTypeIds IssueTypeIds 
* returns oas_any_type_not_mapped
* */
const removeMappingsFromIssueTypeScreenScheme = ({ issueTypeScreenSchemeId, issueTypeIds }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeScreenSchemeId,
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
* Update issue type screen scheme default screen scheme
* Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeScreenSchemeId String The ID of the issue type screen scheme.
* updateDefaultScreenScheme UpdateDefaultScreenScheme 
* returns oas_any_type_not_mapped
* */
const updateDefaultScreenScheme = ({ issueTypeScreenSchemeId, updateDefaultScreenScheme }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeScreenSchemeId,
        updateDefaultScreenScheme,
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
* Update issue type screen scheme
* Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueTypeScreenSchemeId String The ID of the issue type screen scheme.
* issueTypeScreenSchemeUpdateDetails IssueTypeScreenSchemeUpdateDetails The issue type screen scheme update details.
* returns oas_any_type_not_mapped
* */
const updateIssueTypeScreenScheme = ({ issueTypeScreenSchemeId, issueTypeScreenSchemeUpdateDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueTypeScreenSchemeId,
        issueTypeScreenSchemeUpdateDetails,
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
  appendMappingsForIssueTypeScreenScheme,
  assignIssueTypeScreenSchemeToProject,
  createIssueTypeScreenScheme,
  deleteIssueTypeScreenScheme,
  getIssueTypeScreenSchemeMappings,
  getIssueTypeScreenSchemeProjectAssociations,
  getIssueTypeScreenSchemes,
  getProjectsForIssueTypeScreenScheme,
  removeMappingsFromIssueTypeScreenScheme,
  updateDefaultScreenScheme,
  updateIssueTypeScreenScheme,
};
