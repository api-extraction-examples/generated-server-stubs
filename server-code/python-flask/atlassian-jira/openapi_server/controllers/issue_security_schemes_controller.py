import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_security_scheme_levels_request_bean import AddSecuritySchemeLevelsRequestBean  # noqa: E501
from openapi_server.models.create_issue_security_scheme_details import CreateIssueSecuritySchemeDetails  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_issue_security_scheme_to_project_mapping import PageBeanIssueSecuritySchemeToProjectMapping  # noqa: E501
from openapi_server.models.page_bean_security_level import PageBeanSecurityLevel  # noqa: E501
from openapi_server.models.page_bean_security_level_member import PageBeanSecurityLevelMember  # noqa: E501
from openapi_server.models.page_bean_security_scheme_with_projects import PageBeanSecuritySchemeWithProjects  # noqa: E501
from openapi_server.models.security_scheme import SecurityScheme  # noqa: E501
from openapi_server.models.security_scheme_id import SecuritySchemeId  # noqa: E501
from openapi_server.models.security_scheme_members_request import SecuritySchemeMembersRequest  # noqa: E501
from openapi_server.models.security_schemes import SecuritySchemes  # noqa: E501
from openapi_server.models.set_default_levels_request import SetDefaultLevelsRequest  # noqa: E501
from openapi_server.models.task_progress_bean_object import TaskProgressBeanObject  # noqa: E501
from openapi_server.models.update_issue_security_level_details import UpdateIssueSecurityLevelDetails  # noqa: E501
from openapi_server.models.update_issue_security_scheme_request_bean import UpdateIssueSecuritySchemeRequestBean  # noqa: E501
from openapi_server import util


def add_security_level(scheme_id, add_security_scheme_levels_request_bean):  # noqa: E501
    """Add issue security levels

    Adds levels and levels&#39; members to the issue security scheme. You can add up to 100 levels per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param scheme_id: The ID of the issue security scheme.
    :type scheme_id: str
    :param add_security_scheme_levels_request_bean: 
    :type add_security_scheme_levels_request_bean: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_security_scheme_levels_request_bean = AddSecuritySchemeLevelsRequestBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_security_level_members(scheme_id, level_id, security_scheme_members_request):  # noqa: E501
    """Add issue security level members

    Adds members to the issue security level. You can add up to 100 members per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param scheme_id: The ID of the issue security scheme.
    :type scheme_id: str
    :param level_id: The ID of the issue security level.
    :type level_id: str
    :param security_scheme_members_request: 
    :type security_scheme_members_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        security_scheme_members_request = SecuritySchemeMembersRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_issue_security_scheme(create_issue_security_scheme_details):  # noqa: E501
    """Create issue security scheme

    Creates a security scheme with security scheme levels and levels&#39; members. You can create up to 100 security scheme levels and security scheme levels&#39; members per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param create_issue_security_scheme_details: 
    :type create_issue_security_scheme_details: dict | bytes

    :rtype: Union[SecuritySchemeId, Tuple[SecuritySchemeId, int], Tuple[SecuritySchemeId, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_issue_security_scheme_details = CreateIssueSecuritySchemeDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_security_scheme(scheme_id):  # noqa: E501
    """Delete issue security scheme

    Deletes an issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param scheme_id: The ID of the issue security scheme.
    :type scheme_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_security_scheme(id):  # noqa: E501
    """Get issue security scheme

    Returns an issue security scheme along with its security levels.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme. # noqa: E501

    :param id: The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
    :type id: int

    :rtype: Union[SecurityScheme, Tuple[SecurityScheme, int], Tuple[SecurityScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_issue_security_schemes():  # noqa: E501
    """Get issue security schemes

    Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[SecuritySchemes, Tuple[SecuritySchemes, int], Tuple[SecuritySchemes, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_security_level_members(start_at=None, max_results=None, id=None, scheme_id=None, level_id=None, expand=None):  # noqa: E501
    """Get issue security level members

    Returns a [paginated](#pagination) list of issue security level members.  Only issue security level members in the context of classic projects are returned.  Filtering using parameters is inclusive: if you specify both security scheme IDs and level IDs, the result will include all issue security level members from the specified schemes and levels.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: str
    :param max_results: The maximum number of items to return per page.
    :type max_results: str
    :param id: The list of issue security level member IDs. To include multiple issue security level members separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
    :type id: List[str]
    :param scheme_id: The list of issue security scheme IDs. To include multiple issue security schemes separate IDs with an ampersand: &#x60;schemeId&#x3D;10000&amp;schemeId&#x3D;10001&#x60;.
    :type scheme_id: List[str]
    :param level_id: The list of issue security level IDs. To include multiple issue security levels separate IDs with an ampersand: &#x60;levelId&#x3D;10000&amp;levelId&#x3D;10001&#x60;.
    :type level_id: List[str]
    :param expand: Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information  *  &#x60;field&#x60; Returns information about the custom field granted the permission  *  &#x60;group&#x60; Returns information about the group that is granted the permission  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission  *  &#x60;user&#x60; Returns information about the user who is granted the permission
    :type expand: str

    :rtype: Union[PageBeanSecurityLevelMember, Tuple[PageBeanSecurityLevelMember, int], Tuple[PageBeanSecurityLevelMember, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_security_levels(start_at=None, max_results=None, id=None, scheme_id=None, only_default=None):  # noqa: E501
    """Get issue security levels

    Returns a [paginated](#pagination) list of issue security levels.  Only issue security levels in the context of classic projects are returned.  Filtering using IDs is inclusive: if you specify both security scheme IDs and level IDs, the result will include both specified issue security levels and all issue security levels from the specified schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: str
    :param max_results: The maximum number of items to return per page.
    :type max_results: str
    :param id: The list of issue security scheme level IDs. To include multiple issue security levels, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
    :type id: List[str]
    :param scheme_id: The list of issue security scheme IDs. To include multiple issue security schemes, separate IDs with an ampersand: &#x60;schemeId&#x3D;10000&amp;schemeId&#x3D;10001&#x60;.
    :type scheme_id: List[str]
    :param only_default: When set to true, returns multiple default levels for each security scheme containing a default. If you provide scheme and level IDs not associated with the default, returns an empty page. The default value is false.
    :type only_default: bool

    :rtype: Union[PageBeanSecurityLevel, Tuple[PageBeanSecurityLevel, int], Tuple[PageBeanSecurityLevel, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_level(scheme_id, level_id, replace_with=None):  # noqa: E501
    """Remove issue security level

    Deletes an issue security level.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param scheme_id: The ID of the issue security scheme.
    :type scheme_id: str
    :param level_id: The ID of the issue security level to remove.
    :type level_id: str
    :param replace_with: The ID of the issue security level that will replace the currently selected level.
    :type replace_with: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_member_from_security_level(scheme_id, level_id, member_id):  # noqa: E501
    """Remove member from issue security level

    Removes an issue security level member from an issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param scheme_id: The ID of the issue security scheme.
    :type scheme_id: str
    :param level_id: The ID of the issue security level.
    :type level_id: str
    :param member_id: The ID of the issue security level member to be removed.
    :type member_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_projects_using_security_schemes(start_at=None, max_results=None, issue_security_scheme_id=None, project_id=None):  # noqa: E501
    """Get projects using issue security schemes

    Returns a [paginated](#pagination) mapping of projects that are using security schemes. You can provide either one or multiple security scheme IDs or project IDs to filter by. If you don&#39;t provide any, this will return a list of all mappings. Only issue security schemes in the context of classic projects are supported. **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: str
    :param max_results: The maximum number of items to return per page.
    :type max_results: str
    :param issue_security_scheme_id: The list of security scheme IDs to be filtered out.
    :type issue_security_scheme_id: List[str]
    :param project_id: The list of project IDs to be filtered out.
    :type project_id: List[str]

    :rtype: Union[PageBeanIssueSecuritySchemeToProjectMapping, Tuple[PageBeanIssueSecuritySchemeToProjectMapping, int], Tuple[PageBeanIssueSecuritySchemeToProjectMapping, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_security_schemes(start_at=None, max_results=None, id=None, project_id=None):  # noqa: E501
    """Search issue security schemes

    Returns a [paginated](#pagination) list of issue security schemes.   If you specify the project ID parameter, the result will contain issue security schemes and related project IDs you filter by. Use \\{@link IssueSecuritySchemeResource\\#searchProjectsUsingSecuritySchemes(String, String, Set, Set)\\} to obtain all projects related to scheme.  Only issue security schemes in the context of classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: str
    :param max_results: The maximum number of items to return per page.
    :type max_results: str
    :param id: The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
    :type id: List[str]
    :param project_id: The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.
    :type project_id: List[str]

    :rtype: Union[PageBeanSecuritySchemeWithProjects, Tuple[PageBeanSecuritySchemeWithProjects, int], Tuple[PageBeanSecuritySchemeWithProjects, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_default_levels(set_default_levels_request):  # noqa: E501
    """Set default issue security levels

    Sets default issue security levels for schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param set_default_levels_request: 
    :type set_default_levels_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_default_levels_request = SetDefaultLevelsRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_issue_security_scheme(id, update_issue_security_scheme_request_bean):  # noqa: E501
    """Update issue security scheme

    Updates the issue security scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the issue security scheme.
    :type id: str
    :param update_issue_security_scheme_request_bean: 
    :type update_issue_security_scheme_request_bean: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_issue_security_scheme_request_bean = UpdateIssueSecuritySchemeRequestBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_security_level(scheme_id, level_id, update_issue_security_level_details):  # noqa: E501
    """Update issue security level

    Updates the issue security level.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param scheme_id: The ID of the issue security scheme level belongs to.
    :type scheme_id: str
    :param level_id: The ID of the issue security level to update.
    :type level_id: str
    :param update_issue_security_level_details: 
    :type update_issue_security_level_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_issue_security_level_details = UpdateIssueSecurityLevelDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
