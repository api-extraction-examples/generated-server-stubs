import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.status_response import StatusResponse  # noqa: E501
from openapi_server.models.users_info_response import UsersInfoResponse  # noqa: E501
from openapi_server import util


def media_media_id_likes_delete(media_id):  # noqa: E501
    """Remove a like on this media by the current user.

    Remove a like on this media by the currently authenticated user. # noqa: E501

    :param media_id: The ID of the media resource.
    :type media_id: str

    :rtype: Union[StatusResponse, Tuple[StatusResponse, int], Tuple[StatusResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def media_media_id_likes_get(media_id):  # noqa: E501
    """Get a list of users who have liked this media.

    Get a list of users who have liked this media. # noqa: E501

    :param media_id: The ID of the media resource.
    :type media_id: str

    :rtype: Union[UsersInfoResponse, Tuple[UsersInfoResponse, int], Tuple[UsersInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def media_media_id_likes_post(media_id):  # noqa: E501
    """Set a like on this media by the current user.

    Set a like on this media by the currently authenticated user. # noqa: E501

    :param media_id: The ID of the media resource.
    :type media_id: str

    :rtype: Union[StatusResponse, Tuple[StatusResponse, int], Tuple[StatusResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
