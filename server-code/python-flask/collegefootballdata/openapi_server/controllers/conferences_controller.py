import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.conference import Conference  # noqa: E501
from openapi_server import util


def get_conferences():  # noqa: E501
    """Conferences

    Get conference list # noqa: E501


    :rtype: Union[List[Conference], Tuple[List[Conference], int], Tuple[List[Conference], int, Dict[str, str]]
    """
    return 'do some magic!'
