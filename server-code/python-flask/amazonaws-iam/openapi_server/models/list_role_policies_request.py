from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListRolePoliciesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, role_name=None, marker=None, max_items=None):  # noqa: E501
        """ListRolePoliciesRequest - a model defined in OpenAPI

        :param role_name: The role_name of this ListRolePoliciesRequest.  # noqa: E501
        :type role_name: str
        :param marker: The marker of this ListRolePoliciesRequest.  # noqa: E501
        :type marker: str
        :param max_items: The max_items of this ListRolePoliciesRequest.  # noqa: E501
        :type max_items: int
        """
        self.openapi_types = {
            'role_name': str,
            'marker': str,
            'max_items': int
        }

        self.attribute_map = {
            'role_name': 'RoleName',
            'marker': 'Marker',
            'max_items': 'MaxItems'
        }

        self._role_name = role_name
        self._marker = marker
        self._max_items = max_items

    @classmethod
    def from_dict(cls, dikt) -> 'ListRolePoliciesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListRolePoliciesRequest of this ListRolePoliciesRequest.  # noqa: E501
        :rtype: ListRolePoliciesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role_name(self) -> str:
        """Gets the role_name of this ListRolePoliciesRequest.


        :return: The role_name of this ListRolePoliciesRequest.
        :rtype: str
        """
        return self._role_name

    @role_name.setter
    def role_name(self, role_name: str):
        """Sets the role_name of this ListRolePoliciesRequest.


        :param role_name: The role_name of this ListRolePoliciesRequest.
        :type role_name: str
        """
        if role_name is None:
            raise ValueError("Invalid value for `role_name`, must not be `None`")  # noqa: E501

        self._role_name = role_name

    @property
    def marker(self) -> str:
        """Gets the marker of this ListRolePoliciesRequest.


        :return: The marker of this ListRolePoliciesRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListRolePoliciesRequest.


        :param marker: The marker of this ListRolePoliciesRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def max_items(self) -> int:
        """Gets the max_items of this ListRolePoliciesRequest.


        :return: The max_items of this ListRolePoliciesRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this ListRolePoliciesRequest.


        :param max_items: The max_items of this ListRolePoliciesRequest.
        :type max_items: int
        """

        self._max_items = max_items
