from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_service_linked_role_response_role import CreateServiceLinkedRoleResponseRole
from openapi_server import util

from openapi_server.models.create_service_linked_role_response_role import CreateServiceLinkedRoleResponseRole  # noqa: E501

class CreateServiceLinkedRoleResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, role=None):  # noqa: E501
        """CreateServiceLinkedRoleResponse - a model defined in OpenAPI

        :param role: The role of this CreateServiceLinkedRoleResponse.  # noqa: E501
        :type role: CreateServiceLinkedRoleResponseRole
        """
        self.openapi_types = {
            'role': CreateServiceLinkedRoleResponseRole
        }

        self.attribute_map = {
            'role': 'Role'
        }

        self._role = role

    @classmethod
    def from_dict(cls, dikt) -> 'CreateServiceLinkedRoleResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateServiceLinkedRoleResponse of this CreateServiceLinkedRoleResponse.  # noqa: E501
        :rtype: CreateServiceLinkedRoleResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role(self) -> CreateServiceLinkedRoleResponseRole:
        """Gets the role of this CreateServiceLinkedRoleResponse.


        :return: The role of this CreateServiceLinkedRoleResponse.
        :rtype: CreateServiceLinkedRoleResponseRole
        """
        return self._role

    @role.setter
    def role(self, role: CreateServiceLinkedRoleResponseRole):
        """Sets the role of this CreateServiceLinkedRoleResponse.


        :param role: The role of this CreateServiceLinkedRoleResponse.
        :type role: CreateServiceLinkedRoleResponseRole
        """

        self._role = role
