import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.advanced_game_stat import AdvancedGameStat  # noqa: E501
from openapi_server.models.advanced_season_stat import AdvancedSeasonStat  # noqa: E501
from openapi_server.models.team_season_stat import TeamSeasonStat  # noqa: E501
from openapi_server import util


def get_advanced_team_game_stats(year=None, week=None, team=None, opponent=None, exclude_garbage_time=None, season_type=None):  # noqa: E501
    """Advanced team metrics by game

    Advanced team game stats # noqa: E501

    :param year: Year filter (required if no team specified)
    :type year: int
    :param week: Week filter
    :type week: int
    :param team: Team filter (required if no year specified)
    :type team: str
    :param opponent: Opponent filter
    :type opponent: str
    :param exclude_garbage_time: Filter to remove garbage time plays from calculations
    :type exclude_garbage_time: bool
    :param season_type: Season type filter (regular, postseason, or both)
    :type season_type: str

    :rtype: Union[List[AdvancedGameStat], Tuple[List[AdvancedGameStat], int], Tuple[List[AdvancedGameStat], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_advanced_team_season_stats(year=None, team=None, exclude_garbage_time=None, start_week=None, end_week=None):  # noqa: E501
    """Advanced team metrics by season

    Advanced team season stats # noqa: E501

    :param year: Year filter (required if no team specified)
    :type year: int
    :param team: Team filter (required if no year specified)
    :type team: str
    :param exclude_garbage_time: Filter to remove garbage time plays from calculations
    :type exclude_garbage_time: bool
    :param start_week: Starting week filter
    :type start_week: int
    :param end_week: Starting week filter
    :type end_week: int

    :rtype: Union[List[AdvancedSeasonStat], Tuple[List[AdvancedSeasonStat], int], Tuple[List[AdvancedSeasonStat], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_stat_categories():  # noqa: E501
    """Team stat categories

    Stat category list # noqa: E501


    :rtype: Union[List[str], Tuple[List[str], int], Tuple[List[str], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_team_season_stats(year=None, team=None, conference=None, start_week=None, end_week=None):  # noqa: E501
    """Team statistics by season

    Team season stats # noqa: E501

    :param year: Year filter (required if no team specified)
    :type year: int
    :param team: Team filter (required if no year specified)
    :type team: str
    :param conference: Conference abbreviation filter
    :type conference: str
    :param start_week: Starting week filter
    :type start_week: int
    :param end_week: Starting week filter
    :type end_week: int

    :rtype: Union[List[TeamSeasonStat], Tuple[List[TeamSeasonStat], int], Tuple[List[TeamSeasonStat], int, Dict[str, str]]
    """
    return 'do some magic!'
