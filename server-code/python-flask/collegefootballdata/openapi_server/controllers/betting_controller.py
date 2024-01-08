import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.game_lines import GameLines  # noqa: E501
from openapi_server import util


def get_lines(game_id=None, year=None, week=None, season_type=None, team=None, home=None, away=None, conference=None):  # noqa: E501
    """Betting lines

    Closing betting lines # noqa: E501

    :param game_id: Game id filter
    :type game_id: int
    :param year: Year/season filter for games
    :type year: int
    :param week: Week filter
    :type week: int
    :param season_type: Season type filter (regular or postseason)
    :type season_type: str
    :param team: Team
    :type team: str
    :param home: Home team filter
    :type home: str
    :param away: Away team filter
    :type away: str
    :param conference: Conference abbreviation filter
    :type conference: str

    :rtype: Union[List[GameLines], Tuple[List[GameLines], int], Tuple[List[GameLines], int, Dict[str, str]]
    """
    return 'do some magic!'
