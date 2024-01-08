from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.box_score_players_ppa_inner_average import BoxScorePlayersPpaInnerAverage
from openapi_server import util

from openapi_server.models.box_score_players_ppa_inner_average import BoxScorePlayersPpaInnerAverage  # noqa: E501

class BoxScorePlayersPpaInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, average=None, cumulative=None, player=None, position=None, team=None):  # noqa: E501
        """BoxScorePlayersPpaInner - a model defined in OpenAPI

        :param average: The average of this BoxScorePlayersPpaInner.  # noqa: E501
        :type average: BoxScorePlayersPpaInnerAverage
        :param cumulative: The cumulative of this BoxScorePlayersPpaInner.  # noqa: E501
        :type cumulative: BoxScorePlayersPpaInnerAverage
        :param player: The player of this BoxScorePlayersPpaInner.  # noqa: E501
        :type player: str
        :param position: The position of this BoxScorePlayersPpaInner.  # noqa: E501
        :type position: str
        :param team: The team of this BoxScorePlayersPpaInner.  # noqa: E501
        :type team: str
        """
        self.openapi_types = {
            'average': BoxScorePlayersPpaInnerAverage,
            'cumulative': BoxScorePlayersPpaInnerAverage,
            'player': str,
            'position': str,
            'team': str
        }

        self.attribute_map = {
            'average': 'average',
            'cumulative': 'cumulative',
            'player': 'player',
            'position': 'position',
            'team': 'team'
        }

        self._average = average
        self._cumulative = cumulative
        self._player = player
        self._position = position
        self._team = team

    @classmethod
    def from_dict(cls, dikt) -> 'BoxScorePlayersPpaInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BoxScore_players_ppa_inner of this BoxScorePlayersPpaInner.  # noqa: E501
        :rtype: BoxScorePlayersPpaInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def average(self) -> BoxScorePlayersPpaInnerAverage:
        """Gets the average of this BoxScorePlayersPpaInner.


        :return: The average of this BoxScorePlayersPpaInner.
        :rtype: BoxScorePlayersPpaInnerAverage
        """
        return self._average

    @average.setter
    def average(self, average: BoxScorePlayersPpaInnerAverage):
        """Sets the average of this BoxScorePlayersPpaInner.


        :param average: The average of this BoxScorePlayersPpaInner.
        :type average: BoxScorePlayersPpaInnerAverage
        """

        self._average = average

    @property
    def cumulative(self) -> BoxScorePlayersPpaInnerAverage:
        """Gets the cumulative of this BoxScorePlayersPpaInner.


        :return: The cumulative of this BoxScorePlayersPpaInner.
        :rtype: BoxScorePlayersPpaInnerAverage
        """
        return self._cumulative

    @cumulative.setter
    def cumulative(self, cumulative: BoxScorePlayersPpaInnerAverage):
        """Sets the cumulative of this BoxScorePlayersPpaInner.


        :param cumulative: The cumulative of this BoxScorePlayersPpaInner.
        :type cumulative: BoxScorePlayersPpaInnerAverage
        """

        self._cumulative = cumulative

    @property
    def player(self) -> str:
        """Gets the player of this BoxScorePlayersPpaInner.


        :return: The player of this BoxScorePlayersPpaInner.
        :rtype: str
        """
        return self._player

    @player.setter
    def player(self, player: str):
        """Sets the player of this BoxScorePlayersPpaInner.


        :param player: The player of this BoxScorePlayersPpaInner.
        :type player: str
        """

        self._player = player

    @property
    def position(self) -> str:
        """Gets the position of this BoxScorePlayersPpaInner.


        :return: The position of this BoxScorePlayersPpaInner.
        :rtype: str
        """
        return self._position

    @position.setter
    def position(self, position: str):
        """Sets the position of this BoxScorePlayersPpaInner.


        :param position: The position of this BoxScorePlayersPpaInner.
        :type position: str
        """

        self._position = position

    @property
    def team(self) -> str:
        """Gets the team of this BoxScorePlayersPpaInner.


        :return: The team of this BoxScorePlayersPpaInner.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this BoxScorePlayersPpaInner.


        :param team: The team of this BoxScorePlayersPpaInner.
        :type team: str
        """

        self._team = team