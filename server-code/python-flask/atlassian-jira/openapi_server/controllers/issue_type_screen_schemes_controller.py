import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.issue_type_ids import IssueTypeIds  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_details import IssueTypeScreenSchemeDetails  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_id import IssueTypeScreenSchemeId  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_mapping_details import IssueTypeScreenSchemeMappingDetails  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_project_association import IssueTypeScreenSchemeProjectAssociation  # noqa: E501
from openapi_server.models.issue_type_screen_scheme_update_details import IssueTypeScreenSchemeUpdateDetails  # noqa: E501
from openapi_server.models.page_bean_issue_type_screen_scheme import PageBeanIssueTypeScreenScheme  # noqa: E501
from openapi_server.models.page_bean_issue_type_screen_scheme_item import PageBeanIssueTypeScreenSchemeItem  # noqa: E501
from openapi_server.models.page_bean_issue_type_screen_schemes_projects import PageBeanIssueTypeScreenSchemesProjects  # noqa: E501
from openapi_server.models.page_bean_project_details import PageBeanProjectDetails  # noqa: E501
from openapi_server.models.update_default_screen_scheme import UpdateDefaultScreenScheme  # noqa: E501
from openapi_server import util


def append_mappings_for_issue_type_screen_scheme(issue_type_screen_scheme_id, issue_type_screen_scheme_mapping_details):  # noqa: E501
    """Append mappings to issue type screen scheme

    Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_screen_scheme_id: The ID of the issue type screen scheme.
    :type issue_type_screen_scheme_id: str
    :param issue_type_screen_scheme_mapping_details: 
    :type issue_type_screen_scheme_mapping_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_screen_scheme_mapping_details = IssueTypeScreenSchemeMappingDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def assign_issue_type_screen_scheme_to_project(issue_type_screen_scheme_project_association):  # noqa: E501
    """Assign issue type screen scheme to project

    Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_screen_scheme_project_association: 
    :type issue_type_screen_scheme_project_association: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_screen_scheme_project_association = IssueTypeScreenSchemeProjectAssociation.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_issue_type_screen_scheme(issue_type_screen_scheme_details):  # noqa: E501
    """Create issue type screen scheme

    Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_screen_scheme_details: An issue type screen scheme bean.
    :type issue_type_screen_scheme_details: dict | bytes

    :rtype: Union[IssueTypeScreenSchemeId, Tuple[IssueTypeScreenSchemeId, int], Tuple[IssueTypeScreenSchemeId, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_screen_scheme_details = IssueTypeScreenSchemeDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_issue_type_screen_scheme(issue_type_screen_scheme_id):  # noqa: E501
    """Delete issue type screen scheme

    Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_screen_scheme_id: The ID of the issue type screen scheme.
    :type issue_type_screen_scheme_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_type_screen_scheme_mappings(start_at=None, max_results=None, issue_type_screen_scheme_id=None):  # noqa: E501
    """Get issue type screen scheme items

    Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param issue_type_screen_scheme_id: The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: &#x60;issueTypeScreenSchemeId&#x3D;10000&amp;issueTypeScreenSchemeId&#x3D;10001&#x60;.
    :type issue_type_screen_scheme_id: List[int]

    :rtype: Union[PageBeanIssueTypeScreenSchemeItem, Tuple[PageBeanIssueTypeScreenSchemeItem, int], Tuple[PageBeanIssueTypeScreenSchemeItem, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_type_screen_scheme_project_associations(project_id, start_at=None, max_results=None):  # noqa: E501
    """Get issue type screen schemes for projects

    Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param project_id: The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.
    :type project_id: List[int]
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageBeanIssueTypeScreenSchemesProjects, Tuple[PageBeanIssueTypeScreenSchemesProjects, int], Tuple[PageBeanIssueTypeScreenSchemesProjects, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_type_screen_schemes(start_at=None, max_results=None, id=None, query_string=None, order_by=None, expand=None):  # noqa: E501
    """Get issue type screen schemes

    Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param id: The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
    :type id: List[int]
    :param query_string: String used to perform a case-insensitive partial match with issue type screen scheme name.
    :type query_string: str
    :param order_by: [Order](#ordering) the results by a field:   *  &#x60;name&#x60; Sorts by issue type screen scheme name.  *  &#x60;id&#x60; Sorts by issue type screen scheme ID.
    :type order_by: str
    :param expand: Use [expand](#expansion) to include additional information in the response. This parameter accepts &#x60;projects&#x60; that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to.
    :type expand: str

    :rtype: Union[PageBeanIssueTypeScreenScheme, Tuple[PageBeanIssueTypeScreenScheme, int], Tuple[PageBeanIssueTypeScreenScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_projects_for_issue_type_screen_scheme(issue_type_screen_scheme_id, start_at=None, max_results=None, query=None):  # noqa: E501
    """Get issue type screen scheme projects

    Returns a [paginated](#pagination) list of projects associated with an issue type screen scheme.  Only company-managed projects associated with an issue type screen scheme are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_screen_scheme_id: The ID of the issue type screen scheme.
    :type issue_type_screen_scheme_id: int
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param query: 
    :type query: str

    :rtype: Union[PageBeanProjectDetails, Tuple[PageBeanProjectDetails, int], Tuple[PageBeanProjectDetails, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_mappings_from_issue_type_screen_scheme(issue_type_screen_scheme_id, issue_type_ids):  # noqa: E501
    """Remove mappings from issue type screen scheme

    Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_screen_scheme_id: The ID of the issue type screen scheme.
    :type issue_type_screen_scheme_id: str
    :param issue_type_ids: 
    :type issue_type_ids: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_ids = IssueTypeIds.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_default_screen_scheme(issue_type_screen_scheme_id, update_default_screen_scheme):  # noqa: E501
    """Update issue type screen scheme default screen scheme

    Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_screen_scheme_id: The ID of the issue type screen scheme.
    :type issue_type_screen_scheme_id: str
    :param update_default_screen_scheme: 
    :type update_default_screen_scheme: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_default_screen_scheme = UpdateDefaultScreenScheme.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_issue_type_screen_scheme(issue_type_screen_scheme_id, issue_type_screen_scheme_update_details):  # noqa: E501
    """Update issue type screen scheme

    Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param issue_type_screen_scheme_id: The ID of the issue type screen scheme.
    :type issue_type_screen_scheme_id: str
    :param issue_type_screen_scheme_update_details: The issue type screen scheme update details.
    :type issue_type_screen_scheme_update_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        issue_type_screen_scheme_update_details = IssueTypeScreenSchemeUpdateDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
