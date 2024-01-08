from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_avatar_urls import UserAvatarUrls
from openapi_server import util

from openapi_server.models.user_avatar_urls import UserAvatarUrls  # noqa: E501

class CommentUpdateAuthor(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, account_id=None, account_type=None, active=None, avatar_urls=None, display_name=None, email_address=None, key=None, name=None, _self=None, time_zone=None):  # noqa: E501
        """CommentUpdateAuthor - a model defined in OpenAPI

        :param account_id: The account_id of this CommentUpdateAuthor.  # noqa: E501
        :type account_id: str
        :param account_type: The account_type of this CommentUpdateAuthor.  # noqa: E501
        :type account_type: str
        :param active: The active of this CommentUpdateAuthor.  # noqa: E501
        :type active: bool
        :param avatar_urls: The avatar_urls of this CommentUpdateAuthor.  # noqa: E501
        :type avatar_urls: UserAvatarUrls
        :param display_name: The display_name of this CommentUpdateAuthor.  # noqa: E501
        :type display_name: str
        :param email_address: The email_address of this CommentUpdateAuthor.  # noqa: E501
        :type email_address: str
        :param key: The key of this CommentUpdateAuthor.  # noqa: E501
        :type key: str
        :param name: The name of this CommentUpdateAuthor.  # noqa: E501
        :type name: str
        :param _self: The _self of this CommentUpdateAuthor.  # noqa: E501
        :type _self: str
        :param time_zone: The time_zone of this CommentUpdateAuthor.  # noqa: E501
        :type time_zone: str
        """
        self.openapi_types = {
            'account_id': str,
            'account_type': str,
            'active': bool,
            'avatar_urls': UserAvatarUrls,
            'display_name': str,
            'email_address': str,
            'key': str,
            'name': str,
            '_self': str,
            'time_zone': str
        }

        self.attribute_map = {
            'account_id': 'accountId',
            'account_type': 'accountType',
            'active': 'active',
            'avatar_urls': 'avatarUrls',
            'display_name': 'displayName',
            'email_address': 'emailAddress',
            'key': 'key',
            'name': 'name',
            '_self': 'self',
            'time_zone': 'timeZone'
        }

        self._account_id = account_id
        self._account_type = account_type
        self._active = active
        self._avatar_urls = avatar_urls
        self._display_name = display_name
        self._email_address = email_address
        self._key = key
        self._name = name
        self.__self = _self
        self._time_zone = time_zone

    @classmethod
    def from_dict(cls, dikt) -> 'CommentUpdateAuthor':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Comment_updateAuthor of this CommentUpdateAuthor.  # noqa: E501
        :rtype: CommentUpdateAuthor
        """
        return util.deserialize_model(dikt, cls)

    @property
    def account_id(self) -> str:
        """Gets the account_id of this CommentUpdateAuthor.

        The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.  # noqa: E501

        :return: The account_id of this CommentUpdateAuthor.
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id: str):
        """Sets the account_id of this CommentUpdateAuthor.

        The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.  # noqa: E501

        :param account_id: The account_id of this CommentUpdateAuthor.
        :type account_id: str
        """
        if account_id is not None and len(account_id) > 128:
            raise ValueError("Invalid value for `account_id`, length must be less than or equal to `128`")  # noqa: E501

        self._account_id = account_id

    @property
    def account_type(self) -> str:
        """Gets the account_type of this CommentUpdateAuthor.

        The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)  # noqa: E501

        :return: The account_type of this CommentUpdateAuthor.
        :rtype: str
        """
        return self._account_type

    @account_type.setter
    def account_type(self, account_type: str):
        """Sets the account_type of this CommentUpdateAuthor.

        The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)  # noqa: E501

        :param account_type: The account_type of this CommentUpdateAuthor.
        :type account_type: str
        """

        self._account_type = account_type

    @property
    def active(self) -> bool:
        """Gets the active of this CommentUpdateAuthor.

        Whether the user is active.  # noqa: E501

        :return: The active of this CommentUpdateAuthor.
        :rtype: bool
        """
        return self._active

    @active.setter
    def active(self, active: bool):
        """Sets the active of this CommentUpdateAuthor.

        Whether the user is active.  # noqa: E501

        :param active: The active of this CommentUpdateAuthor.
        :type active: bool
        """

        self._active = active

    @property
    def avatar_urls(self) -> UserAvatarUrls:
        """Gets the avatar_urls of this CommentUpdateAuthor.


        :return: The avatar_urls of this CommentUpdateAuthor.
        :rtype: UserAvatarUrls
        """
        return self._avatar_urls

    @avatar_urls.setter
    def avatar_urls(self, avatar_urls: UserAvatarUrls):
        """Sets the avatar_urls of this CommentUpdateAuthor.


        :param avatar_urls: The avatar_urls of this CommentUpdateAuthor.
        :type avatar_urls: UserAvatarUrls
        """

        self._avatar_urls = avatar_urls

    @property
    def display_name(self) -> str:
        """Gets the display_name of this CommentUpdateAuthor.

        The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.  # noqa: E501

        :return: The display_name of this CommentUpdateAuthor.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name: str):
        """Sets the display_name of this CommentUpdateAuthor.

        The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.  # noqa: E501

        :param display_name: The display_name of this CommentUpdateAuthor.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def email_address(self) -> str:
        """Gets the email_address of this CommentUpdateAuthor.

        The email address of the user. Depending on the user’s privacy settings, this may be returned as null.  # noqa: E501

        :return: The email_address of this CommentUpdateAuthor.
        :rtype: str
        """
        return self._email_address

    @email_address.setter
    def email_address(self, email_address: str):
        """Sets the email_address of this CommentUpdateAuthor.

        The email address of the user. Depending on the user’s privacy settings, this may be returned as null.  # noqa: E501

        :param email_address: The email_address of this CommentUpdateAuthor.
        :type email_address: str
        """

        self._email_address = email_address

    @property
    def key(self) -> str:
        """Gets the key of this CommentUpdateAuthor.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :return: The key of this CommentUpdateAuthor.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this CommentUpdateAuthor.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :param key: The key of this CommentUpdateAuthor.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this CommentUpdateAuthor.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :return: The name of this CommentUpdateAuthor.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CommentUpdateAuthor.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :param name: The name of this CommentUpdateAuthor.
        :type name: str
        """

        self._name = name

    @property
    def _self(self) -> str:
        """Gets the _self of this CommentUpdateAuthor.

        The URL of the user.  # noqa: E501

        :return: The _self of this CommentUpdateAuthor.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this CommentUpdateAuthor.

        The URL of the user.  # noqa: E501

        :param _self: The _self of this CommentUpdateAuthor.
        :type _self: str
        """

        self.__self = _self

    @property
    def time_zone(self) -> str:
        """Gets the time_zone of this CommentUpdateAuthor.

        The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.  # noqa: E501

        :return: The time_zone of this CommentUpdateAuthor.
        :rtype: str
        """
        return self._time_zone

    @time_zone.setter
    def time_zone(self, time_zone: str):
        """Sets the time_zone of this CommentUpdateAuthor.

        The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.  # noqa: E501

        :param time_zone: The time_zone of this CommentUpdateAuthor.
        :type time_zone: str
        """

        self._time_zone = time_zone