import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.player import Player  # noqa: E501
from openapi_server.models.team import Team  # noqa: E501
from openapi_server.models.team_matchup import TeamMatchup  # noqa: E501
from openapi_server.models.team_talent import TeamTalent  # noqa: E501
from openapi_server import util


def get_fbs_teams(year=None):  # noqa: E501
    """FBS team list

    Information on major division teams # noqa: E501

    :param year: Year filter
    :type year: int

    :rtype: Union[List[Team], Tuple[List[Team], int], Tuple[List[Team], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_roster(team=None, year=None):  # noqa: E501
    """Team rosters

    Roster data # noqa: E501

    :param team: Team name
    :type team: str
    :param year: Season year
    :type year: int

    :rtype: Union[List[Player], Tuple[List[Player], int], Tuple[List[Player], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_talent(year=None):  # noqa: E501
    """Team talent composite rankings

    Team talent composite # noqa: E501

    :param year: Year filter
    :type year: int

    :rtype: Union[List[TeamTalent], Tuple[List[TeamTalent], int], Tuple[List[TeamTalent], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_team_matchup(team1, team2, min_year=None, max_year=None):  # noqa: E501
    """Team matchup history

    Matchup history # noqa: E501

    :param team1: First team
    :type team1: str
    :param team2: Second team
    :type team2: str
    :param min_year: Minimum year
    :type min_year: int
    :param max_year: Maximum year
    :type max_year: int

    :rtype: Union[TeamMatchup, Tuple[TeamMatchup, int], Tuple[TeamMatchup, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_teams(conference=None):  # noqa: E501
    """Team information

    Get team information # noqa: E501

    :param conference: Conference abbreviation filter
    :type conference: str

    :rtype: Union[List[Team], Tuple[List[Team], int], Tuple[List[Team], int, Dict[str, str]]
    """
    return 'do some magic!'
