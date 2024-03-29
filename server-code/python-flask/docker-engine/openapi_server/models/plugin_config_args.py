from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PluginConfigArgs(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, name=None, settable=None, value=None):  # noqa: E501
        """PluginConfigArgs - a model defined in OpenAPI

        :param description: The description of this PluginConfigArgs.  # noqa: E501
        :type description: str
        :param name: The name of this PluginConfigArgs.  # noqa: E501
        :type name: str
        :param settable: The settable of this PluginConfigArgs.  # noqa: E501
        :type settable: List[str]
        :param value: The value of this PluginConfigArgs.  # noqa: E501
        :type value: List[str]
        """
        self.openapi_types = {
            'description': str,
            'name': str,
            'settable': List[str],
            'value': List[str]
        }

        self.attribute_map = {
            'description': 'Description',
            'name': 'Name',
            'settable': 'Settable',
            'value': 'Value'
        }

        self._description = description
        self._name = name
        self._settable = settable
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'PluginConfigArgs':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Plugin_Config_Args of this PluginConfigArgs.  # noqa: E501
        :rtype: PluginConfigArgs
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this PluginConfigArgs.


        :return: The description of this PluginConfigArgs.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this PluginConfigArgs.


        :param description: The description of this PluginConfigArgs.
        :type description: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def name(self) -> str:
        """Gets the name of this PluginConfigArgs.


        :return: The name of this PluginConfigArgs.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this PluginConfigArgs.


        :param name: The name of this PluginConfigArgs.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def settable(self) -> List[str]:
        """Gets the settable of this PluginConfigArgs.


        :return: The settable of this PluginConfigArgs.
        :rtype: List[str]
        """
        return self._settable

    @settable.setter
    def settable(self, settable: List[str]):
        """Sets the settable of this PluginConfigArgs.


        :param settable: The settable of this PluginConfigArgs.
        :type settable: List[str]
        """
        if settable is None:
            raise ValueError("Invalid value for `settable`, must not be `None`")  # noqa: E501

        self._settable = settable

    @property
    def value(self) -> List[str]:
        """Gets the value of this PluginConfigArgs.


        :return: The value of this PluginConfigArgs.
        :rtype: List[str]
        """
        return self._value

    @value.setter
    def value(self, value: List[str]):
        """Sets the value of this PluginConfigArgs.


        :param value: The value of this PluginConfigArgs.
        :type value: List[str]
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value
