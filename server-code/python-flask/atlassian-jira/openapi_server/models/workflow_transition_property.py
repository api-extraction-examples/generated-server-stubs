from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class WorkflowTransitionProperty(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, key=None, value=None):  # noqa: E501
        """WorkflowTransitionProperty - a model defined in OpenAPI

        :param id: The id of this WorkflowTransitionProperty.  # noqa: E501
        :type id: str
        :param key: The key of this WorkflowTransitionProperty.  # noqa: E501
        :type key: str
        :param value: The value of this WorkflowTransitionProperty.  # noqa: E501
        :type value: str
        """
        self.openapi_types = {
            'id': str,
            'key': str,
            'value': str
        }

        self.attribute_map = {
            'id': 'id',
            'key': 'key',
            'value': 'value'
        }

        self._id = id
        self._key = key
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'WorkflowTransitionProperty':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkflowTransitionProperty of this WorkflowTransitionProperty.  # noqa: E501
        :rtype: WorkflowTransitionProperty
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this WorkflowTransitionProperty.

        The ID of the transition property.  # noqa: E501

        :return: The id of this WorkflowTransitionProperty.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this WorkflowTransitionProperty.

        The ID of the transition property.  # noqa: E501

        :param id: The id of this WorkflowTransitionProperty.
        :type id: str
        """

        self._id = id

    @property
    def key(self) -> str:
        """Gets the key of this WorkflowTransitionProperty.

        The key of the transition property. Also known as the name of the transition property.  # noqa: E501

        :return: The key of this WorkflowTransitionProperty.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this WorkflowTransitionProperty.

        The key of the transition property. Also known as the name of the transition property.  # noqa: E501

        :param key: The key of this WorkflowTransitionProperty.
        :type key: str
        """

        self._key = key

    @property
    def value(self) -> str:
        """Gets the value of this WorkflowTransitionProperty.

        The value of the transition property.  # noqa: E501

        :return: The value of this WorkflowTransitionProperty.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this WorkflowTransitionProperty.

        The value of the transition property.  # noqa: E501

        :param value: The value of this WorkflowTransitionProperty.
        :type value: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value
