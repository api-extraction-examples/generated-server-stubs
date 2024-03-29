from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.position import Position
from openapi_server.models.user_short_info import UserShortInfo
from openapi_server import util

from openapi_server.models.position import Position  # noqa: E501
from openapi_server.models.user_short_info import UserShortInfo  # noqa: E501

class UserInPhoto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, position=None, user=None):  # noqa: E501
        """UserInPhoto - a model defined in OpenAPI

        :param position: The position of this UserInPhoto.  # noqa: E501
        :type position: Position
        :param user: The user of this UserInPhoto.  # noqa: E501
        :type user: UserShortInfo
        """
        self.openapi_types = {
            'position': Position,
            'user': UserShortInfo
        }

        self.attribute_map = {
            'position': 'position',
            'user': 'user'
        }

        self._position = position
        self._user = user

    @classmethod
    def from_dict(cls, dikt) -> 'UserInPhoto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserInPhoto of this UserInPhoto.  # noqa: E501
        :rtype: UserInPhoto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def position(self) -> Position:
        """Gets the position of this UserInPhoto.


        :return: The position of this UserInPhoto.
        :rtype: Position
        """
        return self._position

    @position.setter
    def position(self, position: Position):
        """Sets the position of this UserInPhoto.


        :param position: The position of this UserInPhoto.
        :type position: Position
        """

        self._position = position

    @property
    def user(self) -> UserShortInfo:
        """Gets the user of this UserInPhoto.


        :return: The user of this UserInPhoto.
        :rtype: UserShortInfo
        """
        return self._user

    @user.setter
    def user(self, user: UserShortInfo):
        """Sets the user of this UserInPhoto.


        :param user: The user of this UserInPhoto.
        :type user: UserShortInfo
        """

        self._user = user
