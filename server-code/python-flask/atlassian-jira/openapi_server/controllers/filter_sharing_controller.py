import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.default_share_scope import DefaultShareScope  # noqa: E501
from openapi_server.models.share_permission import SharePermission  # noqa: E501
from openapi_server.models.share_permission_input_bean import SharePermissionInputBean  # noqa: E501
from openapi_server import util


def add_share_permission(id, share_permission_input_bean):  # noqa: E501
    """Add share permission

    Add a share permissions to a filter. If you add a global share permission (one for all logged-in users or the public) it will overwrite all share permissions for the filter.  Be aware that this operation uses different objects for updating share permissions compared to [Update filter](#api-rest-api-3-filter-id-put).  **[Permissions](#permissions) required:** *Share dashboards and filters* [global permission](https://confluence.atlassian.com/x/x4dKLg) and the user must own the filter. # noqa: E501

    :param id: The ID of the filter.
    :type id: int
    :param share_permission_input_bean: 
    :type share_permission_input_bean: dict | bytes

    :rtype: Union[List[SharePermission], Tuple[List[SharePermission], int], Tuple[List[SharePermission], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        share_permission_input_bean = SharePermissionInputBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_share_permission(id, permission_id):  # noqa: E501
    """Delete share permission

    Deletes a share permission from a filter.  **[Permissions](#permissions) required:** Permission to access Jira and the user must own the filter. # noqa: E501

    :param id: The ID of the filter.
    :type id: int
    :param permission_id: The ID of the share permission.
    :type permission_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_default_share_scope():  # noqa: E501
    """Get default share scope

    Returns the default sharing settings for new filters and dashboards for a user.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501


    :rtype: Union[DefaultShareScope, Tuple[DefaultShareScope, int], Tuple[DefaultShareScope, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_share_permission(id, permission_id):  # noqa: E501
    """Get share permission

    Returns a share permission for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, a share permission is only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public. # noqa: E501

    :param id: The ID of the filter.
    :type id: int
    :param permission_id: The ID of the share permission.
    :type permission_id: int

    :rtype: Union[SharePermission, Tuple[SharePermission, int], Tuple[SharePermission, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_share_permissions(id):  # noqa: E501
    """Get share permissions

    Returns the share permissions for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, share permissions are only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public. # noqa: E501

    :param id: The ID of the filter.
    :type id: int

    :rtype: Union[List[SharePermission], Tuple[List[SharePermission], int], Tuple[List[SharePermission], int, Dict[str, str]]
    """
    return 'do some magic!'


def set_default_share_scope(default_share_scope):  # noqa: E501
    """Set default share scope

    Sets the default sharing for new filters and dashboards for a user.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param default_share_scope: 
    :type default_share_scope: dict | bytes

    :rtype: Union[DefaultShareScope, Tuple[DefaultShareScope, int], Tuple[DefaultShareScope, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        default_share_scope = DefaultShareScope.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
