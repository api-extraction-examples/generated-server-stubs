from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListRolesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, roles=None, is_truncated=None, marker=None):  # noqa: E501
        """ListRolesResponse - a model defined in OpenAPI

        :param roles: The roles of this ListRolesResponse.  # noqa: E501
        :type roles: List
        :param is_truncated: The is_truncated of this ListRolesResponse.  # noqa: E501
        :type is_truncated: bool
        :param marker: The marker of this ListRolesResponse.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'roles': List,
            'is_truncated': bool,
            'marker': str
        }

        self.attribute_map = {
            'roles': 'Roles',
            'is_truncated': 'IsTruncated',
            'marker': 'Marker'
        }

        self._roles = roles
        self._is_truncated = is_truncated
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'ListRolesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListRolesResponse of this ListRolesResponse.  # noqa: E501
        :rtype: ListRolesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def roles(self) -> List:
        """Gets the roles of this ListRolesResponse.


        :return: The roles of this ListRolesResponse.
        :rtype: List
        """
        return self._roles

    @roles.setter
    def roles(self, roles: List):
        """Sets the roles of this ListRolesResponse.


        :param roles: The roles of this ListRolesResponse.
        :type roles: List
        """
        if roles is None:
            raise ValueError("Invalid value for `roles`, must not be `None`")  # noqa: E501

        self._roles = roles

    @property
    def is_truncated(self) -> bool:
        """Gets the is_truncated of this ListRolesResponse.


        :return: The is_truncated of this ListRolesResponse.
        :rtype: bool
        """
        return self._is_truncated

    @is_truncated.setter
    def is_truncated(self, is_truncated: bool):
        """Sets the is_truncated of this ListRolesResponse.


        :param is_truncated: The is_truncated of this ListRolesResponse.
        :type is_truncated: bool
        """

        self._is_truncated = is_truncated

    @property
    def marker(self) -> str:
        """Gets the marker of this ListRolesResponse.


        :return: The marker of this ListRolesResponse.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListRolesResponse.


        :param marker: The marker of this ListRolesResponse.
        :type marker: str
        """

        self._marker = marker