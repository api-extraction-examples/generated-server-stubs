/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get issue security level
* Returns details of an issue security level.  Use [Get issue security scheme](#api-rest-api-3-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
*
* id String The ID of the issue security level.
* returns SecurityLevel
* */
const getIssueSecurityLevel = ({ id }) => new Promise(
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
* Get issue security level members
* Returns issue security level members.  Only issue security level members in context of classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* issueSecuritySchemeId Long The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* issueSecurityLevelId Set The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: `issueSecurityLevelId=10000&issueSecurityLevelId=10001`. (optional)
* expand String Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `all` Returns all expandable information.  *  `field` Returns information about the custom field granted the permission.  *  `group` Returns information about the group that is granted the permission.  *  `projectRole` Returns information about the project role granted the permission.  *  `user` Returns information about the user who is granted the permission. (optional)
* returns PageBeanIssueSecurityLevelMember
* */
const getIssueSecurityLevelMembers = ({ issueSecuritySchemeId, startAt, maxResults, issueSecurityLevelId, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        issueSecuritySchemeId,
        startAt,
        maxResults,
        issueSecurityLevelId,
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

module.exports = {
  getIssueSecurityLevel,
  getIssueSecurityLevelMembers,
};
