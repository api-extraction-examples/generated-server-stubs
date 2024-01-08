import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.conference_sp_rating import ConferenceSPRating  # noqa: E501
from openapi_server.models.team_elo_rating import TeamEloRating  # noqa: E501
from openapi_server.models.team_sp_rating import TeamSPRating  # noqa: E501
from openapi_server.models.team_srs_rating import TeamSRSRating  # noqa: E501
from openapi_server import util


def get_conference_sp_ratings(year=None, conference=None):  # noqa: E501
    """Historical SP+ ratings by conference

    Get average SP+ historical rating data by conference # noqa: E501

    :param year: Season filter
    :type year: int
    :param conference: Conference abbreviation filter
    :type conference: str

    :rtype: Union[List[ConferenceSPRating], Tuple[List[ConferenceSPRating], int], Tuple[List[ConferenceSPRating], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_elo_ratings(year=None, week=None, team=None, conference=None):  # noqa: E501
    """Historical Elo ratings

    Elo rating data # noqa: E501

    :param year: Season filter
    :type year: int
    :param week: Maximum week filter
    :type week: int
    :param team: Team filter
    :type team: str
    :param conference: Conference filter
    :type conference: str

    :rtype: Union[List[TeamEloRating], Tuple[List[TeamEloRating], int], Tuple[List[TeamEloRating], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_sp_ratings(year=None, team=None):  # noqa: E501
    """Historical SP+ ratings

    SP+ rating data # noqa: E501

    :param year: Season filter (required if team not specified)
    :type year: int
    :param team: Team filter (required if year not specified)
    :type team: str

    :rtype: Union[List[TeamSPRating], Tuple[List[TeamSPRating], int], Tuple[List[TeamSPRating], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_srs_ratings(year=None, team=None, conference=None):  # noqa: E501
    """Historical SRS ratings

    SRS rating data (requires either a year or team specified) # noqa: E501

    :param year: Season filter (required if team not specified)
    :type year: int
    :param team: Team filter (required if year not specified)
    :type team: str
    :param conference: Conference filter
    :type conference: str

    :rtype: Union[List[TeamSRSRating], Tuple[List[TeamSRSRating], int], Tuple[List[TeamSRSRating], int, Dict[str, str]]
    """
    return 'do some magic!'
