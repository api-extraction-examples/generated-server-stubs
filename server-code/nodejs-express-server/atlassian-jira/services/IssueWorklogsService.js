/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Add worklog
* Adds a worklog to an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* issueIdOrKey String The ID or key the issue.
* worklog Worklog 
* notifyUsers Boolean Whether users watching the issue are notified by email. (optional)
* adjustEstimate String Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `manual` Reduces the estimate by amount specified in `reduceBy`.  *  `auto` Reduces the estimate by the value of `timeSpent` in the worklog. (optional)
* newEstimate String The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`. (optional)
* reduceBy String The amount to reduce the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when `adjustEstimate` is `manual`. (optional)
* expand String Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts `properties`, which returns worklog properties. (optional)
* overrideEditableFlag Boolean Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag. (optional)
* returns Worklog
* */
const addWorklog = ({ issueIdOrKey, worklog, notifyUsers, adjustEstimate, newEstimate, reduceBy, expand, overrideEditableFlag }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        worklog,
        notifyUsers,
        adjustEstimate,
        newEstimate,
        reduceBy,
        expand,
        overrideEditableFlag,
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
* Delete worklog
* Deletes a worklog from an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* issueIdOrKey String The ID or key of the issue.
* id String The ID of the worklog.
* notifyUsers Boolean Whether users watching the issue are notified by email. (optional)
* adjustEstimate String Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `manual` Increases the estimate by amount specified in `increaseBy`.  *  `auto` Reduces the estimate by the value of `timeSpent` in the worklog. (optional)
* newEstimate String The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`. (optional)
* increaseBy String The amount to increase the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `manual`. (optional)
* overrideEditableFlag Boolean Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with admin permission can use this flag. (optional)
* no response value expected for this operation
* */
const deleteWorklog = ({ issueIdOrKey, id, notifyUsers, adjustEstimate, newEstimate, increaseBy, overrideEditableFlag }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        id,
        notifyUsers,
        adjustEstimate,
        newEstimate,
        increaseBy,
        overrideEditableFlag,
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
* Get IDs of deleted worklogs
* Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, `until` indicates the timestamp of the youngest item on the page. Also, `nextPage` provides the URL for the next page of worklogs. The `lastPage` parameter is set to true on the last page of worklogs.  This resource does not return worklogs deleted during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira.
*
* since Long The date and time, as a UNIX timestamp in milliseconds, after which deleted worklogs are returned. (optional)
* returns ChangedWorklogs
* */
const getIdsOfWorklogsDeletedSince = ({ since }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        since,
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
* Get IDs of updated worklogs
* Returns a list of IDs and update timestamps for worklogs updated after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, `until` indicates the timestamp of the youngest item on the page. Also, `nextPage` provides the URL for the next page of worklogs. The `lastPage` parameter is set to true on the last page of worklogs.  This resource does not return worklogs updated during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
*
* since Long The date and time, as a UNIX timestamp in milliseconds, after which updated worklogs are returned. (optional)
* expand String Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties` that returns the properties of each worklog. (optional)
* returns ChangedWorklogs
* */
const getIdsOfWorklogsModifiedSince = ({ since, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        since,
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
* Get issue worklogs
* Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Workloads are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* issueIdOrKey String The ID or key of the issue.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* startedAfter Long The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned. (optional)
* startedBefore Long The worklog start date and time, as a UNIX timestamp in milliseconds, before which worklogs are returned. (optional)
* expand String Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts`properties`, which returns worklog properties. (optional)
* returns PageOfWorklogs
* */
const getIssueWorklog = ({ issueIdOrKey, startAt, maxResults, startedAfter, startedBefore, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        startAt,
        maxResults,
        startedAfter,
        startedBefore,
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
* Get worklog
* Returns a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* issueIdOrKey String The ID or key of the issue.
* id String The ID of the worklog.
* expand String Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts  `properties`, which returns worklog properties. (optional)
* returns Worklog
* */
const getWorklog = ({ issueIdOrKey, id, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        id,
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
* Get worklogs
* Returns worklog details for a list of worklog IDs.  The returned list of worklogs is limited to 1000 items.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
*
* worklogIdsRequestBean WorklogIdsRequestBean A JSON object containing a list of worklog IDs.
* expand String Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties` that returns the properties of each worklog. (optional)
* returns List
* */
const getWorklogsForIds = ({ worklogIdsRequestBean, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        worklogIdsRequestBean,
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
* Update worklog
* Updates a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
*
* issueIdOrKey String The ID or key the issue.
* id String The ID of the worklog.
* worklog Worklog 
* notifyUsers Boolean Whether users watching the issue are notified by email. (optional)
* adjustEstimate String Defines how to update the issue's time estimate, the options are:   *  `new` Sets the estimate to a specific value, defined in `newEstimate`.  *  `leave` Leaves the estimate unchanged.  *  `auto` Updates the estimate by the difference between the original and updated value of `timeSpent` or `timeSpentSeconds`. (optional)
* newEstimate String The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when `adjustEstimate` is `new`. (optional)
* expand String Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties`, which returns worklog properties. (optional)
* overrideEditableFlag Boolean Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag. (optional)
* returns Worklog
* */
const updateWorklog = ({ issueIdOrKey, id, worklog, notifyUsers, adjustEstimate, newEstimate, expand, overrideEditableFlag }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueIdOrKey,
        id,
        worklog,
        notifyUsers,
        adjustEstimate,
        newEstimate,
        expand,
        overrideEditableFlag,
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
  addWorklog,
  deleteWorklog,
  getIdsOfWorklogsDeletedSince,
  getIdsOfWorklogsModifiedSince,
  getIssueWorklog,
  getWorklog,
  getWorklogsForIds,
  updateWorklog,
};
