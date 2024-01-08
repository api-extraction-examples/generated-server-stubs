import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.user_record import UserRecord  # noqa: E501
from openapi_server.models.users import Users  # noqa: E501
from openapi_server import util


def delete_user(project_key, environment_key, user_key):  # noqa: E501
    """Delete a user by ID.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_key: The user&#39;s key.
    :type user_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_search_users(project_key, environment_key, q=None, limit=None, offset=None, after=None):  # noqa: E501
    """Search users in LaunchDarkly based on their last active date, or a search query. It should not be used to enumerate all users in LaunchDarkly-- use the List users API resource.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param q: Search query.
    :type q: str
    :param limit: Pagination limit.
    :type limit: int
    :param offset: Specifies the first item to return in the collection.
    :type offset: int
    :param after: A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occurred after this timestamp.
    :type after: int

    :rtype: Union[Users, Tuple[Users, int], Tuple[Users, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user(project_key, environment_key, user_key):  # noqa: E501
    """Get a user by key.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param user_key: The user&#39;s key.
    :type user_key: str

    :rtype: Union[UserRecord, Tuple[UserRecord, int], Tuple[UserRecord, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_users(project_key, environment_key, limit=None, h=None, scroll_id=None):  # noqa: E501
    """List all users in the environment. Includes the total count of users. In each page, there will be up to &#39;limit&#39; users returned (default 20). This is useful for exporting all users in the system for further analysis. Paginated collections will include a next link containing a URL with the next set of elements in the collection.

     # noqa: E501

    :param project_key: The project key, used to tie the flags together under one project so they can be managed together.
    :type project_key: str
    :param environment_key: The environment key, used to tie together flag configuration and users under one environment so they can be managed together.
    :type environment_key: str
    :param limit: Pagination limit.
    :type limit: int
    :param h: This parameter is required when following \&quot;next\&quot; links.
    :type h: str
    :param scroll_id: This parameter is required when following \&quot;next\&quot; links.
    :type scroll_id: str

    :rtype: Union[Users, Tuple[Users, int], Tuple[Users, int, Dict[str, str]]
    """
    return 'do some magic!'
