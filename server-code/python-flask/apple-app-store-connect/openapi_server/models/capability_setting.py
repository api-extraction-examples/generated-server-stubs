from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.capability_option import CapabilityOption
from openapi_server import util

from openapi_server.models.capability_option import CapabilityOption  # noqa: E501

class CapabilitySetting(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, allowed_instances=None, description=None, enabled_by_default=None, key=None, min_instances=None, name=None, options=None, visible=None):  # noqa: E501
        """CapabilitySetting - a model defined in OpenAPI

        :param allowed_instances: The allowed_instances of this CapabilitySetting.  # noqa: E501
        :type allowed_instances: str
        :param description: The description of this CapabilitySetting.  # noqa: E501
        :type description: str
        :param enabled_by_default: The enabled_by_default of this CapabilitySetting.  # noqa: E501
        :type enabled_by_default: bool
        :param key: The key of this CapabilitySetting.  # noqa: E501
        :type key: str
        :param min_instances: The min_instances of this CapabilitySetting.  # noqa: E501
        :type min_instances: int
        :param name: The name of this CapabilitySetting.  # noqa: E501
        :type name: str
        :param options: The options of this CapabilitySetting.  # noqa: E501
        :type options: List[CapabilityOption]
        :param visible: The visible of this CapabilitySetting.  # noqa: E501
        :type visible: bool
        """
        self.openapi_types = {
            'allowed_instances': str,
            'description': str,
            'enabled_by_default': bool,
            'key': str,
            'min_instances': int,
            'name': str,
            'options': List[CapabilityOption],
            'visible': bool
        }

        self.attribute_map = {
            'allowed_instances': 'allowedInstances',
            'description': 'description',
            'enabled_by_default': 'enabledByDefault',
            'key': 'key',
            'min_instances': 'minInstances',
            'name': 'name',
            'options': 'options',
            'visible': 'visible'
        }

        self._allowed_instances = allowed_instances
        self._description = description
        self._enabled_by_default = enabled_by_default
        self._key = key
        self._min_instances = min_instances
        self._name = name
        self._options = options
        self._visible = visible

    @classmethod
    def from_dict(cls, dikt) -> 'CapabilitySetting':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CapabilitySetting of this CapabilitySetting.  # noqa: E501
        :rtype: CapabilitySetting
        """
        return util.deserialize_model(dikt, cls)

    @property
    def allowed_instances(self) -> str:
        """Gets the allowed_instances of this CapabilitySetting.


        :return: The allowed_instances of this CapabilitySetting.
        :rtype: str
        """
        return self._allowed_instances

    @allowed_instances.setter
    def allowed_instances(self, allowed_instances: str):
        """Sets the allowed_instances of this CapabilitySetting.


        :param allowed_instances: The allowed_instances of this CapabilitySetting.
        :type allowed_instances: str
        """
        allowed_values = ["ENTRY", "SINGLE", "MULTIPLE"]  # noqa: E501
        if allowed_instances not in allowed_values:
            raise ValueError(
                "Invalid value for `allowed_instances` ({0}), must be one of {1}"
                .format(allowed_instances, allowed_values)
            )

        self._allowed_instances = allowed_instances

    @property
    def description(self) -> str:
        """Gets the description of this CapabilitySetting.


        :return: The description of this CapabilitySetting.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this CapabilitySetting.


        :param description: The description of this CapabilitySetting.
        :type description: str
        """

        self._description = description

    @property
    def enabled_by_default(self) -> bool:
        """Gets the enabled_by_default of this CapabilitySetting.


        :return: The enabled_by_default of this CapabilitySetting.
        :rtype: bool
        """
        return self._enabled_by_default

    @enabled_by_default.setter
    def enabled_by_default(self, enabled_by_default: bool):
        """Sets the enabled_by_default of this CapabilitySetting.


        :param enabled_by_default: The enabled_by_default of this CapabilitySetting.
        :type enabled_by_default: bool
        """

        self._enabled_by_default = enabled_by_default

    @property
    def key(self) -> str:
        """Gets the key of this CapabilitySetting.


        :return: The key of this CapabilitySetting.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this CapabilitySetting.


        :param key: The key of this CapabilitySetting.
        :type key: str
        """
        allowed_values = ["ICLOUD_VERSION", "DATA_PROTECTION_PERMISSION_LEVEL", "APPLE_ID_AUTH_APP_CONSENT"]  # noqa: E501
        if key not in allowed_values:
            raise ValueError(
                "Invalid value for `key` ({0}), must be one of {1}"
                .format(key, allowed_values)
            )

        self._key = key

    @property
    def min_instances(self) -> int:
        """Gets the min_instances of this CapabilitySetting.


        :return: The min_instances of this CapabilitySetting.
        :rtype: int
        """
        return self._min_instances

    @min_instances.setter
    def min_instances(self, min_instances: int):
        """Sets the min_instances of this CapabilitySetting.


        :param min_instances: The min_instances of this CapabilitySetting.
        :type min_instances: int
        """

        self._min_instances = min_instances

    @property
    def name(self) -> str:
        """Gets the name of this CapabilitySetting.


        :return: The name of this CapabilitySetting.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CapabilitySetting.


        :param name: The name of this CapabilitySetting.
        :type name: str
        """

        self._name = name

    @property
    def options(self) -> List[CapabilityOption]:
        """Gets the options of this CapabilitySetting.


        :return: The options of this CapabilitySetting.
        :rtype: List[CapabilityOption]
        """
        return self._options

    @options.setter
    def options(self, options: List[CapabilityOption]):
        """Sets the options of this CapabilitySetting.


        :param options: The options of this CapabilitySetting.
        :type options: List[CapabilityOption]
        """

        self._options = options

    @property
    def visible(self) -> bool:
        """Gets the visible of this CapabilitySetting.


        :return: The visible of this CapabilitySetting.
        :rtype: bool
        """
        return self._visible

    @visible.setter
    def visible(self, visible: bool):
        """Sets the visible of this CapabilitySetting.


        :param visible: The visible of this CapabilitySetting.
        :type visible: bool
        """

        self._visible = visible