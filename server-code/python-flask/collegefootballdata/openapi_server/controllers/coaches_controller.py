import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.coach import Coach  # noqa: E501
from openapi_server import util


def get_coaches(first_name=None, last_name=None, team=None, year=None, min_year=None, max_year=None):  # noqa: E501
    """Coaching records and history

    Coaching history # noqa: E501

    :param first_name: First name filter
    :type first_name: str
    :param last_name: Last name filter
    :type last_name: str
    :param team: Team name filter
    :type team: str
    :param year: Year filter
    :type year: int
    :param min_year: Minimum year filter (inclusive)
    :type min_year: int
    :param max_year: Maximum year filter (inclusive)
    :type max_year: int

    :rtype: Union[List[Coach], Tuple[List[Coach], int], Tuple[List[Coach], int, Dict[str, str]]
    """
    return 'do some magic!'
