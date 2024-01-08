import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_workflow_transition_rules import PageBeanWorkflowTransitionRules  # noqa: E501
from openapi_server.models.workflow_transition_rules_update import WorkflowTransitionRulesUpdate  # noqa: E501
from openapi_server.models.workflow_transition_rules_update_errors import WorkflowTransitionRulesUpdateErrors  # noqa: E501
from openapi_server.models.workflows_with_transition_rules_details import WorkflowsWithTransitionRulesDetails  # noqa: E501
from openapi_server import util


def delete_workflow_transition_rule_configurations(workflows_with_transition_rules_details):  # noqa: E501
    """Delete workflow transition rule configurations

    Deletes workflow transition rules from one or more workflows. These rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be deleted.  **[Permissions](#permissions) required:** Only Connect apps can use this operation. # noqa: E501

    :param workflows_with_transition_rules_details: 
    :type workflows_with_transition_rules_details: dict | bytes

    :rtype: Union[WorkflowTransitionRulesUpdateErrors, Tuple[WorkflowTransitionRulesUpdateErrors, int], Tuple[WorkflowTransitionRulesUpdateErrors, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflows_with_transition_rules_details = WorkflowsWithTransitionRulesDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_workflow_transition_rule_configurations(types, start_at=None, max_results=None, keys=None, workflow_names=None, with_tags=None, draft=None, expand=None):  # noqa: E501
    """Get workflow transition rule configurations

    Returns a [paginated](#pagination) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:   *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).  *  matching one or more transition rule keys.  Only workflows containing transition rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app are returned.  Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation. # noqa: E501

    :param types: The types of the transition rules to return.
    :type types: List[str]
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param keys: The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return.
    :type keys: List[str]
    :param workflow_names: EXPERIMENTAL: The list of workflow names to filter by.
    :type workflow_names: List[str]
    :param with_tags: EXPERIMENTAL: The list of &#x60;tags&#x60; to filter by.
    :type with_tags: List[str]
    :param draft: EXPERIMENTAL: Whether draft or published workflows are returned. If not provided, both workflow types are returned.
    :type draft: bool
    :param expand: Use [expand](#expansion) to include additional information in the response. This parameter accepts &#x60;transition&#x60;, which, for each rule, returns information about the transition the rule is assigned to.
    :type expand: str

    :rtype: Union[PageBeanWorkflowTransitionRules, Tuple[PageBeanWorkflowTransitionRules, int], Tuple[PageBeanWorkflowTransitionRules, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_workflow_transition_rule_configurations(workflow_transition_rules_update):  # noqa: E501
    """Update workflow transition rule configurations

    Updates configuration of workflow transition rules. The following rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be updated.  To assist with app migration, this operation can be used to:   *  Disable a rule.  *  Add a &#x60;tag&#x60;. Use this to filter rules in the [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).  Rules are enabled if the &#x60;disabled&#x60; parameter is not provided.  **[Permissions](#permissions) required:** Only Connect apps can use this operation. # noqa: E501

    :param workflow_transition_rules_update: 
    :type workflow_transition_rules_update: dict | bytes

    :rtype: Union[WorkflowTransitionRulesUpdateErrors, Tuple[WorkflowTransitionRulesUpdateErrors, int], Tuple[WorkflowTransitionRulesUpdateErrors, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflow_transition_rules_update = WorkflowTransitionRulesUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
