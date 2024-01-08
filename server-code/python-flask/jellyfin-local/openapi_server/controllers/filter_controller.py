import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.query_filters import QueryFilters  # noqa: E501
from openapi_server.models.query_filters_legacy import QueryFiltersLegacy  # noqa: E501
from openapi_server import util


def get_query_filters(user_id=None, parent_id=None, include_item_types=None, is_airing=None, is_movie=None, is_sports=None, is_kids=None, is_news=None, is_series=None, recursive=None):  # noqa: E501
    """Gets query filters.

     # noqa: E501

    :param user_id: Optional. User id.
    :type user_id: str
    :type user_id: str
    :param parent_id: Optional. Specify this to localize the search to a specific item or folder. Omit to use the root.
    :type parent_id: str
    :type parent_id: str
    :param include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited.
    :type include_item_types: List[str]
    :param is_airing: Optional. Is item airing.
    :type is_airing: bool
    :param is_movie: Optional. Is item movie.
    :type is_movie: bool
    :param is_sports: Optional. Is item sports.
    :type is_sports: bool
    :param is_kids: Optional. Is item kids.
    :type is_kids: bool
    :param is_news: Optional. Is item news.
    :type is_news: bool
    :param is_series: Optional. Is item series.
    :type is_series: bool
    :param recursive: Optional. Search recursive.
    :type recursive: bool

    :rtype: Union[QueryFilters, Tuple[QueryFilters, int], Tuple[QueryFilters, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_query_filters_legacy(user_id=None, parent_id=None, include_item_types=None, media_types=None):  # noqa: E501
    """Gets legacy query filters.

     # noqa: E501

    :param user_id: Optional. User id.
    :type user_id: str
    :type user_id: str
    :param parent_id: Optional. Parent id.
    :type parent_id: str
    :type parent_id: str
    :param include_item_types: Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited.
    :type include_item_types: List[str]
    :param media_types: Optional. Filter by MediaType. Allows multiple, comma delimited.
    :type media_types: List[str]

    :rtype: Union[QueryFiltersLegacy, Tuple[QueryFiltersLegacy, int], Tuple[QueryFiltersLegacy, int, Dict[str, str]]
    """
    return 'do some magic!'
