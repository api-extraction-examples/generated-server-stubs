import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_attachment(video_id, media_source_id, index):  # noqa: E501
    """Get video attachment.

     # noqa: E501

    :param video_id: Video ID.
    :type video_id: str
    :type video_id: str
    :param media_source_id: Media Source ID.
    :type media_source_id: str
    :param index: Attachment Index.
    :type index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'
