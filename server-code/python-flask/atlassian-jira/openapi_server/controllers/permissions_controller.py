import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bulk_permission_grants import BulkPermissionGrants  # noqa: E501
from openapi_server.models.bulk_permissions_request_bean import BulkPermissionsRequestBean  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.permissions import Permissions  # noqa: E501
from openapi_server.models.permissions_keys_bean import PermissionsKeysBean  # noqa: E501
from openapi_server.models.permitted_projects import PermittedProjects  # noqa: E501
from openapi_server import util


def get_all_permissions():  # noqa: E501
    """Get all permissions

    Returns all permissions, including:   *  global permissions.  *  project permissions.  *  global permissions added by plugins.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501


    :rtype: Union[Permissions, Tuple[Permissions, int], Tuple[Permissions, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_bulk_permissions(bulk_permissions_request_bean):  # noqa: E501
    """Get bulk permissions

    Returns:   *  for a list of global permissions, the global permissions granted to a user.  *  for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues a user can access or manipulate.  If no account ID is provided, the operation returns details for the logged in user.  Note that:   *  Invalid project and issue IDs are ignored.  *  A maximum of 1000 projects and 1000 issues can be checked.  *  Null values in &#x60;globalPermissions&#x60;, &#x60;projectPermissions&#x60;, &#x60;projectPermissions.projects&#x60;, and &#x60;projectPermissions.issues&#x60; are ignored.  *  Empty strings in &#x60;projectPermissions.permissions&#x60; are ignored.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn&#39;t apply to calls made using AP.request() in a browser. # noqa: E501

    :param bulk_permissions_request_bean: Details of the permissions to check.
    :type bulk_permissions_request_bean: dict | bytes

    :rtype: Union[BulkPermissionGrants, Tuple[BulkPermissionGrants, int], Tuple[BulkPermissionGrants, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        bulk_permissions_request_bean = BulkPermissionsRequestBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_my_permissions(project_key=None, project_id=None, issue_key=None, issue_id=None, permissions=None, project_uuid=None, project_configuration_uuid=None, comment_id=None):  # noqa: E501
    """Get my permissions

    Returns a list of permissions indicating which permissions the user has. Details of the user&#39;s permissions can be obtained in a global, project, issue or comment context.  The user is reported as having a project permission:   *  in the global context, if the user has the project permission in any project.  *  for a project, where the project permission is determined using issue data, if the user meets the permission&#39;s criteria for any issue in the project. Otherwise, if the user has the project permission in the project.  *  for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.  *  for a comment, where the user has both the permission to browse the comment and the project permission for the comment&#39;s parent issue. Only the BROWSE\\_PROJECTS permission is supported. If a &#x60;commentId&#x60; is provided whose &#x60;permissions&#x60; does not equal BROWSE\\_PROJECTS, a 400 error will be returned.  This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.  Global permissions are unaffected by context.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param project_key: The key of project. Ignored if &#x60;projectId&#x60; is provided.
    :type project_key: str
    :param project_id: The ID of project.
    :type project_id: str
    :param issue_key: The key of the issue. Ignored if &#x60;issueId&#x60; is provided.
    :type issue_key: str
    :param issue_id: The ID of the issue.
    :type issue_id: str
    :param permissions: A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get).
    :type permissions: str
    :param project_uuid: 
    :type project_uuid: str
    :param project_configuration_uuid: 
    :type project_configuration_uuid: str
    :param comment_id: The ID of the comment.
    :type comment_id: str

    :rtype: Union[Permissions, Tuple[Permissions, int], Tuple[Permissions, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_permitted_projects(permissions_keys_bean):  # noqa: E501
    """Get permitted projects

    Returns all the projects where the user is granted a list of project permissions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param permissions_keys_bean: 
    :type permissions_keys_bean: dict | bytes

    :rtype: Union[PermittedProjects, Tuple[PermittedProjects, int], Tuple[PermittedProjects, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        permissions_keys_bean = PermissionsKeysBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
