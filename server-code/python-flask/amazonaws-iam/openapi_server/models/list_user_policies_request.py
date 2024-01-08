from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListUserPoliciesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, marker=None, max_items=None):  # noqa: E501
        """ListUserPoliciesRequest - a model defined in OpenAPI

        :param user_name: The user_name of this ListUserPoliciesRequest.  # noqa: E501
        :type user_name: str
        :param marker: The marker of this ListUserPoliciesRequest.  # noqa: E501
        :type marker: str
        :param max_items: The max_items of this ListUserPoliciesRequest.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'ListUserPoliciesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListUserPoliciesRequest of this ListUserPoliciesRequest.  # noqa: E501
        :rtype: ListUserPoliciesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this ListUserPoliciesRequest.


        :return: The user_name of this ListUserPoliciesRequest.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this ListUserPoliciesRequest.


        :param user_name: The user_name of this ListUserPoliciesRequest.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name

    @property
    def marker(self) -> str:
        """Gets the marker of this ListUserPoliciesRequest.


        :return: The marker of this ListUserPoliciesRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListUserPoliciesRequest.


        :param marker: The marker of this ListUserPoliciesRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def max_items(self) -> int:
        """Gets the max_items of this ListUserPoliciesRequest.


        :return: The max_items of this ListUserPoliciesRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this ListUserPoliciesRequest.


        :param max_items: The max_items of this ListUserPoliciesRequest.
        :type max_items: int
        """

        self._max_items = max_items