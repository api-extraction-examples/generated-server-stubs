from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class EntityProperty(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, key=None, value=None):  # noqa: E501
        """EntityProperty - a model defined in OpenAPI

        :param key: The key of this EntityProperty.  # noqa: E501
        :type key: str
        :param value: The value of this EntityProperty.  # noqa: E501
        :type value: object
        """
        self.openapi_types = {
            'key': str,
            'value': object
        }

        self.attribute_map = {
            'key': 'key',
            'value': 'value'
        }

        self._key = key
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'EntityProperty':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EntityProperty of this EntityProperty.  # noqa: E501
        :rtype: EntityProperty
        """
        return util.deserialize_model(dikt, cls)

    @property
    def key(self) -> str:
        """Gets the key of this EntityProperty.

        The key of the property. Required on create and update.  # noqa: E501

        :return: The key of this EntityProperty.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this EntityProperty.

        The key of the property. Required on create and update.  # noqa: E501

        :param key: The key of this EntityProperty.
        :type key: str
        """

        self._key = key

    @property
    def value(self) -> object:
        """Gets the value of this EntityProperty.

        The value of the property. Required on create and update.  # noqa: E501

        :return: The value of this EntityProperty.
        :rtype: object
        """
        return self._value

    @value.setter
    def value(self, value: object):
        """Sets the value of this EntityProperty.

        The value of the property. Required on create and update.  # noqa: E501

        :param value: The value of this EntityProperty.
        :type value: object
        """

        self._value = value