/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create priority
* Creates an issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* createPriorityDetails CreatePriorityDetails 
* returns PriorityId
* */
const createPriority = ({ createPriorityDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createPriorityDetails,
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
* Delete priority
* Deletes an issue priority.  This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the issue priority.
* replaceWith String The ID of the issue priority that will replace the currently selected resolution.
* no response value expected for this operation
* */
const deletePriority = ({ id, replaceWith }) => new Promise(
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
* Get priorities
* Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* returns List
* */
const getPriorities = () => new Promise(
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
* Get priority
* Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* id String The ID of the issue priority.
* returns Priority
* */
const getPriority = ({ id }) => new Promise(
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
* Move priorities
* Changes the order of issue priorities.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* reorderIssuePriorities ReorderIssuePriorities 
* returns oas_any_type_not_mapped
* */
const movePriorities = ({ reorderIssuePriorities }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        reorderIssuePriorities,
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
* Search priorities
* Returns a [paginated](#pagination) list of priorities. The list can contain all priorities or a subset determined by any combination of these criteria:   *  a list of priority IDs. Any invalid priority IDs are ignored.  *  whether the field configuration is a default. This returns priorities from company-managed (classic) projects only, as there is no concept of default priorities in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* startAt String The index of the first item to return in a page of results (page offset). (optional)
* maxResults String The maximum number of items to return per page. (optional)
* id List The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=2&id=3`. (optional)
* onlyDefault Boolean Whether only the default priority is returned. (optional)
* returns PageBeanPriority
* */
const searchPriorities = ({ startAt, maxResults, id, onlyDefault }) => new Promise(
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
* Set default priority
* Sets default issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* setDefaultPriorityRequest SetDefaultPriorityRequest 
* returns oas_any_type_not_mapped
* */
const setDefaultPriority = ({ setDefaultPriorityRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        setDefaultPriorityRequest,
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
* Update priority
* Updates an issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the issue priority.
* updatePriorityDetails UpdatePriorityDetails 
* returns oas_any_type_not_mapped
* */
const updatePriority = ({ id, updatePriorityDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        updatePriorityDetails,
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
  createPriority,
  deletePriority,
  getPriorities,
  getPriority,
  movePriorities,
  searchPriorities,
  setDefaultPriority,
  updatePriority,
};
