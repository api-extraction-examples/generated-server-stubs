from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.get_group_response_group import GetGroupResponseGroup
from openapi_server import util

from openapi_server.models.get_group_response_group import GetGroupResponseGroup  # noqa: E501

class GetGroupResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, group=None, users=None, is_truncated=None, marker=None):  # noqa: E501
        """GetGroupResponse - a model defined in OpenAPI

        :param group: The group of this GetGroupResponse.  # noqa: E501
        :type group: GetGroupResponseGroup
        :param users: The users of this GetGroupResponse.  # noqa: E501
        :type users: List
        :param is_truncated: The is_truncated of this GetGroupResponse.  # noqa: E501
        :type is_truncated: bool
        :param marker: The marker of this GetGroupResponse.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'group': GetGroupResponseGroup,
            'users': List,
            'is_truncated': bool,
            'marker': str
        }

        self.attribute_map = {
            'group': 'Group',
            'users': 'Users',
            'is_truncated': 'IsTruncated',
            'marker': 'Marker'
        }

        self._group = group
        self._users = users
        self._is_truncated = is_truncated
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'GetGroupResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetGroupResponse of this GetGroupResponse.  # noqa: E501
        :rtype: GetGroupResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def group(self) -> GetGroupResponseGroup:
        """Gets the group of this GetGroupResponse.


        :return: The group of this GetGroupResponse.
        :rtype: GetGroupResponseGroup
        """
        return self._group

    @group.setter
    def group(self, group: GetGroupResponseGroup):
        """Sets the group of this GetGroupResponse.


        :param group: The group of this GetGroupResponse.
        :type group: GetGroupResponseGroup
        """
        if group is None:
            raise ValueError("Invalid value for `group`, must not be `None`")  # noqa: E501

        self._group = group

    @property
    def users(self) -> List:
        """Gets the users of this GetGroupResponse.


        :return: The users of this GetGroupResponse.
        :rtype: List
        """
        return self._users

    @users.setter
    def users(self, users: List):
        """Sets the users of this GetGroupResponse.


        :param users: The users of this GetGroupResponse.
        :type users: List
        """
        if users is None:
            raise ValueError("Invalid value for `users`, must not be `None`")  # noqa: E501

        self._users = users

    @property
    def is_truncated(self) -> bool:
        """Gets the is_truncated of this GetGroupResponse.


        :return: The is_truncated of this GetGroupResponse.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated: bool):
        """Sets the is_truncated of this GetGroupResponse.


        :param is_truncated: The is_truncated of this GetGroupResponse.
        :type is_truncated: bool
        """

        self._is_truncated = is_truncated

    @property
    def marker(self) -> str:
        """Gets the marker of this GetGroupResponse.


        :return: The marker of this GetGroupResponse.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this GetGroupResponse.


        :param marker: The marker of this GetGroupResponse.
        :type marker: str
        """

        self._marker = marker
