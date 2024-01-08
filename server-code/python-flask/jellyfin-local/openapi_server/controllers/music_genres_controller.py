import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server import util


def get_music_genre(genre_name, user_id=None):  # noqa: E501
    """Gets a music genre, by name.

     # noqa: E501

    :param genre_name: The genre name.
    :type genre_name: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDto, Tuple[BaseItemDto, int], Tuple[BaseItemDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_genres(start_index=None, limit=None, search_term=None, parent_id=None, fields=None, exclude_item_types=None, include_item_types=None, is_favorite=None, image_type_limit=None, enable_image_types=None, user_id=None, name_starts_with_or_greater=None, name_starts_with=None, name_less_than=None, enable_images=None, enable_total_record_count=None):  # noqa: E501
    """Gets all music genres from a given item, folder, or the entire library.

     # noqa: E501

    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param search_term: The search term.
    :type search_term: str
    :param parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root.
    :type parent_id: str
    :type parent_id: str
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param exclude_item_types: Optional. If specified, results will be filtered out based on item type. This allows multiple, comma delimited.
    :type exclude_item_types: List[str]
    :param include_item_types: Optional. If specified, results will be filtered in based on item type. This allows multiple, comma delimited.
    :type include_item_types: List[str]
    :param is_favorite: Optional filter by items that are marked as favorite, or not.
    :type is_favorite: bool
    :param image_type_limit: Optional, the max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param name_starts_with_or_greater: Optional filter by items whose name is sorted equally or greater than a given input string.
    :type name_starts_with_or_greater: str
    :param name_starts_with: Optional filter by items whose name is sorted equally than a given input string.
    :type name_starts_with: str
    :param name_less_than: Optional filter by items whose name is equally or lesser than a given input string.
    :type name_less_than: str
    :param enable_images: Optional, include image information in output.
    :type enable_images: bool
    :param enable_total_record_count: Optional. Include total record count.
    :type enable_total_record_count: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'