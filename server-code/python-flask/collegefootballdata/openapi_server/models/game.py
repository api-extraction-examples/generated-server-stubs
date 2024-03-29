from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Game(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attendance=None, away_conference=None, away_division=None, away_id=None, away_line_scores=None, away_points=None, away_post_win_prob=None, away_postgame_elo=None, away_pregame_elo=None, away_team=None, completed=None, conference_game=None, excitement_index=None, highlights=None, home_conference=None, home_division=None, home_id=None, home_line_scores=None, home_points=None, home_post_win_prob=None, home_postgame_elo=None, home_pregame_elo=None, home_team=None, id=None, neutral_site=None, notes=None, season=None, season_type=None, start_date=None, start_time_tbd=None, venue=None, venue_id=None, week=None):  # noqa: E501
        """Game - a model defined in OpenAPI

        :param attendance: The attendance of this Game.  # noqa: E501
        :type attendance: int
        :param away_conference: The away_conference of this Game.  # noqa: E501
        :type away_conference: str
        :param away_division: The away_division of this Game.  # noqa: E501
        :type away_division: str
        :param away_id: The away_id of this Game.  # noqa: E501
        :type away_id: int
        :param away_line_scores: The away_line_scores of this Game.  # noqa: E501
        :type away_line_scores: List[int]
        :param away_points: The away_points of this Game.  # noqa: E501
        :type away_points: int
        :param away_post_win_prob: The away_post_win_prob of this Game.  # noqa: E501
        :type away_post_win_prob: float
        :param away_postgame_elo: The away_postgame_elo of this Game.  # noqa: E501
        :type away_postgame_elo: int
        :param away_pregame_elo: The away_pregame_elo of this Game.  # noqa: E501
        :type away_pregame_elo: int
        :param away_team: The away_team of this Game.  # noqa: E501
        :type away_team: str
        :param completed: The completed of this Game.  # noqa: E501
        :type completed: bool
        :param conference_game: The conference_game of this Game.  # noqa: E501
        :type conference_game: bool
        :param excitement_index: The excitement_index of this Game.  # noqa: E501
        :type excitement_index: float
        :param highlights: The highlights of this Game.  # noqa: E501
        :type highlights: str
        :param home_conference: The home_conference of this Game.  # noqa: E501
        :type home_conference: str
        :param home_division: The home_division of this Game.  # noqa: E501
        :type home_division: str
        :param home_id: The home_id of this Game.  # noqa: E501
        :type home_id: int
        :param home_line_scores: The home_line_scores of this Game.  # noqa: E501
        :type home_line_scores: List[int]
        :param home_points: The home_points of this Game.  # noqa: E501
        :type home_points: int
        :param home_post_win_prob: The home_post_win_prob of this Game.  # noqa: E501
        :type home_post_win_prob: float
        :param home_postgame_elo: The home_postgame_elo of this Game.  # noqa: E501
        :type home_postgame_elo: int
        :param home_pregame_elo: The home_pregame_elo of this Game.  # noqa: E501
        :type home_pregame_elo: int
        :param home_team: The home_team of this Game.  # noqa: E501
        :type home_team: str
        :param id: The id of this Game.  # noqa: E501
        :type id: int
        :param neutral_site: The neutral_site of this Game.  # noqa: E501
        :type neutral_site: bool
        :param notes: The notes of this Game.  # noqa: E501
        :type notes: str
        :param season: The season of this Game.  # noqa: E501
        :type season: int
        :param season_type: The season_type of this Game.  # noqa: E501
        :type season_type: str
        :param start_date: The start_date of this Game.  # noqa: E501
        :type start_date: str
        :param start_time_tbd: The start_time_tbd of this Game.  # noqa: E501
        :type start_time_tbd: bool
        :param venue: The venue of this Game.  # noqa: E501
        :type venue: str
        :param venue_id: The venue_id of this Game.  # noqa: E501
        :type venue_id: int
        :param week: The week of this Game.  # noqa: E501
        :type week: int
        """
        self.openapi_types = {
            'attendance': int,
            'away_conference': str,
            'away_division': str,
            'away_id': int,
            'away_line_scores': List[int],
            'away_points': int,
            'away_post_win_prob': float,
            'away_postgame_elo': int,
            'away_pregame_elo': int,
            'away_team': str,
            'completed': bool,
            'conference_game': bool,
            'excitement_index': float,
            'highlights': str,
            'home_conference': str,
            'home_division': str,
            'home_id': int,
            'home_line_scores': List[int],
            'home_points': int,
            'home_post_win_prob': float,
            'home_postgame_elo': int,
            'home_pregame_elo': int,
            'home_team': str,
            'id': int,
            'neutral_site': bool,
            'notes': str,
            'season': int,
            'season_type': str,
            'start_date': str,
            'start_time_tbd': bool,
            'venue': str,
            'venue_id': int,
            'week': int
        }

        self.attribute_map = {
            'attendance': 'attendance',
            'away_conference': 'away_conference',
            'away_division': 'away_division',
            'away_id': 'away_id',
            'away_line_scores': 'away_line_scores',
            'away_points': 'away_points',
            'away_post_win_prob': 'away_post_win_prob',
            'away_postgame_elo': 'away_postgame_elo',
            'away_pregame_elo': 'away_pregame_elo',
            'away_team': 'away_team',
            'completed': 'completed',
            'conference_game': 'conference_game',
            'excitement_index': 'excitement_index',
            'highlights': 'highlights',
            'home_conference': 'home_conference',
            'home_division': 'home_division',
            'home_id': 'home_id',
            'home_line_scores': 'home_line_scores',
            'home_points': 'home_points',
            'home_post_win_prob': 'home_post_win_prob',
            'home_postgame_elo': 'home_postgame_elo',
            'home_pregame_elo': 'home_pregame_elo',
            'home_team': 'home_team',
            'id': 'id',
            'neutral_site': 'neutral_site',
            'notes': 'notes',
            'season': 'season',
            'season_type': 'season_type',
            'start_date': 'start_date',
            'start_time_tbd': 'start_time_tbd',
            'venue': 'venue',
            'venue_id': 'venue_id',
            'week': 'week'
        }

        self._attendance = attendance
        self._away_conference = away_conference
        self._away_division = away_division
        self._away_id = away_id
        self._away_line_scores = away_line_scores
        self._away_points = away_points
        self._away_post_win_prob = away_post_win_prob
        self._away_postgame_elo = away_postgame_elo
        self._away_pregame_elo = away_pregame_elo
        self._away_team = away_team
        self._completed = completed
        self._conference_game = conference_game
        self._excitement_index = excitement_index
        self._highlights = highlights
        self._home_conference = home_conference
        self._home_division = home_division
        self._home_id = home_id
        self._home_line_scores = home_line_scores
        self._home_points = home_points
        self._home_post_win_prob = home_post_win_prob
        self._home_postgame_elo = home_postgame_elo
        self._home_pregame_elo = home_pregame_elo
        self._home_team = home_team
        self._id = id
        self._neutral_site = neutral_site
        self._notes = notes
        self._season = season
        self._season_type = season_type
        self._start_date = start_date
        self._start_time_tbd = start_time_tbd
        self._venue = venue
        self._venue_id = venue_id
        self._week = week

    @classmethod
    def from_dict(cls, dikt) -> 'Game':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Game of this Game.  # noqa: E501
        :rtype: Game
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attendance(self) -> int:
        """Gets the attendance of this Game.


        :return: The attendance of this Game.
        :rtype: int
        """
        return self._attendance

    @attendance.setter
    def attendance(self, attendance: int):
        """Sets the attendance of this Game.


        :param attendance: The attendance of this Game.
        :type attendance: int
        """

        self._attendance = attendance

    @property
    def away_conference(self) -> str:
        """Gets the away_conference of this Game.


        :return: The away_conference of this Game.
        :rtype: str
        """
        return self._away_conference

    @away_conference.setter
    def away_conference(self, away_conference: str):
        """Sets the away_conference of this Game.


        :param away_conference: The away_conference of this Game.
        :type away_conference: str
        """

        self._away_conference = away_conference

    @property
    def away_division(self) -> str:
        """Gets the away_division of this Game.


        :return: The away_division of this Game.
        :rtype: str
        """
        return self._away_division

    @away_division.setter
    def away_division(self, away_division: str):
        """Sets the away_division of this Game.


        :param away_division: The away_division of this Game.
        :type away_division: str
        """

        self._away_division = away_division

    @property
    def away_id(self) -> int:
        """Gets the away_id of this Game.


        :return: The away_id of this Game.
        :rtype: int
        """
        return self._away_id

    @away_id.setter
    def away_id(self, away_id: int):
        """Sets the away_id of this Game.


        :param away_id: The away_id of this Game.
        :type away_id: int
        """

        self._away_id = away_id

    @property
    def away_line_scores(self) -> List[int]:
        """Gets the away_line_scores of this Game.


        :return: The away_line_scores of this Game.
        :rtype: List[int]
        """
        return self._away_line_scores

    @away_line_scores.setter
    def away_line_scores(self, away_line_scores: List[int]):
        """Sets the away_line_scores of this Game.


        :param away_line_scores: The away_line_scores of this Game.
        :type away_line_scores: List[int]
        """

        self._away_line_scores = away_line_scores

    @property
    def away_points(self) -> int:
        """Gets the away_points of this Game.


        :return: The away_points of this Game.
        :rtype: int
        """
        return self._away_points

    @away_points.setter
    def away_points(self, away_points: int):
        """Sets the away_points of this Game.


        :param away_points: The away_points of this Game.
        :type away_points: int
        """

        self._away_points = away_points

    @property
    def away_post_win_prob(self) -> float:
        """Gets the away_post_win_prob of this Game.


        :return: The away_post_win_prob of this Game.
        :rtype: float
        """
        return self._away_post_win_prob

    @away_post_win_prob.setter
    def away_post_win_prob(self, away_post_win_prob: float):
        """Sets the away_post_win_prob of this Game.


        :param away_post_win_prob: The away_post_win_prob of this Game.
        :type away_post_win_prob: float
        """

        self._away_post_win_prob = away_post_win_prob

    @property
    def away_postgame_elo(self) -> int:
        """Gets the away_postgame_elo of this Game.


        :return: The away_postgame_elo of this Game.
        :rtype: int
        """
        return self._away_postgame_elo

    @away_postgame_elo.setter
    def away_postgame_elo(self, away_postgame_elo: int):
        """Sets the away_postgame_elo of this Game.


        :param away_postgame_elo: The away_postgame_elo of this Game.
        :type away_postgame_elo: int
        """

        self._away_postgame_elo = away_postgame_elo

    @property
    def away_pregame_elo(self) -> int:
        """Gets the away_pregame_elo of this Game.


        :return: The away_pregame_elo of this Game.
        :rtype: int
        """
        return self._away_pregame_elo

    @away_pregame_elo.setter
    def away_pregame_elo(self, away_pregame_elo: int):
        """Sets the away_pregame_elo of this Game.


        :param away_pregame_elo: The away_pregame_elo of this Game.
        :type away_pregame_elo: int
        """

        self._away_pregame_elo = away_pregame_elo

    @property
    def away_team(self) -> str:
        """Gets the away_team of this Game.


        :return: The away_team of this Game.
        :rtype: str
        """
        return self._away_team

    @away_team.setter
    def away_team(self, away_team: str):
        """Sets the away_team of this Game.


        :param away_team: The away_team of this Game.
        :type away_team: str
        """

        self._away_team = away_team

    @property
    def completed(self) -> bool:
        """Gets the completed of this Game.


        :return: The completed of this Game.
        :rtype: bool
        """
        return self._completed

    @completed.setter
    def completed(self, completed: bool):
        """Sets the completed of this Game.


        :param completed: The completed of this Game.
        :type completed: bool
        """

        self._completed = completed

    @property
    def conference_game(self) -> bool:
        """Gets the conference_game of this Game.


        :return: The conference_game of this Game.
        :rtype: bool
        """
        return self._conference_game

    @conference_game.setter
    def conference_game(self, conference_game: bool):
        """Sets the conference_game of this Game.


        :param conference_game: The conference_game of this Game.
        :type conference_game: bool
        """

        self._conference_game = conference_game

    @property
    def excitement_index(self) -> float:
        """Gets the excitement_index of this Game.


        :return: The excitement_index of this Game.
        :rtype: float
        """
        return self._excitement_index

    @excitement_index.setter
    def excitement_index(self, excitement_index: float):
        """Sets the excitement_index of this Game.


        :param excitement_index: The excitement_index of this Game.
        :type excitement_index: float
        """

        self._excitement_index = excitement_index

    @property
    def highlights(self) -> str:
        """Gets the highlights of this Game.


        :return: The highlights of this Game.
        :rtype: str
        """
        return self._highlights

    @highlights.setter
    def highlights(self, highlights: str):
        """Sets the highlights of this Game.


        :param highlights: The highlights of this Game.
        :type highlights: str
        """

        self._highlights = highlights

    @property
    def home_conference(self) -> str:
        """Gets the home_conference of this Game.


        :return: The home_conference of this Game.
        :rtype: str
        """
        return self._home_conference

    @home_conference.setter
    def home_conference(self, home_conference: str):
        """Sets the home_conference of this Game.


        :param home_conference: The home_conference of this Game.
        :type home_conference: str
        """

        self._home_conference = home_conference

    @property
    def home_division(self) -> str:
        """Gets the home_division of this Game.


        :return: The home_division of this Game.
        :rtype: str
        """
        return self._home_division

    @home_division.setter
    def home_division(self, home_division: str):
        """Sets the home_division of this Game.


        :param home_division: The home_division of this Game.
        :type home_division: str
        """

        self._home_division = home_division

    @property
    def home_id(self) -> int:
        """Gets the home_id of this Game.


        :return: The home_id of this Game.
        :rtype: int
        """
        return self._home_id

    @home_id.setter
    def home_id(self, home_id: int):
        """Sets the home_id of this Game.


        :param home_id: The home_id of this Game.
        :type home_id: int
        """

        self._home_id = home_id

    @property
    def home_line_scores(self) -> List[int]:
        """Gets the home_line_scores of this Game.


        :return: The home_line_scores of this Game.
        :rtype: List[int]
        """
        return self._home_line_scores

    @home_line_scores.setter
    def home_line_scores(self, home_line_scores: List[int]):
        """Sets the home_line_scores of this Game.


        :param home_line_scores: The home_line_scores of this Game.
        :type home_line_scores: List[int]
        """

        self._home_line_scores = home_line_scores

    @property
    def home_points(self) -> int:
        """Gets the home_points of this Game.


        :return: The home_points of this Game.
        :rtype: int
        """
        return self._home_points

    @home_points.setter
    def home_points(self, home_points: int):
        """Sets the home_points of this Game.


        :param home_points: The home_points of this Game.
        :type home_points: int
        """

        self._home_points = home_points

    @property
    def home_post_win_prob(self) -> float:
        """Gets the home_post_win_prob of this Game.


        :return: The home_post_win_prob of this Game.
        :rtype: float
        """
        return self._home_post_win_prob

    @home_post_win_prob.setter
    def home_post_win_prob(self, home_post_win_prob: float):
        """Sets the home_post_win_prob of this Game.


        :param home_post_win_prob: The home_post_win_prob of this Game.
        :type home_post_win_prob: float
        """

        self._home_post_win_prob = home_post_win_prob

    @property
    def home_postgame_elo(self) -> int:
        """Gets the home_postgame_elo of this Game.


        :return: The home_postgame_elo of this Game.
        :rtype: int
        """
        return self._home_postgame_elo

    @home_postgame_elo.setter
    def home_postgame_elo(self, home_postgame_elo: int):
        """Sets the home_postgame_elo of this Game.


        :param home_postgame_elo: The home_postgame_elo of this Game.
        :type home_postgame_elo: int
        """

        self._home_postgame_elo = home_postgame_elo

    @property
    def home_pregame_elo(self) -> int:
        """Gets the home_pregame_elo of this Game.


        :return: The home_pregame_elo of this Game.
        :rtype: int
        """
        return self._home_pregame_elo

    @home_pregame_elo.setter
    def home_pregame_elo(self, home_pregame_elo: int):
        """Sets the home_pregame_elo of this Game.


        :param home_pregame_elo: The home_pregame_elo of this Game.
        :type home_pregame_elo: int
        """

        self._home_pregame_elo = home_pregame_elo

    @property
    def home_team(self) -> str:
        """Gets the home_team of this Game.


        :return: The home_team of this Game.
        :rtype: str
        """
        return self._home_team

    @home_team.setter
    def home_team(self, home_team: str):
        """Sets the home_team of this Game.


        :param home_team: The home_team of this Game.
        :type home_team: str
        """

        self._home_team = home_team

    @property
    def id(self) -> int:
        """Gets the id of this Game.


        :return: The id of this Game.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this Game.


        :param id: The id of this Game.
        :type id: int
        """

        self._id = id

    @property
    def neutral_site(self) -> bool:
        """Gets the neutral_site of this Game.


        :return: The neutral_site of this Game.
        :rtype: bool
        """
        return self._neutral_site

    @neutral_site.setter
    def neutral_site(self, neutral_site: bool):
        """Sets the neutral_site of this Game.


        :param neutral_site: The neutral_site of this Game.
        :type neutral_site: bool
        """

        self._neutral_site = neutral_site

    @property
    def notes(self) -> str:
        """Gets the notes of this Game.


        :return: The notes of this Game.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes: str):
        """Sets the notes of this Game.


        :param notes: The notes of this Game.
        :type notes: str
        """

        self._notes = notes

    @property
    def season(self) -> int:
        """Gets the season of this Game.


        :return: The season of this Game.
        :rtype: int
        """
        return self._season

    @season.setter
    def season(self, season: int):
        """Sets the season of this Game.


        :param season: The season of this Game.
        :type season: int
        """

        self._season = season

    @property
    def season_type(self) -> str:
        """Gets the season_type of this Game.


        :return: The season_type of this Game.
        :rtype: str
        """
        return self._season_type

    @season_type.setter
    def season_type(self, season_type: str):
        """Sets the season_type of this Game.


        :param season_type: The season_type of this Game.
        :type season_type: str
        """

        self._season_type = season_type

    @property
    def start_date(self) -> str:
        """Gets the start_date of this Game.


        :return: The start_date of this Game.
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: str):
        """Sets the start_date of this Game.


        :param start_date: The start_date of this Game.
        :type start_date: str
        """

        self._start_date = start_date

    @property
    def start_time_tbd(self) -> bool:
        """Gets the start_time_tbd of this Game.


        :return: The start_time_tbd of this Game.
        :rtype: bool
        """
        return self._start_time_tbd

    @start_time_tbd.setter
    def start_time_tbd(self, start_time_tbd: bool):
        """Sets the start_time_tbd of this Game.


        :param start_time_tbd: The start_time_tbd of this Game.
        :type start_time_tbd: bool
        """

        self._start_time_tbd = start_time_tbd

    @property
    def venue(self) -> str:
        """Gets the venue of this Game.


        :return: The venue of this Game.
        :rtype: str
        """
        return self._venue

    @venue.setter
    def venue(self, venue: str):
        """Sets the venue of this Game.


        :param venue: The venue of this Game.
        :type venue: str
        """

        self._venue = venue

    @property
    def venue_id(self) -> int:
        """Gets the venue_id of this Game.


        :return: The venue_id of this Game.
        :rtype: int
        """
        return self._venue_id

    @venue_id.setter
    def venue_id(self, venue_id: int):
        """Sets the venue_id of this Game.


        :param venue_id: The venue_id of this Game.
        :type venue_id: int
        """

        self._venue_id = venue_id

    @property
    def week(self) -> int:
        """Gets the week of this Game.


        :return: The week of this Game.
        :rtype: int
        """
        return self._week

    @week.setter
    def week(self, week: int):
        """Sets the week of this Game.


        :param week: The week of this Game.
        :type week: int
        """

        self._week = week
