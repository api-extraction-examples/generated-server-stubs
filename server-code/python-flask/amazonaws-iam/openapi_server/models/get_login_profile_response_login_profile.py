from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GetLoginProfileResponseLoginProfile(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, create_date=None, password_reset_required=None):  # noqa: E501
        """GetLoginProfileResponseLoginProfile - a model defined in OpenAPI

        :param user_name: The user_name of this GetLoginProfileResponseLoginProfile.  # noqa: E501
        :type user_name: str
        :param create_date: The create_date of this GetLoginProfileResponseLoginProfile.  # noqa: E501
        :type create_date: datetime
        :param password_reset_required: The password_reset_required of this GetLoginProfileResponseLoginProfile.  # noqa: E501
        :type password_reset_required: bool
        """
        self.openapi_types = {
            'user_name': str,
            'create_date': datetime,
            'password_reset_required': bool
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'create_date': 'CreateDate',
            'password_reset_required': 'PasswordResetRequired'
        }

        self._user_name = user_name
        self._create_date = create_date
        self._password_reset_required = password_reset_required

    @classmethod
    def from_dict(cls, dikt) -> 'GetLoginProfileResponseLoginProfile':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetLoginProfileResponse_LoginProfile of this GetLoginProfileResponseLoginProfile.  # noqa: E501
        :rtype: GetLoginProfileResponseLoginProfile
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this GetLoginProfileResponseLoginProfile.


        :return: The user_name of this GetLoginProfileResponseLoginProfile.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this GetLoginProfileResponseLoginProfile.


        :param user_name: The user_name of this GetLoginProfileResponseLoginProfile.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this GetLoginProfileResponseLoginProfile.


        :return: The create_date of this GetLoginProfileResponseLoginProfile.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this GetLoginProfileResponseLoginProfile.


        :param create_date: The create_date of this GetLoginProfileResponseLoginProfile.
        :type create_date: datetime
        """
        if create_date is None:
            raise ValueError("Invalid value for `create_date`, must not be `None`")  # noqa: E501

        self._create_date = create_date

    @property
    def password_reset_required(self) -> bool:
        """Gets the password_reset_required of this GetLoginProfileResponseLoginProfile.


        :return: The password_reset_required of this GetLoginProfileResponseLoginProfile.
        :rtype: bool
        """
        return self._password_reset_required

    @password_reset_required.setter
    def password_reset_required(self, password_reset_required: bool):
        """Sets the password_reset_required of this GetLoginProfileResponseLoginProfile.


        :param password_reset_required: The password_reset_required of this GetLoginProfileResponseLoginProfile.
        :type password_reset_required: bool
        """

        self._password_reset_required = password_reset_required
