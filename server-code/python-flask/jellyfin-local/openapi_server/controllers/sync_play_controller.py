import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.buffer_request_dto import BufferRequestDto  # noqa: E501
from openapi_server.models.group_info_dto import GroupInfoDto  # noqa: E501
from openapi_server.models.ignore_wait_request_dto import IgnoreWaitRequestDto  # noqa: E501
from openapi_server.models.join_group_request_dto import JoinGroupRequestDto  # noqa: E501
from openapi_server.models.move_playlist_item_request_dto import MovePlaylistItemRequestDto  # noqa: E501
from openapi_server.models.new_group_request_dto import NewGroupRequestDto  # noqa: E501
from openapi_server.models.next_item_request_dto import NextItemRequestDto  # noqa: E501
from openapi_server.models.ping_request_dto import PingRequestDto  # noqa: E501
from openapi_server.models.play_request_dto import PlayRequestDto  # noqa: E501
from openapi_server.models.previous_item_request_dto import PreviousItemRequestDto  # noqa: E501
from openapi_server.models.queue_request_dto import QueueRequestDto  # noqa: E501
from openapi_server.models.ready_request_dto import ReadyRequestDto  # noqa: E501
from openapi_server.models.remove_from_playlist_request_dto import RemoveFromPlaylistRequestDto  # noqa: E501
from openapi_server.models.seek_request_dto import SeekRequestDto  # noqa: E501
from openapi_server.models.set_playlist_item_request_dto import SetPlaylistItemRequestDto  # noqa: E501
from openapi_server.models.set_repeat_mode_request_dto import SetRepeatModeRequestDto  # noqa: E501
from openapi_server.models.set_shuffle_mode_request_dto import SetShuffleModeRequestDto  # noqa: E501
from openapi_server import util


def sync_play_buffering(buffer_request_dto):  # noqa: E501
    """Notify SyncPlay group that member is buffering.

     # noqa: E501

    :param buffer_request_dto: The player status.
    :type buffer_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        buffer_request_dto = BufferRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_create_group(new_group_request_dto):  # noqa: E501
    """Create a new SyncPlay group.

     # noqa: E501

    :param new_group_request_dto: The settings of the new group.
    :type new_group_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        new_group_request_dto = NewGroupRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_get_groups():  # noqa: E501
    """Gets all SyncPlay groups.

     # noqa: E501


    :rtype: Union[List[GroupInfoDto], Tuple[List[GroupInfoDto], int], Tuple[List[GroupInfoDto], int, Dict[str, str]]
    """
    return 'do some magic!'


def sync_play_join_group(join_group_request_dto):  # noqa: E501
    """Join an existing SyncPlay group.

     # noqa: E501

    :param join_group_request_dto: The group to join.
    :type join_group_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        join_group_request_dto = JoinGroupRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_leave_group():  # noqa: E501
    """Leave the joined SyncPlay group.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def sync_play_move_playlist_item(move_playlist_item_request_dto):  # noqa: E501
    """Request to move an item in the playlist in SyncPlay group.

     # noqa: E501

    :param move_playlist_item_request_dto: The new position for the item.
    :type move_playlist_item_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        move_playlist_item_request_dto = MovePlaylistItemRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_next_item(next_item_request_dto):  # noqa: E501
    """Request next item in SyncPlay group.

     # noqa: E501

    :param next_item_request_dto: The current item information.
    :type next_item_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        next_item_request_dto = NextItemRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_pause():  # noqa: E501
    """Request pause in SyncPlay group.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def sync_play_ping(ping_request_dto):  # noqa: E501
    """Update session ping.

     # noqa: E501

    :param ping_request_dto: The new ping.
    :type ping_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        ping_request_dto = PingRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_previous_item(previous_item_request_dto):  # noqa: E501
    """Request previous item in SyncPlay group.

     # noqa: E501

    :param previous_item_request_dto: The current item information.
    :type previous_item_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        previous_item_request_dto = PreviousItemRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_queue(queue_request_dto):  # noqa: E501
    """Request to queue items to the playlist of a SyncPlay group.

     # noqa: E501

    :param queue_request_dto: The items to add.
    :type queue_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        queue_request_dto = QueueRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_ready(ready_request_dto):  # noqa: E501
    """Notify SyncPlay group that member is ready for playback.

     # noqa: E501

    :param ready_request_dto: The player status.
    :type ready_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        ready_request_dto = ReadyRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_remove_from_playlist(remove_from_playlist_request_dto):  # noqa: E501
    """Request to remove items from the playlist in SyncPlay group.

     # noqa: E501

    :param remove_from_playlist_request_dto: The items to remove.
    :type remove_from_playlist_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        remove_from_playlist_request_dto = RemoveFromPlaylistRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_seek(seek_request_dto):  # noqa: E501
    """Request seek in SyncPlay group.

     # noqa: E501

    :param seek_request_dto: The new playback position.
    :type seek_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        seek_request_dto = SeekRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_set_ignore_wait(ignore_wait_request_dto):  # noqa: E501
    """Request SyncPlay group to ignore member during group-wait.

     # noqa: E501

    :param ignore_wait_request_dto: The settings to set.
    :type ignore_wait_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        ignore_wait_request_dto = IgnoreWaitRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_set_new_queue(play_request_dto):  # noqa: E501
    """Request to set new playlist in SyncPlay group.

     # noqa: E501

    :param play_request_dto: The new playlist to play in the group.
    :type play_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        play_request_dto = PlayRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_set_playlist_item(set_playlist_item_request_dto):  # noqa: E501
    """Request to change playlist item in SyncPlay group.

     # noqa: E501

    :param set_playlist_item_request_dto: The new item to play.
    :type set_playlist_item_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_playlist_item_request_dto = SetPlaylistItemRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_set_repeat_mode(set_repeat_mode_request_dto):  # noqa: E501
    """Request to set repeat mode in SyncPlay group.

     # noqa: E501

    :param set_repeat_mode_request_dto: The new repeat mode.
    :type set_repeat_mode_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_repeat_mode_request_dto = SetRepeatModeRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_set_shuffle_mode(set_shuffle_mode_request_dto):  # noqa: E501
    """Request to set shuffle mode in SyncPlay group.

     # noqa: E501

    :param set_shuffle_mode_request_dto: The new shuffle mode.
    :type set_shuffle_mode_request_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        set_shuffle_mode_request_dto = SetShuffleModeRequestDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def sync_play_stop():  # noqa: E501
    """Request stop in SyncPlay group.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def sync_play_unpause():  # noqa: E501
    """Request unpause in SyncPlay group.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
