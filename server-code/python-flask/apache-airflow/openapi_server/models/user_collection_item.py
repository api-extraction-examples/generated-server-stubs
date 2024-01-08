from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_collection_item_roles_inner import UserCollectionItemRolesInner
from openapi_server import util

from openapi_server.models.user_collection_item_roles_inner import UserCollectionItemRolesInner  # noqa: E501

class UserCollectionItem(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, active=None, changed_on=None, created_on=None, email=None, failed_login_count=None, first_name=None, last_login=None, last_name=None, login_count=None, roles=None, username=None):  # noqa: E501
        """UserCollectionItem - a model defined in OpenAPI

        :param active: The active of this UserCollectionItem.  # noqa: E501
        :type active: bool
        :param changed_on: The changed_on of this UserCollectionItem.  # noqa: E501
        :type changed_on: str
        :param created_on: The created_on of this UserCollectionItem.  # noqa: E501
        :type created_on: str
        :param email: The email of this UserCollectionItem.  # noqa: E501
        :type email: str
        :param failed_login_count: The failed_login_count of this UserCollectionItem.  # noqa: E501
        :type failed_login_count: int
        :param first_name: The first_name of this UserCollectionItem.  # noqa: E501
        :type first_name: str
        :param last_login: The last_login of this UserCollectionItem.  # noqa: E501
        :type last_login: str
        :param last_name: The last_name of this UserCollectionItem.  # noqa: E501
        :type last_name: str
        :param login_count: The login_count of this UserCollectionItem.  # noqa: E501
        :type login_count: int
        :param roles: The roles of this UserCollectionItem.  # noqa: E501
        :type roles: List[UserCollectionItemRolesInner]
        :param username: The username of this UserCollectionItem.  # noqa: E501
        :type username: str
        """
        self.openapi_types = {
            'active': bool,
            'changed_on': str,
            'created_on': str,
            'email': str,
            'failed_login_count': int,
            'first_name': str,
            'last_login': str,
            'last_name': str,
            'login_count': int,
            'roles': List[UserCollectionItemRolesInner],
            'username': str
        }

        self.attribute_map = {
            'active': 'active',
            'changed_on': 'changed_on',
            'created_on': 'created_on',
            'email': 'email',
            'failed_login_count': 'failed_login_count',
            'first_name': 'first_name',
            'last_login': 'last_login',
            'last_name': 'last_name',
            'login_count': 'login_count',
            'roles': 'roles',
            'username': 'username'
        }

        self._active = active
        self._changed_on = changed_on
        self._created_on = created_on
        self._email = email
        self._failed_login_count = failed_login_count
        self._first_name = first_name
        self._last_login = last_login
        self._last_name = last_name
        self._login_count = login_count
        self._roles = roles
        self._username = username

    @classmethod
    def from_dict(cls, dikt) -> 'UserCollectionItem':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserCollectionItem of this UserCollectionItem.  # noqa: E501
        :rtype: UserCollectionItem
        """
        return util.deserialize_model(dikt, cls)

    @property
    def active(self) -> bool:
        """Gets the active of this UserCollectionItem.

        Whether the user is active  # noqa: E501

        :return: The active of this UserCollectionItem.
        :rtype: bool
        """
        return self._active

    @active.setter
    def active(self, active: bool):
        """Sets the active of this UserCollectionItem.

        Whether the user is active  # noqa: E501

        :param active: The active of this UserCollectionItem.
        :type active: bool
        """

        self._active = active

    @property
    def changed_on(self) -> str:
        """Gets the changed_on of this UserCollectionItem.

        The date user was changed  # noqa: E501

        :return: The changed_on of this UserCollectionItem.
        :rtype: str
        """
        return self._changed_on

    @changed_on.setter
    def changed_on(self, changed_on: str):
        """Sets the changed_on of this UserCollectionItem.

        The date user was changed  # noqa: E501

        :param changed_on: The changed_on of this UserCollectionItem.
        :type changed_on: str
        """

        self._changed_on = changed_on

    @property
    def created_on(self) -> str:
        """Gets the created_on of this UserCollectionItem.

        The date user was created  # noqa: E501

        :return: The created_on of this UserCollectionItem.
        :rtype: str
        """
        return self._created_on

    @created_on.setter
    def created_on(self, created_on: str):
        """Sets the created_on of this UserCollectionItem.

        The date user was created  # noqa: E501

        :param created_on: The created_on of this UserCollectionItem.
        :type created_on: str
        """

        self._created_on = created_on

    @property
    def email(self) -> str:
        """Gets the email of this UserCollectionItem.

        The user's email.  *Changed in version 2.2.0*&#58; A minimum character length requirement ('minLength') is added.   # noqa: E501

        :return: The email of this UserCollectionItem.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this UserCollectionItem.

        The user's email.  *Changed in version 2.2.0*&#58; A minimum character length requirement ('minLength') is added.   # noqa: E501

        :param email: The email of this UserCollectionItem.
        :type email: str
        """
        if email is not None and len(email) < 1:
            raise ValueError("Invalid value for `email`, length must be greater than or equal to `1`")  # noqa: E501

        self._email = email

    @property
    def failed_login_count(self) -> int:
        """Gets the failed_login_count of this UserCollectionItem.

        The number of times the login failed  # noqa: E501

        :return: The failed_login_count of this UserCollectionItem.
        :rtype: int
        """
        return self._failed_login_count

    @failed_login_count.setter
    def failed_login_count(self, failed_login_count: int):
        """Sets the failed_login_count of this UserCollectionItem.

        The number of times the login failed  # noqa: E501

        :param failed_login_count: The failed_login_count of this UserCollectionItem.
        :type failed_login_count: int
        """

        self._failed_login_count = failed_login_count

    @property
    def first_name(self) -> str:
        """Gets the first_name of this UserCollectionItem.

        The user's first name.  *Changed in version 2.4.0*&#58; The requirement for this to be non-empty was removed.   # noqa: E501

        :return: The first_name of this UserCollectionItem.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name: str):
        """Sets the first_name of this UserCollectionItem.

        The user's first name.  *Changed in version 2.4.0*&#58; The requirement for this to be non-empty was removed.   # noqa: E501

        :param first_name: The first_name of this UserCollectionItem.
        :type first_name: str
        """

        self._first_name = first_name

    @property
    def last_login(self) -> str:
        """Gets the last_login of this UserCollectionItem.

        The last user login  # noqa: E501

        :return: The last_login of this UserCollectionItem.
        :rtype: str
        """
        return self._last_login

    @last_login.setter
    def last_login(self, last_login: str):
        """Sets the last_login of this UserCollectionItem.

        The last user login  # noqa: E501

        :param last_login: The last_login of this UserCollectionItem.
        :type last_login: str
        """

        self._last_login = last_login

    @property
    def last_name(self) -> str:
        """Gets the last_name of this UserCollectionItem.

        The user's last name.  *Changed in version 2.4.0*&#58; The requirement for this to be non-empty was removed.   # noqa: E501

        :return: The last_name of this UserCollectionItem.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name: str):
        """Sets the last_name of this UserCollectionItem.

        The user's last name.  *Changed in version 2.4.0*&#58; The requirement for this to be non-empty was removed.   # noqa: E501

        :param last_name: The last_name of this UserCollectionItem.
        :type last_name: str
        """

        self._last_name = last_name

    @property
    def login_count(self) -> int:
        """Gets the login_count of this UserCollectionItem.

        The login count  # noqa: E501

        :return: The login_count of this UserCollectionItem.
        :rtype: int
        """
        return self._login_count

    @login_count.setter
    def login_count(self, login_count: int):
        """Sets the login_count of this UserCollectionItem.

        The login count  # noqa: E501

        :param login_count: The login_count of this UserCollectionItem.
        :type login_count: int
        """

        self._login_count = login_count

    @property
    def roles(self) -> List[UserCollectionItemRolesInner]:
        """Gets the roles of this UserCollectionItem.

        User roles.  *Changed in version 2.2.0*&#58; Field is no longer read-only.   # noqa: E501

        :return: The roles of this UserCollectionItem.
        :rtype: List[UserCollectionItemRolesInner]
        """
        return self._roles

    @roles.setter
    def roles(self, roles: List[UserCollectionItemRolesInner]):
        """Sets the roles of this UserCollectionItem.

        User roles.  *Changed in version 2.2.0*&#58; Field is no longer read-only.   # noqa: E501

        :param roles: The roles of this UserCollectionItem.
        :type roles: List[UserCollectionItemRolesInner]
        """

        self._roles = roles

    @property
    def username(self) -> str:
        """Gets the username of this UserCollectionItem.

        The username.  *Changed in version 2.2.0*&#58; A minimum character length requirement ('minLength') is added.   # noqa: E501

        :return: The username of this UserCollectionItem.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username: str):
        """Sets the username of this UserCollectionItem.

        The username.  *Changed in version 2.2.0*&#58; A minimum character length requirement ('minLength') is added.   # noqa: E501

        :param username: The username of this UserCollectionItem.
        :type username: str
        """
        if username is not None and len(username) < 1:
            raise ValueError("Invalid value for `username`, length must be greater than or equal to `1`")  # noqa: E501

        self._username = username