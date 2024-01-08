import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.programmes_response import ProgrammesResponse  # noqa: E501
from openapi_server import util


def get_collection_members(x_api_key, pid, offset=None, limit=None):  # noqa: E501
    """Collection Members

    Episodes and Clips from Collection  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param pid: pid
    :type pid: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[ProgrammesResponse, Tuple[ProgrammesResponse, int], Tuple[ProgrammesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
