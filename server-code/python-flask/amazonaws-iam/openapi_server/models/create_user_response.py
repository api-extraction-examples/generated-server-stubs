from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_user_response_user import CreateUserResponseUser
from openapi_server import util

from openapi_server.models.create_user_response_user import CreateUserResponseUser  # noqa: E501

class CreateUserResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user=None):  # noqa: E501
        """CreateUserResponse - a model defined in OpenAPI

        :param user: The user of this CreateUserResponse.  # noqa: E501
        :type user: CreateUserResponseUser
        """
        self.openapi_types = {
            'user': CreateUserResponseUser
        }

        self.attribute_map = {
            'user': 'User'
        }

        self._user = user

    @classmethod
    def from_dict(cls, dikt) -> 'CreateUserResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateUserResponse of this CreateUserResponse.  # noqa: E501
        :rtype: CreateUserResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user(self) -> CreateUserResponseUser:
        """Gets the user of this CreateUserResponse.


        :return: The user of this CreateUserResponse.
        :rtype: CreateUserResponseUser
        """
        return self._user

    @user.setter
    def user(self, user: CreateUserResponseUser):
        """Sets the user of this CreateUserResponse.


        :param user: The user of this CreateUserResponse.
        :type user: CreateUserResponseUser
        """

        self._user = user
