import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.play_method import PlayMethod  # noqa: E501
from openapi_server.models.playback_progress_info import PlaybackProgressInfo  # noqa: E501
from openapi_server.models.playback_start_info import PlaybackStartInfo  # noqa: E501
from openapi_server.models.playback_stop_info import PlaybackStopInfo  # noqa: E501
from openapi_server.models.repeat_mode import RepeatMode  # noqa: E501
from openapi_server.models.user_item_data_dto import UserItemDataDto  # noqa: E501
from openapi_server import util


def mark_played_item(user_id, item_id, date_played=None):  # noqa: E501
    """Marks an item as played for user.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param date_played: Optional. The date the item was played.
    :type date_played: str

    :rtype: Union[UserItemDataDto, Tuple[UserItemDataDto, int], Tuple[UserItemDataDto, int, Dict[str, str]]
    """
    date_played = util.deserialize_datetime(date_played)
    return 'do some magic!'


def mark_unplayed_item(user_id, item_id):  # noqa: E501
    """Marks an item as unplayed for user.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[UserItemDataDto, Tuple[UserItemDataDto, int], Tuple[UserItemDataDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def on_playback_progress(user_id, item_id, media_source_id=None, position_ticks=None, audio_stream_index=None, subtitle_stream_index=None, volume_level=None, play_method=None, live_stream_id=None, play_session_id=None, repeat_mode=None, is_paused=None, is_muted=None):  # noqa: E501
    """Reports a user&#39;s playback progress.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param media_source_id: The id of the MediaSource.
    :type media_source_id: str
    :param position_ticks: Optional. The current position, in ticks. 1 tick &#x3D; 10000 ms.
    :type position_ticks: int
    :param audio_stream_index: The audio stream index.
    :type audio_stream_index: int
    :param subtitle_stream_index: The subtitle stream index.
    :type subtitle_stream_index: int
    :param volume_level: Scale of 0-100.
    :type volume_level: int
    :param play_method: The play method.
    :type play_method: dict | bytes
    :param live_stream_id: The live stream id.
    :type live_stream_id: str
    :param play_session_id: The play session id.
    :type play_session_id: str
    :param repeat_mode: The repeat mode.
    :type repeat_mode: dict | bytes
    :param is_paused: Indicates if the player is paused.
    :type is_paused: bool
    :param is_muted: Indicates if the player is muted.
    :type is_muted: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        play_method =  PlayMethod.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        repeat_mode =  RepeatMode.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def on_playback_start(user_id, item_id, media_source_id=None, audio_stream_index=None, subtitle_stream_index=None, play_method=None, live_stream_id=None, play_session_id=None, can_seek=None):  # noqa: E501
    """Reports that a user has begun playing an item.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param media_source_id: The id of the MediaSource.
    :type media_source_id: str
    :param audio_stream_index: The audio stream index.
    :type audio_stream_index: int
    :param subtitle_stream_index: The subtitle stream index.
    :type subtitle_stream_index: int
    :param play_method: The play method.
    :type play_method: dict | bytes
    :param live_stream_id: The live stream id.
    :type live_stream_id: str
    :param play_session_id: The play session id.
    :type play_session_id: str
    :param can_seek: Indicates if the client can seek.
    :type can_seek: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        play_method =  PlayMethod.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def on_playback_stopped(user_id, item_id, media_source_id=None, next_media_type=None, position_ticks=None, live_stream_id=None, play_session_id=None):  # noqa: E501
    """Reports that a user has stopped playing an item.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param media_source_id: The id of the MediaSource.
    :type media_source_id: str
    :param next_media_type: The next media type that will play.
    :type next_media_type: str
    :param position_ticks: Optional. The position, in ticks, where playback stopped. 1 tick &#x3D; 10000 ms.
    :type position_ticks: int
    :param live_stream_id: The live stream id.
    :type live_stream_id: str
    :param play_session_id: The play session id.
    :type play_session_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def ping_playback_session(play_session_id=None):  # noqa: E501
    """Pings a playback session.

     # noqa: E501

    :param play_session_id: Playback session id.
    :type play_session_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def report_playback_progress(playback_progress_info=None):  # noqa: E501
    """Reports playback progress within a session.

     # noqa: E501

    :param playback_progress_info: The playback progress info.
    :type playback_progress_info: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        playback_progress_info = PlaybackProgressInfo.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def report_playback_start(playback_start_info=None):  # noqa: E501
    """Reports playback has started within a session.

     # noqa: E501

    :param playback_start_info: The playback start info.
    :type playback_start_info: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        playback_start_info = PlaybackStartInfo.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def report_playback_stopped(playback_stop_info=None):  # noqa: E501
    """Reports playback has stopped within a session.

     # noqa: E501

    :param playback_stop_info: The playback stop info.
    :type playback_stop_info: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        playback_stop_info = PlaybackStopInfo.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
