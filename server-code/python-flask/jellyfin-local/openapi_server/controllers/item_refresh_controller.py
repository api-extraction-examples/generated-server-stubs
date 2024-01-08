import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.metadata_refresh_mode import MetadataRefreshMode  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def post(item_id, metadata_refresh_mode=None, image_refresh_mode=None, replace_all_metadata=None, replace_all_images=None):  # noqa: E501
    """Refreshes metadata for an item.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param metadata_refresh_mode: (Optional) Specifies the metadata refresh mode.
    :type metadata_refresh_mode: dict | bytes
    :param image_refresh_mode: (Optional) Specifies the image refresh mode.
    :type image_refresh_mode: dict | bytes
    :param replace_all_metadata: (Optional) Determines if metadata should be replaced. Only applicable if mode is FullRefresh.
    :type replace_all_metadata: bool
    :param replace_all_images: (Optional) Determines if images should be replaced. Only applicable if mode is FullRefresh.
    :type replace_all_images: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        metadata_refresh_mode =  MetadataRefreshMode.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        image_refresh_mode =  MetadataRefreshMode.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
