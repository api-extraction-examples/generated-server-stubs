from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BoxScorePlayersUsageInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, passing=None, player=None, position=None, quarter1=None, quarter2=None, quarter3=None, quarter4=None, rushing=None, team=None, total=None):  # noqa: E501
        """BoxScorePlayersUsageInner - a model defined in OpenAPI

        :param passing: The passing of this BoxScorePlayersUsageInner.  # noqa: E501
        :type passing: float
        :param player: The player of this BoxScorePlayersUsageInner.  # noqa: E501
        :type player: str
        :param position: The position of this BoxScorePlayersUsageInner.  # noqa: E501
        :type position: str
        :param quarter1: The quarter1 of this BoxScorePlayersUsageInner.  # noqa: E501
        :type quarter1: float
        :param quarter2: The quarter2 of this BoxScorePlayersUsageInner.  # noqa: E501
        :type quarter2: float
        :param quarter3: The quarter3 of this BoxScorePlayersUsageInner.  # noqa: E501
        :type quarter3: float
        :param quarter4: The quarter4 of this BoxScorePlayersUsageInner.  # noqa: E501
        :type quarter4: float
        :param rushing: The rushing of this BoxScorePlayersUsageInner.  # noqa: E501
        :type rushing: float
        :param team: The team of this BoxScorePlayersUsageInner.  # noqa: E501
        :type team: str
        :param total: The total of this BoxScorePlayersUsageInner.  # noqa: E501
        :type total: float
        """
        self.openapi_types = {
            'passing': float,
            'player': str,
            'position': str,
            'quarter1': float,
            'quarter2': float,
            'quarter3': float,
            'quarter4': float,
            'rushing': float,
            'team': str,
            'total': float
        }

        self.attribute_map = {
            'passing': 'passing',
            'player': 'player',
            'position': 'position',
            'quarter1': 'quarter1',
            'quarter2': 'quarter2',
            'quarter3': 'quarter3',
            'quarter4': 'quarter4',
            'rushing': 'rushing',
            'team': 'team',
            'total': 'total'
        }

        self._passing = passing
        self._player = player
        self._position = position
        self._quarter1 = quarter1
        self._quarter2 = quarter2
        self._quarter3 = quarter3
        self._quarter4 = quarter4
        self._rushing = rushing
        self._team = team
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'BoxScorePlayersUsageInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BoxScore_players_usage_inner of this BoxScorePlayersUsageInner.  # noqa: E501
        :rtype: BoxScorePlayersUsageInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def passing(self) -> float:
        """Gets the passing of this BoxScorePlayersUsageInner.


        :return: The passing of this BoxScorePlayersUsageInner.
        :rtype: float
        """
        return self._passing

    @passing.setter
    def passing(self, passing: float):
        """Sets the passing of this BoxScorePlayersUsageInner.


        :param passing: The passing of this BoxScorePlayersUsageInner.
        :type passing: float
        """

        self._passing = passing

    @property
    def player(self) -> str:
        """Gets the player of this BoxScorePlayersUsageInner.


        :return: The player of this BoxScorePlayersUsageInner.
        :rtype: str
        """
        return self._player

    @player.setter
    def player(self, player: str):
        """Sets the player of this BoxScorePlayersUsageInner.


        :param player: The player of this BoxScorePlayersUsageInner.
        :type player: str
        """

        self._player = player

    @property
    def position(self) -> str:
        """Gets the position of this BoxScorePlayersUsageInner.


        :return: The position of this BoxScorePlayersUsageInner.
        :rtype: str
        """
        return self._position

    @position.setter
    def position(self, position: str):
        """Sets the position of this BoxScorePlayersUsageInner.


        :param position: The position of this BoxScorePlayersUsageInner.
        :type position: str
        """

        self._position = position

    @property
    def quarter1(self) -> float:
        """Gets the quarter1 of this BoxScorePlayersUsageInner.


        :return: The quarter1 of this BoxScorePlayersUsageInner.
        :rtype: float
        """
        return self._quarter1

    @quarter1.setter
    def quarter1(self, quarter1: float):
        """Sets the quarter1 of this BoxScorePlayersUsageInner.


        :param quarter1: The quarter1 of this BoxScorePlayersUsageInner.
        :type quarter1: float
        """

        self._quarter1 = quarter1

    @property
    def quarter2(self) -> float:
        """Gets the quarter2 of this BoxScorePlayersUsageInner.


        :return: The quarter2 of this BoxScorePlayersUsageInner.
        :rtype: float
        """
        return self._quarter2

    @quarter2.setter
    def quarter2(self, quarter2: float):
        """Sets the quarter2 of this BoxScorePlayersUsageInner.


        :param quarter2: The quarter2 of this BoxScorePlayersUsageInner.
        :type quarter2: float
        """

        self._quarter2 = quarter2

    @property
    def quarter3(self) -> float:
        """Gets the quarter3 of this BoxScorePlayersUsageInner.


        :return: The quarter3 of this BoxScorePlayersUsageInner.
        :rtype: float
        """
        return self._quarter3

    @quarter3.setter
    def quarter3(self, quarter3: float):
        """Sets the quarter3 of this BoxScorePlayersUsageInner.


        :param quarter3: The quarter3 of this BoxScorePlayersUsageInner.
        :type quarter3: float
        """

        self._quarter3 = quarter3

    @property
    def quarter4(self) -> float:
        """Gets the quarter4 of this BoxScorePlayersUsageInner.


        :return: The quarter4 of this BoxScorePlayersUsageInner.
        :rtype: float
        """
        return self._quarter4

    @quarter4.setter
    def quarter4(self, quarter4: float):
        """Sets the quarter4 of this BoxScorePlayersUsageInner.


        :param quarter4: The quarter4 of this BoxScorePlayersUsageInner.
        :type quarter4: float
        """

        self._quarter4 = quarter4

    @property
    def rushing(self) -> float:
        """Gets the rushing of this BoxScorePlayersUsageInner.


        :return: The rushing of this BoxScorePlayersUsageInner.
        :rtype: float
        """
        return self._rushing

    @rushing.setter
    def rushing(self, rushing: float):
        """Sets the rushing of this BoxScorePlayersUsageInner.


        :param rushing: The rushing of this BoxScorePlayersUsageInner.
        :type rushing: float
        """

        self._rushing = rushing

    @property
    def team(self) -> str:
        """Gets the team of this BoxScorePlayersUsageInner.


        :return: The team of this BoxScorePlayersUsageInner.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this BoxScorePlayersUsageInner.


        :param team: The team of this BoxScorePlayersUsageInner.
        :type team: str
        """

        self._team = team

    @property
    def total(self) -> float:
        """Gets the total of this BoxScorePlayersUsageInner.


        :return: The total of this BoxScorePlayersUsageInner.
        :rtype: float
        """
        return self._total

    @total.setter
    def total(self, total: float):
        """Sets the total of this BoxScorePlayersUsageInner.


        :param total: The total of this BoxScorePlayersUsageInner.
        :type total: float
        """

        self._total = total
