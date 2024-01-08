import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.item_filter import ItemFilter  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_person(name, user_id=None):  # noqa: E501
    """Get person by name.

     # noqa: E501

    :param name: Person name.
    :type name: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str

    :rtype: Union[BaseItemDto, Tuple[BaseItemDto, int], Tuple[BaseItemDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_persons(limit=None, search_term=None, fields=None, filters=None, is_favorite=None, enable_user_data=None, image_type_limit=None, enable_image_types=None, exclude_person_types=None, person_types=None, appears_in_item_id=None, user_id=None, enable_images=None):  # noqa: E501
    """Gets all persons.

     # noqa: E501

    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param search_term: The search term.
    :type search_term: str
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param filters: Optional. Specify additional filters to apply.
    :type filters: list | bytes
    :param is_favorite: Optional filter by items that are marked as favorite, or not. userId is required.
    :type is_favorite: bool
    :param enable_user_data: Optional, include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional, the max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes
    :param exclude_person_types: Optional. If specified results will be filtered to exclude those containing the specified PersonType. Allows multiple, comma-delimited.
    :type exclude_person_types: List[str]
    :param person_types: Optional. If specified results will be filtered to include only those containing the specified PersonType. Allows multiple, comma-delimited.
    :type person_types: List[str]
    :param appears_in_item_id: Optional. If specified, person results will be filtered on items related to said persons.
    :type appears_in_item_id: str
    :type appears_in_item_id: str
    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param enable_images: Optional, include image information in output.
    :type enable_images: bool

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        filters = [ItemFilter.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
