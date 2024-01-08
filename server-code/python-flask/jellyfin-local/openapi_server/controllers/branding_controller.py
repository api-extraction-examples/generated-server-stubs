import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.branding_options import BrandingOptions  # noqa: E501
from openapi_server import util


def get_branding_css():  # noqa: E501
    """Gets branding css.

     # noqa: E501


    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_branding_css2():  # noqa: E501
    """Gets branding css.

     # noqa: E501


    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_branding_options():  # noqa: E501
    """Gets branding configuration.

     # noqa: E501


    :rtype: Union[BrandingOptions, Tuple[BrandingOptions, int], Tuple[BrandingOptions, int, Dict[str, str]]
    """
    return 'do some magic!'
