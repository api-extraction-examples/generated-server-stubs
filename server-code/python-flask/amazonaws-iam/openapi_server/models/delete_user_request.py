from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DeleteUserRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None):  # noqa: E501
        """DeleteUserRequest - a model defined in OpenAPI

        :param user_name: The user_name of this DeleteUserRequest.  # noqa: E501
        :type user_name: str
        """
        self.openapi_types = {
            'user_name': str
        }

        self.attribute_map = {
            'user_name': 'UserName'
        }

        self._user_name = user_name

    @classmethod
    def from_dict(cls, dikt) -> 'DeleteUserRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeleteUserRequest of this DeleteUserRequest.  # noqa: E501
        :rtype: DeleteUserRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this DeleteUserRequest.


        :return: The user_name of this DeleteUserRequest.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this DeleteUserRequest.


        :param user_name: The user_name of this DeleteUserRequest.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name
