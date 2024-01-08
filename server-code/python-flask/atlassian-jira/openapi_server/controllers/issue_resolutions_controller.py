import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_resolution_details import CreateResolutionDetails  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_resolution_json_bean import PageBeanResolutionJsonBean  # noqa: E501
from openapi_server.models.reorder_issue_resolutions_request import ReorderIssueResolutionsRequest  # noqa: E501
from openapi_server.models.resolution import Resolution  # noqa: E501
from openapi_server.models.resolution_id import ResolutionId  # noqa: E501
from openapi_server.models.set_default_resolution_request import SetDefaultResolutionRequest  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.update_resolution_details import UpdateResolutionDetails  # noqa: E501
from openapi_server import util


def create_resolution(create_resolution_details):  # noqa: E501
    """Create resolution

    Creates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param create_resolution_details: 
    :type create_resolution_details: dict | bytes

    :rtype: Union[ResolutionId, Tuple[ResolutionId, int], Tuple[ResolutionId, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_resolution_details = CreateResolutionDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_resolution(id, replace_with):  # noqa: E501
    """Delete resolution

    Deletes an issue resolution.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue resolution.
    :type id: str
    :param replace_with: The ID of the issue resolution that will replace the currently selected resolution.
    :type replace_with: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_resolution(id):  # noqa: E501
    """Get resolution

    Returns an issue resolution value.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param id: The ID of the issue resolution value.
    :type id: str

    :rtype: Union[Resolution, Tuple[Resolution, int], Tuple[Resolution, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_resolutions():  # noqa: E501
    """Get resolutions

    Returns a list of all issue resolution values.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501


    :rtype: Union[List[Resolution], Tuple[List[Resolution], int], Tuple[List[Resolution], int, Dict[str, str]]
    """
    return 'do some magic!'


def move_resolutions(reorder_issue_resolutions_request):  # noqa: E501
    """Move resolutions

    Changes the order of issue resolutions.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param reorder_issue_resolutions_request: 
    :type reorder_issue_resolutions_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        reorder_issue_resolutions_request = ReorderIssueResolutionsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def search_resolutions(start_at=None, max_results=None, id=None, only_default=None):  # noqa: E501
    """Search resolutions

    Returns a [paginated](#pagination) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:   *  a list of resolutions IDs.  *  whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: str
    :param max_results: The maximum number of items to return per page.
    :type max_results: str
    :param id: The list of resolutions IDs to be filtered out
    :type id: List[str]
    :param only_default: When set to true, return default only, when IDs provided, if none of them is default, return empty page. Default value is false
    :type only_default: bool

    :rtype: Union[PageBeanResolutionJsonBean, Tuple[PageBeanResolutionJsonBean, int], Tuple[PageBeanResolutionJsonBean, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_default_resolution(set_default_resolution_request):  # noqa: E501
    """Set default resolution

    Sets default issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param set_default_resolution_request: 
    :type set_default_resolution_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_default_resolution_request = SetDefaultResolutionRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_resolution(id, update_resolution_details):  # noqa: E501
    """Update resolution

    Updates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue resolution.
    :type id: str
    :param update_resolution_details: 
    :type update_resolution_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_resolution_details = UpdateResolutionDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
