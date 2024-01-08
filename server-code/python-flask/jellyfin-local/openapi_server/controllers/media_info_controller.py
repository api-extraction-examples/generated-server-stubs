import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.live_stream_response import LiveStreamResponse  # noqa: E501
from openapi_server.models.open_live_stream_dto import OpenLiveStreamDto  # noqa: E501
from openapi_server.models.playback_info_dto import PlaybackInfoDto  # noqa: E501
from openapi_server.models.playback_info_response import PlaybackInfoResponse  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def close_live_stream(live_stream_id):  # noqa: E501
    """Closes a media source.

     # noqa: E501

    :param live_stream_id: The livestream id.
    :type live_stream_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_bitrate_test_bytes(size=None):  # noqa: E501
    """Tests the network with a request with the size of the bitrate.

     # noqa: E501

    :param size: The bitrate. Defaults to 102400.
    :type size: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_playback_info(item_id, user_id):  # noqa: E501
    """Gets live playback media info for an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param user_id: The user id.
    :type user_id: str
    :type user_id: str

    :rtype: Union[PlaybackInfoResponse, Tuple[PlaybackInfoResponse, int], Tuple[PlaybackInfoResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_posted_playback_info(item_id, user_id=None, max_streaming_bitrate=None, start_time_ticks=None, audio_stream_index=None, subtitle_stream_index=None, max_audio_channels=None, media_source_id=None, live_stream_id=None, auto_open_live_stream=None, enable_direct_play=None, enable_direct_stream=None, enable_transcoding=None, allow_video_stream_copy=None, allow_audio_stream_copy=None, playback_info_dto=None):  # noqa: E501
    """Gets live playback media info for an item.

    For backwards compatibility parameters can be sent via Query or Body, with Query having higher precedence. # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param max_streaming_bitrate: The maximum streaming bitrate.
    :type max_streaming_bitrate: int
    :param start_time_ticks: The start time in ticks.
    :type start_time_ticks: int
    :param audio_stream_index: The audio stream index.
    :type audio_stream_index: int
    :param subtitle_stream_index: The subtitle stream index.
    :type subtitle_stream_index: int
    :param max_audio_channels: The maximum number of audio channels.
    :type max_audio_channels: int
    :param media_source_id: The media source id.
    :type media_source_id: str
    :param live_stream_id: The livestream id.
    :type live_stream_id: str
    :param auto_open_live_stream: Whether to auto open the livestream.
    :type auto_open_live_stream: bool
    :param enable_direct_play: Whether to enable direct play. Default: true.
    :type enable_direct_play: bool
    :param enable_direct_stream: Whether to enable direct stream. Default: true.
    :type enable_direct_stream: bool
    :param enable_transcoding: Whether to enable transcoding. Default: true.
    :type enable_transcoding: bool
    :param allow_video_stream_copy: Whether to allow to copy the video stream. Default: true.
    :type allow_video_stream_copy: bool
    :param allow_audio_stream_copy: Whether to allow to copy the audio stream. Default: true.
    :type allow_audio_stream_copy: bool
    :param playback_info_dto: The playback info.
    :type playback_info_dto: dict | bytes

    :rtype: Union[PlaybackInfoResponse, Tuple[PlaybackInfoResponse, int], Tuple[PlaybackInfoResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        playback_info_dto = PlaybackInfoDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def open_live_stream(open_token=None, user_id=None, play_session_id=None, max_streaming_bitrate=None, start_time_ticks=None, audio_stream_index=None, subtitle_stream_index=None, max_audio_channels=None, item_id=None, enable_direct_play=None, enable_direct_stream=None, open_live_stream_dto=None):  # noqa: E501
    """Opens a media source.

     # noqa: E501

    :param open_token: The open token.
    :type open_token: str
    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param play_session_id: The play session id.
    :type play_session_id: str
    :param max_streaming_bitrate: The maximum streaming bitrate.
    :type max_streaming_bitrate: int
    :param start_time_ticks: The start time in ticks.
    :type start_time_ticks: int
    :param audio_stream_index: The audio stream index.
    :type audio_stream_index: int
    :param subtitle_stream_index: The subtitle stream index.
    :type subtitle_stream_index: int
    :param max_audio_channels: The maximum number of audio channels.
    :type max_audio_channels: int
    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param enable_direct_play: Whether to enable direct play. Default: true.
    :type enable_direct_play: bool
    :param enable_direct_stream: Whether to enable direct stream. Default: true.
    :type enable_direct_stream: bool
    :param open_live_stream_dto: The open live stream dto.
    :type open_live_stream_dto: dict | bytes

    :rtype: Union[LiveStreamResponse, Tuple[LiveStreamResponse, int], Tuple[LiveStreamResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        open_live_stream_dto = OpenLiveStreamDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
