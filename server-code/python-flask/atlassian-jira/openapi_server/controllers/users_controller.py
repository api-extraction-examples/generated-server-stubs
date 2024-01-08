import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.column_item import ColumnItem  # noqa: E501
from openapi_server.models.group_name import GroupName  # noqa: E501
from openapi_server.models.new_user_details import NewUserDetails  # noqa: E501
from openapi_server.models.page_bean_user import PageBeanUser  # noqa: E501
from openapi_server.models.unrestricted_user_email import UnrestrictedUserEmail  # noqa: E501
from openapi_server.models.user import User  # noqa: E501
from openapi_server.models.user_migration_bean import UserMigrationBean  # noqa: E501
from openapi_server import util


def bulk_get_users(account_id, start_at=None, max_results=None, username=None, key=None):  # noqa: E501
    """Bulk get users

    Returns a [paginated](#pagination) list of the users specified by one or more account IDs.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param account_id: The account ID of a user. To specify multiple users, pass multiple &#x60;accountId&#x60; parameters. For example, &#x60;accountId&#x3D;5b10a2844c20165700ede21g&amp;accountId&#x3D;5b10ac8d82e05b22cc7d4ef5&#x60;.
    :type account_id: List[str]
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param username: This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type username: List[str]
    :param key: This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type key: List[str]

    :rtype: Union[PageBeanUser, Tuple[PageBeanUser, int], Tuple[PageBeanUser, int, Dict[str, str]]
    """
    return 'do some magic!'


def bulk_get_users_migration(start_at=None, max_results=None, username=None, key=None):  # noqa: E501
    """Get account IDs for users

    Returns the account IDs for the users specified in the &#x60;key&#x60; or &#x60;username&#x60; parameters. Note that multiple &#x60;key&#x60; or &#x60;username&#x60; parameters can be specified.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param username: Username of a user. To specify multiple users, pass multiple copies of this parameter. For example, &#x60;username&#x3D;fred&amp;username&#x3D;barney&#x60;. Required if &#x60;key&#x60; isn&#39;t provided. Cannot be provided if &#x60;key&#x60; is present.
    :type username: List[str]
    :param key: Key of a user. To specify multiple users, pass multiple copies of this parameter. For example, &#x60;key&#x3D;fred&amp;key&#x3D;barney&#x60;. Required if &#x60;username&#x60; isn&#39;t provided. Cannot be provided if &#x60;username&#x60; is present.
    :type key: List[str]

    :rtype: Union[List[UserMigrationBean], Tuple[List[UserMigrationBean], int], Tuple[List[UserMigrationBean], int, Dict[str, str]]
    """
    return 'do some magic!'


def create_user(new_user_details):  # noqa: E501
    """Create user

    Creates a user. This resource is retained for legacy compatibility. As soon as a more suitable alternative is available this resource will be deprecated.  If the user exists and has access to Jira, the operation returns a 201 status. If the user exists but does not have access to Jira, the operation returns a 400 status.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param new_user_details: Details about the user to be created.
    :type new_user_details: dict | bytes

    :rtype: Union[User, Tuple[User, int], Tuple[User, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        new_user_details = NewUserDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_all_users(start_at=None, max_results=None):  # noqa: E501
    """Get all users

    Returns a list of all users, including active users, inactive users and previously deleted users that have an Atlassian account.  Privacy controls are applied to the response based on the users&#39; preferences. This could mean, for example, that the user&#39;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return.
    :type start_at: int
    :param max_results: The maximum number of items to return.
    :type max_results: int

    :rtype: Union[List[User], Tuple[List[User], int], Tuple[List[User], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_users_default(start_at=None, max_results=None):  # noqa: E501
    """Get all users default

    Returns a list of all users, including active users, inactive users and previously deleted users that have an Atlassian account.  Privacy controls are applied to the response based on the users&#39; preferences. This could mean, for example, that the user&#39;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return.
    :type start_at: int
    :param max_results: The maximum number of items to return.
    :type max_results: int

    :rtype: Union[List[User], Tuple[List[User], int], Tuple[List[User], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user(account_id=None, username=None, key=None, expand=None):  # noqa: E501
    """Get user

    Returns a user.  Privacy controls are applied to the response based on the user&#39;s preferences. This could mean, for example, that the user&#39;s email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param account_id: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required.
    :type account_id: str
    :param username: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details.
    :type username: str
    :param key: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details.
    :type key: str
    :param expand: Use [expand](#expansion) to include additional information about users in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;groups&#x60; includes all groups and nested groups to which the user belongs.  *  &#x60;applicationRoles&#x60; includes details of all the applications to which the user has access.
    :type expand: str

    :rtype: Union[User, Tuple[User, int], Tuple[User, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_default_columns(account_id=None, username=None):  # noqa: E501
    """Get user default columns

    Returns the default [issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If &#x60;accountId&#x60; is not passed in the request, the calling user&#39;s details are returned.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLgl), to get the column details for any user.  *  Permission to access Jira, to get the calling user&#39;s column details. # noqa: E501

    :param account_id: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    :type account_id: str
    :param username: This parameter is no longer available See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type username: str

    :rtype: Union[List[ColumnItem], Tuple[List[ColumnItem], int], Tuple[List[ColumnItem], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_email(account_id):  # noqa: E501
    """Get user email

    Returns a user&#39;s email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603). # noqa: E501

    :param account_id: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, &#x60;5b10ac8d82e05b22cc7d4ef5&#x60;.
    :type account_id: str

    :rtype: Union[UnrestrictedUserEmail, Tuple[UnrestrictedUserEmail, int], Tuple[UnrestrictedUserEmail, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_email_bulk(account_id):  # noqa: E501
    """Get user email bulk

    Returns a user&#39;s email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603). # noqa: E501

    :param account_id: The account IDs of the users for which emails are required. An &#x60;accountId&#x60; is an identifier that uniquely identifies the user across all Atlassian products. For example, &#x60;5b10ac8d82e05b22cc7d4ef5&#x60;. Note, this should be treated as an opaque identifier (that is, do not assume any structure in the value).
    :type account_id: List[str]

    :rtype: Union[UnrestrictedUserEmail, Tuple[UnrestrictedUserEmail, int], Tuple[UnrestrictedUserEmail, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_groups(account_id, username=None, key=None):  # noqa: E501
    """Get user groups

    Returns the groups to which a user belongs.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param account_id: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    :type account_id: str
    :param username: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type username: str
    :param key: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type key: str

    :rtype: Union[List[GroupName], Tuple[List[GroupName], int], Tuple[List[GroupName], int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_user(account_id, username=None, key=None):  # noqa: E501
    """Delete user

    Deletes a user. If the operation completes successfully then the user is removed from Jira&#39;s user base. This operation does not delete the user&#39;s Atlassian account.  **[Permissions](#permissions) required:** Site administration (that is, membership of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)). # noqa: E501

    :param account_id: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    :type account_id: str
    :param username: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type username: str
    :param key: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def reset_user_columns(account_id=None, username=None):  # noqa: E501
    """Reset user default columns

    Resets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user to the system default. If &#x60;accountId&#x60; is not passed, the calling user&#39;s default columns are reset.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.  *  Permission to access Jira, to set the calling user&#39;s columns. # noqa: E501

    :param account_id: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    :type account_id: str
    :param username: This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
    :type username: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_user_columns(account_id=None, request_body=None):  # noqa: E501
    """Set user default columns

    Sets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If an account ID is not passed, the calling user&#39;s default columns are set. If no column details are sent, then all default columns are removed.  The parameters for this resource are expressed as HTML form data. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/user/columns?accountId&#x3D;5b10ac8d82e05b22cc7d4ef5&#39;&#x60;  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.  *  Permission to access Jira, to set the calling user&#39;s columns. # noqa: E501

    :param account_id: The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
    :type account_id: str
    :param request_body: The ID of a column to set. To set multiple columns, send multiple &#x60;columns&#x60; parameters.
    :type request_body: List[str]

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'
