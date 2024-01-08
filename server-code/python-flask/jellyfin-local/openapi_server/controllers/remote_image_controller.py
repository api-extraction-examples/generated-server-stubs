import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.image_provider_info import ImageProviderInfo  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.remote_image_result import RemoteImageResult  # noqa: E501
from openapi_server import util


def download_remote_image(item_id, type, image_url=None):  # noqa: E501
    """Downloads a remote image for an item.

     # noqa: E501

    :param item_id: Item Id.
    :type item_id: str
    :type item_id: str
    :param type: The image type.
    :type type: dict | bytes
    :param image_url: The image url.
    :type image_url: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_remote_image(image_url):  # noqa: E501
    """Gets a remote image.

     # noqa: E501

    :param image_url: The image url.
    :type image_url: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_remote_image_providers(item_id):  # noqa: E501
    """Gets available remote image providers for an item.

     # noqa: E501

    :param item_id: Item Id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[List[ImageProviderInfo], Tuple[List[ImageProviderInfo], int], Tuple[List[ImageProviderInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_remote_images(item_id, type=None, start_index=None, limit=None, provider_name=None, include_all_languages=None):  # noqa: E501
    """Gets available remote images for an item.

     # noqa: E501

    :param item_id: Item Id.
    :type item_id: str
    :type item_id: str
    :param type: The image type.
    :type type: dict | bytes
    :param start_index: Optional. The record index to start at. All items with a lower index will be dropped from the results.
    :type start_index: int
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param provider_name: Optional. The image provider to use.
    :type provider_name: str
    :param include_all_languages: Optional. Include all languages.
    :type include_all_languages: bool

    :rtype: Union[RemoteImageResult, Tuple[RemoteImageResult, int], Tuple[RemoteImageResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
