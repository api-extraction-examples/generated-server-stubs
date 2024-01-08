from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.team_record_away_games import TeamRecordAwayGames
from openapi_server import util

from openapi_server.models.team_record_away_games import TeamRecordAwayGames  # noqa: E501

class TeamRecord(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, away_games=None, conference=None, conference_games=None, division=None, expected_wins=None, home_games=None, team=None, total=None, year=None):  # noqa: E501
        """TeamRecord - a model defined in OpenAPI

        :param away_games: The away_games of this TeamRecord.  # noqa: E501
        :type away_games: TeamRecordAwayGames
        :param conference: The conference of this TeamRecord.  # noqa: E501
        :type conference: str
        :param conference_games: The conference_games of this TeamRecord.  # noqa: E501
        :type conference_games: TeamRecordAwayGames
        :param division: The division of this TeamRecord.  # noqa: E501
        :type division: str
        :param expected_wins: The expected_wins of this TeamRecord.  # noqa: E501
        :type expected_wins: float
        :param home_games: The home_games of this TeamRecord.  # noqa: E501
        :type home_games: TeamRecordAwayGames
        :param team: The team of this TeamRecord.  # noqa: E501
        :type team: str
        :param total: The total of this TeamRecord.  # noqa: E501
        :type total: TeamRecordAwayGames
        :param year: The year of this TeamRecord.  # noqa: E501
        :type year: int
        """
        self.openapi_types = {
            'away_games': TeamRecordAwayGames,
            'conference': str,
            'conference_games': TeamRecordAwayGames,
            'division': str,
            'expected_wins': float,
            'home_games': TeamRecordAwayGames,
            'team': str,
            'total': TeamRecordAwayGames,
            'year': int
        }

        self.attribute_map = {
            'away_games': 'awayGames',
            'conference': 'conference',
            'conference_games': 'conferenceGames',
            'division': 'division',
            'expected_wins': 'expectedWins',
            'home_games': 'homeGames',
            'team': 'team',
            'total': 'total',
            'year': 'year'
        }

        self._away_games = away_games
        self._conference = conference
        self._conference_games = conference_games
        self._division = division
        self._expected_wins = expected_wins
        self._home_games = home_games
        self._team = team
        self._total = total
        self._year = year

    @classmethod
    def from_dict(cls, dikt) -> 'TeamRecord':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TeamRecord of this TeamRecord.  # noqa: E501
        :rtype: TeamRecord
        """
        return util.deserialize_model(dikt, cls)

    @property
    def away_games(self) -> TeamRecordAwayGames:
        """Gets the away_games of this TeamRecord.


        :return: The away_games of this TeamRecord.
        :rtype: TeamRecordAwayGames
        """
        return self._away_games

    @away_games.setter
    def away_games(self, away_games: TeamRecordAwayGames):
        """Sets the away_games of this TeamRecord.


        :param away_games: The away_games of this TeamRecord.
        :type away_games: TeamRecordAwayGames
        """

        self._away_games = away_games

    @property
    def conference(self) -> str:
        """Gets the conference of this TeamRecord.


        :return: The conference of this TeamRecord.
        :rtype: str
        """
        return self._conference

    @conference.setter
    def conference(self, conference: str):
        """Sets the conference of this TeamRecord.


        :param conference: The conference of this TeamRecord.
        :type conference: str
        """

        self._conference = conference

    @property
    def conference_games(self) -> TeamRecordAwayGames:
        """Gets the conference_games of this TeamRecord.


        :return: The conference_games of this TeamRecord.
        :rtype: TeamRecordAwayGames
        """
        return self._conference_games

    @conference_games.setter
    def conference_games(self, conference_games: TeamRecordAwayGames):
        """Sets the conference_games of this TeamRecord.


        :param conference_games: The conference_games of this TeamRecord.
        :type conference_games: TeamRecordAwayGames
        """

        self._conference_games = conference_games

    @property
    def division(self) -> str:
        """Gets the division of this TeamRecord.


        :return: The division of this TeamRecord.
        :rtype: str
        """
        return self._division

    @division.setter
    def division(self, division: str):
        """Sets the division of this TeamRecord.


        :param division: The division of this TeamRecord.
        :type division: str
        """

        self._division = division

    @property
    def expected_wins(self) -> float:
        """Gets the expected_wins of this TeamRecord.


        :return: The expected_wins of this TeamRecord.
        :rtype: float
        """
        return self._expected_wins

    @expected_wins.setter
    def expected_wins(self, expected_wins: float):
        """Sets the expected_wins of this TeamRecord.


        :param expected_wins: The expected_wins of this TeamRecord.
        :type expected_wins: float
        """

        self._expected_wins = expected_wins

    @property
    def home_games(self) -> TeamRecordAwayGames:
        """Gets the home_games of this TeamRecord.


        :return: The home_games of this TeamRecord.
        :rtype: TeamRecordAwayGames
        """
        return self._home_games

    @home_games.setter
    def home_games(self, home_games: TeamRecordAwayGames):
        """Sets the home_games of this TeamRecord.


        :param home_games: The home_games of this TeamRecord.
        :type home_games: TeamRecordAwayGames
        """

        self._home_games = home_games

    @property
    def team(self) -> str:
        """Gets the team of this TeamRecord.


        :return: The team of this TeamRecord.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this TeamRecord.


        :param team: The team of this TeamRecord.
        :type team: str
        """

        self._team = team

    @property
    def total(self) -> TeamRecordAwayGames:
        """Gets the total of this TeamRecord.


        :return: The total of this TeamRecord.
        :rtype: TeamRecordAwayGames
        """
        return self._total

    @total.setter
    def total(self, total: TeamRecordAwayGames):
        """Sets the total of this TeamRecord.


        :param total: The total of this TeamRecord.
        :type total: TeamRecordAwayGames
        """

        self._total = total

    @property
    def year(self) -> int:
        """Gets the year of this TeamRecord.


        :return: The year of this TeamRecord.
        :rtype: int
        """
        return self._year

    @year.setter
    def year(self, year: int):
        """Sets the year of this TeamRecord.


        :param year: The year of this TeamRecord.
        :type year: int
        """

        self._year = year