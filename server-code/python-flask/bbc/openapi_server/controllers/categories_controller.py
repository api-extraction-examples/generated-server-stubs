import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.categories_response import CategoriesResponse  # noqa: E501
from openapi_server.models.category_error_response import CategoryErrorResponse  # noqa: E501
from openapi_server import util


def categories_get(x_api_key, kind=None):  # noqa: E501
    """List of categories

    Retrieve Categories  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param kind: Filter by provided query. E.g. &#39;promoted&#39; returns promoted categories
    :type kind: str

    :rtype: Union[CategoriesResponse, Tuple[CategoriesResponse, int], Tuple[CategoriesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def categories_id_get(x_api_key, id):  # noqa: E501
    """Category by ID

    Retrieve Categories by ID  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param id: Retrieve information about the category. E.g. &#39;sport-football-europeanchampionship&#39;
    :type id: str

    :rtype: Union[CategoriesResponse, Tuple[CategoriesResponse, int], Tuple[CategoriesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
