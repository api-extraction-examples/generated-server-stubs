import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.utc_time_response import UtcTimeResponse  # noqa: E501
from openapi_server import util


def get_utc_time():  # noqa: E501
    """Gets the current UTC time.

     # noqa: E501


    :rtype: Union[UtcTimeResponse, Tuple[UtcTimeResponse, int], Tuple[UtcTimeResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
