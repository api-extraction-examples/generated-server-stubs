from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_brief_response import ProjectBriefResponse
from openapi_server import util

from openapi_server.models.project_brief_response import ProjectBriefResponse  # noqa: E501

class GetProjectBrief200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetProjectBrief200Response - a model defined in OpenAPI

        :param data: The data of this GetProjectBrief200Response.  # noqa: E501
        :type data: ProjectBriefResponse
        """
        self.openapi_types = {
            'data': ProjectBriefResponse
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetProjectBrief200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getProjectBrief_200_response of this GetProjectBrief200Response.  # noqa: E501
        :rtype: GetProjectBrief200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> ProjectBriefResponse:
        """Gets the data of this GetProjectBrief200Response.


        :return: The data of this GetProjectBrief200Response.
        :rtype: ProjectBriefResponse
        """
        return self._data

    @data.setter
    def data(self, data: ProjectBriefResponse):
        """Sets the data of this GetProjectBrief200Response.


        :param data: The data of this GetProjectBrief200Response.
        :type data: ProjectBriefResponse
        """

        self._data = data
