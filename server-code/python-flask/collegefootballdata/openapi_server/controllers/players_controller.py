import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.player_search_result import PlayerSearchResult  # noqa: E501
from openapi_server.models.player_season_stat import PlayerSeasonStat  # noqa: E501
from openapi_server.models.player_usage import PlayerUsage  # noqa: E501
from openapi_server.models.portal_player import PortalPlayer  # noqa: E501
from openapi_server.models.returning_production import ReturningProduction  # noqa: E501
from openapi_server import util


def get_player_season_stats(year, team=None, conference=None, start_week=None, end_week=None, season_type=None, category=None):  # noqa: E501
    """Player stats by season

    Season player stats # noqa: E501

    :param year: Year filter
    :type year: int
    :param team: Team filter
    :type team: str
    :param conference: Conference abbreviation filter
    :type conference: str
    :param start_week: Start week filter
    :type start_week: int
    :param end_week: Start week filter
    :type end_week: int
    :param season_type: Season type filter (regular, postseason, or both)
    :type season_type: str
    :param category: Stat category filter (e.g. passing)
    :type category: str

    :rtype: Union[List[PlayerSeasonStat], Tuple[List[PlayerSeasonStat], int], Tuple[List[PlayerSeasonStat], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_player_usage(year, team=None, conference=None, position=None, player_id=None, exclude_garbage_time=None):  # noqa: E501
    """Player usage metrics broken down by season

    Player usage metrics by season # noqa: E501

    :param year: Year filter
    :type year: int
    :param team: Team filter
    :type team: str
    :param conference: Conference abbreviation filter
    :type conference: str
    :param position: Position abbreviation filter
    :type position: str
    :param player_id: Player id filter
    :type player_id: int
    :param exclude_garbage_time: Filter to remove garbage time plays from calculations
    :type exclude_garbage_time: bool

    :rtype: Union[List[PlayerUsage], Tuple[List[PlayerUsage], int], Tuple[List[PlayerUsage], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_returning_production(year=None, team=None, conference=None):  # noqa: E501
    """Team returning production metrics

    Returning production metrics # noqa: E501

    :param year: Year filter
    :type year: int
    :param team: Team filter
    :type team: str
    :param conference: Conference abbreviation filter
    :type conference: str

    :rtype: Union[List[ReturningProduction], Tuple[List[ReturningProduction], int], Tuple[List[ReturningProduction], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_transfer_portal(year):  # noqa: E501
    """Transfer portal by season

    Transfer portal by season # noqa: E501

    :param year: Year filter
    :type year: int

    :rtype: Union[List[PortalPlayer], Tuple[List[PortalPlayer], int], Tuple[List[PortalPlayer], int, Dict[str, str]]
    """
    return 'do some magic!'


def player_search(search_term, position=None, team=None, year=None):  # noqa: E501
    """Search for player information

    Search for players # noqa: E501

    :param search_term: Term to search on
    :type search_term: str
    :param position: Position abbreviation filter
    :type position: str
    :param team: Team filter
    :type team: str
    :param year: Year filter
    :type year: int

    :rtype: Union[List[PlayerSearchResult], Tuple[List[PlayerSearchResult], int], Tuple[List[PlayerSearchResult], int, Dict[str, str]]
    """
    return 'do some magic!'
