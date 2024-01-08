import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def api_v1_rss_allbills_rss_get():  # noqa: E501
    """Returns an Rss feed of all Bills.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_rss_bills_id_rss_get(id):  # noqa: E501
    """Returns an Rss feed of a certain Bill.

     # noqa: E501

    :param id: Id of Bill
    :type id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_rss_privatebills_rss_get():  # noqa: E501
    """Returns an Rss feed of private Bills.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def api_v1_rss_publicbills_rss_get():  # noqa: E501
    """Returns an Rss feed of public Bills.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
