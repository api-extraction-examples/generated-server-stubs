/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get issue picker suggestions
* Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.  This operation returns two lists:   *  `History Search` which includes issues from the user's history of created, edited, or viewed issues that contain the string in the `query` parameter.  *  `Current Search` which includes issues that match the JQL expression in `currentJQL` and contain the string in the `query` parameter.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* query String A string to match against text fields in the issue such as title, description, or comments. (optional)
* currentJQL String A JQL query defining a list of issues to search for the query term. Note that `username` and `userkey` cannot be used as search terms for this parameter, due to privacy reasons. Use `accountId` instead. (optional)
* currentIssueKey String The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query. (optional)
* currentProjectId String The ID of a project that suggested issues must belong to. (optional)
* showSubTasks Boolean Indicate whether to include subtasks in the suggestions list. (optional)
* showSubTaskParent Boolean When `currentIssueKey` is a subtask, whether to include the parent issue in the suggestions if it matches the query. (optional)
* returns IssuePickerSuggestions
* */
const getIssuePickerResource = ({ query, currentJQL, currentIssueKey, currentProjectId, showSubTasks, showSubTaskParent }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        query,
        currentJQL,
        currentIssueKey,
        currentProjectId,
        showSubTasks,
        showSubTaskParent,
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
* Check issues against JQL
* Checks whether one or more issues would be returned by one or more JQL queries.  **[Permissions](#permissions) required:** None, however, issues are only matched against JQL queries where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* issuesAndJQLQueries IssuesAndJQLQueries 
* returns IssueMatches
* */
const matchIssues = ({ issuesAndJQLQueries }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issuesAndJQLQueries,
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
* Search for issues using JQL (GET)
* Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  If the JQL query expression is too large to be encoded as a query parameter, use the [POST](#api-rest-api-3-search-post) version of this resource.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* jql String The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  `username` and `userkey` cannot be used as search terms due to privacy reasons. Use `accountId` instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required. (optional)
* startAt Integer The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting `id` or `key` only. (optional)
* validateQuery String Determines how to validate the JQL query and treat the validation results. Supported values are:   *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  `warn` Returns all errors as warnings.  *  `none` No validation is performed.  *  `true` *Deprecated* A legacy synonym for `strict`.  *  `false` *Deprecated* A legacy synonym for `warn`.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value. (optional)
* fields List A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  `*all` Returns all fields.  *  `*navigable` Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  `summary,comment` Returns only the summary and comments fields.  *  `-description` Returns all navigable (default) fields except description.  *  `*all,-comment` Returns all fields except comments.  This parameter may be specified multiple times. For example, `fields=field1,field2&fields=field3`.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields. (optional)
* expand String Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  `renderedFields` Returns field values rendered in HTML format.  *  `names` Returns the display name of each field.  *  `schema` Returns the schema describing a field type.  *  `transitions` Returns all possible transitions for the issue.  *  `operations` Returns all possible operations for the issue.  *  `editmeta` Returns information about how each field can be edited.  *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version. (optional)
* properties List A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, `properties=prop1,prop2&properties=prop3`. A maximum of 5 issue property keys can be specified. (optional)
* fieldsByKeys Boolean Reference fields by their key (rather than ID). (optional)
* returns SearchResults
* */
const searchForIssuesUsingJql = ({ jql, startAt, maxResults, validateQuery, fields, expand, properties, fieldsByKeys }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        jql,
        startAt,
        maxResults,
        validateQuery,
        fields,
        expand,
        properties,
        fieldsByKeys,
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
* Search for issues using JQL (POST)
* Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).  There is a [GET](#api-rest-api-3-search-get) version of this resource that can be used for smaller JQL query expressions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Issues are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
*
* searchRequestBean SearchRequestBean A JSON object containing the search request.
* returns SearchResults
* */
const searchForIssuesUsingJqlPost = ({ searchRequestBean }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        searchRequestBean,
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
  getIssuePickerResource,
  matchIssues,
  searchForIssuesUsingJql,
  searchForIssuesUsingJqlPost,
};
