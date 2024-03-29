from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.game_lines_lines_inner import GameLinesLinesInner
from openapi_server import util

from openapi_server.models.game_lines_lines_inner import GameLinesLinesInner  # noqa: E501

class GameLines(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, away_conference=None, away_score=None, away_team=None, home_conference=None, home_score=None, home_team=None, id=None, lines=None, season=None, season_type=None, start_date=None, week=None):  # noqa: E501
        """GameLines - a model defined in OpenAPI

        :param away_conference: The away_conference of this GameLines.  # noqa: E501
        :type away_conference: str
        :param away_score: The away_score of this GameLines.  # noqa: E501
        :type away_score: int
        :param away_team: The away_team of this GameLines.  # noqa: E501
        :type away_team: str
        :param home_conference: The home_conference of this GameLines.  # noqa: E501
        :type home_conference: str
        :param home_score: The home_score of this GameLines.  # noqa: E501
        :type home_score: int
        :param home_team: The home_team of this GameLines.  # noqa: E501
        :type home_team: str
        :param id: The id of this GameLines.  # noqa: E501
        :type id: int
        :param lines: The lines of this GameLines.  # noqa: E501
        :type lines: List[GameLinesLinesInner]
        :param season: The season of this GameLines.  # noqa: E501
        :type season: int
        :param season_type: The season_type of this GameLines.  # noqa: E501
        :type season_type: str
        :param start_date: The start_date of this GameLines.  # noqa: E501
        :type start_date: str
        :param week: The week of this GameLines.  # noqa: E501
        :type week: int
        """
        self.openapi_types = {
            'away_conference': str,
            'away_score': int,
            'away_team': str,
            'home_conference': str,
            'home_score': int,
            'home_team': str,
            'id': int,
            'lines': List[GameLinesLinesInner],
            'season': int,
            'season_type': str,
            'start_date': str,
            'week': int
        }

        self.attribute_map = {
            'away_conference': 'awayConference',
            'away_score': 'awayScore',
            'away_team': 'awayTeam',
            'home_conference': 'homeConference',
            'home_score': 'homeScore',
            'home_team': 'homeTeam',
            'id': 'id',
            'lines': 'lines',
            'season': 'season',
            'season_type': 'seasonType',
            'start_date': 'startDate',
            'week': 'week'
        }

        self._away_conference = away_conference
        self._away_score = away_score
        self._away_team = away_team
        self._home_conference = home_conference
        self._home_score = home_score
        self._home_team = home_team
        self._id = id
        self._lines = lines
        self._season = season
        self._season_type = season_type
        self._start_date = start_date
        self._week = week

    @classmethod
    def from_dict(cls, dikt) -> 'GameLines':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GameLines of this GameLines.  # noqa: E501
        :rtype: GameLines
        """
        return util.deserialize_model(dikt, cls)

    @property
    def away_conference(self) -> str:
        """Gets the away_conference of this GameLines.


        :return: The away_conference of this GameLines.
        :rtype: str
        """
        return self._away_conference

    @away_conference.setter
    def away_conference(self, away_conference: str):
        """Sets the away_conference of this GameLines.


        :param away_conference: The away_conference of this GameLines.
        :type away_conference: str
        """

        self._away_conference = away_conference

    @property
    def away_score(self) -> int:
        """Gets the away_score of this GameLines.


        :return: The away_score of this GameLines.
        :rtype: int
        """
        return self._away_score

    @away_score.setter
    def away_score(self, away_score: int):
        """Sets the away_score of this GameLines.


        :param away_score: The away_score of this GameLines.
        :type away_score: int
        """

        self._away_score = away_score

    @property
    def away_team(self) -> str:
        """Gets the away_team of this GameLines.


        :return: The away_team of this GameLines.
        :rtype: str
        """
        return self._away_team

    @away_team.setter
    def away_team(self, away_team: str):
        """Sets the away_team of this GameLines.


        :param away_team: The away_team of this GameLines.
        :type away_team: str
        """

        self._away_team = away_team

    @property
    def home_conference(self) -> str:
        """Gets the home_conference of this GameLines.


        :return: The home_conference of this GameLines.
        :rtype: str
        """
        return self._home_conference

    @home_conference.setter
    def home_conference(self, home_conference: str):
        """Sets the home_conference of this GameLines.


        :param home_conference: The home_conference of this GameLines.
        :type home_conference: str
        """

        self._home_conference = home_conference

    @property
    def home_score(self) -> int:
        """Gets the home_score of this GameLines.


        :return: The home_score of this GameLines.
        :rtype: int
        """
        return self._home_score

    @home_score.setter
    def home_score(self, home_score: int):
        """Sets the home_score of this GameLines.


        :param home_score: The home_score of this GameLines.
        :type home_score: int
        """

        self._home_score = home_score

    @property
    def home_team(self) -> str:
        """Gets the home_team of this GameLines.


        :return: The home_team of this GameLines.
        :rtype: str
        """
        return self._home_team

    @home_team.setter
    def home_team(self, home_team: str):
        """Sets the home_team of this GameLines.


        :param home_team: The home_team of this GameLines.
        :type home_team: str
        """

        self._home_team = home_team

    @property
    def id(self) -> int:
        """Gets the id of this GameLines.


        :return: The id of this GameLines.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this GameLines.


        :param id: The id of this GameLines.
        :type id: int
        """

        self._id = id

    @property
    def lines(self) -> List[GameLinesLinesInner]:
        """Gets the lines of this GameLines.


        :return: The lines of this GameLines.
        :rtype: List[GameLinesLinesInner]
        """
        return self._lines

    @lines.setter
    def lines(self, lines: List[GameLinesLinesInner]):
        """Sets the lines of this GameLines.


        :param lines: The lines of this GameLines.
        :type lines: List[GameLinesLinesInner]
        """

        self._lines = lines

    @property
    def season(self) -> int:
        """Gets the season of this GameLines.


        :return: The season of this GameLines.
        :rtype: int
        """
        return self._season

    @season.setter
    def season(self, season: int):
        """Sets the season of this GameLines.


        :param season: The season of this GameLines.
        :type season: int
        """

        self._season = season

    @property
    def season_type(self) -> str:
        """Gets the season_type of this GameLines.


        :return: The season_type of this GameLines.
        :rtype: str
        """
        return self._season_type

    @season_type.setter
    def season_type(self, season_type: str):
        """Sets the season_type of this GameLines.


        :param season_type: The season_type of this GameLines.
        :type season_type: str
        """

        self._season_type = season_type

    @property
    def start_date(self) -> str:
        """Gets the start_date of this GameLines.


        :return: The start_date of this GameLines.
        :rtype: str
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: str):
        """Sets the start_date of this GameLines.


        :param start_date: The start_date of this GameLines.
        :type start_date: str
        """

        self._start_date = start_date

    @property
    def week(self) -> int:
        """Gets the week of this GameLines.


        :return: The week of this GameLines.
        :rtype: int
        """
        return self._week

    @week.setter
    def week(self, week: int):
        """Sets the week of this GameLines.


        :param week: The week of this GameLines.
        :type week: int
        """

        self._week = week
