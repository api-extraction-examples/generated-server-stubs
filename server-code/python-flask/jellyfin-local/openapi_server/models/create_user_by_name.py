from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CreateUserByName(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, password=None):  # noqa: E501
        """CreateUserByName - a model defined in OpenAPI

        :param name: The name of this CreateUserByName.  # noqa: E501
        :type name: str
        :param password: The password of this CreateUserByName.  # noqa: E501
        :type password: str
        """
        self.openapi_types = {
            'name': str,
            'password': str
        }

        self.attribute_map = {
            'name': 'Name',
            'password': 'Password'
        }

        self._name = name
        self._password = password

    @classmethod
    def from_dict(cls, dikt) -> 'CreateUserByName':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateUserByName of this CreateUserByName.  # noqa: E501
        :rtype: CreateUserByName
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this CreateUserByName.

        Gets or sets the username.  # noqa: E501

        :return: The name of this CreateUserByName.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CreateUserByName.

        Gets or sets the username.  # noqa: E501

        :param name: The name of this CreateUserByName.
        :type name: str
        """

        self._name = name

    @property
    def password(self) -> str:
        """Gets the password of this CreateUserByName.

        Gets or sets the password.  # noqa: E501

        :return: The password of this CreateUserByName.
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password: str):
        """Sets the password of this CreateUserByName.

        Gets or sets the password.  # noqa: E501

        :param password: The password of this CreateUserByName.
        :type password: str
        """

        self._password = password