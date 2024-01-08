import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.config import Config  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def get_config():  # noqa: E501
    """Get current configuration

     # noqa: E501


    :rtype: Union[Config, Tuple[Config, int], Tuple[Config, int, Dict[str, str]]
    """
    return 'do some magic!'
