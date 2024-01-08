import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.networks_response import NetworksResponse  # noqa: E501
from openapi_server.models.radio_error_response import RadioErrorResponse  # noqa: E501
from openapi_server import util


def get_radio_networks(x_api_key, preset=None, international=None):  # noqa: E501
    """Networks

    All iPlayer Radio networks - contains business logic for masterbrand and service relationships  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param preset: Returns all networks needed for iPlayer Radio responsive web navigation
    :type preset: bool
    :param international: Returns all networks available internationally
    :type international: bool

    :rtype: Union[NetworksResponse, Tuple[NetworksResponse, int], Tuple[NetworksResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
