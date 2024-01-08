from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.workspace_response import WorkspaceResponse
from openapi_server import util

from openapi_server.models.workspace_response import WorkspaceResponse  # noqa: E501

class GetWorkspace200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetWorkspace200Response - a model defined in OpenAPI

        :param data: The data of this GetWorkspace200Response.  # noqa: E501
        :type data: WorkspaceResponse
        """
        self.openapi_types = {
            'data': WorkspaceResponse
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetWorkspace200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getWorkspace_200_response of this GetWorkspace200Response.  # noqa: E501
        :rtype: GetWorkspace200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> WorkspaceResponse:
        """Gets the data of this GetWorkspace200Response.


        :return: The data of this GetWorkspace200Response.
        :rtype: WorkspaceResponse
        """
        return self._data

    @data.setter
    def data(self, data: WorkspaceResponse):
        """Sets the data of this GetWorkspace200Response.


        :param data: The data of this GetWorkspace200Response.
        :type data: WorkspaceResponse
        """

        self._data = data
