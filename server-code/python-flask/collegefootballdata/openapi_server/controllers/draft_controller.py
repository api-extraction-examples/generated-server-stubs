import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.draft_pick import DraftPick  # noqa: E501
from openapi_server.models.draft_position import DraftPosition  # noqa: E501
from openapi_server.models.draft_team import DraftTeam  # noqa: E501
from openapi_server import util


def get_draft_picks(year=None, nfl_team=None, college=None, conference=None, position=None):  # noqa: E501
    """List of NFL Draft picks

    List of NFL Draft picks # noqa: E501

    :param year: Year filter
    :type year: int
    :param nfl_team: NFL team filter
    :type nfl_team: str
    :param college: Player college filter
    :type college: str
    :param conference: College confrence abbreviation filter
    :type conference: str
    :param position: NFL position filter
    :type position: str

    :rtype: Union[List[DraftPick], Tuple[List[DraftPick], int], Tuple[List[DraftPick], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_nfl_positions():  # noqa: E501
    """List of NFL positions

    List of NFL positions # noqa: E501


    :rtype: Union[List[DraftPosition], Tuple[List[DraftPosition], int], Tuple[List[DraftPosition], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_nfl_teams():  # noqa: E501
    """List of NFL teams

    List of NFL teams # noqa: E501


    :rtype: Union[List[DraftTeam], Tuple[List[DraftTeam], int], Tuple[List[DraftTeam], int, Dict[str, str]]
    """
    return 'do some magic!'
