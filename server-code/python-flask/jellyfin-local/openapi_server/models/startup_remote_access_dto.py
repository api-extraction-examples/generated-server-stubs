from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class StartupRemoteAccessDto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, enable_automatic_port_mapping=None, enable_remote_access=None):  # noqa: E501
        """StartupRemoteAccessDto - a model defined in OpenAPI

        :param enable_automatic_port_mapping: The enable_automatic_port_mapping of this StartupRemoteAccessDto.  # noqa: E501
        :type enable_automatic_port_mapping: bool
        :param enable_remote_access: The enable_remote_access of this StartupRemoteAccessDto.  # noqa: E501
        :type enable_remote_access: bool
        """
        self.openapi_types = {
            'enable_automatic_port_mapping': bool,
            'enable_remote_access': bool
        }

        self.attribute_map = {
            'enable_automatic_port_mapping': 'EnableAutomaticPortMapping',
            'enable_remote_access': 'EnableRemoteAccess'
        }

        self._enable_automatic_port_mapping = enable_automatic_port_mapping
        self._enable_remote_access = enable_remote_access

    @classmethod
    def from_dict(cls, dikt) -> 'StartupRemoteAccessDto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StartupRemoteAccessDto of this StartupRemoteAccessDto.  # noqa: E501
        :rtype: StartupRemoteAccessDto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def enable_automatic_port_mapping(self) -> bool:
        """Gets the enable_automatic_port_mapping of this StartupRemoteAccessDto.

        Gets or sets a value indicating whether enable automatic port mapping.  # noqa: E501

        :return: The enable_automatic_port_mapping of this StartupRemoteAccessDto.
        :rtype: bool
        """
        return self._enable_automatic_port_mapping

    @enable_automatic_port_mapping.setter
    def enable_automatic_port_mapping(self, enable_automatic_port_mapping: bool):
        """Sets the enable_automatic_port_mapping of this StartupRemoteAccessDto.

        Gets or sets a value indicating whether enable automatic port mapping.  # noqa: E501

        :param enable_automatic_port_mapping: The enable_automatic_port_mapping of this StartupRemoteAccessDto.
        :type enable_automatic_port_mapping: bool
        """
        if enable_automatic_port_mapping is None:
            raise ValueError("Invalid value for `enable_automatic_port_mapping`, must not be `None`")  # noqa: E501

        self._enable_automatic_port_mapping = enable_automatic_port_mapping

    @property
    def enable_remote_access(self) -> bool:
        """Gets the enable_remote_access of this StartupRemoteAccessDto.

        Gets or sets a value indicating whether enable remote access.  # noqa: E501

        :return: The enable_remote_access of this StartupRemoteAccessDto.
        :rtype: bool
        """
        return self._enable_remote_access

    @enable_remote_access.setter
    def enable_remote_access(self, enable_remote_access: bool):
        """Sets the enable_remote_access of this StartupRemoteAccessDto.

        Gets or sets a value indicating whether enable remote access.  # noqa: E501

        :param enable_remote_access: The enable_remote_access of this StartupRemoteAccessDto.
        :type enable_remote_access: bool
        """
        if enable_remote_access is None:
            raise ValueError("Invalid value for `enable_remote_access`, must not be `None`")  # noqa: E501

        self._enable_remote_access = enable_remote_access
