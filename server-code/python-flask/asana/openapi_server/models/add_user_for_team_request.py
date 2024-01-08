from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.team_add_user_request import TeamAddUserRequest
from openapi_server import util

from openapi_server.models.team_add_user_request import TeamAddUserRequest  # noqa: E501

class AddUserForTeamRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AddUserForTeamRequest - a model defined in OpenAPI

        :param data: The data of this AddUserForTeamRequest.  # noqa: E501
        :type data: TeamAddUserRequest
        """
        self.openapi_types = {
            'data': TeamAddUserRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AddUserForTeamRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The addUserForTeam_request of this AddUserForTeamRequest.  # noqa: E501
        :rtype: AddUserForTeamRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> TeamAddUserRequest:
        """Gets the data of this AddUserForTeamRequest.


        :return: The data of this AddUserForTeamRequest.
        :rtype: TeamAddUserRequest
        """
        return self._data

    @data.setter
    def data(self, data: TeamAddUserRequest):
        """Sets the data of this AddUserForTeamRequest.


        :param data: The data of this AddUserForTeamRequest.
        :type data: TeamAddUserRequest
        """

        self._data = data