from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListVirtualMFADevicesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, virtual_mfa_devices=None, is_truncated=None, marker=None):  # noqa: E501
        """ListVirtualMFADevicesResponse - a model defined in OpenAPI

        :param virtual_mfa_devices: The virtual_mfa_devices of this ListVirtualMFADevicesResponse.  # noqa: E501
        :type virtual_mfa_devices: List
        :param is_truncated: The is_truncated of this ListVirtualMFADevicesResponse.  # noqa: E501
        :type is_truncated: bool
        :param marker: The marker of this ListVirtualMFADevicesResponse.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'virtual_mfa_devices': List,
            'is_truncated': bool,
            'marker': str
        }

        self.attribute_map = {
            'virtual_mfa_devices': 'VirtualMFADevices',
            'is_truncated': 'IsTruncated',
            'marker': 'Marker'
        }

        self._virtual_mfa_devices = virtual_mfa_devices
        self._is_truncated = is_truncated
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'ListVirtualMFADevicesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListVirtualMFADevicesResponse of this ListVirtualMFADevicesResponse.  # noqa: E501
        :rtype: ListVirtualMFADevicesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def virtual_mfa_devices(self) -> List:
        """Gets the virtual_mfa_devices of this ListVirtualMFADevicesResponse.


        :return: The virtual_mfa_devices of this ListVirtualMFADevicesResponse.
        :rtype: List
        """
        return self._virtual_mfa_devices

    @virtual_mfa_devices.setter
    def virtual_mfa_devices(self, virtual_mfa_devices: List):
        """Sets the virtual_mfa_devices of this ListVirtualMFADevicesResponse.


        :param virtual_mfa_devices: The virtual_mfa_devices of this ListVirtualMFADevicesResponse.
        :type virtual_mfa_devices: List
        """
        if virtual_mfa_devices is None:
            raise ValueError("Invalid value for `virtual_mfa_devices`, must not be `None`")  # noqa: E501

        self._virtual_mfa_devices = virtual_mfa_devices

    @property
    def is_truncated(self) -> bool:
        """Gets the is_truncated of this ListVirtualMFADevicesResponse.


        :return: The is_truncated of this ListVirtualMFADevicesResponse.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated: bool):
        """Sets the is_truncated of this ListVirtualMFADevicesResponse.


        :param is_truncated: The is_truncated of this ListVirtualMFADevicesResponse.
        :type is_truncated: bool
        """

        self._is_truncated = is_truncated

    @property
    def marker(self) -> str:
        """Gets the marker of this ListVirtualMFADevicesResponse.


        :return: The marker of this ListVirtualMFADevicesResponse.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListVirtualMFADevicesResponse.


        :param marker: The marker of this ListVirtualMFADevicesResponse.
        :type marker: str
        """

        self._marker = marker
