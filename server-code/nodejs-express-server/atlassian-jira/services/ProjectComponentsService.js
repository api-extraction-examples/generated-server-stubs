/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create component
* Creates a component. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* projectComponent ProjectComponent 
* returns ProjectComponent
* */
const createComponent = ({ projectComponent }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectComponent,
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
* Delete component
* Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the component.
* moveIssuesTo String The ID of the component to replace the deleted component. If this value is null no replacement is made. (optional)
* no response value expected for this operation
* */
const deleteComponent = ({ id, moveIssuesTo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        moveIssuesTo,
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
* Get component
* Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.
*
* id String The ID of the component.
* returns ProjectComponent
* */
const getComponent = ({ id }) => new Promise(
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
* Get component issues count
* Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* id String The ID of the component.
* returns ComponentIssuesCount
* */
const getComponentRelatedIssues = ({ id }) => new Promise(
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
* Get project components
* Returns all components in a project. See the [Get project components paginated](#api-rest-api-3-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
*
* projectIdOrKey String The project ID or project key (case sensitive).
* returns List
* */
const getProjectComponents = ({ projectIdOrKey }) => new Promise(
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
* Get project components paginated
* Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-3-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
*
* projectIdOrKey String The project ID or project key (case sensitive).
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* orderBy String [Order](#ordering) the results by a field:   *  `description` Sorts by the component description.  *  `issueCount` Sorts by the count of issues associated with the component.  *  `lead` Sorts by the user key of the component's project lead.  *  `name` Sorts by component name. (optional)
* query String Filter the results using a literal string. Components with a matching `name` or `description` are returned (case insensitive). (optional)
* returns PageBeanComponentWithIssueCount
* */
const getProjectComponentsPaginated = ({ projectIdOrKey, startAt, maxResults, orderBy, query }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectIdOrKey,
        startAt,
        maxResults,
        orderBy,
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
* Update component
* Updates a component. Any fields included in the request are overwritten. If `leadAccountId` is an empty string (\"\") the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id String The ID of the component.
* projectComponent ProjectComponent 
* returns ProjectComponent
* */
const updateComponent = ({ id, projectComponent }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        projectComponent,
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
  createComponent,
  deleteComponent,
  getComponent,
  getComponentRelatedIssues,
  getProjectComponents,
  getProjectComponentsPaginated,
  updateComponent,
};
