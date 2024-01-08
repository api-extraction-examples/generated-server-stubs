import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.body4 import Body4  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def my_plays_post(authorization, x_api_key, body):  # noqa: E501
    """Write Play Event

     # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = Body4.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
