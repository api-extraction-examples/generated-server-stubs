/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create draft workflow scheme
* Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the active workflow scheme that the draft is created from.
* returns WorkflowScheme
* */
const createWorkflowSchemeDraftFromParent = ({ id }) => new Promise(
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
* Delete draft default workflow
* Resets the default workflow for a workflow scheme's draft. That is, the default workflow is set to Jira's system workflow (the *jira* workflow).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* returns WorkflowScheme
* */
const deleteDraftDefaultWorkflow = ({ id }) => new Promise(
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
* Delete issue types for workflow in draft workflow scheme
* Deletes the workflow-issue type mapping for a workflow in a workflow scheme's draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* workflowName String The name of the workflow.
* no response value expected for this operation
* */
const deleteDraftWorkflowMapping = ({ id, workflowName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        workflowName,
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
* Delete draft workflow scheme
* Deletes a draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the active workflow scheme that the draft was created from.
* no response value expected for this operation
* */
const deleteWorkflowSchemeDraft = ({ id }) => new Promise(
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
* Delete workflow for issue type in draft workflow scheme
* Deletes the issue type-workflow mapping for an issue type in a workflow scheme's draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* issueType String The ID of the issue type.
* returns WorkflowScheme
* */
const deleteWorkflowSchemeDraftIssueType = ({ id, issueType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        issueType,
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
* Get draft default workflow
* Returns the default workflow for a workflow scheme's draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* returns DefaultWorkflow
* */
const getDraftDefaultWorkflow = ({ id }) => new Promise(
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
* Get issue types for workflows in draft workflow scheme
* Returns the workflow-issue type mappings for a workflow scheme's draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* workflowName String The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. (optional)
* returns IssueTypesWorkflowMapping
* */
const getDraftWorkflow = ({ id, workflowName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        workflowName,
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
* Get draft workflow scheme
* Returns the draft workflow scheme for an active workflow scheme. Draft workflow schemes allow changes to be made to the active workflow schemes: When an active workflow scheme is updated, a draft copy is created. The draft is modified, then the changes in the draft are copied back to the active workflow scheme. See [Configuring workflow schemes](https://confluence.atlassian.com/x/tohKLg) for more information.   Note that:   *  Only active workflow schemes can have draft workflow schemes.  *  An active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the active workflow scheme that the draft was created from.
* returns WorkflowScheme
* */
const getWorkflowSchemeDraft = ({ id }) => new Promise(
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
* Get workflow for issue type in draft workflow scheme
* Returns the issue type-workflow mapping for an issue type in a workflow scheme's draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* issueType String The ID of the issue type.
* returns IssueTypeWorkflowMapping
* */
const getWorkflowSchemeDraftIssueType = ({ id, issueType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        issueType,
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
* Publish draft workflow scheme
* Publishes a draft workflow scheme.  Where the draft workflow includes new workflow statuses for an issue type, mappings are provided to update issues with the original workflow status to the new workflow status.  This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* publishDraftWorkflowScheme PublishDraftWorkflowScheme Details of the status mappings.
* validateOnly Boolean Whether the request only performs a validation. (optional)
* no response value expected for this operation
* */
const publishDraftWorkflowScheme = ({ id, publishDraftWorkflowScheme, validateOnly }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        publishDraftWorkflowScheme,
        validateOnly,
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
* Set workflow for issue type in draft workflow scheme
* Sets the workflow for an issue type in a workflow scheme's draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* issueType String The ID of the issue type.
* issueTypeWorkflowMapping IssueTypeWorkflowMapping The issue type-project mapping.
* returns WorkflowScheme
* */
const setWorkflowSchemeDraftIssueType = ({ id, issueType, issueTypeWorkflowMapping }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        issueType,
        issueTypeWorkflowMapping,
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
* Update draft default workflow
* Sets the default workflow for a workflow scheme's draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* defaultWorkflow DefaultWorkflow The object for the new default workflow.
* returns WorkflowScheme
* */
const updateDraftDefaultWorkflow = ({ id, defaultWorkflow }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        defaultWorkflow,
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
* Set issue types for workflow in workflow scheme
* Sets the issue types for a workflow in a workflow scheme's draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the workflow scheme that the draft belongs to.
* workflowName String The name of the workflow.
* issueTypesWorkflowMapping IssueTypesWorkflowMapping 
* returns WorkflowScheme
* */
const updateDraftWorkflowMapping = ({ id, workflowName, issueTypesWorkflowMapping }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        workflowName,
        issueTypesWorkflowMapping,
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
* Update draft workflow scheme
* Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* id Long The ID of the active workflow scheme that the draft was created from.
* workflowScheme WorkflowScheme 
* returns WorkflowScheme
* */
const updateWorkflowSchemeDraft = ({ id, workflowScheme }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        workflowScheme,
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
  createWorkflowSchemeDraftFromParent,
  deleteDraftDefaultWorkflow,
  deleteDraftWorkflowMapping,
  deleteWorkflowSchemeDraft,
  deleteWorkflowSchemeDraftIssueType,
  getDraftDefaultWorkflow,
  getDraftWorkflow,
  getWorkflowSchemeDraft,
  getWorkflowSchemeDraftIssueType,
  publishDraftWorkflowScheme,
  setWorkflowSchemeDraftIssueType,
  updateDraftDefaultWorkflow,
  updateDraftWorkflowMapping,
  updateWorkflowSchemeDraft,
};
