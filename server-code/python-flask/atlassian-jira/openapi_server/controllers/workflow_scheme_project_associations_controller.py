import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.container_of_workflow_scheme_associations import ContainerOfWorkflowSchemeAssociations  # noqa: E501
from openapi_server.models.workflow_scheme_project_association import WorkflowSchemeProjectAssociation  # noqa: E501
from openapi_server import util


def assign_scheme_to_project(workflow_scheme_project_association):  # noqa: E501
    """Assign workflow scheme to project

    Assigns a workflow scheme to a project. This operation is performed only when there are no issues in the project.  Workflow schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param workflow_scheme_project_association: 
    :type workflow_scheme_project_association: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflow_scheme_project_association = WorkflowSchemeProjectAssociation.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_workflow_scheme_project_associations(project_id):  # noqa: E501
    """Get workflow scheme project associations

    Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any team-managed or non-existent projects in the request are ignored and no errors are returned.  If the project is associated with the &#x60;Default Workflow Scheme&#x60; no ID is returned. This is because the way the &#x60;Default Workflow Scheme&#x60; is stored means it has no ID.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id: The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.
    :type project_id: List[int]

    :rtype: Union[ContainerOfWorkflowSchemeAssociations, Tuple[ContainerOfWorkflowSchemeAssociations, int], Tuple[ContainerOfWorkflowSchemeAssociations, int, Dict[str, str]]
    """
    return 'do some magic!'