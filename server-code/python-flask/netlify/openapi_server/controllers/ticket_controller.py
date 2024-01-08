import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.ticket import Ticket  # noqa: E501
from openapi_server import util


def create_ticket(client_id):  # noqa: E501
    """create_ticket

     # noqa: E501

    :param client_id: 
    :type client_id: str

    :rtype: Union[Ticket, Tuple[Ticket, int], Tuple[Ticket, int, Dict[str, str]]
    """
    return 'do some magic!'


def show_ticket(ticket_id):  # noqa: E501
    """show_ticket

     # noqa: E501

    :param ticket_id: 
    :type ticket_id: str

    :rtype: Union[Ticket, Tuple[Ticket, int], Tuple[Ticket, int, Dict[str, str]]
    """
    return 'do some magic!'
