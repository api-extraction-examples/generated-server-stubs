import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.component_issues_count import ComponentIssuesCount  # noqa: E501
from openapi_server.models.page_bean_component_with_issue_count import PageBeanComponentWithIssueCount  # noqa: E501
from openapi_server.models.project_component import ProjectComponent  # noqa: E501
from openapi_server import util


def create_component(project_component):  # noqa: E501
    """Create component

    Creates a component. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_component: 
    :type project_component: dict | bytes

    :rtype: Union[ProjectComponent, Tuple[ProjectComponent, int], Tuple[ProjectComponent, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_component = ProjectComponent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_component(id, move_issues_to=None):  # noqa: E501
    """Delete component

    Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the component.
    :type id: str
    :param move_issues_to: The ID of the component to replace the deleted component. If this value is null no replacement is made.
    :type move_issues_to: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_component(id):  # noqa: E501
    """Get component

    Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component. # noqa: E501

    :param id: The ID of the component.
    :type id: str

    :rtype: Union[ProjectComponent, Tuple[ProjectComponent, int], Tuple[ProjectComponent, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_component_related_issues(id):  # noqa: E501
    """Get component issues count

    Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param id: The ID of the component.
    :type id: str

    :rtype: Union[ComponentIssuesCount, Tuple[ComponentIssuesCount, int], Tuple[ComponentIssuesCount, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_components(project_id_or_key):  # noqa: E501
    """Get project components

    Returns all components in a project. See the [Get project components paginated](#api-rest-api-3-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project. # noqa: E501

    :param project_id_or_key: The project ID or project key (case sensitive).
    :type project_id_or_key: str

    :rtype: Union[List[ProjectComponent], Tuple[List[ProjectComponent], int], Tuple[List[ProjectComponent], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_components_paginated(project_id_or_key, start_at=None, max_results=None, order_by=None, query=None):  # noqa: E501
    """Get project components paginated

    Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-3-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project. # noqa: E501

    :param project_id_or_key: The project ID or project key (case sensitive).
    :type project_id_or_key: str
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param order_by: [Order](#ordering) the results by a field:   *  &#x60;description&#x60; Sorts by the component description.  *  &#x60;issueCount&#x60; Sorts by the count of issues associated with the component.  *  &#x60;lead&#x60; Sorts by the user key of the component&#39;s project lead.  *  &#x60;name&#x60; Sorts by component name.
    :type order_by: str
    :param query: Filter the results using a literal string. Components with a matching &#x60;name&#x60; or &#x60;description&#x60; are returned (case insensitive).
    :type query: str

    :rtype: Union[PageBeanComponentWithIssueCount, Tuple[PageBeanComponentWithIssueCount, int], Tuple[PageBeanComponentWithIssueCount, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_component(id, project_component):  # noqa: E501
    """Update component

    Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the component.
    :type id: str
    :param project_component: 
    :type project_component: dict | bytes

    :rtype: Union[ProjectComponent, Tuple[ProjectComponent, int], Tuple[ProjectComponent, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        project_component = ProjectComponent.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
