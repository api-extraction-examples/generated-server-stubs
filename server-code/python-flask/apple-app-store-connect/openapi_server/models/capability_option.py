from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CapabilityOption(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, enabled=None, enabled_by_default=None, key=None, name=None, supports_wildcard=None):  # noqa: E501
        """CapabilityOption - a model defined in OpenAPI

        :param description: The description of this CapabilityOption.  # noqa: E501
        :type description: str
        :param enabled: The enabled of this CapabilityOption.  # noqa: E501
        :type enabled: bool
        :param enabled_by_default: The enabled_by_default of this CapabilityOption.  # noqa: E501
        :type enabled_by_default: bool
        :param key: The key of this CapabilityOption.  # noqa: E501
        :type key: str
        :param name: The name of this CapabilityOption.  # noqa: E501
        :type name: str
        :param supports_wildcard: The supports_wildcard of this CapabilityOption.  # noqa: E501
        :type supports_wildcard: bool
        """
        self.openapi_types = {
            'description': str,
            'enabled': bool,
            'enabled_by_default': bool,
            'key': str,
            'name': str,
            'supports_wildcard': bool
        }

        self.attribute_map = {
            'description': 'description',
            'enabled': 'enabled',
            'enabled_by_default': 'enabledByDefault',
            'key': 'key',
            'name': 'name',
            'supports_wildcard': 'supportsWildcard'
        }

        self._description = description
        self._enabled = enabled
        self._enabled_by_default = enabled_by_default
        self._key = key
        self._name = name
        self._supports_wildcard = supports_wildcard

    @classmethod
    def from_dict(cls, dikt) -> 'CapabilityOption':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CapabilityOption of this CapabilityOption.  # noqa: E501
        :rtype: CapabilityOption
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this CapabilityOption.


        :return: The description of this CapabilityOption.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this CapabilityOption.


        :param description: The description of this CapabilityOption.
        :type description: str
        """

        self._description = description

    @property
    def enabled(self) -> bool:
        """Gets the enabled of this CapabilityOption.


        :return: The enabled of this CapabilityOption.
        :rtype: bool
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled: bool):
        """Sets the enabled of this CapabilityOption.


        :param enabled: The enabled of this CapabilityOption.
        :type enabled: bool
        """

        self._enabled = enabled

    @property
    def enabled_by_default(self) -> bool:
        """Gets the enabled_by_default of this CapabilityOption.


        :return: The enabled_by_default of this CapabilityOption.
        :rtype: bool
        """
        return self._enabled_by_default

    @enabled_by_default.setter
    def enabled_by_default(self, enabled_by_default: bool):
        """Sets the enabled_by_default of this CapabilityOption.


        :param enabled_by_default: The enabled_by_default of this CapabilityOption.
        :type enabled_by_default: bool
        """

        self._enabled_by_default = enabled_by_default

    @property
    def key(self) -> str:
        """Gets the key of this CapabilityOption.


        :return: The key of this CapabilityOption.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this CapabilityOption.


        :param key: The key of this CapabilityOption.
        :type key: str
        """
        allowed_values = ["XCODE_5", "XCODE_6", "COMPLETE_PROTECTION", "PROTECTED_UNLESS_OPEN", "PROTECTED_UNTIL_FIRST_USER_AUTH", "PRIMARY_APP_CONSENT"]  # noqa: E501
        if key not in allowed_values:
            raise ValueError(
                "Invalid value for `key` ({0}), must be one of {1}"
                .format(key, allowed_values)
            )

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this CapabilityOption.


        :return: The name of this CapabilityOption.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CapabilityOption.


        :param name: The name of this CapabilityOption.
        :type name: str
        """

        self._name = name

    @property
    def supports_wildcard(self) -> bool:
        """Gets the supports_wildcard of this CapabilityOption.


        :return: The supports_wildcard of this CapabilityOption.
        :rtype: bool
        """
        return self._supports_wildcard

    @supports_wildcard.setter
    def supports_wildcard(self, supports_wildcard: bool):
        """Sets the supports_wildcard of this CapabilityOption.


        :param supports_wildcard: The supports_wildcard of this CapabilityOption.
        :type supports_wildcard: bool
        """

        self._supports_wildcard = supports_wildcard
