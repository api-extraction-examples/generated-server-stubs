from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListUsersResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, users=None, is_truncated=None, marker=None):  # noqa: E501
        """ListUsersResponse - a model defined in OpenAPI

        :param users: The users of this ListUsersResponse.  # noqa: E501
        :type users: List
        :param is_truncated: The is_truncated of this ListUsersResponse.  # noqa: E501
        :type is_truncated: bool
        :param marker: The marker of this ListUsersResponse.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'users': List,
            'is_truncated': bool,
            'marker': str
        }

        self.attribute_map = {
            'users': 'Users',
            'is_truncated': 'IsTruncated',
            'marker': 'Marker'
        }

        self._users = users
        self._is_truncated = is_truncated
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'ListUsersResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListUsersResponse of this ListUsersResponse.  # noqa: E501
        :rtype: ListUsersResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def users(self) -> List:
        """Gets the users of this ListUsersResponse.


        :return: The users of this ListUsersResponse.
        :rtype: List
        """
        return self._users

    @users.setter
    def users(self, users: List):
        """Sets the users of this ListUsersResponse.


        :param users: The users of this ListUsersResponse.
        :type users: List
        """
        if users is None:
            raise ValueError("Invalid value for `users`, must not be `None`")  # noqa: E501

        self._users = users

    @property
    def is_truncated(self) -> bool:
        """Gets the is_truncated of this ListUsersResponse.


        :return: The is_truncated of this ListUsersResponse.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated: bool):
        """Sets the is_truncated of this ListUsersResponse.


        :param is_truncated: The is_truncated of this ListUsersResponse.
        :type is_truncated: bool
        """

        self._is_truncated = is_truncated

    @property
    def marker(self) -> str:
        """Gets the marker of this ListUsersResponse.


        :return: The marker of this ListUsersResponse.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListUsersResponse.


        :param marker: The marker of this ListUsersResponse.
        :type marker: str
        """

        self._marker = marker
