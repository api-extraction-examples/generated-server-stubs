import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.relationship_post_response import RelationshipPostResponse  # noqa: E501
from openapi_server.models.relationship_response import RelationshipResponse  # noqa: E501
from openapi_server.models.users_info_response import UsersInfoResponse  # noqa: E501
from openapi_server.models.users_paging_response import UsersPagingResponse  # noqa: E501
from openapi_server import util


def users_self_requested_by_get():  # noqa: E501
    """List the users who have requested this user&#39;s permission to follow.

    List the users who have requested this user&#39;s permission to follow. # noqa: E501


    :rtype: Union[UsersInfoResponse, Tuple[UsersInfoResponse, int], Tuple[UsersInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_user_id_followed_by_get(user_id):  # noqa: E501
    """Get the list of users this user is followed by.

    Get the list of users this user is followed by. To get users followed by the owner of the access token, you can use **self** instead of the &#x60;user-id&#x60;.  # noqa: E501

    :param user_id: The ID of a user, or **self** to retrieve information about authenticated user.
    :type user_id: str

    :rtype: Union[UsersPagingResponse, Tuple[UsersPagingResponse, int], Tuple[UsersPagingResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_user_id_follows_get(user_id):  # noqa: E501
    """Get the list of users this user follows.

    Get the list of users this user follows. To get follows of the owner of the access token, you can use **self** instead of the &#x60;user-id&#x60;.  # noqa: E501

    :param user_id: The ID of a user, or **self** to retrieve information about authenticated user.
    :type user_id: str

    :rtype: Union[UsersPagingResponse, Tuple[UsersPagingResponse, int], Tuple[UsersPagingResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_user_id_relationship_get(user_id):  # noqa: E501
    """Get information about a relationship to another user.

    Get information about a relationship to another user. # noqa: E501

    :param user_id: The ID of a user to get information about.
    :type user_id: str

    :rtype: Union[RelationshipResponse, Tuple[RelationshipResponse, int], Tuple[RelationshipResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def users_user_id_relationship_post(user_id, action):  # noqa: E501
    """Modify the relationship between the current user and the target user.

    Modify the relationship between the current user and the target user. # noqa: E501

    :param user_id: The ID of the target user.
    :type user_id: str
    :param action: Type of action to apply for relationship with the user.
    :type action: str

    :rtype: Union[RelationshipPostResponse, Tuple[RelationshipPostResponse, int], Tuple[RelationshipPostResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
