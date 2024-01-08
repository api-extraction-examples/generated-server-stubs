from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.task_duplicate_request import TaskDuplicateRequest
from openapi_server import util

from openapi_server.models.task_duplicate_request import TaskDuplicateRequest  # noqa: E501

class DuplicateTaskRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """DuplicateTaskRequest - a model defined in OpenAPI

        :param data: The data of this DuplicateTaskRequest.  # noqa: E501
        :type data: TaskDuplicateRequest
        """
        self.openapi_types = {
            'data': TaskDuplicateRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'DuplicateTaskRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The duplicateTask_request of this DuplicateTaskRequest.  # noqa: E501
        :rtype: DuplicateTaskRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> TaskDuplicateRequest:
        """Gets the data of this DuplicateTaskRequest.


        :return: The data of this DuplicateTaskRequest.
        :rtype: TaskDuplicateRequest
        """
        return self._data

    @data.setter
    def data(self, data: TaskDuplicateRequest):
        """Sets the data of this DuplicateTaskRequest.


        :param data: The data of this DuplicateTaskRequest.
        :type data: TaskDuplicateRequest
        """

        self._data = data
