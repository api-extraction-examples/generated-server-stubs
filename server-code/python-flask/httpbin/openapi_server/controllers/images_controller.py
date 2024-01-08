import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def image_get():  # noqa: E501
    """Returns a simple image of the type suggest by the Accept header.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def image_jpeg_get():  # noqa: E501
    """Returns a simple JPEG image.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def image_png_get():  # noqa: E501
    """Returns a simple PNG image.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def image_svg_get():  # noqa: E501
    """Returns a simple SVG image.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def image_webp_get():  # noqa: E501
    """Returns a simple WEBP image.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
