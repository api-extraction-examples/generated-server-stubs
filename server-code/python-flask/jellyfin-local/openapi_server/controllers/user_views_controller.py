import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.special_view_option_dto import SpecialViewOptionDto  # noqa: E501
from openapi_server import util


def get_grouping_options(user_id):  # noqa: E501
    """Get user view grouping options.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str

    :rtype: Union[List[SpecialViewOptionDto], Tuple[List[SpecialViewOptionDto], int], Tuple[List[SpecialViewOptionDto], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_user_views(user_id, include_external_content=None, preset_views=None, include_hidden=None):  # noqa: E501
    """Get user views.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param include_external_content: Whether or not to include external views such as channels or live tv.
    :type include_external_content: bool
    :param preset_views: Preset views.
    :type preset_views: List[str]
    :param include_hidden: Whether or not to include hidden content.
    :type include_hidden: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'
