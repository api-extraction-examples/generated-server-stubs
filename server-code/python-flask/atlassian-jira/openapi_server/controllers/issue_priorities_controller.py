import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_priority_details import CreatePriorityDetails  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_priority import PageBeanPriority  # noqa: E501
from openapi_server.models.priority import Priority  # noqa: E501
from openapi_server.models.priority_id import PriorityId  # noqa: E501
from openapi_server.models.reorder_issue_priorities import ReorderIssuePriorities  # noqa: E501
from openapi_server.models.set_default_priority_request import SetDefaultPriorityRequest  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.update_priority_details import UpdatePriorityDetails  # noqa: E501
from openapi_server import util


def create_priority(create_priority_details):  # noqa: E501
    """Create priority

    Creates an issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param create_priority_details: 
    :type create_priority_details: dict | bytes

    :rtype: Union[PriorityId, Tuple[PriorityId, int], Tuple[PriorityId, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_priority_details = CreatePriorityDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_priority(id, replace_with):  # noqa: E501
    """Delete priority

    Deletes an issue priority.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue priority.
    :type id: str
    :param replace_with: The ID of the issue priority that will replace the currently selected resolution.
    :type replace_with: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_priorities():  # noqa: E501
    """Get priorities

    Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501


    :rtype: Union[List[Priority], Tuple[List[Priority], int], Tuple[List[Priority], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_priority(id):  # noqa: E501
    """Get priority

    Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param id: The ID of the issue priority.
    :type id: str

    :rtype: Union[Priority, Tuple[Priority, int], Tuple[Priority, int, Dict[str, str]]
    """
    return 'do some magic!'


def move_priorities(reorder_issue_priorities):  # noqa: E501
    """Move priorities

    Changes the order of issue priorities.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param reorder_issue_priorities: 
    :type reorder_issue_priorities: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        reorder_issue_priorities = ReorderIssuePriorities.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def search_priorities(start_at=None, max_results=None, id=None, only_default=None):  # noqa: E501
    """Search priorities

    Returns a [paginated](#pagination) list of priorities. The list can contain all priorities or a subset determined by any combination of these criteria:   *  a list of priority IDs. Any invalid priority IDs are ignored.  *  whether the field configuration is a default. This returns priorities from company-managed (classic) projects only, as there is no concept of default priorities in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: str
    :param max_results: The maximum number of items to return per page.
    :type max_results: str
    :param id: The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;2&amp;id&#x3D;3&#x60;.
    :type id: List[str]
    :param only_default: Whether only the default priority is returned.
    :type only_default: bool

    :rtype: Union[PageBeanPriority, Tuple[PageBeanPriority, int], Tuple[PageBeanPriority, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_default_priority(set_default_priority_request):  # noqa: E501
    """Set default priority

    Sets default issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param set_default_priority_request: 
    :type set_default_priority_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_default_priority_request = SetDefaultPriorityRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_priority(id, update_priority_details):  # noqa: E501
    """Update priority

    Updates an issue priority.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue priority.
    :type id: str
    :param update_priority_details: 
    :type update_priority_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_priority_details = UpdatePriorityDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
