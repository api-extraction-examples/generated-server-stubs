import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.get_list_of_countries200_response_inner import GetListOfCountries200ResponseInner  # noqa: E501
from openapi_server import util


def get_list_of_countries(format=None):  # noqa: E501
    """getListOfCountries

    Get name name, alpha-2, alpha-3 code, latitude and longitude for every country. # noqa: E501

    :param format: Format of the response
    :type format: str

    :rtype: Union[List[GetListOfCountries200ResponseInner], Tuple[List[GetListOfCountries200ResponseInner], int], Tuple[List[GetListOfCountries200ResponseInner], int, Dict[str, str]]
    """
    return 'do some magic!'
