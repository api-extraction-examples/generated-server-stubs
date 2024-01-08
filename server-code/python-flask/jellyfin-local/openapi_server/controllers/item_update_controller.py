import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.metadata_editor_info import MetadataEditorInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_metadata_editor_info(item_id):  # noqa: E501
    """Gets metadata editor info for an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[MetadataEditorInfo, Tuple[MetadataEditorInfo, int], Tuple[MetadataEditorInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_item(item_id, base_item_dto):  # noqa: E501
    """Updates an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param base_item_dto: The new item properties.
    :type base_item_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        base_item_dto = BaseItemDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_item_content_type(item_id, content_type=None):  # noqa: E501
    """Updates an item&#39;s content type.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param content_type: The content type of the item.
    :type content_type: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
