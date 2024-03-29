from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.virtual_mfa_device_user import VirtualMFADeviceUser
from openapi_server import util

from openapi_server.models.virtual_mfa_device_user import VirtualMFADeviceUser  # noqa: E501

class VirtualMFADevice(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, serial_number=None, base32_string_seed=None, qr_code_png=None, user=None, enable_date=None, tags=None):  # noqa: E501
        """VirtualMFADevice - a model defined in OpenAPI

        :param serial_number: The serial_number of this VirtualMFADevice.  # noqa: E501
        :type serial_number: str
        :param base32_string_seed: The base32_string_seed of this VirtualMFADevice.  # noqa: E501
        :type base32_string_seed: str
        :param qr_code_png: The qr_code_png of this VirtualMFADevice.  # noqa: E501
        :type qr_code_png: str
        :param user: The user of this VirtualMFADevice.  # noqa: E501
        :type user: VirtualMFADeviceUser
        :param enable_date: The enable_date of this VirtualMFADevice.  # noqa: E501
        :type enable_date: datetime
        :param tags: The tags of this VirtualMFADevice.  # noqa: E501
        :type tags: List
        """
        self.openapi_types = {
            'serial_number': str,
            'base32_string_seed': str,
            'qr_code_png': str,
            'user': VirtualMFADeviceUser,
            'enable_date': datetime,
            'tags': List
        }

        self.attribute_map = {
            'serial_number': 'SerialNumber',
            'base32_string_seed': 'Base32StringSeed',
            'qr_code_png': 'QRCodePNG',
            'user': 'User',
            'enable_date': 'EnableDate',
            'tags': 'Tags'
        }

        self._serial_number = serial_number
        self._base32_string_seed = base32_string_seed
        self._qr_code_png = qr_code_png
        self._user = user
        self._enable_date = enable_date
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'VirtualMFADevice':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VirtualMFADevice of this VirtualMFADevice.  # noqa: E501
        :rtype: VirtualMFADevice
        """
        return util.deserialize_model(dikt, cls)

    @property
    def serial_number(self) -> str:
        """Gets the serial_number of this VirtualMFADevice.


        :return: The serial_number of this VirtualMFADevice.
        :rtype: str
        """
        return self._serial_number

    @serial_number.setter
    def serial_number(self, serial_number: str):
        """Sets the serial_number of this VirtualMFADevice.


        :param serial_number: The serial_number of this VirtualMFADevice.
        :type serial_number: str
        """
        if serial_number is None:
            raise ValueError("Invalid value for `serial_number`, must not be `None`")  # noqa: E501

        self._serial_number = serial_number

    @property
    def base32_string_seed(self) -> str:
        """Gets the base32_string_seed of this VirtualMFADevice.


        :return: The base32_string_seed of this VirtualMFADevice.
        :rtype: str
        """
        return self._base32_string_seed

    @base32_string_seed.setter
    def base32_string_seed(self, base32_string_seed: str):
        """Sets the base32_string_seed of this VirtualMFADevice.


        :param base32_string_seed: The base32_string_seed of this VirtualMFADevice.
        :type base32_string_seed: str
        """

        self._base32_string_seed = base32_string_seed

    @property
    def qr_code_png(self) -> str:
        """Gets the qr_code_png of this VirtualMFADevice.


        :return: The qr_code_png of this VirtualMFADevice.
        :rtype: str
        """
        return self._qr_code_png

    @qr_code_png.setter
    def qr_code_png(self, qr_code_png: str):
        """Sets the qr_code_png of this VirtualMFADevice.


        :param qr_code_png: The qr_code_png of this VirtualMFADevice.
        :type qr_code_png: str
        """

        self._qr_code_png = qr_code_png

    @property
    def user(self) -> VirtualMFADeviceUser:
        """Gets the user of this VirtualMFADevice.


        :return: The user of this VirtualMFADevice.
        :rtype: VirtualMFADeviceUser
        """
        return self._user

    @user.setter
    def user(self, user: VirtualMFADeviceUser):
        """Sets the user of this VirtualMFADevice.


        :param user: The user of this VirtualMFADevice.
        :type user: VirtualMFADeviceUser
        """

        self._user = user

    @property
    def enable_date(self) -> datetime:
        """Gets the enable_date of this VirtualMFADevice.


        :return: The enable_date of this VirtualMFADevice.
        :rtype: datetime
        """
        return self._enable_date

    @enable_date.setter
    def enable_date(self, enable_date: datetime):
        """Sets the enable_date of this VirtualMFADevice.


        :param enable_date: The enable_date of this VirtualMFADevice.
        :type enable_date: datetime
        """

        self._enable_date = enable_date

    @property
    def tags(self) -> List:
        """Gets the tags of this VirtualMFADevice.


        :return: The tags of this VirtualMFADevice.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this VirtualMFADevice.


        :param tags: The tags of this VirtualMFADevice.
        :type tags: List
        """

        self._tags = tags
