import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_episodes(series_id, user_id=None, fields=None, season=None, season_id=None, is_missing=None, adjacent_to=None, start_item_id=None, start_index=None, limit=None, enable_images=None, image_type_limit=None, enable_image_types=None, enable_user_data=None, sort_by=None):  # noqa: E501
    """Gets episodes for a tv season.

     # noqa: E501

    :param series_id: The series id.
    :type series_id: str
    :type series_id: str
    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls.
    :type fields: list | bytes
    :param season: Optional filter by season number.
    :type season: int
    :param season_id: Optional. Filter by season id.
    :type season_id: str
    :type season_id: str
    :param is_missing: Optional. Filter by items that are missing episodes or not.
    :type is_missing: bool
    :param adjacent_to: Optional. Return items that are siblings of a supplied item.
    :type adjacent_to: str
    :param start_item_id: Optional. Skip through the list until a given item is found.
    :type start_item_id: str
    :type start_item_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param enable_images: Optional, include image information in output.
    :type enable_images: bool
    :param image_type_limit: Optional, the max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param sort_by: Optional. Specify one or more sort orders, comma delimited. Options: Album, AlbumArtist, Artist, Budget, CommunityRating, CriticRating, DateCreated, DatePlayed, PlayCount, PremiereDate, ProductionYear, SortName, Random, Revenue, Runtime.
    :type sort_by: str

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_next_up(user_id=None, start_index=None, limit=None, fields=None, series_id=None, parent_id=None, enable_imges=None, image_type_limit=None, enable_image_types=None, enable_user_data=None, enable_total_record_count=None):  # noqa: E501
    """Gets a list of next up episodes.

     # noqa: E501

    :param user_id: The user id of the user to get the next up episodes for.
    :type user_id: str
    :type user_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param series_id: Optional. Filter by series id.
    :type series_id: str
    :param parent_id: Optional. Specify this to localize the search to a specific item or folder. Omit to use the root.
    :type parent_id: str
    :type parent_id: str
    :param enable_imges: Optional. Include image information in output.
    :type enable_imges: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param enable_total_record_count: Whether to enable the total records count. Defaults to true.
    :type enable_total_record_count: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_seasons(series_id, user_id=None, fields=None, is_special_season=None, is_missing=None, adjacent_to=None, enable_images=None, image_type_limit=None, enable_image_types=None, enable_user_data=None):  # noqa: E501
    """Gets seasons for a tv series.

     # noqa: E501

    :param series_id: The series id.
    :type series_id: str
    :type series_id: str
    :param user_id: The user id.
    :type user_id: str
    :type user_id: str
    :param fields: Optional. Specify additional fields of information to return in the output. This allows multiple, comma delimited. Options: Budget, Chapters, DateCreated, Genres, HomePageUrl, IndexOptions, MediaStreams, Overview, ParentId, Path, People, ProviderIds, PrimaryImageAspectRatio, Revenue, SortName, Studios, Taglines, TrailerUrls.
    :type fields: list | bytes
    :param is_special_season: Optional. Filter by special season.
    :type is_special_season: bool
    :param is_missing: Optional. Filter by items that are missing episodes or not.
    :type is_missing: bool
    :param adjacent_to: Optional. Return items that are siblings of a supplied item.
    :type adjacent_to: str
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_upcoming_episodes(user_id=None, start_index=None, limit=None, fields=None, parent_id=None, enable_imges=None, image_type_limit=None, enable_image_types=None, enable_user_data=None):  # noqa: E501
    """Gets a list of upcoming episodes.

     # noqa: E501

    :param user_id: The user id of the user to get the upcoming episodes for.
    :type user_id: str
    :type user_id: str
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param parent_id: Optional. Specify this to localize the search to a specific item or folder. Omit to use the root.
    :type parent_id: str
    :type parent_id: str
    :param enable_imges: Optional. Include image information in output.
    :type enable_imges: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
