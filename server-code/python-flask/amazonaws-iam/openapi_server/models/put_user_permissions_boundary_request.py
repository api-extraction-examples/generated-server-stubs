from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PutUserPermissionsBoundaryRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, user_name=None, permissions_boundary=None):  # noqa: E501
        """PutUserPermissionsBoundaryRequest - a model defined in OpenAPI

        :param user_name: The user_name of this PutUserPermissionsBoundaryRequest.  # noqa: E501
        :type user_name: str
        :param permissions_boundary: The permissions_boundary of this PutUserPermissionsBoundaryRequest.  # noqa: E501
        :type permissions_boundary: str
        """
        self.openapi_types = {
            'user_name': str,
            'permissions_boundary': str
        }

        self.attribute_map = {
            'user_name': 'UserName',
            'permissions_boundary': 'PermissionsBoundary'
        }

        self._user_name = user_name
        self._permissions_boundary = permissions_boundary

    @classmethod
    def from_dict(cls, dikt) -> 'PutUserPermissionsBoundaryRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PutUserPermissionsBoundaryRequest of this PutUserPermissionsBoundaryRequest.  # noqa: E501
        :rtype: PutUserPermissionsBoundaryRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def user_name(self) -> str:
        """Gets the user_name of this PutUserPermissionsBoundaryRequest.


        :return: The user_name of this PutUserPermissionsBoundaryRequest.
        :rtype: str
        """
        return self._user_name

    @user_name.setter
    def user_name(self, user_name: str):
        """Sets the user_name of this PutUserPermissionsBoundaryRequest.


        :param user_name: The user_name of this PutUserPermissionsBoundaryRequest.
        :type user_name: str
        """
        if user_name is None:
            raise ValueError("Invalid value for `user_name`, must not be `None`")  # noqa: E501

        self._user_name = user_name

    @property
    def permissions_boundary(self) -> str:
        """Gets the permissions_boundary of this PutUserPermissionsBoundaryRequest.


        :return: The permissions_boundary of this PutUserPermissionsBoundaryRequest.
        :rtype: str
        """
        return self._permissions_boundary

    @permissions_boundary.setter
    def permissions_boundary(self, permissions_boundary: str):
        """Sets the permissions_boundary of this PutUserPermissionsBoundaryRequest.


        :param permissions_boundary: The permissions_boundary of this PutUserPermissionsBoundaryRequest.
        :type permissions_boundary: str
        """
        if permissions_boundary is None:
            raise ValueError("Invalid value for `permissions_boundary`, must not be `None`")  # noqa: E501

        self._permissions_boundary = permissions_boundary
