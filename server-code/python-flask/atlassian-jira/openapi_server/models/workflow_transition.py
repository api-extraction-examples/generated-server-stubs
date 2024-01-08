from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class WorkflowTransition(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, name=None):  # noqa: E501
        """WorkflowTransition - a model defined in OpenAPI

        :param id: The id of this WorkflowTransition.  # noqa: E501
        :type id: int
        :param name: The name of this WorkflowTransition.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name'
        }

        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'WorkflowTransition':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkflowTransition of this WorkflowTransition.  # noqa: E501
        :rtype: WorkflowTransition
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> int:
        """Gets the id of this WorkflowTransition.

        The transition ID.  # noqa: E501

        :return: The id of this WorkflowTransition.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this WorkflowTransition.

        The transition ID.  # noqa: E501

        :param id: The id of this WorkflowTransition.
        :type id: int
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this WorkflowTransition.

        The transition name.  # noqa: E501

        :return: The name of this WorkflowTransition.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this WorkflowTransition.

        The transition name.  # noqa: E501

        :param name: The name of this WorkflowTransition.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name
