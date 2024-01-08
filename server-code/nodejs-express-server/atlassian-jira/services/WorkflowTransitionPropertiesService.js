/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Create workflow transition property
* Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* transitionId Long The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
* key String The key of the property being added, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
* workflowName String The name of the workflow that the transition belongs to.
* workflowTransitionProperty WorkflowTransitionProperty 
* workflowMode String The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited. (optional)
* returns WorkflowTransitionProperty
* */
const createWorkflowTransitionProperty = ({ transitionId, key, workflowName, workflowTransitionProperty, workflowMode }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        transitionId,
        key,
        workflowName,
        workflowTransitionProperty,
        workflowMode,
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
* Delete workflow transition property
* Deletes a property from a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* transitionId Long The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
* key String The name of the transition property to delete, also known as the name of the property.
* workflowName String The name of the workflow that the transition belongs to.
* workflowMode String The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited. (optional)
* no response value expected for this operation
* */
const deleteWorkflowTransitionProperty = ({ transitionId, key, workflowName, workflowMode }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        transitionId,
        key,
        workflowName,
        workflowMode,
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
* Get workflow transition properties
* Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* transitionId Long The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition.
* workflowName String The name of the workflow that the transition belongs to.
* includeReservedKeys Boolean Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*. (optional)
* key String The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned. (optional)
* workflowMode String The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows. (optional)
* returns WorkflowTransitionProperty
* */
const getWorkflowTransitionProperties = ({ transitionId, workflowName, includeReservedKeys, key, workflowMode }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        transitionId,
        workflowName,
        includeReservedKeys,
        key,
        workflowMode,
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
* Update workflow transition property
* Updates a workflow transition by changing the property value. Trying to update a property that does not exist results in a new property being added to the transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
*
* transitionId Long The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
* key String The key of the property being updated, also known as the name of the property. Set this to the same value as the `key` defined in the request body.
* workflowName String The name of the workflow that the transition belongs to.
* workflowTransitionProperty WorkflowTransitionProperty 
* workflowMode String The workflow status. Set to `live` for inactive workflows or `draft` for draft workflows. Active workflows cannot be edited. (optional)
* returns WorkflowTransitionProperty
* */
const updateWorkflowTransitionProperty = ({ transitionId, key, workflowName, workflowTransitionProperty, workflowMode }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        transitionId,
        key,
        workflowName,
        workflowTransitionProperty,
        workflowMode,
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
  createWorkflowTransitionProperty,
  deleteWorkflowTransitionProperty,
  getWorkflowTransitionProperties,
  updateWorkflowTransitionProperty,
};
