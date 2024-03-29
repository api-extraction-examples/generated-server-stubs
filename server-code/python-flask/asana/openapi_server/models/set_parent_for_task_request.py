from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.task_set_parent_request import TaskSetParentRequest
from openapi_server import util

from openapi_server.models.task_set_parent_request import TaskSetParentRequest  # noqa: E501

class SetParentForTaskRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """SetParentForTaskRequest - a model defined in OpenAPI

        :param data: The data of this SetParentForTaskRequest.  # noqa: E501
        :type data: TaskSetParentRequest
        """
        self.openapi_types = {
            'data': TaskSetParentRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'SetParentForTaskRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The setParentForTask_request of this SetParentForTaskRequest.  # noqa: E501
        :rtype: SetParentForTaskRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> TaskSetParentRequest:
        """Gets the data of this SetParentForTaskRequest.


        :return: The data of this SetParentForTaskRequest.
        :rtype: TaskSetParentRequest
        """
        return self._data

    @data.setter
    def data(self, data: TaskSetParentRequest):
        """Sets the data of this SetParentForTaskRequest.


        :param data: The data of this SetParentForTaskRequest.
        :type data: TaskSetParentRequest
        """

        self._data = data
