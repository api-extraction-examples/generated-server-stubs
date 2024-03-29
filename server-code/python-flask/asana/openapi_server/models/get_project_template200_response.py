from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_template_response import ProjectTemplateResponse
from openapi_server import util

from openapi_server.models.project_template_response import ProjectTemplateResponse  # noqa: E501

class GetProjectTemplate200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """GetProjectTemplate200Response - a model defined in OpenAPI

        :param data: The data of this GetProjectTemplate200Response.  # noqa: E501
        :type data: ProjectTemplateResponse
        """
        self.openapi_types = {
            'data': ProjectTemplateResponse
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'GetProjectTemplate200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getProjectTemplate_200_response of this GetProjectTemplate200Response.  # noqa: E501
        :rtype: GetProjectTemplate200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> ProjectTemplateResponse:
        """Gets the data of this GetProjectTemplate200Response.


        :return: The data of this GetProjectTemplate200Response.
        :rtype: ProjectTemplateResponse
        """
        return self._data

    @data.setter
    def data(self, data: ProjectTemplateResponse):
        """Sets the data of this GetProjectTemplate200Response.


        :param data: The data of this GetProjectTemplate200Response.
        :type data: ProjectTemplateResponse
        """

        self._data = data
