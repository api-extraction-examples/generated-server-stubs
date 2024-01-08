from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.team_response import TeamResponse
from openapi_server import util

from openapi_server.models.team_response import TeamResponse  # noqa: E501

class UpdateTeam200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """UpdateTeam200Response - a model defined in OpenAPI

        :param data: The data of this UpdateTeam200Response.  # noqa: E501
        :type data: TeamResponse
        """
        self.openapi_types = {
            'data': TeamResponse
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateTeam200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The updateTeam_200_response of this UpdateTeam200Response.  # noqa: E501
        :rtype: UpdateTeam200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> TeamResponse:
        """Gets the data of this UpdateTeam200Response.


        :return: The data of this UpdateTeam200Response.
        :rtype: TeamResponse
        """
        return self._data

    @data.setter
    def data(self, data: TeamResponse):
        """Sets the data of this UpdateTeam200Response.


        :param data: The data of this UpdateTeam200Response.
        :type data: TeamResponse
        """

        self._data = data
