import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.issue_type_ids import IssueTypeIds  # noqa: E501
from openapi_server.models.issue_type_scheme_details import IssueTypeSchemeDetails  # noqa: E501
from openapi_server.models.issue_type_scheme_id import IssueTypeSchemeID  # noqa: E501
from openapi_server.models.issue_type_scheme_project_association import IssueTypeSchemeProjectAssociation  # noqa: E501
from openapi_server.models.issue_type_scheme_update_details import IssueTypeSchemeUpdateDetails  # noqa: E501
from openapi_server.models.order_of_issue_types import OrderOfIssueTypes  # noqa: E501
from openapi_server.models.page_bean_issue_type_scheme import PageBeanIssueTypeScheme  # noqa: E501
from openapi_server.models.page_bean_issue_type_scheme_mapping import PageBeanIssueTypeSchemeMapping  # noqa: E501
from openapi_server.models.page_bean_issue_type_scheme_projects import PageBeanIssueTypeSchemeProjects  # noqa: E501
from openapi_server import util


def add_issue_types_to_issue_type_scheme(issue_type_scheme_id, issue_type_ids):  # noqa: E501
    """Add issue types to issue type scheme

    Adds issue types to an issue type scheme.  The added issue types are appended to the issue types list.  If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_scheme_id: The ID of the issue type scheme.
    :type issue_type_scheme_id: int
    :param issue_type_ids: 
    :type issue_type_ids: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_ids = IssueTypeIds.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def assign_issue_type_scheme_to_project(issue_type_scheme_project_association):  # noqa: E501
    """Assign issue type scheme to project

    Assigns an issue type scheme to a project.  If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.  Issue type schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_scheme_project_association: 
    :type issue_type_scheme_project_association: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_scheme_project_association = IssueTypeSchemeProjectAssociation.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_issue_type_scheme(issue_type_scheme_details):  # noqa: E501
    """Create issue type scheme

    Creates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_scheme_details: 
    :type issue_type_scheme_details: dict | bytes

    :rtype: Union[IssueTypeSchemeID, Tuple[IssueTypeSchemeID, int], Tuple[IssueTypeSchemeID, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_scheme_details = IssueTypeSchemeDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_issue_type_scheme(issue_type_scheme_id):  # noqa: E501
    """Delete issue type scheme

    Deletes an issue type scheme.  Only issue type schemes used in classic projects can be deleted.  Any projects assigned to the scheme are reassigned to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_scheme_id: The ID of the issue type scheme.
    :type issue_type_scheme_id: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_issue_type_schemes(start_at=None, max_results=None, id=None, order_by=None, expand=None, query_string=None):  # noqa: E501
    """Get all issue type schemes

    Returns a [paginated](#pagination) list of issue type schemes.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param id: The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
    :type id: List[int]
    :param order_by: [Order](#ordering) the results by a field:   *  &#x60;name&#x60; Sorts by issue type scheme name.  *  &#x60;id&#x60; Sorts by issue type scheme ID.
    :type order_by: str
    :param expand: Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;projects&#x60; For each issue type schemes, returns information about the projects the issue type scheme is assigned to.  *  &#x60;issueTypes&#x60; For each issue type schemes, returns information about the issueTypes the issue type scheme have.
    :type expand: str
    :param query_string: String used to perform a case-insensitive partial match with issue type scheme name.
    :type query_string: str

    :rtype: Union[PageBeanIssueTypeScheme, Tuple[PageBeanIssueTypeScheme, int], Tuple[PageBeanIssueTypeScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_type_scheme_for_projects(project_id, start_at=None, max_results=None):  # noqa: E501
    """Get issue type schemes for projects

    Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id: The list of project IDs. To include multiple project IDs, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.
    :type project_id: List[int]
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageBeanIssueTypeSchemeProjects, Tuple[PageBeanIssueTypeSchemeProjects, int], Tuple[PageBeanIssueTypeSchemeProjects, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_type_schemes_mapping(start_at=None, max_results=None, issue_type_scheme_id=None):  # noqa: E501
    """Get issue type scheme items

    Returns a [paginated](#pagination) list of issue type scheme items.  Only issue type scheme items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param issue_type_scheme_id: The list of issue type scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;issueTypeSchemeId&#x3D;10000&amp;issueTypeSchemeId&#x3D;10001&#x60;.
    :type issue_type_scheme_id: List[int]

    :rtype: Union[PageBeanIssueTypeSchemeMapping, Tuple[PageBeanIssueTypeSchemeMapping, int], Tuple[PageBeanIssueTypeSchemeMapping, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_issue_type_from_issue_type_scheme(issue_type_scheme_id, issue_type_id):  # noqa: E501
    """Remove issue type from issue type scheme

    Removes an issue type from an issue type scheme.  This operation cannot remove:   *  any issue type used by issues.  *  any issue types from the default issue type scheme.  *  the last standard issue type from an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_scheme_id: The ID of the issue type scheme.
    :type issue_type_scheme_id: int
    :param issue_type_id: The ID of the issue type.
    :type issue_type_id: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def reorder_issue_types_in_issue_type_scheme(issue_type_scheme_id, order_of_issue_types):  # noqa: E501
    """Change order of issue types

    Changes the order of issue types in an issue type scheme.  The request body parameters must meet the following requirements:   *  all of the issue types must belong to the issue type scheme.  *  either &#x60;after&#x60; or &#x60;position&#x60; must be provided.  *  the issue type in &#x60;after&#x60; must not be in the issue type list.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_scheme_id: The ID of the issue type scheme.
    :type issue_type_scheme_id: int
    :param order_of_issue_types: 
    :type order_of_issue_types: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        order_of_issue_types = OrderOfIssueTypes.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_issue_type_scheme(issue_type_scheme_id, issue_type_scheme_update_details):  # noqa: E501
    """Update issue type scheme

    Updates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_scheme_id: The ID of the issue type scheme.
    :type issue_type_scheme_id: int
    :param issue_type_scheme_update_details: 
    :type issue_type_scheme_update_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_scheme_update_details = IssueTypeSchemeUpdateDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
