import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.halified_countries import HalifiedCountries  # noqa: E501
from openapi_server import util


def countries_get(page=None, page_size=None):  # noqa: E501
    """countries_get

    This request returns the countries supported by the Dealer API # noqa: E501

    :param page: The index of the page to be returned. If this parameter is omitted, the first page will be returned. 
    :type page: int
    :param page_size: The index of the page to be returned. If this parameter is omitted, the first page will be returned. 
    :type page_size: int

    :rtype: Union[HalifiedCountries, Tuple[HalifiedCountries, int], Tuple[HalifiedCountries, int, Dict[str, str]]
    """
    return 'do some magic!'
