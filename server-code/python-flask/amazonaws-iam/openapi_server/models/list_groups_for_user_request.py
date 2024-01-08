from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListGroupsForUserRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, marker=None, max_items=None):  # noqa: E501
        """ListGroupsForUserRequest - a model defined in OpenAPI

        :param user_name: The user_name of this ListGroupsForUserRequest.  # noqa: E501
        :type user_name: str
        :param marker: The marker of this ListGroupsForUserRequest.  # noqa: E501
        :type marker: str
        :param max_items: The max_items of this ListGroupsForUserRequest.  # noqa: E501
        :type max_items: int
        """
        self.openapi_types = {
            'user_name': str,
            'marker': str,
            'max_items': int
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'marker': 'Marker',
            'max_items': 'MaxItems'
        }

        self._user_name = user_name
        self._marker = marker
        self._max_items = max_items

    @classmethod
    def from_dict(cls, dikt) -> 'ListGroupsForUserRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListGroupsForUserRequest of this ListGroupsForUserRequest.  # noqa: E501
        :rtype: ListGroupsForUserRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this ListGroupsForUserRequest.


        :return: The user_name of this ListGroupsForUserRequest.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this ListGroupsForUserRequest.


        :param user_name: The user_name of this ListGroupsForUserRequest.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name

    @property
    def marker(self) -> str:
        """Gets the marker of this ListGroupsForUserRequest.


        :return: The marker of this ListGroupsForUserRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListGroupsForUserRequest.


        :param marker: The marker of this ListGroupsForUserRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def max_items(self) -> int:
        """Gets the max_items of this ListGroupsForUserRequest.


        :return: The max_items of this ListGroupsForUserRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this ListGroupsForUserRequest.


        :param max_items: The max_items of this ListGroupsForUserRequest.
        :type max_items: int
        """

        self._max_items = max_items
