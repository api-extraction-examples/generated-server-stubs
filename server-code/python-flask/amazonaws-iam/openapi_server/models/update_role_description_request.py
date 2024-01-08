from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UpdateRoleDescriptionRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, role_name=None, description=None):  # noqa: E501
        """UpdateRoleDescriptionRequest - a model defined in OpenAPI

        :param role_name: The role_name of this UpdateRoleDescriptionRequest.  # noqa: E501
        :type role_name: str
        :param description: The description of this UpdateRoleDescriptionRequest.  # noqa: E501
        :type description: str
        """
        self.openapi_types = {
            'role_name': str,
            'description': str
        }

        self.attribute_map = {
            'role_name': 'RoleName',
            'description': 'Description'
        }

        self._role_name = role_name
        self._description = description

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateRoleDescriptionRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateRoleDescriptionRequest of this UpdateRoleDescriptionRequest.  # noqa: E501
        :rtype: UpdateRoleDescriptionRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def role_name(self) -> str:
        """Gets the role_name of this UpdateRoleDescriptionRequest.


        :return: The role_name of this UpdateRoleDescriptionRequest.
        :rtype: str
        """
        return self._role_name

    @role_name.setter
    def role_name(self, role_name: str):
        """Sets the role_name of this UpdateRoleDescriptionRequest.


        :param role_name: The role_name of this UpdateRoleDescriptionRequest.
        :type role_name: str
        """
        if role_name is None:
            raise ValueError("Invalid value for `role_name`, must not be `None`")  # noqa: E501

        self._role_name = role_name

    @property
    def description(self) -> str:
        """Gets the description of this UpdateRoleDescriptionRequest.


        :return: The description of this UpdateRoleDescriptionRequest.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this UpdateRoleDescriptionRequest.


        :param description: The description of this UpdateRoleDescriptionRequest.
        :type description: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description