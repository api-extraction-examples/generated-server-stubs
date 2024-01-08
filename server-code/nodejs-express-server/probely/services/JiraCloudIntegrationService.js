/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List Jira Projects
*
* returns List
* */
const integrationsJiraCloudProjectsGET = () => new Promise(
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
* Retrieve project issue types
*
* projectUnderscoreid String Jira Project Id
* returns List
* */
const integrationsJiraCloudProjectsProjectIdIssueTypesGET = ({ projectUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
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
* Retrieve issue priorities
*
* projectUnderscoreid String Jira Project Id
* issueUnderscoretypeUnderscoreid String Jira issue type id
* returns List
* */
const integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET = ({ projectUnderscoreid, issueUnderscoretypeUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        issueUnderscoretypeUnderscoreid,
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
* Retrieve issue statuses
*
* projectUnderscoreid String Jira Project Id
* issueUnderscoretypeUnderscoreid String Jira issue type id
* returns List
* */
const integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdStatusGET = ({ projectUnderscoreid, issueUnderscoretypeUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        projectUnderscoreid,
        issueUnderscoretypeUnderscoreid,
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
* Retrieve Jira Cloud finding configuration
*
* targetUnderscoreid String Target id
* id String Object Id
* returns JiraFinding
* */
const targetsTargetIdFindingsIdIntegrationsJiraCloudGET = ({ targetUnderscoreid, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Update Jira Cloud finding configuration
*
* targetUnderscoreid String Target id
* id String Object Id
* jiraFinding JiraFinding 
* returns JiraFinding
* */
const targetsTargetIdFindingsIdIntegrationsJiraCloudPATCH = ({ targetUnderscoreid, id, jiraFinding }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        jiraFinding,
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
* Update Jira Cloud finding configuration
*
* targetUnderscoreid String Target id
* id String Object Id
* jiraFinding JiraFinding 
* returns JiraFinding
* */
const targetsTargetIdFindingsIdIntegrationsJiraCloudPUT = ({ targetUnderscoreid, id, jiraFinding }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        id,
        jiraFinding,
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
* Retrieve Jira Cloud Target configuration
*
* targetUnderscoreid String Target id
* returns JiraScope
* */
const targetsTargetIdIntegrationsJiraCloudGET = ({ targetUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
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
* Update Jira Cloud target configuration
*
* targetUnderscoreid String Target id
* jiraScope JiraScope 
* returns JiraScope
* */
const targetsTargetIdIntegrationsJiraCloudPATCH = ({ targetUnderscoreid, jiraScope }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        jiraScope,
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
* Update Jira Cloud target configuration
*
* targetUnderscoreid String Target id
* jiraScope JiraScope 
* returns JiraScope
* */
const targetsTargetIdIntegrationsJiraCloudPUT = ({ targetUnderscoreid, jiraScope }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        targetUnderscoreid,
        jiraScope,
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
  integrationsJiraCloudProjectsGET,
  integrationsJiraCloudProjectsProjectIdIssueTypesGET,
  integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET,
  integrationsJiraCloudProjectsProjectIdIssueTypesIssueTypeIdStatusGET,
  targetsTargetIdFindingsIdIntegrationsJiraCloudGET,
  targetsTargetIdFindingsIdIntegrationsJiraCloudPATCH,
  targetsTargetIdFindingsIdIntegrationsJiraCloudPUT,
  targetsTargetIdIntegrationsJiraCloudGET,
  targetsTargetIdIntegrationsJiraCloudPATCH,
  targetsTargetIdIntegrationsJiraCloudPUT,
};
