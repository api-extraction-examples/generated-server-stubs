import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.id_bean import IdBean  # noqa: E501
from openapi_server.models.permission_scheme import PermissionScheme  # noqa: E501
from openapi_server.models.project_issue_security_levels import ProjectIssueSecurityLevels  # noqa: E501
from openapi_server.models.security_scheme import SecurityScheme  # noqa: E501
from openapi_server import util


def assign_permission_scheme(project_key_or_id, id_bean, expand=None):  # noqa: E501
    """Assign permission scheme

    Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) # noqa: E501

    :param project_key_or_id: The project ID or project key (case sensitive).
    :type project_key_or_id: str
    :param id_bean: 
    :type id_bean: dict | bytes
    :param expand: Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.
    :type expand: str

    :rtype: Union[PermissionScheme, Tuple[PermissionScheme, int], Tuple[PermissionScheme, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        id_bean = IdBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_assigned_permission_scheme(project_key_or_id, expand=None):  # noqa: E501
    """Get assigned permission scheme

    Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg). # noqa: E501

    :param project_key_or_id: The project ID or project key (case sensitive).
    :type project_key_or_id: str
    :param expand: Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;permissions&#x60; Returns all permission grants for each permission scheme.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.
    :type expand: str

    :rtype: Union[PermissionScheme, Tuple[PermissionScheme, int], Tuple[PermissionScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_project_issue_security_scheme(project_key_or_id):  # noqa: E501
    """Get project issue security scheme

    Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg). # noqa: E501

    :param project_key_or_id: The project ID or project key (case sensitive).
    :type project_key_or_id: str

    :rtype: Union[SecurityScheme, Tuple[SecurityScheme, int], Tuple[SecurityScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_security_levels_for_project(project_key_or_id):  # noqa: E501
    """Get project issue security levels

    Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project. # noqa: E501

    :param project_key_or_id: The project ID or project key (case sensitive).
    :type project_key_or_id: str

    :rtype: Union[ProjectIssueSecurityLevels, Tuple[ProjectIssueSecurityLevels, int], Tuple[ProjectIssueSecurityLevels, int, Dict[str, str]]
    """
    return 'do some magic!'
