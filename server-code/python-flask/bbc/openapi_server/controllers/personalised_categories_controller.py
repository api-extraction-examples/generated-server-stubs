import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.body import Body  # noqa: E501
from openapi_server.models.body1 import Body1  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.personalised_categories_response import PersonalisedCategoriesResponse  # noqa: E501
from openapi_server import util


def my_categories_follows_delete(authorization, x_api_key, body):  # noqa: E501
    """Unfollow category

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
        body = Body1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def my_categories_follows_get(authorization, x_api_key, offset=None, limit=None):  # noqa: E501
    """List of followed categories

    List of followed categories for a given user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[PersonalisedCategoriesResponse, Tuple[PersonalisedCategoriesResponse, int], Tuple[PersonalisedCategoriesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def my_categories_follows_post(authorization, x_api_key, body):  # noqa: E501
    """Follow category

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
        body = Body.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
