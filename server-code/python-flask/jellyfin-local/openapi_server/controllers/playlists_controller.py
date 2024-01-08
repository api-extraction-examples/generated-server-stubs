import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.create_playlist_dto import CreatePlaylistDto  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.playlist_creation_result import PlaylistCreationResult  # noqa: E501
from openapi_server import util


def add_to_playlist(playlist_id, ids=None, user_id=None):  # noqa: E501
    """Adds items to a playlist.

     # noqa: E501

    :param playlist_id: The playlist id.
    :type playlist_id: str
    :type playlist_id: str
    :param ids: Item id, comma delimited.
    :type ids: List[str]
    :param user_id: The userId.
    :type user_id: str
    :type user_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_playlist(name=None, ids=None, user_id=None, media_type=None, create_playlist_dto=None):  # noqa: E501
    """Creates a new playlist.

    For backwards compatibility parameters can be sent via Query or Body, with Query having higher precedence. # noqa: E501

    :param name: The playlist name.
    :type name: str
    :param ids: The item ids.
    :type ids: List[str]
    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param media_type: The media type.
    :type media_type: str
    :param create_playlist_dto: The create playlist payload.
    :type create_playlist_dto: dict | bytes

    :rtype: Union[PlaylistCreationResult, Tuple[PlaylistCreationResult, int], Tuple[PlaylistCreationResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_playlist_dto = CreatePlaylistDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_playlist_items(playlist_id, user_id, start_index=None, limit=None, fields=None, enable_images=None, enable_user_data=None, image_type_limit=None, enable_image_types=None):  # noqa: E501
    """Gets the original items of a playlist.

     # noqa: E501

    :param playlist_id: The playlist id.
    :type playlist_id: str
    :type playlist_id: str
    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def move_item(playlist_id, item_id, new_index):  # noqa: E501
    """Moves a playlist item.

     # noqa: E501

    :param playlist_id: The playlist id.
    :type playlist_id: str
    :param item_id: The item id.
    :type item_id: str
    :param new_index: The new index.
    :type new_index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_from_playlist(playlist_id, entry_ids=None):  # noqa: E501
    """Removes items from a playlist.

     # noqa: E501

    :param playlist_id: The playlist id.
    :type playlist_id: str
    :param entry_ids: The item ids, comma delimited.
    :type entry_ids: List[str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
