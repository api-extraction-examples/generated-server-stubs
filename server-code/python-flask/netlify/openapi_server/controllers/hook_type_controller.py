import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.hook_type import HookType  # noqa: E501
from openapi_server import util


def list_hook_types():  # noqa: E501
    """list_hook_types

     # noqa: E501


    :rtype: Union[List[HookType], Tuple[List[HookType], int], Tuple[List[HookType], int, Dict[str, str]]
    """
    return 'do some magic!'
