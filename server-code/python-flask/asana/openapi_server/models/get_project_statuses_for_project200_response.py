from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_status_compact import ProjectStatusCompact
from openapi_server import util

from openapi_server.models.project_status_compact import ProjectStatusCompact  # noqa: E501

class GetProjectStatusesForProject200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetProjectStatusesForProject200Response - a model defined in OpenAPI

        :param data: The data of this GetProjectStatusesForProject200Response.  # noqa: E501
        :type data: List[ProjectStatusCompact]
        """
        self.openapi_types = {
            'data': List[ProjectStatusCompact]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetProjectStatusesForProject200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getProjectStatusesForProject_200_response of this GetProjectStatusesForProject200Response.  # noqa: E501
        :rtype: GetProjectStatusesForProject200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[ProjectStatusCompact]:
        """Gets the data of this GetProjectStatusesForProject200Response.


        :return: The data of this GetProjectStatusesForProject200Response.
        :rtype: List[ProjectStatusCompact]
        """
        return self._data

    @data.setter
    def data(self, data: List[ProjectStatusCompact]):
        """Sets the data of this GetProjectStatusesForProject200Response.


        :param data: The data of this GetProjectStatusesForProject200Response.
        :type data: List[ProjectStatusCompact]
        """

        self._data = data