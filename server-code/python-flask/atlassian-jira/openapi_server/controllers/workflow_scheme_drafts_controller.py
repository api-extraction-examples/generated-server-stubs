import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.default_workflow import DefaultWorkflow  # noqa: E501
from openapi_server.models.issue_type_workflow_mapping import IssueTypeWorkflowMapping  # noqa: E501
from openapi_server.models.issue_types_workflow_mapping import IssueTypesWorkflowMapping  # noqa: E501
from openapi_server.models.publish_draft_workflow_scheme import PublishDraftWorkflowScheme  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.workflow_scheme import WorkflowScheme  # noqa: E501
from openapi_server import util


def create_workflow_scheme_draft_from_parent(id):  # noqa: E501
    """Create draft workflow scheme

    Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the active workflow scheme that the draft is created from.
    :type id: int

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_draft_default_workflow(id):  # noqa: E501
    """Delete draft default workflow

    Resets the default workflow for a workflow scheme&#39;s draft. That is, the default workflow is set to Jira&#39;s system workflow (the *jira* workflow).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
    :type id: int

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_draft_workflow_mapping(id, workflow_name):  # noqa: E501
    """Delete issue types for workflow in draft workflow scheme

    Deletes the workflow-issue type mapping for a workflow in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
    :type id: int
    :param workflow_name: The name of the workflow.
    :type workflow_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_workflow_scheme_draft(id):  # noqa: E501
    """Delete draft workflow scheme

    Deletes a draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the active workflow scheme that the draft was created from.
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_workflow_scheme_draft_issue_type(id, issue_type):  # noqa: E501
    """Delete workflow for issue type in draft workflow scheme

    Deletes the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
    :type id: int
    :param issue_type: The ID of the issue type.
    :type issue_type: str

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_draft_default_workflow(id):  # noqa: E501
    """Get draft default workflow

    Returns the default workflow for a workflow scheme&#39;s draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
    :type id: int

    :rtype: Union[DefaultWorkflow, Tuple[DefaultWorkflow, int], Tuple[DefaultWorkflow, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_draft_workflow(id, workflow_name=None):  # noqa: E501
    """Get issue types for workflows in draft workflow scheme

    Returns the workflow-issue type mappings for a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
    :type id: int
    :param workflow_name: The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow.
    :type workflow_name: str

    :rtype: Union[IssueTypesWorkflowMapping, Tuple[IssueTypesWorkflowMapping, int], Tuple[IssueTypesWorkflowMapping, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workflow_scheme_draft(id):  # noqa: E501
    """Get draft workflow scheme

    Returns the draft workflow scheme for an active workflow scheme. Draft workflow schemes allow changes to be made to the active workflow schemes: When an active workflow scheme is updated, a draft copy is created. The draft is modified, then the changes in the draft are copied back to the active workflow scheme. See [Configuring workflow schemes](https://confluence.atlassian.com/x/tohKLg) for more information.   Note that:   *  Only active workflow schemes can have draft workflow schemes.  *  An active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the active workflow scheme that the draft was created from.
    :type id: int

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workflow_scheme_draft_issue_type(id, issue_type):  # noqa: E501
    """Get workflow for issue type in draft workflow scheme

    Returns the issue type-workflow mapping for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
    :type id: int
    :param issue_type: The ID of the issue type.
    :type issue_type: str

    :rtype: Union[IssueTypeWorkflowMapping, Tuple[IssueTypeWorkflowMapping, int], Tuple[IssueTypeWorkflowMapping, int, Dict[str, str]]
    """
    return 'do some magic!'


def publish_draft_workflow_scheme(id, publish_draft_workflow_scheme, validate_only=None):  # noqa: E501
    """Publish draft workflow scheme

    Publishes a draft workflow scheme.  Where the draft workflow includes new workflow statuses for an issue type, mappings are provided to update issues with the original workflow status to the new workflow status.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
    :type id: int
    :param publish_draft_workflow_scheme: Details of the status mappings.
    :type publish_draft_workflow_scheme: dict | bytes
    :param validate_only: Whether the request only performs a validation.
    :type validate_only: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        publish_draft_workflow_scheme = PublishDraftWorkflowScheme.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_workflow_scheme_draft_issue_type(id, issue_type, issue_type_workflow_mapping):  # noqa: E501
    """Set workflow for issue type in draft workflow scheme

    Sets the workflow for an issue type in a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
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


def update_draft_default_workflow(id, default_workflow):  # noqa: E501
    """Update draft default workflow

    Sets the default workflow for a workflow scheme&#39;s draft.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
    :type id: int
    :param default_workflow: The object for the new default workflow.
    :type default_workflow: dict | bytes

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        default_workflow = DefaultWorkflow.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_draft_workflow_mapping(id, workflow_name, issue_types_workflow_mapping):  # noqa: E501
    """Set issue types for workflow in workflow scheme

    Sets the issue types for a workflow in a workflow scheme&#39;s draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the workflow scheme that the draft belongs to.
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


def update_workflow_scheme_draft(id, workflow_scheme):  # noqa: E501
    """Update draft workflow scheme

    Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the active workflow scheme that the draft was created from.
    :type id: int
    :param workflow_scheme: 
    :type workflow_scheme: dict | bytes

    :rtype: Union[WorkflowScheme, Tuple[WorkflowScheme, int], Tuple[WorkflowScheme, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflow_scheme = WorkflowScheme.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
