/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List Jira Projects
*
* returns List
* */
const integrationsJiraServerProjectsGET = () => new Promise(
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
const integrationsJiraServerProjectsProjectIdIssueTypesGET = ({ projectUnderscoreid }) => new Promise(
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
const integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET = ({ projectUnderscoreid, issueUnderscoretypeUnderscoreid }) => new Promise(
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
const integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdStatusGET = ({ projectUnderscoreid, issueUnderscoretypeUnderscoreid }) => new Promise(
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
* Retrieve Jira Server finding configuration
*
* targetUnderscoreid String Target id
* id String Object Id
* returns JiraFinding
* */
const targetsTargetIdFindingsIdIntegrationsJiraServerGET = ({ targetUnderscoreid, id }) => new Promise(
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
* Update Jira Server finding configuration
*
* targetUnderscoreid String Target id
* id String Object Id
* jiraFinding JiraFinding 
* returns JiraFinding
* */
const targetsTargetIdFindingsIdIntegrationsJiraServerPATCH = ({ targetUnderscoreid, id, jiraFinding }) => new Promise(
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
* Update Jira Server finding configuration
*
* targetUnderscoreid String Target id
* id String Object Id
* jiraFinding JiraFinding 
* returns JiraFinding
* */
const targetsTargetIdFindingsIdIntegrationsJiraServerPUT = ({ targetUnderscoreid, id, jiraFinding }) => new Promise(
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
* Retrieve Jira Server Target configuration
*
* targetUnderscoreid String Target id
* returns JiraScope
* */
const targetsTargetIdIntegrationsJiraServerGET = ({ targetUnderscoreid }) => new Promise(
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
* Update Jira Server target configuration
*
* targetUnderscoreid String Target id
* jiraScope JiraScope 
* returns JiraScope
* */
const targetsTargetIdIntegrationsJiraServerPATCH = ({ targetUnderscoreid, jiraScope }) => new Promise(
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
* Update Jira Server target configuration
*
* targetUnderscoreid String Target id
* jiraScope JiraScope 
* returns JiraScope
* */
const targetsTargetIdIntegrationsJiraServerPUT = ({ targetUnderscoreid, jiraScope }) => new Promise(
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
  integrationsJiraServerProjectsGET,
  integrationsJiraServerProjectsProjectIdIssueTypesGET,
  integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdPrioritiesGET,
  integrationsJiraServerProjectsProjectIdIssueTypesIssueTypeIdStatusGET,
  targetsTargetIdFindingsIdIntegrationsJiraServerGET,
  targetsTargetIdFindingsIdIntegrationsJiraServerPATCH,
  targetsTargetIdFindingsIdIntegrationsJiraServerPUT,
  targetsTargetIdIntegrationsJiraServerGET,
  targetsTargetIdIntegrationsJiraServerPATCH,
  targetsTargetIdIntegrationsJiraServerPUT,
};
