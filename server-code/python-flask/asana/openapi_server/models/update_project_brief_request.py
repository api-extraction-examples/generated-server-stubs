from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_brief_request import ProjectBriefRequest
from openapi_server import util

from openapi_server.models.project_brief_request import ProjectBriefRequest  # noqa: E501

class UpdateProjectBriefRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """UpdateProjectBriefRequest - a model defined in OpenAPI

        :param data: The data of this UpdateProjectBriefRequest.  # noqa: E501
        :type data: ProjectBriefRequest
        """
        self.openapi_types = {
            'data': ProjectBriefRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateProjectBriefRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The updateProjectBrief_request of this UpdateProjectBriefRequest.  # noqa: E501
        :rtype: UpdateProjectBriefRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> ProjectBriefRequest:
        """Gets the data of this UpdateProjectBriefRequest.


        :return: The data of this UpdateProjectBriefRequest.
        :rtype: ProjectBriefRequest
        """
        return self._data

    @data.setter
    def data(self, data: ProjectBriefRequest):
        """Sets the data of this UpdateProjectBriefRequest.


        :param data: The data of this UpdateProjectBriefRequest.
        :type data: ProjectBriefRequest
        """

        self._data = data