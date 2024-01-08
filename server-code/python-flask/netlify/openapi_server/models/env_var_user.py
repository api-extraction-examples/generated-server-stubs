from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class EnvVarUser(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, avatar_url=None, email=None, full_name=None, id=None):  # noqa: E501
        """EnvVarUser - a model defined in OpenAPI

        :param avatar_url: The avatar_url of this EnvVarUser.  # noqa: E501
        :type avatar_url: str
        :param email: The email of this EnvVarUser.  # noqa: E501
        :type email: str
        :param full_name: The full_name of this EnvVarUser.  # noqa: E501
        :type full_name: str
        :param id: The id of this EnvVarUser.  # noqa: E501
        :type id: str
        """
        self.openapi_types = {
            'avatar_url': str,
            'email': str,
            'full_name': str,
            'id': str
        }

        self.attribute_map = {
            'avatar_url': 'avatar_url',
            'email': 'email',
            'full_name': 'full_name',
            'id': 'id'
        }

        self._avatar_url = avatar_url
        self._email = email
        self._full_name = full_name
        self._id = id

    @classmethod
    def from_dict(cls, dikt) -> 'EnvVarUser':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The envVarUser of this EnvVarUser.  # noqa: E501
        :rtype: EnvVarUser
        """
        return util.deserialize_model(dikt, cls)

    @property
    def avatar_url(self) -> str:
        """Gets the avatar_url of this EnvVarUser.

        A URL pointing to the user's avatar  # noqa: E501

        :return: The avatar_url of this EnvVarUser.
        :rtype: str
        """
        return self._avatar_url

    @avatar_url.setter
    def avatar_url(self, avatar_url: str):
        """Sets the avatar_url of this EnvVarUser.

        A URL pointing to the user's avatar  # noqa: E501

        :param avatar_url: The avatar_url of this EnvVarUser.
        :type avatar_url: str
        """

        self._avatar_url = avatar_url

    @property
    def email(self) -> str:
        """Gets the email of this EnvVarUser.

        The user's email address  # noqa: E501

        :return: The email of this EnvVarUser.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this EnvVarUser.

        The user's email address  # noqa: E501

        :param email: The email of this EnvVarUser.
        :type email: str
        """

        self._email = email

    @property
    def full_name(self) -> str:
        """Gets the full_name of this EnvVarUser.

        The user's full name (first and last)  # noqa: E501

        :return: The full_name of this EnvVarUser.
        :rtype: str
        """
        return self._full_name

    @full_name.setter
    def full_name(self, full_name: str):
        """Sets the full_name of this EnvVarUser.

        The user's full name (first and last)  # noqa: E501

        :param full_name: The full_name of this EnvVarUser.
        :type full_name: str
        """

        self._full_name = full_name

    @property
    def id(self) -> str:
        """Gets the id of this EnvVarUser.

        The user's unique identifier  # noqa: E501

        :return: The id of this EnvVarUser.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this EnvVarUser.

        The user's unique identifier  # noqa: E501

        :param id: The id of this EnvVarUser.
        :type id: str
        """

        self._id = id