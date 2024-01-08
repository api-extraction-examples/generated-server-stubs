from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.base_item_dto import BaseItemDto
from openapi_server.models.queue_item import QueueItem
from openapi_server import util

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.queue_item import QueueItem  # noqa: E501

class PlaybackStopInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, failed=None, item=None, item_id=None, live_stream_id=None, media_source_id=None, next_media_type=None, now_playing_queue=None, play_session_id=None, playlist_item_id=None, position_ticks=None, session_id=None):  # noqa: E501
        """PlaybackStopInfo - a model defined in OpenAPI

        :param failed: The failed of this PlaybackStopInfo.  # noqa: E501
        :type failed: bool
        :param item: The item of this PlaybackStopInfo.  # noqa: E501
        :type item: BaseItemDto
        :param item_id: The item_id of this PlaybackStopInfo.  # noqa: E501
        :type item_id: str
        :param live_stream_id: The live_stream_id of this PlaybackStopInfo.  # noqa: E501
        :type live_stream_id: str
        :param media_source_id: The media_source_id of this PlaybackStopInfo.  # noqa: E501
        :type media_source_id: str
        :param next_media_type: The next_media_type of this PlaybackStopInfo.  # noqa: E501
        :type next_media_type: str
        :param now_playing_queue: The now_playing_queue of this PlaybackStopInfo.  # noqa: E501
        :type now_playing_queue: List[QueueItem]
        :param play_session_id: The play_session_id of this PlaybackStopInfo.  # noqa: E501
        :type play_session_id: str
        :param playlist_item_id: The playlist_item_id of this PlaybackStopInfo.  # noqa: E501
        :type playlist_item_id: str
        :param position_ticks: The position_ticks of this PlaybackStopInfo.  # noqa: E501
        :type position_ticks: int
        :param session_id: The session_id of this PlaybackStopInfo.  # noqa: E501
        :type session_id: str
        """
        self.openapi_types = {
            'failed': bool,
            'item': BaseItemDto,
            'item_id': str,
            'live_stream_id': str,
            'media_source_id': str,
            'next_media_type': str,
            'now_playing_queue': List[QueueItem],
            'play_session_id': str,
            'playlist_item_id': str,
            'position_ticks': int,
            'session_id': str
        }

        self.attribute_map = {
            'failed': 'Failed',
            'item': 'Item',
            'item_id': 'ItemId',
            'live_stream_id': 'LiveStreamId',
            'media_source_id': 'MediaSourceId',
            'next_media_type': 'NextMediaType',
            'now_playing_queue': 'NowPlayingQueue',
            'play_session_id': 'PlaySessionId',
            'playlist_item_id': 'PlaylistItemId',
            'position_ticks': 'PositionTicks',
            'session_id': 'SessionId'
        }

        self._failed = failed
        self._item = item
        self._item_id = item_id
        self._live_stream_id = live_stream_id
        self._media_source_id = media_source_id
        self._next_media_type = next_media_type
        self._now_playing_queue = now_playing_queue
        self._play_session_id = play_session_id
        self._playlist_item_id = playlist_item_id
        self._position_ticks = position_ticks
        self._session_id = session_id

    @classmethod
    def from_dict(cls, dikt) -> 'PlaybackStopInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PlaybackStopInfo of this PlaybackStopInfo.  # noqa: E501
        :rtype: PlaybackStopInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def failed(self) -> bool:
        """Gets the failed of this PlaybackStopInfo.

        Gets or sets a value indicating whether this MediaBrowser.Model.Session.PlaybackStopInfo is failed.  # noqa: E501

        :return: The failed of this PlaybackStopInfo.
        :rtype: bool
        """
        return self._failed

    @failed.setter
    def failed(self, failed: bool):
        """Sets the failed of this PlaybackStopInfo.

        Gets or sets a value indicating whether this MediaBrowser.Model.Session.PlaybackStopInfo is failed.  # noqa: E501

        :param failed: The failed of this PlaybackStopInfo.
        :type failed: bool
        """

        self._failed = failed

    @property
    def item(self) -> BaseItemDto:
        """Gets the item of this PlaybackStopInfo.


        :return: The item of this PlaybackStopInfo.
        :rtype: BaseItemDto
        """
        return self._item

    @item.setter
    def item(self, item: BaseItemDto):
        """Sets the item of this PlaybackStopInfo.


        :param item: The item of this PlaybackStopInfo.
        :type item: BaseItemDto
        """

        self._item = item

    @property
    def item_id(self) -> str:
        """Gets the item_id of this PlaybackStopInfo.

        Gets or sets the item identifier.  # noqa: E501

        :return: The item_id of this PlaybackStopInfo.
        :rtype: str
        """
        return self._item_id

    @item_id.setter
    def item_id(self, item_id: str):
        """Sets the item_id of this PlaybackStopInfo.

        Gets or sets the item identifier.  # noqa: E501

        :param item_id: The item_id of this PlaybackStopInfo.
        :type item_id: str
        """

        self._item_id = item_id

    @property
    def live_stream_id(self) -> str:
        """Gets the live_stream_id of this PlaybackStopInfo.

        Gets or sets the live stream identifier.  # noqa: E501

        :return: The live_stream_id of this PlaybackStopInfo.
        :rtype: str
        """
        return self._live_stream_id

    @live_stream_id.setter
    def live_stream_id(self, live_stream_id: str):
        """Sets the live_stream_id of this PlaybackStopInfo.

        Gets or sets the live stream identifier.  # noqa: E501

        :param live_stream_id: The live_stream_id of this PlaybackStopInfo.
        :type live_stream_id: str
        """

        self._live_stream_id = live_stream_id

    @property
    def media_source_id(self) -> str:
        """Gets the media_source_id of this PlaybackStopInfo.

        Gets or sets the media version identifier.  # noqa: E501

        :return: The media_source_id of this PlaybackStopInfo.
        :rtype: str
        """
        return self._media_source_id

    @media_source_id.setter
    def media_source_id(self, media_source_id: str):
        """Sets the media_source_id of this PlaybackStopInfo.

        Gets or sets the media version identifier.  # noqa: E501

        :param media_source_id: The media_source_id of this PlaybackStopInfo.
        :type media_source_id: str
        """

        self._media_source_id = media_source_id

    @property
    def next_media_type(self) -> str:
        """Gets the next_media_type of this PlaybackStopInfo.


        :return: The next_media_type of this PlaybackStopInfo.
        :rtype: str
        """
        return self._next_media_type

    @next_media_type.setter
    def next_media_type(self, next_media_type: str):
        """Sets the next_media_type of this PlaybackStopInfo.


        :param next_media_type: The next_media_type of this PlaybackStopInfo.
        :type next_media_type: str
        """

        self._next_media_type = next_media_type

    @property
    def now_playing_queue(self) -> List[QueueItem]:
        """Gets the now_playing_queue of this PlaybackStopInfo.


        :return: The now_playing_queue of this PlaybackStopInfo.
        :rtype: List[QueueItem]
        """
        return self._now_playing_queue

    @now_playing_queue.setter
    def now_playing_queue(self, now_playing_queue: List[QueueItem]):
        """Sets the now_playing_queue of this PlaybackStopInfo.


        :param now_playing_queue: The now_playing_queue of this PlaybackStopInfo.
        :type now_playing_queue: List[QueueItem]
        """

        self._now_playing_queue = now_playing_queue

    @property
    def play_session_id(self) -> str:
        """Gets the play_session_id of this PlaybackStopInfo.

        Gets or sets the play session identifier.  # noqa: E501

        :return: The play_session_id of this PlaybackStopInfo.
        :rtype: str
        """
        return self._play_session_id

    @play_session_id.setter
    def play_session_id(self, play_session_id: str):
        """Sets the play_session_id of this PlaybackStopInfo.

        Gets or sets the play session identifier.  # noqa: E501

        :param play_session_id: The play_session_id of this PlaybackStopInfo.
        :type play_session_id: str
        """

        self._play_session_id = play_session_id

    @property
    def playlist_item_id(self) -> str:
        """Gets the playlist_item_id of this PlaybackStopInfo.


        :return: The playlist_item_id of this PlaybackStopInfo.
        :rtype: str
        """
        return self._playlist_item_id

    @playlist_item_id.setter
    def playlist_item_id(self, playlist_item_id: str):
        """Sets the playlist_item_id of this PlaybackStopInfo.


        :param playlist_item_id: The playlist_item_id of this PlaybackStopInfo.
        :type playlist_item_id: str
        """

        self._playlist_item_id = playlist_item_id

    @property
    def position_ticks(self) -> int:
        """Gets the position_ticks of this PlaybackStopInfo.

        Gets or sets the position ticks.  # noqa: E501

        :return: The position_ticks of this PlaybackStopInfo.
        :rtype: int
        """
        return self._position_ticks

    @position_ticks.setter
    def position_ticks(self, position_ticks: int):
        """Sets the position_ticks of this PlaybackStopInfo.

        Gets or sets the position ticks.  # noqa: E501

        :param position_ticks: The position_ticks of this PlaybackStopInfo.
        :type position_ticks: int
        """

        self._position_ticks = position_ticks

    @property
    def session_id(self) -> str:
        """Gets the session_id of this PlaybackStopInfo.

        Gets or sets the session id.  # noqa: E501

        :return: The session_id of this PlaybackStopInfo.
        :rtype: str
        """
        return self._session_id

    @session_id.setter
    def session_id(self, session_id: str):
        """Sets the session_id of this PlaybackStopInfo.

        Gets or sets the session id.  # noqa: E501

        :param session_id: The session_id of this PlaybackStopInfo.
        :type session_id: str
        """

        self._session_id = session_id
