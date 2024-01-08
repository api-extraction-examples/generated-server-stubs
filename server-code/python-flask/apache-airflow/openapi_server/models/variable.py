from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Variable(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, key=None, value=None):  # noqa: E501
        """Variable - a model defined in OpenAPI

        :param description: The description of this Variable.  # noqa: E501
        :type description: str
        :param key: The key of this Variable.  # noqa: E501
        :type key: str
        :param value: The value of this Variable.  # noqa: E501
        :type value: str
        """
        self.openapi_types = {
            'description': str,
            'key': str,
            'value': str
        }

        self.attribute_map = {
            'description': 'description',
            'key': 'key',
            'value': 'value'
        }

        self._description = description
        self._key = key
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'Variable':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Variable of this Variable.  # noqa: E501
        :rtype: Variable
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this Variable.

        The description of the variable.  *New in version 2.4.0*   # noqa: E501

        :return: The description of this Variable.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this Variable.

        The description of the variable.  *New in version 2.4.0*   # noqa: E501

        :param description: The description of this Variable.
        :type description: str
        """

        self._description = description

    @property
    def key(self) -> str:
        """Gets the key of this Variable.


        :return: The key of this Variable.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this Variable.


        :param key: The key of this Variable.
        :type key: str
        """

        self._key = key

    @property
    def value(self) -> str:
        """Gets the value of this Variable.


        :return: The value of this Variable.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this Variable.


        :param value: The value of this Variable.
        :type value: str
        """

        self._value = value
