from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CustomProperty(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, value=None):  # noqa: E501
        """CustomProperty - a model defined in OpenAPI

        :param name: The name of this CustomProperty.  # noqa: E501
        :type name: str
        :param value: The value of this CustomProperty.  # noqa: E501
        :type value: List[str]
        """
        self.openapi_types = {
            'name': str,
            'value': List[str]
        }

        self.attribute_map = {
            'name': 'name',
            'value': 'value'
        }

        self._name = name
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'CustomProperty':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomProperty of this CustomProperty.  # noqa: E501
        :rtype: CustomProperty
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this CustomProperty.

        The name of the property.  # noqa: E501

        :return: The name of this CustomProperty.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CustomProperty.

        The name of the property.  # noqa: E501

        :param name: The name of this CustomProperty.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def value(self) -> List[str]:
        """Gets the value of this CustomProperty.

        Values for this property.  # noqa: E501

        :return: The value of this CustomProperty.
        :rtype: List[str]
        """
        return self._value

    @value.setter
    def value(self, value: List[str]):
        """Sets the value of this CustomProperty.

        Values for this property.  # noqa: E501

        :param value: The value of this CustomProperty.
        :type value: List[str]
        """

        self._value = value