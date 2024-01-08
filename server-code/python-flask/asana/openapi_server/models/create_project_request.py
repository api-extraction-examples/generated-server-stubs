from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_request import ProjectRequest
from openapi_server import util

from openapi_server.models.project_request import ProjectRequest  # noqa: E501

class CreateProjectRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """CreateProjectRequest - a model defined in OpenAPI

        :param data: The data of this CreateProjectRequest.  # noqa: E501
        :type data: ProjectRequest
        """
        self.openapi_types = {
            'data': ProjectRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'CreateProjectRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The createProject_request of this CreateProjectRequest.  # noqa: E501
        :rtype: CreateProjectRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> ProjectRequest:
        """Gets the data of this CreateProjectRequest.


        :return: The data of this CreateProjectRequest.
        :rtype: ProjectRequest
        """
        return self._data

    @data.setter
    def data(self, data: ProjectRequest):
        """Sets the data of this CreateProjectRequest.


        :param data: The data of this CreateProjectRequest.
        :type data: ProjectRequest
        """

        self._data = data
