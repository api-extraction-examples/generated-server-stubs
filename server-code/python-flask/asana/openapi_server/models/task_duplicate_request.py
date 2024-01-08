from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TaskDuplicateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, include=None, name=None):  # noqa: E501
        """TaskDuplicateRequest - a model defined in OpenAPI

        :param include: The include of this TaskDuplicateRequest.  # noqa: E501
        :type include: str
        :param name: The name of this TaskDuplicateRequest.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'include': str,
            'name': str
        }

        self.attribute_map = {
            'include': 'include',
            'name': 'name'
        }

        self._include = include
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'TaskDuplicateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskDuplicateRequest of this TaskDuplicateRequest.  # noqa: E501
        :rtype: TaskDuplicateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def include(self) -> str:
        """Gets the include of this TaskDuplicateRequest.

        The fields that will be duplicated to the new task.  # noqa: E501

        :return: The include of this TaskDuplicateRequest.
        :rtype: str
        """
        return self._include

    @include.setter
    def include(self, include: str):
        """Sets the include of this TaskDuplicateRequest.

        The fields that will be duplicated to the new task.  # noqa: E501

        :param include: The include of this TaskDuplicateRequest.
        :type include: str
        """
        allowed_values = ["notes", "assignee", "subtasks", "attachments", "tags", "followers", "projects", "dates", "dependencies", "parent"]  # noqa: E501
        if include not in allowed_values:
            raise ValueError(
                "Invalid value for `include` ({0}), must be one of {1}"
                .format(include, allowed_values)
            )

        self._include = include

    @property
    def name(self) -> str:
        """Gets the name of this TaskDuplicateRequest.

        The name of the new task.  # noqa: E501

        :return: The name of this TaskDuplicateRequest.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TaskDuplicateRequest.

        The name of the new task.  # noqa: E501

        :param name: The name of this TaskDuplicateRequest.
        :type name: str
        """

        self._name = name