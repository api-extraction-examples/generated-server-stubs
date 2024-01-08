import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.box_score import BoxScore  # noqa: E501
from openapi_server.models.game import Game  # noqa: E501
from openapi_server.models.game_media import GameMedia  # noqa: E501
from openapi_server.models.game_weather import GameWeather  # noqa: E501
from openapi_server.models.player_game import PlayerGame  # noqa: E501
from openapi_server.models.scoreboard_game import ScoreboardGame  # noqa: E501
from openapi_server.models.team_game import TeamGame  # noqa: E501
from openapi_server.models.team_record import TeamRecord  # noqa: E501
from openapi_server.models.week import Week  # noqa: E501
from openapi_server import util


def get_advanced_box_score(game_id):  # noqa: E501
    """Advanced box scores

    Get advanced box score data # noqa: E501

    :param game_id: Game id parameters
    :type game_id: int

    :rtype: Union[BoxScore, Tuple[BoxScore, int], Tuple[BoxScore, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_calendar(year):  # noqa: E501
    """Season calendar

    Get calendar of weeks by season # noqa: E501

    :param year: Year filter
    :type year: int

    :rtype: Union[List[Week], Tuple[List[Week], int], Tuple[List[Week], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_game_media(year, week=None, season_type=None, team=None, conference=None, media_type=None, classification=None):  # noqa: E501
    """Game media information and schedules

    Game media information (TV, radio, etc) # noqa: E501

    :param year: Year filter
    :type year: int
    :param week: Week filter
    :type week: int
    :param season_type: Season type filter (regular, postseason, or both)
    :type season_type: str
    :param team: Team filter
    :type team: str
    :param conference: Conference filter
    :type conference: str
    :param media_type: Media type filter (tv, radio, web, ppv, or mobile)
    :type media_type: str
    :param classification: Division classification filter (fbs/fcs/ii/iii)
    :type classification: str

    :rtype: Union[List[GameMedia], Tuple[List[GameMedia], int], Tuple[List[GameMedia], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_game_weather(game_id=None, year=None, week=None, season_type=None, team=None, conference=None, classification=None):  # noqa: E501
    """Game weather information (Patreon only)

    Weather information for the hour of kickoff # noqa: E501

    :param game_id: Game id filter (required if no year)
    :type game_id: int
    :param year: Year filter (required if no game id)
    :type year: int
    :param week: Week filter
    :type week: int
    :param season_type: Season type filter (regular, postseason, or both)
    :type season_type: str
    :param team: Team filter
    :type team: str
    :param conference: Conference filter
    :type conference: str
    :param classification: Division classification filter (fbs/fcs/ii/iii)
    :type classification: str

    :rtype: Union[List[GameWeather], Tuple[List[GameWeather], int], Tuple[List[GameWeather], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_games(year, week=None, season_type=None, team=None, home=None, away=None, conference=None, division=None, id=None):  # noqa: E501
    """Games and results

    Get game results # noqa: E501

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
    :param division: Division classification filter (fbs/fcs/ii/iii)
    :type division: str
    :param id: id filter for querying a single game
    :type id: int

    :rtype: Union[List[Game], Tuple[List[Game], int], Tuple[List[Game], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_player_game_stats(year, week=None, season_type=None, team=None, conference=None, category=None, game_id=None):  # noqa: E501
    """Player game stats

    Player stats broken down by game # noqa: E501

    :param year: Year/season filter for games
    :type year: int
    :param week: Week filter
    :type week: int
    :param season_type: Season type filter (regular or postseason)
    :type season_type: str
    :param team: Team filter
    :type team: str
    :param conference: Conference abbreviation filter
    :type conference: str
    :param category: Category filter (e.g defensive)
    :type category: str
    :param game_id: Game id filter
    :type game_id: int

    :rtype: Union[List[PlayerGame], Tuple[List[PlayerGame], int], Tuple[List[PlayerGame], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_scoreboard(classification=None, conference=None):  # noqa: E501
    """Live game results (Patreon only)

    Get live game results # noqa: E501

    :param classification: Classification filter (fbs, fcs, ii, or iii). Defaults to fbs.
    :type classification: str
    :param conference: Conference abbreviation filter.
    :type conference: str

    :rtype: Union[List[ScoreboardGame], Tuple[List[ScoreboardGame], int], Tuple[List[ScoreboardGame], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_team_game_stats(year, week=None, season_type=None, team=None, conference=None, game_id=None, classification=None):  # noqa: E501
    """Team game stats

    Team stats broken down by game # noqa: E501

    :param year: Year/season filter for games
    :type year: int
    :param week: Week filter
    :type week: int
    :param season_type: Season type filter (regular or postseason)
    :type season_type: str
    :param team: Team filter
    :type team: str
    :param conference: Conference abbreviation filter
    :type conference: str
    :param game_id: Game id filter
    :type game_id: int
    :param classification: Division classification filter (fbs/fcs/ii/iii)
    :type classification: str

    :rtype: Union[List[TeamGame], Tuple[List[TeamGame], int], Tuple[List[TeamGame], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_team_records(year=None, team=None, conference=None):  # noqa: E501
    """Team records

    Get team records by year # noqa: E501

    :param year: Year filter
    :type year: int
    :param team: Team filter
    :type team: str
    :param conference: Conference filter
    :type conference: str

    :rtype: Union[List[TeamRecord], Tuple[List[TeamRecord], int], Tuple[List[TeamRecord], int, Dict[str, str]]
    """
    return 'do some magic!'
