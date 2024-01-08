from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_virtual_mfa_device_response_virtual_mfa_device import CreateVirtualMFADeviceResponseVirtualMFADevice
from openapi_server import util

from openapi_server.models.create_virtual_mfa_device_response_virtual_mfa_device import CreateVirtualMFADeviceResponseVirtualMFADevice  # noqa: E501

class CreateVirtualMFADeviceResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, virtual_mfa_device=None):  # noqa: E501
        """CreateVirtualMFADeviceResponse - a model defined in OpenAPI

        :param virtual_mfa_device: The virtual_mfa_device of this CreateVirtualMFADeviceResponse.  # noqa: E501
        :type virtual_mfa_device: CreateVirtualMFADeviceResponseVirtualMFADevice
        """
        self.openapi_types = {
            'virtual_mfa_device': CreateVirtualMFADeviceResponseVirtualMFADevice
        }

        self.attribute_map = {
            'virtual_mfa_device': 'VirtualMFADevice'
        }

        self._virtual_mfa_device = virtual_mfa_device

    @classmethod
    def from_dict(cls, dikt) -> 'CreateVirtualMFADeviceResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateVirtualMFADeviceResponse of this CreateVirtualMFADeviceResponse.  # noqa: E501
        :rtype: CreateVirtualMFADeviceResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def virtual_mfa_device(self) -> CreateVirtualMFADeviceResponseVirtualMFADevice:
        """Gets the virtual_mfa_device of this CreateVirtualMFADeviceResponse.


        :return: The virtual_mfa_device of this CreateVirtualMFADeviceResponse.
        :rtype: CreateVirtualMFADeviceResponseVirtualMFADevice
        """
        return self._virtual_mfa_device

    @virtual_mfa_device.setter
    def virtual_mfa_device(self, virtual_mfa_device: CreateVirtualMFADeviceResponseVirtualMFADevice):
        """Sets the virtual_mfa_device of this CreateVirtualMFADeviceResponse.


        :param virtual_mfa_device: The virtual_mfa_device of this CreateVirtualMFADeviceResponse.
        :type virtual_mfa_device: CreateVirtualMFADeviceResponseVirtualMFADevice
        """
        if virtual_mfa_device is None:
            raise ValueError("Invalid value for `virtual_mfa_device`, must not be `None`")  # noqa: E501

        self._virtual_mfa_device = virtual_mfa_device