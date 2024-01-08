import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.links import Links  # noqa: E501
from openapi_server import util


def get_root():  # noqa: E501
    """get_root

    You can issue a GET request to the root resource to find all of the resource categories supported by the API. # noqa: E501


    :rtype: Union[Links, Tuple[Links, int], Tuple[Links, int, Dict[str, str]]
    """
    return 'do some magic!'
