from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class MFADevice(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, serial_number=None, enable_date=None):  # noqa: E501
        """MFADevice - a model defined in OpenAPI

        :param user_name: The user_name of this MFADevice.  # noqa: E501
        :type user_name: str
        :param serial_number: The serial_number of this MFADevice.  # noqa: E501
        :type serial_number: str
        :param enable_date: The enable_date of this MFADevice.  # noqa: E501
        :type enable_date: datetime
        """
        self.openapi_types = {
            'user_name': str,
            'serial_number': str,
            'enable_date': datetime
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'serial_number': 'SerialNumber',
            'enable_date': 'EnableDate'
        }

        self._user_name = user_name
        self._serial_number = serial_number
        self._enable_date = enable_date

    @classmethod
    def from_dict(cls, dikt) -> 'MFADevice':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MFADevice of this MFADevice.  # noqa: E501
        :rtype: MFADevice
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this MFADevice.


        :return: The user_name of this MFADevice.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this MFADevice.


        :param user_name: The user_name of this MFADevice.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name

    @property
    def serial_number(self) -> str:
        """Gets the serial_number of this MFADevice.


        :return: The serial_number of this MFADevice.
        :rtype: str
        """
        return self._serial_number

    @serial_number.setter
    def serial_number(self, serial_number: str):
        """Sets the serial_number of this MFADevice.


        :param serial_number: The serial_number of this MFADevice.
        :type serial_number: str
        """
        if serial_number is None:
            raise ValueError("Invalid value for `serial_number`, must not be `None`")  # noqa: E501

        self._serial_number = serial_number

    @property
    def enable_date(self) -> datetime:
        """Gets the enable_date of this MFADevice.


        :return: The enable_date of this MFADevice.
        :rtype: datetime
        """
        return self._enable_date

    @enable_date.setter
    def enable_date(self, enable_date: datetime):
        """Sets the enable_date of this MFADevice.


        :param enable_date: The enable_date of this MFADevice.
        :type enable_date: datetime
        """
        if enable_date is None:
            raise ValueError("Invalid value for `enable_date`, must not be `None`")  # noqa: E501

        self._enable_date = enable_date
