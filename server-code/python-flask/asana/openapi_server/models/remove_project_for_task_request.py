from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.task_remove_project_request import TaskRemoveProjectRequest
from openapi_server import util

from openapi_server.models.task_remove_project_request import TaskRemoveProjectRequest  # noqa: E501

class RemoveProjectForTaskRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """RemoveProjectForTaskRequest - a model defined in OpenAPI

        :param data: The data of this RemoveProjectForTaskRequest.  # noqa: E501
        :type data: TaskRemoveProjectRequest
        """
        self.openapi_types = {
            'data': TaskRemoveProjectRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'RemoveProjectForTaskRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The removeProjectForTask_request of this RemoveProjectForTaskRequest.  # noqa: E501
        :rtype: RemoveProjectForTaskRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> TaskRemoveProjectRequest:
        """Gets the data of this RemoveProjectForTaskRequest.


        :return: The data of this RemoveProjectForTaskRequest.
        :rtype: TaskRemoveProjectRequest
        """
        return self._data

    @data.setter
    def data(self, data: TaskRemoveProjectRequest):
        """Sets the data of this RemoveProjectForTaskRequest.


        :param data: The data of this RemoveProjectForTaskRequest.
        :type data: TaskRemoveProjectRequest
        """

        self._data = data
