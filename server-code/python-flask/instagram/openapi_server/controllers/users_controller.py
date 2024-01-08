import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.media_list_response import MediaListResponse  # noqa: E501
from openapi_server.models.user_response import UserResponse  # noqa: E501
from openapi_server.models.users_info_response import UsersInfoResponse  # noqa: E501
from openapi_server import util


def users_search_get(q, count=None):  # noqa: E501
    """Search for a user by name.

    Search for a user by name. # noqa: E501

    :param q: A query string.
    :type q: str
    :param count: Number of users to return.
    :type count: int

    :rtype: Union[UsersInfoResponse, Tuple[UsersInfoResponse, int], Tuple[UsersInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_self_feed_get(count=None, min_id=None, max_id=None):  # noqa: E501
    """See the authenticated user&#39;s feed.

    See the authenticated user&#39;s feed.  **Warning:** [Deprecated](http://instagram.com/developer/changelog/) for Apps created **on or after** Nov 17, 2015  # noqa: E501

    :param count: Count of media to return.
    :type count: int
    :param min_id: Return media later than this &#x60;min_id&#x60;.
    :type min_id: str
    :param max_id: Return media earlier than this &#x60;max_id&#x60;.
    :type max_id: str

    :rtype: Union[MediaListResponse, Tuple[MediaListResponse, int], Tuple[MediaListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_self_media_liked_get(count=None, max_like_id=None):  # noqa: E501
    """See the list of media liked by the authenticated user.

    See the list of media liked by the authenticated user. Private media is returned as long as the authenticated user has permission to view that media. Liked media lists are only available for the currently authenticated user.  # noqa: E501

    :param count: Count of media to return.
    :type count: int
    :param max_like_id: Return media liked before this id.
    :type max_like_id: str

    :rtype: Union[MediaListResponse, Tuple[MediaListResponse, int], Tuple[MediaListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_user_id_get(user_id):  # noqa: E501
    """Get basic information about a user.

    Get basic information about a user. To get information about the owner of the access token, you can use **self** instead of the &#x60;user-id&#x60;.  Security scope &#x60;public_content&#x60; is required to read information about other users.  # noqa: E501

    :param user_id: The ID of a user to get information about, or **self** to retrieve information about authenticated user.
    :type user_id: str

    :rtype: Union[UserResponse, Tuple[UserResponse, int], Tuple[UserResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_user_id_media_recent_get(user_id, count=None, max_timestamp=None, min_timestamp=None, min_id=None, max_id=None):  # noqa: E501
    """Get the most recent media published by a user.

    Get the most recent media published by a user. To get the most recent media published by the owner of the access token, you can use **self** instead of the &#x60;user-id&#x60;.  Security scope &#x60;public_content&#x60; is required to read information about other users.  # noqa: E501

    :param user_id: The ID of a user to get recent media of, or **self** to retrieve media of authenticated user.
    :type user_id: str
    :param count: Count of media to return.
    :type count: int
    :param max_timestamp: Return media before this UNIX timestamp.
    :type max_timestamp: int
    :param min_timestamp: Return media after this UNIX timestamp.
    :type min_timestamp: int
    :param min_id: Return media later than this &#x60;min_id&#x60;.
    :type min_id: str
    :param max_id: Return media earlier than this &#x60;max_id&#x60;.
    :type max_id: str

    :rtype: Union[MediaListResponse, Tuple[MediaListResponse, int], Tuple[MediaListResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
