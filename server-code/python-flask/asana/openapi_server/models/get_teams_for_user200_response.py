from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.team_compact import TeamCompact
from openapi_server import util

from openapi_server.models.team_compact import TeamCompact  # noqa: E501

class GetTeamsForUser200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetTeamsForUser200Response - a model defined in OpenAPI

        :param data: The data of this GetTeamsForUser200Response.  # noqa: E501
        :type data: List[TeamCompact]
        """
        self.openapi_types = {
            'data': List[TeamCompact]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetTeamsForUser200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getTeamsForUser_200_response of this GetTeamsForUser200Response.  # noqa: E501
        :rtype: GetTeamsForUser200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[TeamCompact]:
        """Gets the data of this GetTeamsForUser200Response.


        :return: The data of this GetTeamsForUser200Response.
        :rtype: List[TeamCompact]
        """
        return self._data

    @data.setter
    def data(self, data: List[TeamCompact]):
        """Sets the data of this GetTeamsForUser200Response.


        :param data: The data of this GetTeamsForUser200Response.
        :type data: List[TeamCompact]
        """

        self._data = data
