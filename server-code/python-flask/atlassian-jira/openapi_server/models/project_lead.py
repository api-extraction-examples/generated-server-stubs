from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_application_roles import UserApplicationRoles
from openapi_server.models.user_avatar_urls import UserAvatarUrls
from openapi_server.models.user_groups import UserGroups
from openapi_server import util

from openapi_server.models.user_application_roles import UserApplicationRoles  # noqa: E501
from openapi_server.models.user_avatar_urls import UserAvatarUrls  # noqa: E501
from openapi_server.models.user_groups import UserGroups  # noqa: E501

class ProjectLead(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, account_id=None, account_type=None, active=None, application_roles=None, avatar_urls=None, display_name=None, email_address=None, expand=None, groups=None, key=None, locale=None, name=None, _self=None, time_zone=None):  # noqa: E501
        """ProjectLead - a model defined in OpenAPI

        :param account_id: The account_id of this ProjectLead.  # noqa: E501
        :type account_id: str
        :param account_type: The account_type of this ProjectLead.  # noqa: E501
        :type account_type: str
        :param active: The active of this ProjectLead.  # noqa: E501
        :type active: bool
        :param application_roles: The application_roles of this ProjectLead.  # noqa: E501
        :type application_roles: UserApplicationRoles
        :param avatar_urls: The avatar_urls of this ProjectLead.  # noqa: E501
        :type avatar_urls: UserAvatarUrls
        :param display_name: The display_name of this ProjectLead.  # noqa: E501
        :type display_name: str
        :param email_address: The email_address of this ProjectLead.  # noqa: E501
        :type email_address: str
        :param expand: The expand of this ProjectLead.  # noqa: E501
        :type expand: str
        :param groups: The groups of this ProjectLead.  # noqa: E501
        :type groups: UserGroups
        :param key: The key of this ProjectLead.  # noqa: E501
        :type key: str
        :param locale: The locale of this ProjectLead.  # noqa: E501
        :type locale: str
        :param name: The name of this ProjectLead.  # noqa: E501
        :type name: str
        :param _self: The _self of this ProjectLead.  # noqa: E501
        :type _self: str
        :param time_zone: The time_zone of this ProjectLead.  # noqa: E501
        :type time_zone: str
        """
        self.openapi_types = {
            'account_id': str,
            'account_type': str,
            'active': bool,
            'application_roles': UserApplicationRoles,
            'avatar_urls': UserAvatarUrls,
            'display_name': str,
            'email_address': str,
            'expand': str,
            'groups': UserGroups,
            'key': str,
            'locale': str,
            'name': str,
            '_self': str,
            'time_zone': str
        }

        self.attribute_map = {
            'account_id': 'accountId',
            'account_type': 'accountType',
            'active': 'active',
            'application_roles': 'applicationRoles',
            'avatar_urls': 'avatarUrls',
            'display_name': 'displayName',
            'email_address': 'emailAddress',
            'expand': 'expand',
            'groups': 'groups',
            'key': 'key',
            'locale': 'locale',
            'name': 'name',
            '_self': 'self',
            'time_zone': 'timeZone'
        }

        self._account_id = account_id
        self._account_type = account_type
        self._active = active
        self._application_roles = application_roles
        self._avatar_urls = avatar_urls
        self._display_name = display_name
        self._email_address = email_address
        self._expand = expand
        self._groups = groups
        self._key = key
        self._locale = locale
        self._name = name
        self.__self = _self
        self._time_zone = time_zone

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectLead':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Project_lead of this ProjectLead.  # noqa: E501
        :rtype: ProjectLead
        """
        return util.deserialize_model(dikt, cls)

    @property
    def account_id(self) -> str:
        """Gets the account_id of this ProjectLead.

        The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.  # noqa: E501

        :return: The account_id of this ProjectLead.
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id: str):
        """Sets the account_id of this ProjectLead.

        The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.  # noqa: E501

        :param account_id: The account_id of this ProjectLead.
        :type account_id: str
        """
        if account_id is not None and len(account_id) > 128:
            raise ValueError("Invalid value for `account_id`, length must be less than or equal to `128`")  # noqa: E501

        self._account_id = account_id

    @property
    def account_type(self) -> str:
        """Gets the account_type of this ProjectLead.

        The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk  # noqa: E501

        :return: The account_type of this ProjectLead.
        :rtype: str
        """
        return self._account_type

    @account_type.setter
    def account_type(self, account_type: str):
        """Sets the account_type of this ProjectLead.

        The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk  # noqa: E501

        :param account_type: The account_type of this ProjectLead.
        :type account_type: str
        """
        allowed_values = ["atlassian", "app", "customer", "unknown"]  # noqa: E501
        if account_type not in allowed_values:
            raise ValueError(
                "Invalid value for `account_type` ({0}), must be one of {1}"
                .format(account_type, allowed_values)
            )

        self._account_type = account_type

    @property
    def active(self) -> bool:
        """Gets the active of this ProjectLead.

        Whether the user is active.  # noqa: E501

        :return: The active of this ProjectLead.
        :rtype: bool
        """
        return self._active

    @active.setter
    def active(self, active: bool):
        """Sets the active of this ProjectLead.

        Whether the user is active.  # noqa: E501

        :param active: The active of this ProjectLead.
        :type active: bool
        """

        self._active = active

    @property
    def application_roles(self) -> UserApplicationRoles:
        """Gets the application_roles of this ProjectLead.


        :return: The application_roles of this ProjectLead.
        :rtype: UserApplicationRoles
        """
        return self._application_roles

    @application_roles.setter
    def application_roles(self, application_roles: UserApplicationRoles):
        """Sets the application_roles of this ProjectLead.


        :param application_roles: The application_roles of this ProjectLead.
        :type application_roles: UserApplicationRoles
        """

        self._application_roles = application_roles

    @property
    def avatar_urls(self) -> UserAvatarUrls:
        """Gets the avatar_urls of this ProjectLead.


        :return: The avatar_urls of this ProjectLead.
        :rtype: UserAvatarUrls
        """
        return self._avatar_urls

    @avatar_urls.setter
    def avatar_urls(self, avatar_urls: UserAvatarUrls):
        """Sets the avatar_urls of this ProjectLead.


        :param avatar_urls: The avatar_urls of this ProjectLead.
        :type avatar_urls: UserAvatarUrls
        """

        self._avatar_urls = avatar_urls

    @property
    def display_name(self) -> str:
        """Gets the display_name of this ProjectLead.

        The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.  # noqa: E501

        :return: The display_name of this ProjectLead.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name: str):
        """Sets the display_name of this ProjectLead.

        The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.  # noqa: E501

        :param display_name: The display_name of this ProjectLead.
        :type display_name: str
        """

        self._display_name = display_name

    @property
    def email_address(self) -> str:
        """Gets the email_address of this ProjectLead.

        The email address of the user. Depending on the user’s privacy setting, this may be returned as null.  # noqa: E501

        :return: The email_address of this ProjectLead.
        :rtype: str
        """
        return self._email_address

    @email_address.setter
    def email_address(self, email_address: str):
        """Sets the email_address of this ProjectLead.

        The email address of the user. Depending on the user’s privacy setting, this may be returned as null.  # noqa: E501

        :param email_address: The email_address of this ProjectLead.
        :type email_address: str
        """

        self._email_address = email_address

    @property
    def expand(self) -> str:
        """Gets the expand of this ProjectLead.

        Expand options that include additional user details in the response.  # noqa: E501

        :return: The expand of this ProjectLead.
        :rtype: str
        """
        return self._expand

    @expand.setter
    def expand(self, expand: str):
        """Sets the expand of this ProjectLead.

        Expand options that include additional user details in the response.  # noqa: E501

        :param expand: The expand of this ProjectLead.
        :type expand: str
        """

        self._expand = expand

    @property
    def groups(self) -> UserGroups:
        """Gets the groups of this ProjectLead.


        :return: The groups of this ProjectLead.
        :rtype: UserGroups
        """
        return self._groups

    @groups.setter
    def groups(self, groups: UserGroups):
        """Sets the groups of this ProjectLead.


        :param groups: The groups of this ProjectLead.
        :type groups: UserGroups
        """

        self._groups = groups

    @property
    def key(self) -> str:
        """Gets the key of this ProjectLead.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :return: The key of this ProjectLead.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this ProjectLead.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :param key: The key of this ProjectLead.
        :type key: str
        """

        self._key = key

    @property
    def locale(self) -> str:
        """Gets the locale of this ProjectLead.

        The locale of the user. Depending on the user’s privacy setting, this may be returned as null.  # noqa: E501

        :return: The locale of this ProjectLead.
        :rtype: str
        """
        return self._locale

    @locale.setter
    def locale(self, locale: str):
        """Sets the locale of this ProjectLead.

        The locale of the user. Depending on the user’s privacy setting, this may be returned as null.  # noqa: E501

        :param locale: The locale of this ProjectLead.
        :type locale: str
        """

        self._locale = locale

    @property
    def name(self) -> str:
        """Gets the name of this ProjectLead.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :return: The name of this ProjectLead.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ProjectLead.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :param name: The name of this ProjectLead.
        :type name: str
        """

        self._name = name

    @property
    def _self(self) -> str:
        """Gets the _self of this ProjectLead.

        The URL of the user.  # noqa: E501

        :return: The _self of this ProjectLead.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this ProjectLead.

        The URL of the user.  # noqa: E501

        :param _self: The _self of this ProjectLead.
        :type _self: str
        """

        self.__self = _self

    @property
    def time_zone(self) -> str:
        """Gets the time_zone of this ProjectLead.

        The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.  # noqa: E501

        :return: The time_zone of this ProjectLead.
        :rtype: str
        """
        return self._time_zone

    @time_zone.setter
    def time_zone(self, time_zone: str):
        """Sets the time_zone of this ProjectLead.

        The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.  # noqa: E501

        :param time_zone: The time_zone of this ProjectLead.
        :type time_zone: str
        """

        self._time_zone = time_zone