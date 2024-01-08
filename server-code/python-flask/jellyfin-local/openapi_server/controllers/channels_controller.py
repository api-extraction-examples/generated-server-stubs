import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.channel_features import ChannelFeatures  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.item_filter import ItemFilter  # noqa: E501
from openapi_server import util


def get_all_channel_features():  # noqa: E501
    """Get all channel features.

     # noqa: E501


    :rtype: Union[List[ChannelFeatures], Tuple[List[ChannelFeatures], int], Tuple[List[ChannelFeatures], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_channel_features(channel_id):  # noqa: E501
    """Get channel features.

     # noqa: E501

    :param channel_id: Channel id.
    :type channel_id: str
    :type channel_id: str

    :rtype: Union[ChannelFeatures, Tuple[ChannelFeatures, int], Tuple[ChannelFeatures, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_channel_items(channel_id, folder_id=None, user_id=None, start_index=None, limit=None, sort_order=None, filters=None, sort_by=None, fields=None):  # noqa: E501
    """Get channel items.

     # noqa: E501

    :param channel_id: Channel Id.
    :type channel_id: str
    :type channel_id: str
    :param folder_id: Optional. Folder Id.
    :type folder_id: str
    :type folder_id: str
    :param user_id: Optional. User Id.
    :type user_id: str
    :type user_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param sort_order: Optional. Sort Order - Ascending,Descending.
    :type sort_order: str
    :param filters: Optional. Specify additional filters to apply.
    :type filters: list | bytes
    :param sort_by: Optional. Specify one or more sort orders, comma delimited. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime.
    :type sort_by: str
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        filters = [ItemFilter.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_channels(user_id=None, start_index=None, limit=None, supports_latest_items=None, supports_media_deletion=None, is_favorite=None):  # noqa: E501
    """Gets available channels.

     # noqa: E501

    :param user_id: User Id to filter by. Use System.Guid.Empty to not filter by user.
    :type user_id: str
    :type user_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param supports_latest_items: Optional. Filter by channels that support getting latest items.
    :type supports_latest_items: bool
    :param supports_media_deletion: Optional. Filter by channels that support media deletion.
    :type supports_media_deletion: bool
    :param is_favorite: Optional. Filter by channels that are favorite.
    :type is_favorite: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_latest_channel_items(user_id=None, start_index=None, limit=None, filters=None, fields=None, channel_ids=None):  # noqa: E501
    """Gets latest channel items.

     # noqa: E501

    :param user_id: Optional. User Id.
    :type user_id: str
    :type user_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param filters: Optional. Specify additional filters to apply.
    :type filters: list | bytes
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param channel_ids: Optional. Specify one or more channel id&#39;s, comma delimited.
    :type channel_ids: List[str]

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        filters = [ItemFilter.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
