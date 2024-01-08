import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def headers_get():  # noqa: E501
    """Return the incoming request&#39;s HTTP headers.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def ip_get():  # noqa: E501
    """Returns the requester&#39;s IP Address.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def user_agent_get():  # noqa: E501
    """Return the incoming requests&#39;s User-Agent header.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
