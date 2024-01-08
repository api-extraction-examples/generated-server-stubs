from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_section_insert_request import ProjectSectionInsertRequest
from openapi_server import util

from openapi_server.models.project_section_insert_request import ProjectSectionInsertRequest  # noqa: E501

class InsertSectionForProjectRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """InsertSectionForProjectRequest - a model defined in OpenAPI

        :param data: The data of this InsertSectionForProjectRequest.  # noqa: E501
        :type data: ProjectSectionInsertRequest
        """
        self.openapi_types = {
            'data': ProjectSectionInsertRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'InsertSectionForProjectRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The insertSectionForProject_request of this InsertSectionForProjectRequest.  # noqa: E501
        :rtype: InsertSectionForProjectRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> ProjectSectionInsertRequest:
        """Gets the data of this InsertSectionForProjectRequest.


        :return: The data of this InsertSectionForProjectRequest.
        :rtype: ProjectSectionInsertRequest
        """
        return self._data

    @data.setter
    def data(self, data: ProjectSectionInsertRequest):
        """Sets the data of this InsertSectionForProjectRequest.


        :param data: The data of this InsertSectionForProjectRequest.
        :type data: ProjectSectionInsertRequest
        """

        self._data = data
