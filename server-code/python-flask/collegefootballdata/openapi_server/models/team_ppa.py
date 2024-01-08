from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.team_ppa_defense import TeamPPADefense
from openapi_server import util

from openapi_server.models.team_ppa_defense import TeamPPADefense  # noqa: E501

class TeamPPA(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, conference=None, defense=None, offense=None, season=None, team=None):  # noqa: E501
        """TeamPPA - a model defined in OpenAPI

        :param conference: The conference of this TeamPPA.  # noqa: E501
        :type conference: str
        :param defense: The defense of this TeamPPA.  # noqa: E501
        :type defense: TeamPPADefense
        :param offense: The offense of this TeamPPA.  # noqa: E501
        :type offense: TeamPPADefense
        :param season: The season of this TeamPPA.  # noqa: E501
        :type season: int
        :param team: The team of this TeamPPA.  # noqa: E501
        :type team: str
        """
        self.openapi_types = {
            'conference': str,
            'defense': TeamPPADefense,
            'offense': TeamPPADefense,
            'season': int,
            'team': str
        }

        self.attribute_map = {
            'conference': 'conference',
            'defense': 'defense',
            'offense': 'offense',
            'season': 'season',
            'team': 'team'
        }

        self._conference = conference
        self._defense = defense
        self._offense = offense
        self._season = season
        self._team = team

    @classmethod
    def from_dict(cls, dikt) -> 'TeamPPA':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TeamPPA of this TeamPPA.  # noqa: E501
        :rtype: TeamPPA
        """
        return util.deserialize_model(dikt, cls)

    @property
    def conference(self) -> str:
        """Gets the conference of this TeamPPA.


        :return: The conference of this TeamPPA.
        :rtype: str
        """
        return self._conference

    @conference.setter
    def conference(self, conference: str):
        """Sets the conference of this TeamPPA.


        :param conference: The conference of this TeamPPA.
        :type conference: str
        """

        self._conference = conference

    @property
    def defense(self) -> TeamPPADefense:
        """Gets the defense of this TeamPPA.


        :return: The defense of this TeamPPA.
        :rtype: TeamPPADefense
        """
        return self._defense

    @defense.setter
    def defense(self, defense: TeamPPADefense):
        """Sets the defense of this TeamPPA.


        :param defense: The defense of this TeamPPA.
        :type defense: TeamPPADefense
        """

        self._defense = defense

    @property
    def offense(self) -> TeamPPADefense:
        """Gets the offense of this TeamPPA.


        :return: The offense of this TeamPPA.
        :rtype: TeamPPADefense
        """
        return self._offense

    @offense.setter
    def offense(self, offense: TeamPPADefense):
        """Sets the offense of this TeamPPA.


        :param offense: The offense of this TeamPPA.
        :type offense: TeamPPADefense
        """

        self._offense = offense

    @property
    def season(self) -> int:
        """Gets the season of this TeamPPA.


        :return: The season of this TeamPPA.
        :rtype: int
        """
        return self._season

    @season.setter
    def season(self, season: int):
        """Sets the season of this TeamPPA.


        :param season: The season of this TeamPPA.
        :type season: int
        """

        self._season = season

    @property
    def team(self) -> str:
        """Gets the team of this TeamPPA.


        :return: The team of this TeamPPA.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this TeamPPA.


        :param team: The team of this TeamPPA.
        :type team: str
        """

        self._team = team