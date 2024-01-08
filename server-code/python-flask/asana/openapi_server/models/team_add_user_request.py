from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TeamAddUserRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user=None):  # noqa: E501
        """TeamAddUserRequest - a model defined in OpenAPI

        :param user: The user of this TeamAddUserRequest.  # noqa: E501
        :type user: str
        """
        self.openapi_types = {
            'user': str
        }

        self.attribute_map = {
            'user': 'user'
        }

        self._user = user

    @classmethod
    def from_dict(cls, dikt) -> 'TeamAddUserRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TeamAddUserRequest of this TeamAddUserRequest.  # noqa: E501
        :rtype: TeamAddUserRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user(self) -> str:
        """Gets the user of this TeamAddUserRequest.

        A string identifying a user. This can either be the string \"me\", an email, or the gid of a user.  # noqa: E501

        :return: The user of this TeamAddUserRequest.
        :rtype: str
        """
        return self._user

    @user.setter
    def user(self, user: str):
        """Sets the user of this TeamAddUserRequest.

        A string identifying a user. This can either be the string \"me\", an email, or the gid of a user.  # noqa: E501

        :param user: The user of this TeamAddUserRequest.
        :type user: str
        """

        self._user = user
