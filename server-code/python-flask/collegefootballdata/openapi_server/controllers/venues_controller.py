import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.venue import Venue  # noqa: E501
from openapi_server import util


def get_venues():  # noqa: E501
    """Arena and venue information

    Venues # noqa: E501


    :rtype: Union[List[Venue], Tuple[List[Venue], int], Tuple[List[Venue], int, Dict[str, str]]
    """
    return 'do some magic!'
