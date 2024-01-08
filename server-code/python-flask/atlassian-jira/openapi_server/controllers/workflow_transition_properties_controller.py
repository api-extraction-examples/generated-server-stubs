import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.workflow_transition_property import WorkflowTransitionProperty  # noqa: E501
from openapi_server import util


def create_workflow_transition_property(transition_id, key, workflow_name, workflow_transition_property, workflow_mode=None):  # noqa: E501
    """Create workflow transition property

    Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param transition_id: The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    :type transition_id: int
    :param key: The key of the property being added, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body.
    :type key: str
    :param workflow_name: The name of the workflow that the transition belongs to.
    :type workflow_name: str
    :param workflow_transition_property: 
    :type workflow_transition_property: dict | bytes
    :param workflow_mode: The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited.
    :type workflow_mode: str

    :rtype: Union[WorkflowTransitionProperty, Tuple[WorkflowTransitionProperty, int], Tuple[WorkflowTransitionProperty, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflow_transition_property = WorkflowTransitionProperty.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_workflow_transition_property(transition_id, key, workflow_name, workflow_mode=None):  # noqa: E501
    """Delete workflow transition property

    Deletes a property from a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param transition_id: The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    :type transition_id: int
    :param key: The name of the transition property to delete, also known as the name of the property.
    :type key: str
    :param workflow_name: The name of the workflow that the transition belongs to.
    :type workflow_name: str
    :param workflow_mode: The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited.
    :type workflow_mode: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_workflow_transition_properties(transition_id, workflow_name, include_reserved_keys=None, key=None, workflow_mode=None):  # noqa: E501
    """Get workflow transition properties

    Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param transition_id: The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition.
    :type transition_id: int
    :param workflow_name: The name of the workflow that the transition belongs to.
    :type workflow_name: str
    :param include_reserved_keys: Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*.
    :type include_reserved_keys: bool
    :param key: The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned.
    :type key: str
    :param workflow_mode: The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows.
    :type workflow_mode: str

    :rtype: Union[WorkflowTransitionProperty, Tuple[WorkflowTransitionProperty, int], Tuple[WorkflowTransitionProperty, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_workflow_transition_property(transition_id, key, workflow_name, workflow_transition_property, workflow_mode=None):  # noqa: E501
    """Update workflow transition property

    Updates a workflow transition by changing the property value. Trying to update a property that does not exist results in a new property being added to the transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param transition_id: The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.
    :type transition_id: int
    :param key: The key of the property being updated, also known as the name of the property. Set this to the same value as the &#x60;key&#x60; defined in the request body.
    :type key: str
    :param workflow_name: The name of the workflow that the transition belongs to.
    :type workflow_name: str
    :param workflow_transition_property: 
    :type workflow_transition_property: dict | bytes
    :param workflow_mode: The workflow status. Set to &#x60;live&#x60; for inactive workflows or &#x60;draft&#x60; for draft workflows. Active workflows cannot be edited.
    :type workflow_mode: str

    :rtype: Union[WorkflowTransitionProperty, Tuple[WorkflowTransitionProperty, int], Tuple[WorkflowTransitionProperty, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflow_transition_property = WorkflowTransitionProperty.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
