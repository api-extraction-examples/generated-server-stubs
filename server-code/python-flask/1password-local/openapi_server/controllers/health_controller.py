import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.get_server_health200_response import GetServerHealth200Response  # noqa: E501
from openapi_server import util


def get_heartbeat():  # noqa: E501
    """Ping the server for liveness

     # noqa: E501


    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_server_health():  # noqa: E501
    """Get state of the server and its dependencies.

     # noqa: E501


    :rtype: Union[GetServerHealth200Response, Tuple[GetServerHealth200Response, int], Tuple[GetServerHealth200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
