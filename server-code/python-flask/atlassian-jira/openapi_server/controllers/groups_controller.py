import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_group_bean import AddGroupBean  # noqa: E501
from openapi_server.models.found_groups import FoundGroups  # noqa: E501
from openapi_server.models.group import Group  # noqa: E501
from openapi_server.models.page_bean_group_details import PageBeanGroupDetails  # noqa: E501
from openapi_server.models.page_bean_user_details import PageBeanUserDetails  # noqa: E501
from openapi_server.models.update_user_to_group_bean import UpdateUserToGroupBean  # noqa: E501
from openapi_server import util


def add_user_to_group(update_user_to_group_bean, groupname=None, group_id=None):  # noqa: E501
    """Add user to group

    Adds a user to a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)). # noqa: E501

    :param update_user_to_group_bean: The user to add to the group.
    :type update_user_to_group_bean: dict | bytes
    :param groupname: As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended to identify a group.   The name of the group. This parameter cannot be used with the &#x60;groupId&#x60; parameter.
    :type groupname: str
    :param group_id: The ID of the group. This parameter cannot be used with the &#x60;groupName&#x60; parameter.
    :type group_id: str

    :rtype: Union[Group, Tuple[Group, int], Tuple[Group, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_user_to_group_bean = UpdateUserToGroupBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def bulk_get_groups(start_at=None, max_results=None, group_id=None, group_name=None, access_type=None, application_key=None):  # noqa: E501
    """Bulk get groups

    Returns a [paginated](#pagination) list of groups.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param group_id: The ID of a group. To specify multiple IDs, pass multiple &#x60;groupId&#x60; parameters. For example, &#x60;groupId&#x3D;5b10a2844c20165700ede21g&amp;groupId&#x3D;5b10ac8d82e05b22cc7d4ef5&#x60;.
    :type group_id: List[str]
    :param group_name: The name of a group. To specify multiple names, pass multiple &#x60;groupName&#x60; parameters. For example, &#x60;groupName&#x3D;administrators&amp;groupName&#x3D;jira-software-users&#x60;.
    :type group_name: List[str]
    :param access_type: The access level of a group. Valid values: &#39;site-admin&#39;, &#39;admin&#39;, &#39;user&#39;.
    :type access_type: str
    :param application_key: The application key of the product user groups to search for. Valid values: &#39;jira-servicedesk&#39;, &#39;jira-software&#39;, &#39;jira-product-discovery&#39;, &#39;jira-core&#39;.
    :type application_key: str

    :rtype: Union[PageBeanGroupDetails, Tuple[PageBeanGroupDetails, int], Tuple[PageBeanGroupDetails, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_group(add_group_bean):  # noqa: E501
    """Create group

    Creates a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)). # noqa: E501

    :param add_group_bean: The name of the group.
    :type add_group_bean: dict | bytes

    :rtype: Union[Group, Tuple[Group, int], Tuple[Group, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_group_bean = AddGroupBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def find_groups(account_id=None, query=None, exclude=None, exclude_id=None, max_results=None, case_insensitive=None, user_name=None):  # noqa: E501
    """Find groups

    Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.  The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the &#x60;html&#x60; field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.  The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.  *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Without this permission, calls where query is not an exact match to an existing group will return an empty list. # noqa: E501

    :param account_id: This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-3-user-groups-get).
    :type account_id: str
    :param query: The string to find in group names.
    :type query: str
    :param exclude: As a group&#39;s name can change, use of &#x60;excludeGroupIds&#x60; is recommended to identify a group.   A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, &#x60;exclude&#x3D;group1&amp;exclude&#x3D;group2&#x60;. This parameter cannot be used with the &#x60;excludeGroupIds&#x60; parameter.
    :type exclude: List[str]
    :param exclude_id: A group ID to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, &#x60;excludeId&#x3D;group1-id&amp;excludeId&#x3D;group2-id&#x60;. This parameter cannot be used with the &#x60;excludeGroups&#x60; parameter.
    :type exclude_id: List[str]
    :param max_results: The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property &#x60;jira.ajax.autocomplete.limit&#x60;.
    :type max_results: int
    :param case_insensitive: Whether the search for groups should be case insensitive.
    :type case_insensitive: bool
    :param user_name: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type user_name: str

    :rtype: Union[FoundGroups, Tuple[FoundGroups, int], Tuple[FoundGroups, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_group(groupname=None, group_id=None, expand=None):  # noqa: E501
    """Get group

    This operation is deprecated, use [&#x60;group/member&#x60;](#api-rest-api-3-group-member-get).  Returns all users in a group.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param groupname: As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended to identify a group.   The name of the group. This parameter cannot be used with the &#x60;groupId&#x60; parameter.
    :type groupname: str
    :param group_id: The ID of the group. This parameter cannot be used with the &#x60;groupName&#x60; parameter.
    :type group_id: str
    :param expand: List of fields to expand.
    :type expand: str

    :rtype: Union[Group, Tuple[Group, int], Tuple[Group, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_users_from_group(groupname=None, group_id=None, include_inactive_users=None, start_at=None, max_results=None):  # noqa: E501
    """Get users from group

    Returns a [paginated](#pagination) list of all users in a group.  Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param groupname: As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended to identify a group.   The name of the group. This parameter cannot be used with the &#x60;groupId&#x60; parameter.
    :type groupname: str
    :param group_id: The ID of the group. This parameter cannot be used with the &#x60;groupName&#x60; parameter.
    :type group_id: str
    :param include_inactive_users: Include inactive users.
    :type include_inactive_users: bool
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageBeanUserDetails, Tuple[PageBeanUserDetails, int], Tuple[PageBeanUserDetails, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_group(groupname=None, group_id=None, swap_group=None, swap_group_id=None):  # noqa: E501
    """Remove group

    Deletes a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)). # noqa: E501

    :param groupname: 
    :type groupname: str
    :param group_id: The ID of the group. This parameter cannot be used with the &#x60;groupname&#x60; parameter.
    :type group_id: str
    :param swap_group: As a group&#39;s name can change, use of &#x60;swapGroupId&#x60; is recommended to identify a group.   The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the &#x60;swapGroupId&#x60; parameter.
    :type swap_group: str
    :param swap_group_id: The ID of the group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the &#x60;swapGroup&#x60; parameter.
    :type swap_group_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_user_from_group(account_id, groupname=None, group_id=None, username=None):  # noqa: E501
    """Remove user from group

    Removes a user from a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)). # noqa: E501

    :param account_id: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    :type account_id: str
    :param groupname: As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended to identify a group.   The name of the group. This parameter cannot be used with the &#x60;groupId&#x60; parameter.
    :type groupname: str
    :param group_id: The ID of the group. This parameter cannot be used with the &#x60;groupName&#x60; parameter.
    :type group_id: str
    :param username: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type username: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
