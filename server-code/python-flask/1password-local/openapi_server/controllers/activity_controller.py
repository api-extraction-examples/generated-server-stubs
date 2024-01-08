import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.api_request import APIRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def get_api_activity(limit=None, offset=None):  # noqa: E501
    """Retrieve a list of API Requests that have been made.

     # noqa: E501

    :param limit: How many API Events should be retrieved in a single request.
    :type limit: int
    :param offset: How far into the collection of API Events should the response start
    :type offset: int

    :rtype: Union[List[APIRequest], Tuple[List[APIRequest], int], Tuple[List[APIRequest], int, Dict[str, str]]
    """
    return 'do some magic!'
