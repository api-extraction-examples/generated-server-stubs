import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.ranking_week import RankingWeek  # noqa: E501
from openapi_server import util


def get_rankings(year, week=None, season_type=None):  # noqa: E501
    """Historical polls and rankings

    Poll rankings # noqa: E501

    :param year: Year/season filter for games
    :type year: int
    :param week: Week filter
    :type week: int
    :param season_type: Season type filter (regular or postseason)
    :type season_type: str

    :rtype: Union[List[RankingWeek], Tuple[List[RankingWeek], int], Tuple[List[RankingWeek], int, Dict[str, str]]
    """
    return 'do some magic!'
