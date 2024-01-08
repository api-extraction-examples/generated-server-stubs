import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.comments_response import CommentsResponse  # noqa: E501
from openapi_server.models.status_response import StatusResponse  # noqa: E501
from openapi_server import util


def media_media_id_comments_comment_id_delete(media_id, comment_id):  # noqa: E501
    """Remove a comment.

    Remove a comment either on the authenticated user&#39;s media object or authored by the authenticated user.  # noqa: E501

    :param media_id: The ID of the media resource.
    :type media_id: str
    :param comment_id: The ID of the comment entry.
    :type comment_id: str

    :rtype: Union[StatusResponse, Tuple[StatusResponse, int], Tuple[StatusResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def media_media_id_comments_get(media_id):  # noqa: E501
    """Get a list of recent comments on a media object.

    Get a list of recent comments on a media object. # noqa: E501

    :param media_id: The ID of the media resource.
    :type media_id: str

    :rtype: Union[CommentsResponse, Tuple[CommentsResponse, int], Tuple[CommentsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def media_media_id_comments_post(media_id, text):  # noqa: E501
    """Create a comment on a media object.

    Create a comment on a media object with the following rules:    * The total length of the comment cannot exceed 300 characters.   * The comment cannot contain more than 4 hashtags.   * The comment cannot contain more than 1 URL.   * The comment cannot consist of all capital letters.  # noqa: E501

    :param media_id: The ID of the media resource.
    :type media_id: str
    :param text: Text to post as a comment on the media object as specified in &#x60;media-id&#x60;.
    :type text: str

    :rtype: Union[StatusResponse, Tuple[StatusResponse, int], Tuple[StatusResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
