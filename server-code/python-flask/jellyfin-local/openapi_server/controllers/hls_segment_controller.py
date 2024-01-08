import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_hls_audio_segment_legacy_aac(item_id, segment_id):  # noqa: E501
    """Gets the specified audio segment for an audio item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :param segment_id: The segment id.
    :type segment_id: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_hls_audio_segment_legacy_mp3(item_id, segment_id):  # noqa: E501
    """Gets the specified audio segment for an audio item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :param segment_id: The segment id.
    :type segment_id: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_hls_playlist_legacy(item_id, playlist_id):  # noqa: E501
    """Gets a hls video playlist.

     # noqa: E501

    :param item_id: The video id.
    :type item_id: str
    :param playlist_id: The playlist id.
    :type playlist_id: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_hls_video_segment_legacy(item_id, playlist_id, segment_id, segment_container):  # noqa: E501
    """Gets a hls video segment.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :param playlist_id: The playlist id.
    :type playlist_id: str
    :param segment_id: The segment id.
    :type segment_id: str
    :param segment_container: The segment container.
    :type segment_container: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def stop_encoding_process(device_id=None, play_session_id=None):  # noqa: E501
    """Stops an active encoding.

     # noqa: E501

    :param device_id: The device id of the client requesting. Used to stop encoding processes when needed.
    :type device_id: str
    :param play_session_id: The play session id.
    :type play_session_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
