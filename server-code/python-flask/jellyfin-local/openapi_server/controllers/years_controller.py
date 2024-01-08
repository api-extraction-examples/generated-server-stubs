import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_year(year, user_id=None):  # noqa: E501
    """Gets a year.

     # noqa: E501

    :param year: The year.
    :type year: int
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDto, Tuple[BaseItemDto, int], Tuple[BaseItemDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_years(start_index=None, limit=None, sort_order=None, parent_id=None, fields=None, exclude_item_types=None, include_item_types=None, media_types=None, sort_by=None, enable_user_data=None, image_type_limit=None, enable_image_types=None, user_id=None, recursive=None, enable_images=None):  # noqa: E501
    """Get years.

     # noqa: E501

    :param start_index: Skips over a given number of items within the results. Use for paging.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param sort_order: Sort Order - Ascending,Descending.
    :type sort_order: str
    :param parent_id: Specify this to localize the search to a specific item or folder. Omit to use the root.
    :type parent_id: str
    :type parent_id: str
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param exclude_item_types: Optional. If specified, results will be excluded based on item type. This allows multiple, comma delimited.
    :type exclude_item_types: List[str]
    :param include_item_types: Optional. If specified, results will be included based on item type. This allows multiple, comma delimited.
    :type include_item_types: List[str]
    :param media_types: Optional. Filter by MediaType. Allows multiple, comma delimited.
    :type media_types: List[str]
    :param sort_by: Optional. Specify one or more sort orders, comma delimited. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime.
    :type sort_by: str
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param user_id: User Id.
    :type user_id: str
    :type user_id: str
    :param recursive: Search recursively.
    :type recursive: bool
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
