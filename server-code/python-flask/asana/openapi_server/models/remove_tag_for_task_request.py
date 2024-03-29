from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.task_remove_tag_request import TaskRemoveTagRequest
from openapi_server import util

from openapi_server.models.task_remove_tag_request import TaskRemoveTagRequest  # noqa: E501

class RemoveTagForTaskRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """RemoveTagForTaskRequest - a model defined in OpenAPI

        :param data: The data of this RemoveTagForTaskRequest.  # noqa: E501
        :type data: TaskRemoveTagRequest
        """
        self.openapi_types = {
            'data': TaskRemoveTagRequest
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'RemoveTagForTaskRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The removeTagForTask_request of this RemoveTagForTaskRequest.  # noqa: E501
        :rtype: RemoveTagForTaskRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> TaskRemoveTagRequest:
        """Gets the data of this RemoveTagForTaskRequest.


        :return: The data of this RemoveTagForTaskRequest.
        :rtype: TaskRemoveTagRequest
        """
        return self._data

    @data.setter
    def data(self, data: TaskRemoveTagRequest):
        """Sets the data of this RemoveTagForTaskRequest.


        :param data: The data of this RemoveTagForTaskRequest.
        :type data: TaskRemoveTagRequest
        """

        self._data = data
