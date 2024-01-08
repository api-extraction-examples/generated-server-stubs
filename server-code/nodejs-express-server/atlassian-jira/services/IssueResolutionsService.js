/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create resolution
* Creates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* createResolutionDetails CreateResolutionDetails 
* returns ResolutionId
* */
const createResolution = ({ createResolutionDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createResolutionDetails,
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
* Delete resolution
* Deletes an issue resolution.  This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the issue resolution.
* replaceWith String The ID of the issue resolution that will replace the currently selected resolution.
* no response value expected for this operation
* */
const deleteResolution = ({ id, replaceWith }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* Get resolution
* Returns an issue resolution value.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* id String The ID of the issue resolution value.
* returns Resolution
* */
const getResolution = ({ id }) => new Promise(
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
* Get resolutions
* Returns a list of all issue resolution values.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* returns List
* */
const getResolutions = () => new Promise(
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
* Move resolutions
* Changes the order of issue resolutions.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* reorderIssueResolutionsRequest ReorderIssueResolutionsRequest 
* returns oas_any_type_not_mapped
* */
const moveResolutions = ({ reorderIssueResolutionsRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        reorderIssueResolutionsRequest,
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
* Search resolutions
* Returns a [paginated](#pagination) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:   *  a list of resolutions IDs.  *  whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* startAt String The index of the first item to return in a page of results (page offset). (optional)
* maxResults String The maximum number of items to return per page. (optional)
* id List The list of resolutions IDs to be filtered out (optional)
* onlyDefault Boolean When set to true, return default only, when IDs provided, if none of them is default, return empty page. Default value is false (optional)
* returns PageBeanResolutionJsonBean
* */
const searchResolutions = ({ startAt, maxResults, id, onlyDefault }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
        id,
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
* Set default resolution
* Sets default issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* setDefaultResolutionRequest SetDefaultResolutionRequest 
* returns oas_any_type_not_mapped
* */
const setDefaultResolution = ({ setDefaultResolutionRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        setDefaultResolutionRequest,
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
* Update resolution
* Updates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the issue resolution.
* updateResolutionDetails UpdateResolutionDetails 
* returns oas_any_type_not_mapped
* */
const updateResolution = ({ id, updateResolutionDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        updateResolutionDetails,
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
  createResolution,
  deleteResolution,
  getResolution,
  getResolutions,
  moveResolutions,
  searchResolutions,
  setDefaultResolution,
  updateResolution,
};
