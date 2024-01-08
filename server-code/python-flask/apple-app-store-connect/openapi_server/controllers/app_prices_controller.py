import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_price_response import AppPriceResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_prices_get_instance(id, fields_app_prices=None, include=None):  # noqa: E501
    """app_prices_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_prices: the fields to include for returned resources of type appPrices
    :type fields_app_prices: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppPriceResponse, Tuple[AppPriceResponse, int], Tuple[AppPriceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
