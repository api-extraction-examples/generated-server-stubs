import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.api_health import ApiHealth  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def payments_health_get():  # noqa: E501
    """Returns the status of each connectivity provider

    Returns the status of each connectivity provider # noqa: E501


    :rtype: Union[ApiHealth, Tuple[ApiHealth, int], Tuple[ApiHealth, int, Dict[str, str]]
    """
    return 'do some magic!'
