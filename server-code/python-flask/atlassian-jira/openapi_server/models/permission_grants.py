from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.permission_grant import PermissionGrant
from openapi_server import util

from openapi_server.models.permission_grant import PermissionGrant  # noqa: E501

class PermissionGrants(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, expand=None, permissions=None):  # noqa: E501
        """PermissionGrants - a model defined in OpenAPI

        :param expand: The expand of this PermissionGrants.  # noqa: E501
        :type expand: str
        :param permissions: The permissions of this PermissionGrants.  # noqa: E501
        :type permissions: List[PermissionGrant]
        """
        self.openapi_types = {
            'expand': str,
            'permissions': List[PermissionGrant]
        }

        self.attribute_map = {
            'expand': 'expand',
            'permissions': 'permissions'
        }

        self._expand = expand
        self._permissions = permissions

    @classmethod
    def from_dict(cls, dikt) -> 'PermissionGrants':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PermissionGrants of this PermissionGrants.  # noqa: E501
        :rtype: PermissionGrants
        """
        return util.deserialize_model(dikt, cls)

    @property
    def expand(self) -> str:
        """Gets the expand of this PermissionGrants.

        Expand options that include additional permission grant details in the response.  # noqa: E501

        :return: The expand of this PermissionGrants.
        :rtype: str
        """
        return self._expand

    @expand.setter
    def expand(self, expand: str):
        """Sets the expand of this PermissionGrants.

        Expand options that include additional permission grant details in the response.  # noqa: E501

        :param expand: The expand of this PermissionGrants.
        :type expand: str
        """

        self._expand = expand

    @property
    def permissions(self) -> List[PermissionGrant]:
        """Gets the permissions of this PermissionGrants.

        Permission grants list.  # noqa: E501

        :return: The permissions of this PermissionGrants.
        :rtype: List[PermissionGrant]
        """
        return self._permissions

    @permissions.setter
    def permissions(self, permissions: List[PermissionGrant]):
        """Sets the permissions of this PermissionGrants.

        Permission grants list.  # noqa: E501

        :param permissions: The permissions of this PermissionGrants.
        :type permissions: List[PermissionGrant]
        """

        self._permissions = permissions
