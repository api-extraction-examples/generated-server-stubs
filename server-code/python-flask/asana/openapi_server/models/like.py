from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_compact import UserCompact
from openapi_server import util

from openapi_server.models.user_compact import UserCompact  # noqa: E501

class Like(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, user=None):  # noqa: E501
        """Like - a model defined in OpenAPI

        :param gid: The gid of this Like.  # noqa: E501
        :type gid: str
        :param user: The user of this Like.  # noqa: E501
        :type user: UserCompact
        """
        self.openapi_types = {
            'gid': str,
            'user': UserCompact
        }

        self.attribute_map = {
            'gid': 'gid',
            'user': 'user'
        }

        self._gid = gid
        self._user = user

    @classmethod
    def from_dict(cls, dikt) -> 'Like':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Like of this Like.  # noqa: E501
        :rtype: Like
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this Like.

        Globally unique identifier of the object, as a string.  # noqa: E501

        :return: The gid of this Like.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this Like.

        Globally unique identifier of the object, as a string.  # noqa: E501

        :param gid: The gid of this Like.
        :type gid: str
        """

        self._gid = gid

    @property
    def user(self) -> UserCompact:
        """Gets the user of this Like.


        :return: The user of this Like.
        :rtype: UserCompact
        """
        return self._user

    @user.setter
    def user(self, user: UserCompact):
        """Sets the user of this Like.


        :param user: The user of this Like.
        :type user: UserCompact
        """

        self._user = user
