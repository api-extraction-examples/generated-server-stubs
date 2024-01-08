/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete workflow transition rule configurations
* Deletes workflow transition rules from one or more workflows. These rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be deleted.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.
*
* workflowsWithTransitionRulesDetails WorkflowsWithTransitionRulesDetails 
* returns WorkflowTransitionRulesUpdateErrors
* */
const deleteWorkflowTransitionRuleConfigurations = ({ workflowsWithTransitionRulesDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workflowsWithTransitionRulesDetails,
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
* Get workflow transition rule configurations
* Returns a [paginated](#pagination) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:   *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).  *  matching one or more transition rule keys.  Only workflows containing transition rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app are returned.  Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.
*
* types Set The types of the transition rules to return.
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* keys Set The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return. (optional)
* workflowNames Set EXPERIMENTAL: The list of workflow names to filter by. (optional)
* withTags Set EXPERIMENTAL: The list of `tags` to filter by. (optional)
* draft Boolean EXPERIMENTAL: Whether draft or published workflows are returned. If not provided, both workflow types are returned. (optional)
* expand String Use [expand](#expansion) to include additional information in the response. This parameter accepts `transition`, which, for each rule, returns information about the transition the rule is assigned to. (optional)
* returns PageBeanWorkflowTransitionRules
* */
const getWorkflowTransitionRuleConfigurations = ({ types, startAt, maxResults, keys, workflowNames, withTags, draft, expand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        types,
        startAt,
        maxResults,
        keys,
        workflowNames,
        withTags,
        draft,
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
* Update workflow transition rule configurations
* Updates configuration of workflow transition rules. The following rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be updated.  To assist with app migration, this operation can be used to:   *  Disable a rule.  *  Add a `tag`. Use this to filter rules in the [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).  Rules are enabled if the `disabled` parameter is not provided.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.
*
* workflowTransitionRulesUpdate WorkflowTransitionRulesUpdate 
* returns WorkflowTransitionRulesUpdateErrors
* */
const updateWorkflowTransitionRuleConfigurations = ({ workflowTransitionRulesUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workflowTransitionRulesUpdate,
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
  deleteWorkflowTransitionRuleConfigurations,
  getWorkflowTransitionRuleConfigurations,
  updateWorkflowTransitionRuleConfigurations,
};
