/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Bulk create statuses
* Creates statuses for a global or project scope.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
*
* statusCreateRequest StatusCreateRequest Details of the statuses being created and their scope.
* returns List
* */
const createStatuses = ({ statusCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        statusCreateRequest,
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
* Bulk delete Statuses
* Deletes statuses by ID.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
*
* id List The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&id=10001.  Min items `1`, Max items `50` (optional)
* returns oas_any_type_not_mapped
* */
const deleteStatusesById = ({ id }) => new Promise(
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
* Bulk get statuses
* Returns a list of the statuses specified by one or more status IDs.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
*
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `usages` Returns the project and issue types that use the status in their workflow. (optional)
* id List The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&id=10001.  Min items `1`, Max items `50` (optional)
* returns List
* */
const getStatusesById = ({ expand, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        expand,
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
* Search statuses paginated
* Returns a [paginated](https://developer.atlassian.com/cloud/jira/platform/rest/v3/intro/#pagination) list of statuses that match a search on name or project.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
*
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `usages` Returns the project and issue types that use the status in their workflow. (optional)
* projectId String The project the status is part of or null for global statuses. (optional)
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* searchString String Term to match status names against or null to search for all statuses in the search scope. (optional)
* statusCategory String Category of the status to filter by. The supported values are: `TODO`, `IN_PROGRESS`, and `DONE`. (optional)
* returns PageOfStatuses
* */
const search = ({ expand, projectId, startAt, maxResults, searchString, statusCategory }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        expand,
        projectId,
        startAt,
        maxResults,
        searchString,
        statusCategory,
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
* Bulk update statuses
* Updates statuses by ID.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
*
* statusUpdateRequest StatusUpdateRequest The list of statuses that will be updated.
* returns oas_any_type_not_mapped
* */
const updateStatuses = ({ statusUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        statusUpdateRequest,
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
  createStatuses,
  deleteStatusesById,
  getStatusesById,
  search,
  updateStatuses,
};
