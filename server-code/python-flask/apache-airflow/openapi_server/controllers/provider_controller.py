import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.get_providers200_response import GetProviders200Response  # noqa: E501
from openapi_server import util


def get_providers():  # noqa: E501
    """List providers

    Get a list of providers.  *New in version 2.1.0*  # noqa: E501


    :rtype: Union[GetProviders200Response, Tuple[GetProviders200Response, int], Tuple[GetProviders200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
