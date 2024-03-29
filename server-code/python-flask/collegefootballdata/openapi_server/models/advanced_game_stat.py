from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.advanced_game_stat_defense import AdvancedGameStatDefense
from openapi_server import util

from openapi_server.models.advanced_game_stat_defense import AdvancedGameStatDefense  # noqa: E501

class AdvancedGameStat(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, defense=None, game_id=None, offense=None, opponent=None, season=None, team=None, week=None):  # noqa: E501
        """AdvancedGameStat - a model defined in OpenAPI

        :param defense: The defense of this AdvancedGameStat.  # noqa: E501
        :type defense: AdvancedGameStatDefense
        :param game_id: The game_id of this AdvancedGameStat.  # noqa: E501
        :type game_id: int
        :param offense: The offense of this AdvancedGameStat.  # noqa: E501
        :type offense: AdvancedGameStatDefense
        :param opponent: The opponent of this AdvancedGameStat.  # noqa: E501
        :type opponent: str
        :param season: The season of this AdvancedGameStat.  # noqa: E501
        :type season: int
        :param team: The team of this AdvancedGameStat.  # noqa: E501
        :type team: str
        :param week: The week of this AdvancedGameStat.  # noqa: E501
        :type week: int
        """
        self.openapi_types = {
            'defense': AdvancedGameStatDefense,
            'game_id': int,
            'offense': AdvancedGameStatDefense,
            'opponent': str,
            'season': int,
            'team': str,
            'week': int
        }

        self.attribute_map = {
            'defense': 'defense',
            'game_id': 'gameId',
            'offense': 'offense',
            'opponent': 'opponent',
            'season': 'season',
            'team': 'team',
            'week': 'week'
        }

        self._defense = defense
        self._game_id = game_id
        self._offense = offense
        self._opponent = opponent
        self._season = season
        self._team = team
        self._week = week

    @classmethod
    def from_dict(cls, dikt) -> 'AdvancedGameStat':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AdvancedGameStat of this AdvancedGameStat.  # noqa: E501
        :rtype: AdvancedGameStat
        """
        return util.deserialize_model(dikt, cls)

    @property
    def defense(self) -> AdvancedGameStatDefense:
        """Gets the defense of this AdvancedGameStat.


        :return: The defense of this AdvancedGameStat.
        :rtype: AdvancedGameStatDefense
        """
        return self._defense

    @defense.setter
    def defense(self, defense: AdvancedGameStatDefense):
        """Sets the defense of this AdvancedGameStat.


        :param defense: The defense of this AdvancedGameStat.
        :type defense: AdvancedGameStatDefense
        """

        self._defense = defense

    @property
    def game_id(self) -> int:
        """Gets the game_id of this AdvancedGameStat.


        :return: The game_id of this AdvancedGameStat.
        :rtype: int
        """
        return self._game_id

    @game_id.setter
    def game_id(self, game_id: int):
        """Sets the game_id of this AdvancedGameStat.


        :param game_id: The game_id of this AdvancedGameStat.
        :type game_id: int
        """

        self._game_id = game_id

    @property
    def offense(self) -> AdvancedGameStatDefense:
        """Gets the offense of this AdvancedGameStat.


        :return: The offense of this AdvancedGameStat.
        :rtype: AdvancedGameStatDefense
        """
        return self._offense

    @offense.setter
    def offense(self, offense: AdvancedGameStatDefense):
        """Sets the offense of this AdvancedGameStat.


        :param offense: The offense of this AdvancedGameStat.
        :type offense: AdvancedGameStatDefense
        """

        self._offense = offense

    @property
    def opponent(self) -> str:
        """Gets the opponent of this AdvancedGameStat.


        :return: The opponent of this AdvancedGameStat.
        :rtype: str
        """
        return self._opponent

    @opponent.setter
    def opponent(self, opponent: str):
        """Sets the opponent of this AdvancedGameStat.


        :param opponent: The opponent of this AdvancedGameStat.
        :type opponent: str
        """

        self._opponent = opponent

    @property
    def season(self) -> int:
        """Gets the season of this AdvancedGameStat.


        :return: The season of this AdvancedGameStat.
        :rtype: int
        """
        return self._season

    @season.setter
    def season(self, season: int):
        """Sets the season of this AdvancedGameStat.


        :param season: The season of this AdvancedGameStat.
        :type season: int
        """

        self._season = season

    @property
    def team(self) -> str:
        """Gets the team of this AdvancedGameStat.


        :return: The team of this AdvancedGameStat.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this AdvancedGameStat.


        :param team: The team of this AdvancedGameStat.
        :type team: str
        """

        self._team = team

    @property
    def week(self) -> int:
        """Gets the week of this AdvancedGameStat.


        :return: The week of this AdvancedGameStat.
        :rtype: int
        """
        return self._week

    @week.setter
    def week(self, week: int):
        """Sets the week of this AdvancedGameStat.


        :param week: The week of this AdvancedGameStat.
        :type week: int
        """

        self._week = week
