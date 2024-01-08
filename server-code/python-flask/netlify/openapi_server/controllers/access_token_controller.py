import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.access_token import AccessToken  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def exchange_ticket(ticket_id):  # noqa: E501
    """exchange_ticket

     # noqa: E501

    :param ticket_id: 
    :type ticket_id: str

    :rtype: Union[AccessToken, Tuple[AccessToken, int], Tuple[AccessToken, int, Dict[str, str]]
    """
    return 'do some magic!'
