import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.image_by_name_info import ImageByNameInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def get_general_image(name, type):  # noqa: E501
    """Get General Image.

     # noqa: E501

    :param name: The name of the image.
    :type name: str
    :param type: Image Type (primary, backdrop, logo, etc).
    :type type: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_general_images():  # noqa: E501
    """Get all general images.

     # noqa: E501


    :rtype: Union[List[ImageByNameInfo], Tuple[List[ImageByNameInfo], int], Tuple[List[ImageByNameInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_media_info_image(theme, name):  # noqa: E501
    """Get media info image.

     # noqa: E501

    :param theme: The theme to get the image from.
    :type theme: str
    :param name: The name of the image.
    :type name: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_media_info_images():  # noqa: E501
    """Get all media info images.

     # noqa: E501


    :rtype: Union[List[ImageByNameInfo], Tuple[List[ImageByNameInfo], int], Tuple[List[ImageByNameInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_rating_image(theme, name):  # noqa: E501
    """Get rating image.

     # noqa: E501

    :param theme: The theme to get the image from.
    :type theme: str
    :param name: The name of the image.
    :type name: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_rating_images():  # noqa: E501
    """Get all general images.

     # noqa: E501


    :rtype: Union[List[ImageByNameInfo], Tuple[List[ImageByNameInfo], int], Tuple[List[ImageByNameInfo], int, Dict[str, str]]
    """
    return 'do some magic!'
