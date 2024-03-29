from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.permissions_boundary_attachment_type import PermissionsBoundaryAttachmentType
from openapi_server import util

from openapi_server.models.permissions_boundary_attachment_type import PermissionsBoundaryAttachmentType  # noqa: E501

class RolePermissionsBoundary(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, permissions_boundary_type=None, permissions_boundary_arn=None):  # noqa: E501
        """RolePermissionsBoundary - a model defined in OpenAPI

        :param permissions_boundary_type: The permissions_boundary_type of this RolePermissionsBoundary.  # noqa: E501
        :type permissions_boundary_type: PermissionsBoundaryAttachmentType
        :param permissions_boundary_arn: The permissions_boundary_arn of this RolePermissionsBoundary.  # noqa: E501
        :type permissions_boundary_arn: str
        """
        self.openapi_types = {
            'permissions_boundary_type': PermissionsBoundaryAttachmentType,
            'permissions_boundary_arn': str
        }

        self.attribute_map = {
            'permissions_boundary_type': 'PermissionsBoundaryType',
            'permissions_boundary_arn': 'PermissionsBoundaryArn'
        }

        self._permissions_boundary_type = permissions_boundary_type
        self._permissions_boundary_arn = permissions_boundary_arn

    @classmethod
    def from_dict(cls, dikt) -> 'RolePermissionsBoundary':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Role_PermissionsBoundary of this RolePermissionsBoundary.  # noqa: E501
        :rtype: RolePermissionsBoundary
        """
        return util.deserialize_model(dikt, cls)

    @property
    def permissions_boundary_type(self) -> PermissionsBoundaryAttachmentType:
        """Gets the permissions_boundary_type of this RolePermissionsBoundary.


        :return: The permissions_boundary_type of this RolePermissionsBoundary.
        :rtype: PermissionsBoundaryAttachmentType
        """
        return self._permissions_boundary_type

    @permissions_boundary_type.setter
    def permissions_boundary_type(self, permissions_boundary_type: PermissionsBoundaryAttachmentType):
        """Sets the permissions_boundary_type of this RolePermissionsBoundary.


        :param permissions_boundary_type: The permissions_boundary_type of this RolePermissionsBoundary.
        :type permissions_boundary_type: PermissionsBoundaryAttachmentType
        """

        self._permissions_boundary_type = permissions_boundary_type

    @property
    def permissions_boundary_arn(self) -> str:
        """Gets the permissions_boundary_arn of this RolePermissionsBoundary.


        :return: The permissions_boundary_arn of this RolePermissionsBoundary.
        :rtype: str
        """
        return self._permissions_boundary_arn

    @permissions_boundary_arn.setter
    def permissions_boundary_arn(self, permissions_boundary_arn: str):
        """Sets the permissions_boundary_arn of this RolePermissionsBoundary.


        :param permissions_boundary_arn: The permissions_boundary_arn of this RolePermissionsBoundary.
        :type permissions_boundary_arn: str
        """

        self._permissions_boundary_arn = permissions_boundary_arn
