import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.position_group_recruiting_rating import PositionGroupRecruitingRating  # noqa: E501
from openapi_server.models.recruit import Recruit  # noqa: E501
from openapi_server.models.team_recruiting_rank import TeamRecruitingRank  # noqa: E501
from openapi_server import util


def get_recruiting_groups(start_year=None, end_year=None, team=None, conference=None):  # noqa: E501
    """Recruit position group ratings

    Gets a list of aggregated statistics by team and position grouping # noqa: E501

    :param start_year: Starting year
    :type start_year: int
    :param end_year: Ending year
    :type end_year: int
    :param team: Team filter
    :type team: str
    :param conference: conference filter
    :type conference: str

    :rtype: Union[List[PositionGroupRecruitingRating], Tuple[List[PositionGroupRecruitingRating], int], Tuple[List[PositionGroupRecruitingRating], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_recruiting_players(year=None, classification=None, position=None, state=None, team=None):  # noqa: E501
    """Player recruiting ratings and rankings

    Get player recruiting rankings and data. Requires either a year or team to be specified. # noqa: E501

    :param year: Recruiting class year (required if team no specified)
    :type year: int
    :param classification: Type of recruit (HighSchool, JUCO, PrepSchool)
    :type classification: str
    :param position: Position abbreviation filter
    :type position: str
    :param state: State or province abbreviation filter
    :type state: str
    :param team: Committed team filter (required if year not specified)
    :type team: str

    :rtype: Union[List[Recruit], Tuple[List[Recruit], int], Tuple[List[Recruit], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_recruiting_teams(year=None, team=None):  # noqa: E501
    """Team recruiting rankings and ratings

    Team recruiting rankings # noqa: E501

    :param year: Recruiting class year
    :type year: int
    :param team: Team filter
    :type team: str

    :rtype: Union[List[TeamRecruitingRank], Tuple[List[TeamRecruitingRank], int], Tuple[List[TeamRecruitingRank], int, Dict[str, str]]
    """
    return 'do some magic!'
