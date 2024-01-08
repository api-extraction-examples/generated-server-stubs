import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.body2 import Body2  # noqa: E501
from openapi_server.models.body3 import Body3  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.personalised_networks_response import PersonalisedNetworksResponse  # noqa: E501
from openapi_server import util


def my_networks_follows_delete(authorization, x_api_key, body, offset=None, limit=None):  # noqa: E501
    """Unfollow network

     # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: 
    :type body: dict | bytes
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = Body3.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def my_networks_follows_get(authorization, x_api_key, offset=None, limit=None):  # noqa: E501
    """List of followed networks

    List of followed networks for a given user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[PersonalisedNetworksResponse, Tuple[PersonalisedNetworksResponse, int], Tuple[PersonalisedNetworksResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def my_networks_follows_post(authorization, x_api_key, body, offset=None, limit=None):  # noqa: E501
    """Follow network

     # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: 
    :type body: dict | bytes
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = Body2.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
