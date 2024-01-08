from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_response import UserResponse
from openapi_server import util

from openapi_server.models.user_response import UserResponse  # noqa: E501

class GetUser200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetUser200Response - a model defined in OpenAPI

        :param data: The data of this GetUser200Response.  # noqa: E501
        :type data: UserResponse
        """
        self.openapi_types = {
            'data': UserResponse
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetUser200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getUser_200_response of this GetUser200Response.  # noqa: E501
        :rtype: GetUser200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> UserResponse:
        """Gets the data of this GetUser200Response.


        :return: The data of this GetUser200Response.
        :rtype: UserResponse
        """
        return self._data

    @data.setter
    def data(self, data: UserResponse):
        """Sets the data of this GetUser200Response.


        :param data: The data of this GetUser200Response.
        :type data: UserResponse
        """

        self._data = data
