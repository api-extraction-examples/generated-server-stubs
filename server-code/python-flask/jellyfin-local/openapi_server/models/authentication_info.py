from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AuthenticationInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, access_token=None, app_name=None, app_version=None, date_created=None, date_last_activity=None, date_revoked=None, device_id=None, device_name=None, id=None, is_active=None, user_id=None, user_name=None):  # noqa: E501
        """AuthenticationInfo - a model defined in OpenAPI

        :param access_token: The access_token of this AuthenticationInfo.  # noqa: E501
        :type access_token: str
        :param app_name: The app_name of this AuthenticationInfo.  # noqa: E501
        :type app_name: str
        :param app_version: The app_version of this AuthenticationInfo.  # noqa: E501
        :type app_version: str
        :param date_created: The date_created of this AuthenticationInfo.  # noqa: E501
        :type date_created: datetime
        :param date_last_activity: The date_last_activity of this AuthenticationInfo.  # noqa: E501
        :type date_last_activity: datetime
        :param date_revoked: The date_revoked of this AuthenticationInfo.  # noqa: E501
        :type date_revoked: datetime
        :param device_id: The device_id of this AuthenticationInfo.  # noqa: E501
        :type device_id: str
        :param device_name: The device_name of this AuthenticationInfo.  # noqa: E501
        :type device_name: str
        :param id: The id of this AuthenticationInfo.  # noqa: E501
        :type id: int
        :param is_active: The is_active of this AuthenticationInfo.  # noqa: E501
        :type is_active: bool
        :param user_id: The user_id of this AuthenticationInfo.  # noqa: E501
        :type user_id: str
        :param user_name: The user_name of this AuthenticationInfo.  # noqa: E501
        :type user_name: str
        """
        self.openapi_types = {
            'access_token': str,
            'app_name': str,
            'app_version': str,
            'date_created': datetime,
            'date_last_activity': datetime,
            'date_revoked': datetime,
            'device_id': str,
            'device_name': str,
            'id': int,
            'is_active': bool,
            'user_id': str,
            'user_name': str
        }

        self.attribute_map = {
            'access_token': 'AccessToken',
            'app_name': 'AppName',
            'app_version': 'AppVersion',
            'date_created': 'DateCreated',
            'date_last_activity': 'DateLastActivity',
            'date_revoked': 'DateRevoked',
            'device_id': 'DeviceId',
            'device_name': 'DeviceName',
            'id': 'Id',
            'is_active': 'IsActive',
            'user_id': 'UserId',
            'user_name': 'UserName'
        }

        self._access_token = access_token
        self._app_name = app_name
        self._app_version = app_version
        self._date_created = date_created
        self._date_last_activity = date_last_activity
        self._date_revoked = date_revoked
        self._device_id = device_id
        self._device_name = device_name
        self._id = id
        self._is_active = is_active
        self._user_id = user_id
        self._user_name = user_name

    @classmethod
    def from_dict(cls, dikt) -> 'AuthenticationInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AuthenticationInfo of this AuthenticationInfo.  # noqa: E501
        :rtype: AuthenticationInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def access_token(self) -> str:
        """Gets the access_token of this AuthenticationInfo.

        Gets or sets the access token.  # noqa: E501

        :return: The access_token of this AuthenticationInfo.
        :rtype: str
        """
        return self._access_token

    @access_token.setter
    def access_token(self, access_token: str):
        """Sets the access_token of this AuthenticationInfo.

        Gets or sets the access token.  # noqa: E501

        :param access_token: The access_token of this AuthenticationInfo.
        :type access_token: str
        """

        self._access_token = access_token

    @property
    def app_name(self) -> str:
        """Gets the app_name of this AuthenticationInfo.

        Gets or sets the name of the application.  # noqa: E501

        :return: The app_name of this AuthenticationInfo.
        :rtype: str
        """
        return self._app_name

    @app_name.setter
    def app_name(self, app_name: str):
        """Sets the app_name of this AuthenticationInfo.

        Gets or sets the name of the application.  # noqa: E501

        :param app_name: The app_name of this AuthenticationInfo.
        :type app_name: str
        """

        self._app_name = app_name

    @property
    def app_version(self) -> str:
        """Gets the app_version of this AuthenticationInfo.

        Gets or sets the application version.  # noqa: E501

        :return: The app_version of this AuthenticationInfo.
        :rtype: str
        """
        return self._app_version

    @app_version.setter
    def app_version(self, app_version: str):
        """Sets the app_version of this AuthenticationInfo.

        Gets or sets the application version.  # noqa: E501

        :param app_version: The app_version of this AuthenticationInfo.
        :type app_version: str
        """

        self._app_version = app_version

    @property
    def date_created(self) -> datetime:
        """Gets the date_created of this AuthenticationInfo.

        Gets or sets the date created.  # noqa: E501

        :return: The date_created of this AuthenticationInfo.
        :rtype: datetime
        """
        return self._date_created

    @date_created.setter
    def date_created(self, date_created: datetime):
        """Sets the date_created of this AuthenticationInfo.

        Gets or sets the date created.  # noqa: E501

        :param date_created: The date_created of this AuthenticationInfo.
        :type date_created: datetime
        """

        self._date_created = date_created

    @property
    def date_last_activity(self) -> datetime:
        """Gets the date_last_activity of this AuthenticationInfo.


        :return: The date_last_activity of this AuthenticationInfo.
        :rtype: datetime
        """
        return self._date_last_activity

    @date_last_activity.setter
    def date_last_activity(self, date_last_activity: datetime):
        """Sets the date_last_activity of this AuthenticationInfo.


        :param date_last_activity: The date_last_activity of this AuthenticationInfo.
        :type date_last_activity: datetime
        """

        self._date_last_activity = date_last_activity

    @property
    def date_revoked(self) -> datetime:
        """Gets the date_revoked of this AuthenticationInfo.

        Gets or sets the date revoked.  # noqa: E501

        :return: The date_revoked of this AuthenticationInfo.
        :rtype: datetime
        """
        return self._date_revoked

    @date_revoked.setter
    def date_revoked(self, date_revoked: datetime):
        """Sets the date_revoked of this AuthenticationInfo.

        Gets or sets the date revoked.  # noqa: E501

        :param date_revoked: The date_revoked of this AuthenticationInfo.
        :type date_revoked: datetime
        """

        self._date_revoked = date_revoked

    @property
    def device_id(self) -> str:
        """Gets the device_id of this AuthenticationInfo.

        Gets or sets the device identifier.  # noqa: E501

        :return: The device_id of this AuthenticationInfo.
        :rtype: str
        """
        return self._device_id

    @device_id.setter
    def device_id(self, device_id: str):
        """Sets the device_id of this AuthenticationInfo.

        Gets or sets the device identifier.  # noqa: E501

        :param device_id: The device_id of this AuthenticationInfo.
        :type device_id: str
        """

        self._device_id = device_id

    @property
    def device_name(self) -> str:
        """Gets the device_name of this AuthenticationInfo.

        Gets or sets the name of the device.  # noqa: E501

        :return: The device_name of this AuthenticationInfo.
        :rtype: str
        """
        return self._device_name

    @device_name.setter
    def device_name(self, device_name: str):
        """Sets the device_name of this AuthenticationInfo.

        Gets or sets the name of the device.  # noqa: E501

        :param device_name: The device_name of this AuthenticationInfo.
        :type device_name: str
        """

        self._device_name = device_name

    @property
    def id(self) -> int:
        """Gets the id of this AuthenticationInfo.

        Gets or sets the identifier.  # noqa: E501

        :return: The id of this AuthenticationInfo.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this AuthenticationInfo.

        Gets or sets the identifier.  # noqa: E501

        :param id: The id of this AuthenticationInfo.
        :type id: int
        """

        self._id = id

    @property
    def is_active(self) -> bool:
        """Gets the is_active of this AuthenticationInfo.

        Gets or sets a value indicating whether this instance is active.  # noqa: E501

        :return: The is_active of this AuthenticationInfo.
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active: bool):
        """Sets the is_active of this AuthenticationInfo.

        Gets or sets a value indicating whether this instance is active.  # noqa: E501

        :param is_active: The is_active of this AuthenticationInfo.
        :type is_active: bool
        """

        self._is_active = is_active

    @property
    def user_id(self) -> str:
        """Gets the user_id of this AuthenticationInfo.

        Gets or sets the user identifier.  # noqa: E501

        :return: The user_id of this AuthenticationInfo.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this AuthenticationInfo.

        Gets or sets the user identifier.  # noqa: E501

        :param user_id: The user_id of this AuthenticationInfo.
        :type user_id: str
        """

        self._user_id = user_id

    @property
    def user_name(self) -> str:
        """Gets the user_name of this AuthenticationInfo.


        :return: The user_name of this AuthenticationInfo.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this AuthenticationInfo.


        :param user_name: The user_name of this AuthenticationInfo.
        :type user_name: str
        """

        self._user_name = user_name