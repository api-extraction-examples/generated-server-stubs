from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_role import UserRole
from openapi_server import util

from openapi_server.models.user_role import UserRole  # noqa: E501

class UserInvitationAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, all_apps_visible=None, email=None, expiration_date=None, first_name=None, last_name=None, provisioning_allowed=None, roles=None):  # noqa: E501
        """UserInvitationAttributes - a model defined in OpenAPI

        :param all_apps_visible: The all_apps_visible of this UserInvitationAttributes.  # noqa: E501
        :type all_apps_visible: bool
        :param email: The email of this UserInvitationAttributes.  # noqa: E501
        :type email: str
        :param expiration_date: The expiration_date of this UserInvitationAttributes.  # noqa: E501
        :type expiration_date: datetime
        :param first_name: The first_name of this UserInvitationAttributes.  # noqa: E501
        :type first_name: str
        :param last_name: The last_name of this UserInvitationAttributes.  # noqa: E501
        :type last_name: str
        :param provisioning_allowed: The provisioning_allowed of this UserInvitationAttributes.  # noqa: E501
        :type provisioning_allowed: bool
        :param roles: The roles of this UserInvitationAttributes.  # noqa: E501
        :type roles: List[UserRole]
        """
        self.openapi_types = {
            'all_apps_visible': bool,
            'email': str,
            'expiration_date': datetime,
            'first_name': str,
            'last_name': str,
            'provisioning_allowed': bool,
            'roles': List[UserRole]
        }

        self.attribute_map = {
            'all_apps_visible': 'allAppsVisible',
            'email': 'email',
            'expiration_date': 'expirationDate',
            'first_name': 'firstName',
            'last_name': 'lastName',
            'provisioning_allowed': 'provisioningAllowed',
            'roles': 'roles'
        }

        self._all_apps_visible = all_apps_visible
        self._email = email
        self._expiration_date = expiration_date
        self._first_name = first_name
        self._last_name = last_name
        self._provisioning_allowed = provisioning_allowed
        self._roles = roles

    @classmethod
    def from_dict(cls, dikt) -> 'UserInvitationAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserInvitation_attributes of this UserInvitationAttributes.  # noqa: E501
        :rtype: UserInvitationAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def all_apps_visible(self) -> bool:
        """Gets the all_apps_visible of this UserInvitationAttributes.


        :return: The all_apps_visible of this UserInvitationAttributes.
        :rtype: bool
        """
        return self._all_apps_visible

    @all_apps_visible.setter
    def all_apps_visible(self, all_apps_visible: bool):
        """Sets the all_apps_visible of this UserInvitationAttributes.


        :param all_apps_visible: The all_apps_visible of this UserInvitationAttributes.
        :type all_apps_visible: bool
        """

        self._all_apps_visible = all_apps_visible

    @property
    def email(self) -> str:
        """Gets the email of this UserInvitationAttributes.


        :return: The email of this UserInvitationAttributes.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this UserInvitationAttributes.


        :param email: The email of this UserInvitationAttributes.
        :type email: str
        """

        self._email = email

    @property
    def expiration_date(self) -> datetime:
        """Gets the expiration_date of this UserInvitationAttributes.


        :return: The expiration_date of this UserInvitationAttributes.
        :rtype: datetime
        """
        return self._expiration_date

    @expiration_date.setter
    def expiration_date(self, expiration_date: datetime):
        """Sets the expiration_date of this UserInvitationAttributes.


        :param expiration_date: The expiration_date of this UserInvitationAttributes.
        :type expiration_date: datetime
        """

        self._expiration_date = expiration_date

    @property
    def first_name(self) -> str:
        """Gets the first_name of this UserInvitationAttributes.


        :return: The first_name of this UserInvitationAttributes.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name: str):
        """Sets the first_name of this UserInvitationAttributes.


        :param first_name: The first_name of this UserInvitationAttributes.
        :type first_name: str
        """

        self._first_name = first_name

    @property
    def last_name(self) -> str:
        """Gets the last_name of this UserInvitationAttributes.


        :return: The last_name of this UserInvitationAttributes.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name: str):
        """Sets the last_name of this UserInvitationAttributes.


        :param last_name: The last_name of this UserInvitationAttributes.
        :type last_name: str
        """

        self._last_name = last_name

    @property
    def provisioning_allowed(self) -> bool:
        """Gets the provisioning_allowed of this UserInvitationAttributes.


        :return: The provisioning_allowed of this UserInvitationAttributes.
        :rtype: bool
        """
        return self._provisioning_allowed

    @provisioning_allowed.setter
    def provisioning_allowed(self, provisioning_allowed: bool):
        """Sets the provisioning_allowed of this UserInvitationAttributes.


        :param provisioning_allowed: The provisioning_allowed of this UserInvitationAttributes.
        :type provisioning_allowed: bool
        """

        self._provisioning_allowed = provisioning_allowed

    @property
    def roles(self) -> List[UserRole]:
        """Gets the roles of this UserInvitationAttributes.


        :return: The roles of this UserInvitationAttributes.
        :rtype: List[UserRole]
        """
        return self._roles

    @roles.setter
    def roles(self, roles: List[UserRole]):
        """Sets the roles of this UserInvitationAttributes.


        :param roles: The roles of this UserInvitationAttributes.
        :type roles: List[UserRole]
        """

        self._roles = roles