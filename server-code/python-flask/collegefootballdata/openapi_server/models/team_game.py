from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.team_game_teams_inner import TeamGameTeamsInner
from openapi_server import util

from openapi_server.models.team_game_teams_inner import TeamGameTeamsInner  # noqa: E501

class TeamGame(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, teams=None):  # noqa: E501
        """TeamGame - a model defined in OpenAPI

        :param id: The id of this TeamGame.  # noqa: E501
        :type id: int
        :param teams: The teams of this TeamGame.  # noqa: E501
        :type teams: List[TeamGameTeamsInner]
        """
        self.openapi_types = {
            'id': int,
            'teams': List[TeamGameTeamsInner]
        }

        self.attribute_map = {
            'id': 'id',
            'teams': 'teams'
        }

        self._id = id
        self._teams = teams

    @classmethod
    def from_dict(cls, dikt) -> 'TeamGame':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TeamGame of this TeamGame.  # noqa: E501
        :rtype: TeamGame
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this TeamGame.


        :return: The id of this TeamGame.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this TeamGame.


        :param id: The id of this TeamGame.
        :type id: int
        """

        self._id = id

    @property
    def teams(self) -> List[TeamGameTeamsInner]:
        """Gets the teams of this TeamGame.


        :return: The teams of this TeamGame.
        :rtype: List[TeamGameTeamsInner]
        """
        return self._teams

    @teams.setter
    def teams(self, teams: List[TeamGameTeamsInner]):
        """Sets the teams of this TeamGame.


        :param teams: The teams of this TeamGame.
        :type teams: List[TeamGameTeamsInner]
        """

        self._teams = teams
