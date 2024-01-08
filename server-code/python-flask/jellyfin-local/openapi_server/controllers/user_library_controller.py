import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.user_item_data_dto import UserItemDataDto  # noqa: E501
from openapi_server import util


def delete_user_item_rating(user_id, item_id):  # noqa: E501
    """Deletes a user&#39;s saved personal rating for an item.

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


def get_intros(user_id, item_id):  # noqa: E501
    """Gets intros to play before the main media item plays.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_item(user_id, item_id):  # noqa: E501
    """Gets an item from a user&#39;s library.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[BaseItemDto, Tuple[BaseItemDto, int], Tuple[BaseItemDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_latest_media(user_id, parent_id=None, fields=None, include_item_types=None, is_played=None, enable_images=None, image_type_limit=None, enable_image_types=None, enable_user_data=None, limit=None, group_items=None):  # noqa: E501
    """Gets latest media.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root.
    :type parent_id: str
    :type parent_id: str
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited.
    :type include_item_types: List[str]
    :param is_played: Filter by items that are played, or not.
    :type is_played: bool
    :param enable_images: Optional. include image information in output.
    :type enable_images: bool
    :param image_type_limit: Optional. the max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param enable_user_data: Optional. include user data.
    :type enable_user_data: bool
    :param limit: Return item limit.
    :type limit: int
    :param group_items: Whether or not to group items into a parent container.
    :type group_items: bool

    :rtype: Union[List[BaseItemDto], Tuple[List[BaseItemDto], int], Tuple[List[BaseItemDto], int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_local_trailers(user_id, item_id):  # noqa: E501
    """Gets local trailers for an item.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[List[BaseItemDto], Tuple[List[BaseItemDto], int], Tuple[List[BaseItemDto], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_root_folder(user_id):  # noqa: E501
    """Gets the root folder from a user&#39;s library.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDto, Tuple[BaseItemDto, int], Tuple[BaseItemDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_special_features(user_id, item_id):  # noqa: E501
    """Gets special features for an item.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[List[BaseItemDto], Tuple[List[BaseItemDto], int], Tuple[List[BaseItemDto], int, Dict[str, str]]
    """
    return 'do some magic!'


def mark_favorite_item(user_id, item_id):  # noqa: E501
    """Marks an item as a favorite.

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


def unmark_favorite_item(user_id, item_id):  # noqa: E501
    """Unmarks item as a favorite.

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


def update_user_item_rating(user_id, item_id, likes=None):  # noqa: E501
    """Updates a user&#39;s rating for an item.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param likes: Whether this M:Jellyfin.Api.Controllers.UserLibraryController.UpdateUserItemRating(System.Guid,System.Guid,System.Nullable{System.Boolean}) is likes.
    :type likes: bool

    :rtype: Union[UserItemDataDto, Tuple[UserItemDataDto, int], Tuple[UserItemDataDto, int, Dict[str, str]]
    """
    return 'do some magic!'
