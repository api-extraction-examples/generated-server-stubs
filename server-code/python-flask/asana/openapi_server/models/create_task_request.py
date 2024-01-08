from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.task_request import TaskRequest
from openapi_server import util

from openapi_server.models.task_request import TaskRequest  # noqa: E501

class CreateTaskRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """CreateTaskRequest - a model defined in OpenAPI

        :param data: The data of this CreateTaskRequest.  # noqa: E501
        :type data: TaskRequest
        """
        self.openapi_types = {
            'data': TaskRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'CreateTaskRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The createTask_request of this CreateTaskRequest.  # noqa: E501
        :rtype: CreateTaskRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> TaskRequest:
        """Gets the data of this CreateTaskRequest.


        :return: The data of this CreateTaskRequest.
        :rtype: TaskRequest
        """
        return self._data

    @data.setter
    def data(self, data: TaskRequest):
        """Sets the data of this CreateTaskRequest.


        :param data: The data of this CreateTaskRequest.
        :type data: TaskRequest
        """

        self._data = data