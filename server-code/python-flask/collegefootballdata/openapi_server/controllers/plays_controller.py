import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.live_play_by_play import LivePlayByPlay  # noqa: E501
from openapi_server.models.play import Play  # noqa: E501
from openapi_server.models.play_stat import PlayStat  # noqa: E501
from openapi_server.models.play_stat_type import PlayStatType  # noqa: E501
from openapi_server.models.play_type import PlayType  # noqa: E501
from openapi_server import util


def get_live_plays(id):  # noqa: E501
    """Live metrics and PBP (Patreon only)

    Get live metrics and PBP # noqa: E501

    :param id: Game id
    :type id: int

    :rtype: Union[LivePlayByPlay, Tuple[LivePlayByPlay, int], Tuple[LivePlayByPlay, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_play_stat_types():  # noqa: E501
    """Types of player play stats

    Type of play stats # noqa: E501


    :rtype: Union[List[PlayStatType], Tuple[List[PlayStatType], int], Tuple[List[PlayStatType], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_play_stats(year=None, week=None, team=None, game_id=None, athlete_id=None, stat_type_id=None, season_type=None, conference=None):  # noqa: E501
    """Play stats by play

    Gets player stats associated by play (limit 1000) # noqa: E501

    :param year: Year filter
    :type year: int
    :param week: Week filter
    :type week: int
    :param team: Team filter
    :type team: str
    :param game_id: gameId filter (from /games endpoint)
    :type game_id: int
    :param athlete_id: athleteId filter (from /roster endpoint)
    :type athlete_id: int
    :param stat_type_id: statTypeId filter (from /play/stat/types endpoint)
    :type stat_type_id: int
    :param season_type: regular, postseason, or both
    :type season_type: str
    :param conference: conference abbreviation filter
    :type conference: str

    :rtype: Union[List[PlayStat], Tuple[List[PlayStat], int], Tuple[List[PlayStat], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_play_types():  # noqa: E501
    """Play types

    Types of plays # noqa: E501


    :rtype: Union[List[PlayType], Tuple[List[PlayType], int], Tuple[List[PlayType], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_plays(year, week, season_type=None, team=None, offense=None, defense=None, conference=None, offense_conference=None, defense_conference=None, play_type=None, classification=None):  # noqa: E501
    """Play by play data

    Get play data and results # noqa: E501

    :param year: Year filter
    :type year: int
    :param week: Week filter (required if team, offense, or defense, not specified)
    :type week: int
    :param season_type: Season type filter
    :type season_type: str
    :param team: Team filter
    :type team: str
    :param offense: Offensive team filter
    :type offense: str
    :param defense: Defensive team filter
    :type defense: str
    :param conference: Conference filter
    :type conference: str
    :param offense_conference: Offensive conference filter
    :type offense_conference: str
    :param defense_conference: Defensive conference filter
    :type defense_conference: str
    :param play_type: Play type filter
    :type play_type: int
    :param classification: Division classification filter (fbs/fcs/ii/iii)
    :type classification: str

    :rtype: Union[List[Play], Tuple[List[Play], int], Tuple[List[Play], int, Dict[str, str]]
    """
    return 'do some magic!'
