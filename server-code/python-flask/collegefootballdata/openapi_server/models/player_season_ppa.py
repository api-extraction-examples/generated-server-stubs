from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.player_season_ppa_average_ppa import PlayerSeasonPPAAveragePPA
from openapi_server import util

from openapi_server.models.player_season_ppa_average_ppa import PlayerSeasonPPAAveragePPA  # noqa: E501

class PlayerSeasonPPA(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, average_ppa=None, conference=None, id=None, name=None, position=None, season=None, team=None, total_ppa=None):  # noqa: E501
        """PlayerSeasonPPA - a model defined in OpenAPI

        :param average_ppa: The average_ppa of this PlayerSeasonPPA.  # noqa: E501
        :type average_ppa: PlayerSeasonPPAAveragePPA
        :param conference: The conference of this PlayerSeasonPPA.  # noqa: E501
        :type conference: str
        :param id: The id of this PlayerSeasonPPA.  # noqa: E501
        :type id: int
        :param name: The name of this PlayerSeasonPPA.  # noqa: E501
        :type name: str
        :param position: The position of this PlayerSeasonPPA.  # noqa: E501
        :type position: str
        :param season: The season of this PlayerSeasonPPA.  # noqa: E501
        :type season: int
        :param team: The team of this PlayerSeasonPPA.  # noqa: E501
        :type team: str
        :param total_ppa: The total_ppa of this PlayerSeasonPPA.  # noqa: E501
        :type total_ppa: PlayerSeasonPPAAveragePPA
        """
        self.openapi_types = {
            'average_ppa': PlayerSeasonPPAAveragePPA,
            'conference': str,
            'id': int,
            'name': str,
            'position': str,
            'season': int,
            'team': str,
            'total_ppa': PlayerSeasonPPAAveragePPA
        }

        self.attribute_map = {
            'average_ppa': 'averagePPA',
            'conference': 'conference',
            'id': 'id',
            'name': 'name',
            'position': 'position',
            'season': 'season',
            'team': 'team',
            'total_ppa': 'totalPPA'
        }

        self._average_ppa = average_ppa
        self._conference = conference
        self._id = id
        self._name = name
        self._position = position
        self._season = season
        self._team = team
        self._total_ppa = total_ppa

    @classmethod
    def from_dict(cls, dikt) -> 'PlayerSeasonPPA':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PlayerSeasonPPA of this PlayerSeasonPPA.  # noqa: E501
        :rtype: PlayerSeasonPPA
        """
        return util.deserialize_model(dikt, cls)

    @property
    def average_ppa(self) -> PlayerSeasonPPAAveragePPA:
        """Gets the average_ppa of this PlayerSeasonPPA.


        :return: The average_ppa of this PlayerSeasonPPA.
        :rtype: PlayerSeasonPPAAveragePPA
        """
        return self._average_ppa

    @average_ppa.setter
    def average_ppa(self, average_ppa: PlayerSeasonPPAAveragePPA):
        """Sets the average_ppa of this PlayerSeasonPPA.


        :param average_ppa: The average_ppa of this PlayerSeasonPPA.
        :type average_ppa: PlayerSeasonPPAAveragePPA
        """

        self._average_ppa = average_ppa

    @property
    def conference(self) -> str:
        """Gets the conference of this PlayerSeasonPPA.


        :return: The conference of this PlayerSeasonPPA.
        :rtype: str
        """
        return self._conference

    @conference.setter
    def conference(self, conference: str):
        """Sets the conference of this PlayerSeasonPPA.


        :param conference: The conference of this PlayerSeasonPPA.
        :type conference: str
        """

        self._conference = conference

    @property
    def id(self) -> int:
        """Gets the id of this PlayerSeasonPPA.


        :return: The id of this PlayerSeasonPPA.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this PlayerSeasonPPA.


        :param id: The id of this PlayerSeasonPPA.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this PlayerSeasonPPA.


        :return: The name of this PlayerSeasonPPA.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this PlayerSeasonPPA.


        :param name: The name of this PlayerSeasonPPA.
        :type name: str
        """

        self._name = name

    @property
    def position(self) -> str:
        """Gets the position of this PlayerSeasonPPA.


        :return: The position of this PlayerSeasonPPA.
        :rtype: str
        """
        return self._position

    @position.setter
    def position(self, position: str):
        """Sets the position of this PlayerSeasonPPA.


        :param position: The position of this PlayerSeasonPPA.
        :type position: str
        """

        self._position = position

    @property
    def season(self) -> int:
        """Gets the season of this PlayerSeasonPPA.


        :return: The season of this PlayerSeasonPPA.
        :rtype: int
        """
        return self._season

    @season.setter
    def season(self, season: int):
        """Sets the season of this PlayerSeasonPPA.


        :param season: The season of this PlayerSeasonPPA.
        :type season: int
        """

        self._season = season

    @property
    def team(self) -> str:
        """Gets the team of this PlayerSeasonPPA.


        :return: The team of this PlayerSeasonPPA.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this PlayerSeasonPPA.


        :param team: The team of this PlayerSeasonPPA.
        :type team: str
        """

        self._team = team

    @property
    def total_ppa(self) -> PlayerSeasonPPAAveragePPA:
        """Gets the total_ppa of this PlayerSeasonPPA.


        :return: The total_ppa of this PlayerSeasonPPA.
        :rtype: PlayerSeasonPPAAveragePPA
        """
        return self._total_ppa

    @total_ppa.setter
    def total_ppa(self, total_ppa: PlayerSeasonPPAAveragePPA):
        """Sets the total_ppa of this PlayerSeasonPPA.


        :param total_ppa: The total_ppa of this PlayerSeasonPPA.
        :type total_ppa: PlayerSeasonPPAAveragePPA
        """

        self._total_ppa = total_ppa
