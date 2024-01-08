from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PlayerGameTeamsInnerSchool(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, conference=None, name=None):  # noqa: E501
        """PlayerGameTeamsInnerSchool - a model defined in OpenAPI

        :param conference: The conference of this PlayerGameTeamsInnerSchool.  # noqa: E501
        :type conference: str
        :param name: The name of this PlayerGameTeamsInnerSchool.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'conference': str,
            'name': str
        }

        self.attribute_map = {
            'conference': 'conference',
            'name': 'name'
        }

        self._conference = conference
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'PlayerGameTeamsInnerSchool':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PlayerGame_teams_inner_school of this PlayerGameTeamsInnerSchool.  # noqa: E501
        :rtype: PlayerGameTeamsInnerSchool
        """
        return util.deserialize_model(dikt, cls)

    @property
    def conference(self) -> str:
        """Gets the conference of this PlayerGameTeamsInnerSchool.


        :return: The conference of this PlayerGameTeamsInnerSchool.
        :rtype: str
        """
        return self._conference

    @conference.setter
    def conference(self, conference: str):
        """Sets the conference of this PlayerGameTeamsInnerSchool.


        :param conference: The conference of this PlayerGameTeamsInnerSchool.
        :type conference: str
        """

        self._conference = conference

    @property
    def name(self) -> str:
        """Gets the name of this PlayerGameTeamsInnerSchool.


        :return: The name of this PlayerGameTeamsInnerSchool.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this PlayerGameTeamsInnerSchool.


        :param name: The name of this PlayerGameTeamsInnerSchool.
        :type name: str
        """

        self._name = name