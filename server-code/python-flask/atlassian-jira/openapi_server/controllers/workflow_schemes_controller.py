import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.default_workflow import DefaultWorkflow  # noqa: E501
from openapi_server.models.issue_type_workflow_mapping import IssueTypeWorkflowMapping  # noqa: E501
from openapi_server.models.issue_types_workflow_mapping import IssueTypesWorkflowMapping  # noqa: E501
from openapi_server.models.page_bean_workflow_scheme import PageBeanWorkflowScheme  # noqa: E501
from openapi_server.models.workflow_scheme import WorkflowScheme  # noqa: E501
from openapi_server import util


def create_workflow_scheme(workflow_scheme):  # noqa: E501
    """Create workflow scheme

    Creates a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param workflow_scheme: 
    :type workflow_scheme: dict | bytes

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflow_scheme = WorkflowScheme.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_default_workflow(id, update_draft_if_needed=None):  # noqa: E501
    """Delete default workflow

    Resets the default workflow for a workflow scheme. That is, the default workflow is set to Jira&#39;s system workflow (the *jira* workflow).  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the default workflow reset. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param update_draft_if_needed: Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;.
    :type update_draft_if_needed: bool

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_workflow_mapping(id, workflow_name, update_draft_if_needed=None):  # noqa: E501
    """Delete issue types for workflow in workflow scheme

    Deletes the workflow-issue type mapping for a workflow in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the workflow-issue type mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param workflow_name: The name of the workflow.
    :type workflow_name: str
    :param update_draft_if_needed: Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;.
    :type update_draft_if_needed: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_workflow_scheme(id):  # noqa: E501
    """Delete workflow scheme

    Deletes a workflow scheme. Note that a workflow scheme cannot be deleted if it is active (that is, being used by at least one project).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*.
    :type id: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_workflow_scheme_issue_type(id, issue_type, update_draft_if_needed=None):  # noqa: E501
    """Delete workflow for issue type in workflow scheme

    Deletes the issue type-workflow mapping for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; and a draft workflow scheme is created or updated with the issue type-workflow mapping deleted. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param issue_type: The ID of the issue type.
    :type issue_type: str
    :param update_draft_if_needed: Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to &#x60;false&#x60;.
    :type update_draft_if_needed: bool

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_workflow_schemes(start_at=None, max_results=None):  # noqa: E501
    """Get all workflow schemes

    Returns a [paginated](#pagination) list of all workflow schemes, not including draft workflow schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageBeanWorkflowScheme, Tuple[PageBeanWorkflowScheme, int], Tuple[PageBeanWorkflowScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_default_workflow(id, return_draft_if_exists=None):  # noqa: E501
    """Get default workflow

    Returns the default workflow for a workflow scheme. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param return_draft_if_exists: Set to &#x60;true&#x60; to return the default workflow for the workflow scheme&#39;s draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned.
    :type return_draft_if_exists: bool

    :rtype: Union[DefaultWorkflow, Tuple[DefaultWorkflow, int], Tuple[DefaultWorkflow, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workflow(id, workflow_name=None, return_draft_if_exists=None):  # noqa: E501
    """Get issue types for workflows in workflow scheme

    Returns the workflow-issue type mappings for a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param workflow_name: The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
    :type workflow_name: str
    :param return_draft_if_exists: Returns the mapping from the workflow scheme&#39;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
    :type return_draft_if_exists: bool

    :rtype: Union[IssueTypesWorkflowMapping, Tuple[IssueTypesWorkflowMapping, int], Tuple[IssueTypesWorkflowMapping, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workflow_scheme(id, return_draft_if_exists=None):  # noqa: E501
    """Get workflow scheme

    Returns a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*.
    :type id: int
    :param return_draft_if_exists: Returns the workflow scheme&#39;s draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned.
    :type return_draft_if_exists: bool

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workflow_scheme_issue_type(id, issue_type, return_draft_if_exists=None):  # noqa: E501
    """Get workflow for issue type in workflow scheme

    Returns the issue type-workflow mapping for an issue type in a workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param issue_type: The ID of the issue type.
    :type issue_type: str
    :param return_draft_if_exists: Returns the mapping from the workflow scheme&#39;s draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned.
    :type return_draft_if_exists: bool

    :rtype: Union[IssueTypeWorkflowMapping, Tuple[IssueTypeWorkflowMapping, int], Tuple[IssueTypeWorkflowMapping, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_workflow_scheme_issue_type(id, issue_type, issue_type_workflow_mapping):  # noqa: E501
    """Set workflow for issue type in workflow scheme

    Sets the workflow for an issue type in a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new issue type-workflow mapping. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param issue_type: The ID of the issue type.
    :type issue_type: str
    :param issue_type_workflow_mapping: The issue type-project mapping.
    :type issue_type_workflow_mapping: dict | bytes

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_workflow_mapping = IssueTypeWorkflowMapping.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_default_workflow(id, default_workflow):  # noqa: E501
    """Update default workflow

    Sets the default workflow for a workflow scheme.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request object and a draft workflow scheme is created or updated with the new default workflow. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param default_workflow: The new default workflow.
    :type default_workflow: dict | bytes

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        default_workflow = DefaultWorkflow.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_workflow_mapping(id, workflow_name, issue_types_workflow_mapping):  # noqa: E501
    """Set issue types for workflow in workflow scheme

    Sets the issue types for a workflow in a workflow scheme. The workflow can also be set as the default workflow for the workflow scheme. Unmapped issues types are mapped to the default workflow.  Note that active workflow schemes cannot be edited. If the workflow scheme is active, set &#x60;updateDraftIfNeeded&#x60; to &#x60;true&#x60; in the request body and a draft workflow scheme is created or updated with the new workflow-issue types mappings. The draft workflow scheme can be published in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme.
    :type id: int
    :param workflow_name: The name of the workflow.
    :type workflow_name: str
    :param issue_types_workflow_mapping: 
    :type issue_types_workflow_mapping: dict | bytes

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_types_workflow_mapping = IssueTypesWorkflowMapping.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_workflow_scheme(id, workflow_scheme):  # noqa: E501
    """Update workflow scheme

    Updates a workflow scheme, including the name, default workflow, issue type to project mappings, and more. If the workflow scheme is active (that is, being used by at least one project), then a draft workflow scheme is created or updated instead, provided that &#x60;updateDraftIfNeeded&#x60; is set to &#x60;true&#x60;.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as &#x60;schemeId&#x60;. For example, *schemeId&#x3D;10301*.
    :type id: int
    :param workflow_scheme: 
    :type workflow_scheme: dict | bytes

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflow_scheme = WorkflowScheme.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
