import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.get200_response import Get200Response  # noqa: E501
from openapi_server import util


def root_get():  # noqa: E501
    """Get Welcome

    **Test Endpoint** Returns the information about the Medium API  # noqa: E501


    :rtype: Union[Get200Response, Tuple[Get200Response, int], Tuple[Get200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
