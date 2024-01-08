from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectSaveAsTemplateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """ProjectSaveAsTemplateRequest - a model defined in OpenAPI

        :param data: The data of this ProjectSaveAsTemplateRequest.  # noqa: E501
        :type data: ProjectSaveAsTemplateRequest
        """
        self.openapi_types = {
            'data': ProjectSaveAsTemplateRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectSaveAsTemplateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The projectSaveAsTemplate_request of this ProjectSaveAsTemplateRequest.  # noqa: E501
        :rtype: ProjectSaveAsTemplateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> ProjectSaveAsTemplateRequest:
        """Gets the data of this ProjectSaveAsTemplateRequest.


        :return: The data of this ProjectSaveAsTemplateRequest.
        :rtype: ProjectSaveAsTemplateRequest
        """
        return self._data

    @data.setter
    def data(self, data: ProjectSaveAsTemplateRequest):
        """Sets the data of this ProjectSaveAsTemplateRequest.


        :param data: The data of this ProjectSaveAsTemplateRequest.
        :type data: ProjectSaveAsTemplateRequest
        """

        self._data = data
