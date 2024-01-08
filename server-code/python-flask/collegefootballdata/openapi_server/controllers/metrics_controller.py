import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.game_ppa import GamePPA  # noqa: E501
from openapi_server.models.play_wp import PlayWP  # noqa: E501
from openapi_server.models.player_game_ppa import PlayerGamePPA  # noqa: E501
from openapi_server.models.player_season_ppa import PlayerSeasonPPA  # noqa: E501
from openapi_server.models.predicted_points import PredictedPoints  # noqa: E501
from openapi_server.models.pregame_wp import PregameWP  # noqa: E501
from openapi_server.models.team_ppa import TeamPPA  # noqa: E501
from openapi_server import util


def get_game_ppa(year, week=None, team=None, conference=None, exclude_garbage_time=None, season_type=None):  # noqa: E501
    """Team Predicated Points Added (PPA/EPA) by game

    Predicted Points Added (PPA) by game # noqa: E501

    :param year: Year filter
    :type year: int
    :param week: Week filter
    :type week: int
    :param team: Team filter
    :type team: str
    :param conference: Conference filter
    :type conference: str
    :param exclude_garbage_time: Filter to remove garbage time plays from calculations
    :type exclude_garbage_time: bool
    :param season_type: Season type filter (regular or postseason)
    :type season_type: str

    :rtype: Union[List[GamePPA], Tuple[List[GamePPA], int], Tuple[List[GamePPA], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_player_game_ppa(year=None, week=None, team=None, position=None, player_id=None, threshold=None, exclude_garbage_time=None, season_type=None):  # noqa: E501
    """Player Predicated Points Added (PPA/EPA) broken down by game

    Predicted Points Added (PPA) by player game # noqa: E501

    :param year: Year filter
    :type year: int
    :param week: Week filter
    :type week: int
    :param team: Team filter
    :type team: str
    :param position: Position abbreviation filter
    :type position: str
    :param player_id: Player id filter
    :type player_id: int
    :param threshold: Minimum play threshold filter
    :type threshold: str
    :param exclude_garbage_time: Filter to remove garbage time plays from calculations
    :type exclude_garbage_time: bool
    :param season_type: Season type filter (regular or postseason)
    :type season_type: str

    :rtype: Union[List[PlayerGamePPA], Tuple[List[PlayerGamePPA], int], Tuple[List[PlayerGamePPA], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_player_season_ppa(year=None, team=None, conference=None, position=None, player_id=None, threshold=None, exclude_garbage_time=None):  # noqa: E501
    """Player Predicated Points Added (PPA/EPA) broken down by season

    Predicted Points Added (PPA) by player season # noqa: E501

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
    :param threshold: Minimum play threshold filter
    :type threshold: str
    :param exclude_garbage_time: Filter to remove garbage time plays from calculations
    :type exclude_garbage_time: bool

    :rtype: Union[List[PlayerSeasonPPA], Tuple[List[PlayerSeasonPPA], int], Tuple[List[PlayerSeasonPPA], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_predicted_points(down, distance):  # noqa: E501
    """Predicted Points (i.e. Expected Points or EP)

    Predicted Points # noqa: E501

    :param down: Down filter
    :type down: int
    :param distance: Distance filter
    :type distance: int

    :rtype: Union[List[PredictedPoints], Tuple[List[PredictedPoints], int], Tuple[List[PredictedPoints], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_pregame_win_probabilities(year=None, week=None, team=None, season_type=None):  # noqa: E501
    """Pregame win probability data

    Pregame win probabilities # noqa: E501

    :param year: Year filter
    :type year: int
    :param week: Week filter
    :type week: int
    :param team: Team filter
    :type team: str
    :param season_type: regular or postseason
    :type season_type: str

    :rtype: Union[List[PregameWP], Tuple[List[PregameWP], int], Tuple[List[PregameWP], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_team_ppa(year=None, team=None, conference=None, exclude_garbage_time=None):  # noqa: E501
    """Predicted Points Added (PPA/EPA) data by team

    Predicted Points Added (PPA) # noqa: E501

    :param year: Year filter (required if team not specified)
    :type year: int
    :param team: Team filter (required if year not specified)
    :type team: str
    :param conference: Conference filter
    :type conference: str
    :param exclude_garbage_time: Filter to remove garbage time plays from calculations
    :type exclude_garbage_time: bool

    :rtype: Union[List[TeamPPA], Tuple[List[TeamPPA], int], Tuple[List[TeamPPA], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_win_probability_data(game_id):  # noqa: E501
    """Win probability chart data

    Win probability data # noqa: E501

    :param game_id: Game id filter
    :type game_id: int

    :rtype: Union[List[PlayWP], Tuple[List[PlayWP], int], Tuple[List[PlayWP], int, Dict[str, str]]
    """
    return 'do some magic!'
